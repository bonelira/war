/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.troops;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;
import br.unicap.eng2.debuggin_squad.war.model.state.troops.DeliveryOfTerritoryState;
import br.unicap.eng2.debuggin_squad.war.model.state.troops.TroopsContext;
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

    private List<Territory> conqueredTerritories;
    private Territory brasil;
    private Territory argentina;
    private Territory colombia;

    private TroopsService alocar;
    private TroopsContext troopsContext;

    @BeforeEach
    public void setup() {
        alocar = new TroopsService();
        troopsContext = new TroopsContext();
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
        int exercitosRecebidos = alocar.deliverArmiesInTerritory(players);

        int expectedExercitosRecebidos = totalTerritoriosValue / players.size();

        assertEquals(expectedExercitosRecebidos, exercitosRecebidos);

    }

    @Test
    public void testValidatesTroopsSentInTerritorial() {
        mockPlayers();mockPlayer1Territory();
        int totalTerritoriosValue = conqueredTerritories.size();
        int expectedExercitosRecebidos = totalTerritoriosValue / 2;
        troopsContext.setState(new DeliveryOfTerritoryState());

        int exercitosRecebidos = troopsContext.deliverArmies(player1);

        assertEquals(expectedExercitosRecebidos, exercitosRecebidos);
    }

    //Criar teste para alocação de exercitos através da conquista de continente
    /*Criar um método mock para alocar os continentes*/

    //Criar teste para alocação de exercitos através da troca de carta
    /*Criar um método mock para alocar as cartas*/
}