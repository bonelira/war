/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.troops;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;
import br.unicap.eng2.debuggin_squad.war.model.composite.troops.ContinentTroopDelivery;
import br.unicap.eng2.debuggin_squad.war.model.composite.troops.DeliveryInitialState;
import br.unicap.eng2.debuggin_squad.war.model.composite.troops.DeliveryOfTerritoryState;
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
    private DeliveryInitialState troopsContext;

    @BeforeEach
    public void setup() {
        alocar = new TroopsService() {
            @Override
            public int deliverArmies(List<Player> players) {
                return 0;
            }
        };
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

    private void mockAfricanTerritories() {
        Territory algeria = mock(Territory.class);
        when(algeria.getName()).thenReturn("Algeria");
        when(algeria.getContinent()).thenReturn("Africa");

        Territory egypt = mock(Territory.class);
        when(egypt.getName()).thenReturn("Egypt");
        when(egypt.getContinent()).thenReturn("Africa");

        Territory sudan = mock(Territory.class);
        when(sudan.getName()).thenReturn("Sudan");
        when(sudan.getContinent()).thenReturn("Africa");

        Territory congo = mock(Territory.class);
        when(congo.getName()).thenReturn("Congo");
        when(congo.getContinent()).thenReturn("Africa");

        Territory madagascar = mock(Territory.class);
        when(madagascar.getName()).thenReturn("Madagascar");
        when(madagascar.getContinent()).thenReturn("Africa");

        Territory southAfrica = mock(Territory.class);
        when(southAfrica.getName()).thenReturn("South Africa");
        when(southAfrica.getContinent()).thenReturn("Africa");

        List<Territory> africanTerritories = new ArrayList<>();
        africanTerritories.add(algeria);
        africanTerritories.add(egypt);
        africanTerritories.add(sudan);
        africanTerritories.add(congo);
        africanTerritories.add(madagascar);
        africanTerritories.add(southAfrica);

        when(player1.getConqueredTerritories()).thenReturn(africanTerritories);
    }

    @Test
    public void testValidatesTroopsSentInTheInitialTurn() {
        mockPlayers();
        int totalTerritoriosValue = 42;
        DeliveryInitialState initialState = new DeliveryInitialState();
        int exercitosRecebidos = initialState.deliverArmies(players);

        int expectedExercitosRecebidos = totalTerritoriosValue / players.size();

        assertEquals(expectedExercitosRecebidos, exercitosRecebidos);
    }

    @Test
    public void testValidatesTroopsSentInTerritorial() {
        mockPlayers();
        mockPlayer1Territory();
        int totalTerritoriosValue = conqueredTerritories.size();
        DeliveryOfTerritoryState territoryState = new DeliveryOfTerritoryState();
        int exercitosRecebidos = territoryState.deliverArmies(players);

        int expectedExercitosRecebidos = totalTerritoriosValue / 2;

        assertEquals(expectedExercitosRecebidos, exercitosRecebidos);
    }

    @Test
    public void testValidatesTroopsSentInContinentAfrica() {
        mockPlayers();
        mockAfricanTerritories();
        ContinentTroopDelivery continentTroopDelivery = new ContinentTroopDelivery();

        int armiesReceived = continentTroopDelivery.deliverArmies(players);
        int expectedArmiesReceived = 3;

        assertEquals(expectedArmiesReceived, armiesReceived);
    }


    //Criar teste para alocação de exercitos através da troca de carta
    /*Criar um método mock para alocar as cartas*/
}