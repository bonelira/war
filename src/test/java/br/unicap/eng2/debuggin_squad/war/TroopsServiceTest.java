/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;
import br.unicap.eng2.debuggin_squad.war.service.TroopsService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TroopsServiceTest {
    private Player player1;
    private Player player2;
    private Player player3;
    private List<Player> players;

    private Territory territory;
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
    public void testValidatesTroopsSentInTheInitialTurn() {
        mockPlayers();
        int totalTerritoriosValue = 42;
        int exercitosRecebidos = alocar.deliverArmiesInInitialTurn(players);

        // Calcule o número esperado de exércitos para cada jogador
        int expectedExercitosRecebidos = totalTerritoriosValue / players.size();

        // Verifique se a quantidade de exércitos recebidos é igual à quantidade esperada para cada jogador
        assertEquals(expectedExercitosRecebidos, exercitosRecebidos);

    }

    @Test
    public void testValidatesTroopsSentInTerritorial() {
        mockPlayers();mockPlayer1Territory();
        conqueredTerritories = player1.getConqueredTerritories();

        // Substituir o mock incorreto do território pelo território real
        when(player1.getConqueredTerritories()).thenReturn(conqueredTerritories);

        int totalTerritoriosValue = conqueredTerritories.size();
        int expectedExercitosRecebidos = totalTerritoriosValue / 2;

        int exercitosRecebidos = alocar.deliverArmiesByAmountOfTerritory(player1);

        assertEquals(expectedExercitosRecebidos, exercitosRecebidos);
    }

    //Criar teste para alocação de exercitos através da conquista de continente
    /*Criar um método mock para alocar os continentes*/

    //Criar teste para alocação de exercitos através da troca de carta
    /*Criar um método mock para alocar as cartas*/
}