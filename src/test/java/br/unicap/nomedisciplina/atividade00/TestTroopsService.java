package br.unicap.nomedisciplina.atividade00;

import br.unicap.eng2.atividade00.controller.Player;
import br.unicap.eng2.atividade00.controller.Territory;
import br.unicap.eng2.atividade00.service.TroopsService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestTroopsService {

    private Player player1;
    private Player player2;
    private Player player3;
    private List<Player> players;

    
    private List<Territory> conqueredTerritories;
    private Territory brasil;
    private Territory argentina;
    private Territory colombia;

    private TroopsService alocar;

    @BeforeEach
    public void setup() {
        alocar = new TroopsService();
        conqueredTerritories = new ArrayList<Territory>();
    }

    private void mockPlayers() {
        player1 = mock(Player.class);
        player2 = mock(Player.class);
        player3 = mock(Player.class);

        when(player1.getId()).thenReturn("1");
        when(player2.getId()).thenReturn("2");
        when(player3.getId()).thenReturn("3");

        players = new ArrayList<Player>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
    }

    private void mockPlayer1Territory() {
        conqueredTerritories.add(brasil);
        conqueredTerritories.add(argentina);
        conqueredTerritories.add(colombia);

        when(player1.getConqueredTerritories()).thenReturn(conqueredTerritories);
    }

    @Test
    public void test01ValidatesTroopsSentInTheInitialTurn() {
        mockPlayers();
        int totalTerritoriosValue = 42;
        int exercitosRecebidos = alocar.entregarExércitosNoTurnoInicial(players);
        int expectedExercitosRecebidos = totalTerritoriosValue / players.size();
        assertEquals(expectedExercitosRecebidos, exercitosRecebidos);

    }

    @Test
    public void test02ValidatesTroopsSentInTerritorial() {
        mockPlayers();mockPlayer1Territory();
        conqueredTerritories = player1.getConqueredTerritories();

        when(player1.getConqueredTerritories()).thenReturn(conqueredTerritories);

        int totalTerritoriosValue = conqueredTerritories.size();
        int expectedExercitosRecebidos = totalTerritoriosValue / 2;

        int exercitosRecebidos = alocar.entregarExércitosPorQuantidadeDeTerritório(player1);

        assertEquals(expectedExercitosRecebidos, exercitosRecebidos);
    }

}


    

