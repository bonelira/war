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

    private void mockAsianTerritories() {
        Territory japan = mock(Territory.class);
        when(japan.getName()).thenReturn("Japan");
        when(japan.getContinent()).thenReturn("Asia");

        Territory vietnam = mock(Territory.class);
        when(vietnam.getName()).thenReturn("Vietnam");
        when(vietnam.getContinent()).thenReturn("Asia");

        Territory india = mock(Territory.class);
        when(india.getName()).thenReturn("India");
        when(india.getContinent()).thenReturn("Asia");

        Territory middleEast = mock(Territory.class);
        when(middleEast.getName()).thenReturn("Middle East");
        when(middleEast.getContinent()).thenReturn("Asia");

        Territory aral = mock(Territory.class);
        when(aral.getName()).thenReturn("Aral");
        when(aral.getContinent()).thenReturn("Asia");

        Territory omsk = mock(Territory.class);
        when(omsk.getName()).thenReturn("Omsk");
        when(omsk.getContinent()).thenReturn("Asia");

        Territory china = mock(Territory.class);
        when(china.getName()).thenReturn("China");
        when(china.getContinent()).thenReturn("Asia");

        Territory dudinka = mock(Territory.class);
        when(dudinka.getName()).thenReturn("Dudinka");
        when(dudinka.getContinent()).thenReturn("Asia");

        Territory tchita = mock(Territory.class);
        when(tchita.getName()).thenReturn("Tchita");
        when(tchita.getContinent()).thenReturn("Asia");

        Territory mongolia = mock(Territory.class);
        when(mongolia.getName()).thenReturn("Mongolia");
        when(mongolia.getContinent()).thenReturn("Asia");

        Territory siberia = mock(Territory.class);
        when(siberia.getName()).thenReturn("Siberia");
        when(siberia.getContinent()).thenReturn("Asia");

        Territory vladvostok = mock(Territory.class);
        when(vladvostok.getName()).thenReturn("Vladvostok");
        when(vladvostok.getContinent()).thenReturn("Asia");

        List<Territory> asianTerritories = new ArrayList<>();
        asianTerritories.add(japan);
        asianTerritories.add(vietnam);
        asianTerritories.add(india);
        asianTerritories.add(middleEast);
        asianTerritories.add(aral);
        asianTerritories.add(omsk);
        asianTerritories.add(china);
        asianTerritories.add(dudinka);
        asianTerritories.add(tchita);
        asianTerritories.add(mongolia);
        asianTerritories.add(siberia);
        asianTerritories.add(vladvostok);

        when(player1.getConqueredTerritories()).thenReturn(asianTerritories);
    }

    private void mockEuropeanTerritories() {
        Territory sweden = mock(Territory.class);
        when(sweden.getName()).thenReturn("Sweden");
        when(sweden.getContinent()).thenReturn("Europe");

        Territory germany = mock(Territory.class);
        when(germany.getName()).thenReturn("Germany");
        when(germany.getContinent()).thenReturn("Europe");

        Territory poland = mock(Territory.class);
        when(poland.getName()).thenReturn("Poland");
        when(poland.getContinent()).thenReturn("Europe");

        Territory moscow = mock(Territory.class);
        when(moscow.getName()).thenReturn("Moscow");
        when(moscow.getContinent()).thenReturn("Europe");

        Territory france = mock(Territory.class);
        when(france.getName()).thenReturn("France");
        when(france.getContinent()).thenReturn("Europe");

        Territory england = mock(Territory.class);
        when(england.getName()).thenReturn("England");
        when(england.getContinent()).thenReturn("Europe");

        Territory iceland = mock(Territory.class);
        when(iceland.getName()).thenReturn("Iceland");
        when(iceland.getContinent()).thenReturn("Europe");

        Territory greenland = mock(Territory.class);
        when(greenland.getName()).thenReturn("Greenland");
        when(greenland.getContinent()).thenReturn("Europe");

        List<Territory> europeanTerritories = new ArrayList<>();
        europeanTerritories.add(sweden);
        europeanTerritories.add(germany);
        europeanTerritories.add(poland);
        europeanTerritories.add(moscow);
        europeanTerritories.add(france);
        europeanTerritories.add(england);
        europeanTerritories.add(iceland);
        europeanTerritories.add(greenland);

        when(player1.getConqueredTerritories()).thenReturn(europeanTerritories);
    }

    private void mockNorthAmericanTerritories() {
        Territory alaska = mock(Territory.class);
        when(alaska.getName()).thenReturn("Alaska");
        when(alaska.getContinent()).thenReturn("North America");

        Territory mackenzie = mock(Territory.class);
        when(mackenzie.getName()).thenReturn("Mackenzie");
        when(mackenzie.getContinent()).thenReturn("North America");

        Territory vancouver = mock(Territory.class);
        when(vancouver.getName()).thenReturn("Vancouver");
        when(vancouver.getContinent()).thenReturn("North America");

        Territory ottawa = mock(Territory.class);
        when(ottawa.getName()).thenReturn("Ottawa");
        when(ottawa.getContinent()).thenReturn("North America");

        Territory newYork = mock(Territory.class);
        when(newYork.getName()).thenReturn("New York");
        when(newYork.getContinent()).thenReturn("North America");

        Territory labrador = mock(Territory.class);
        when(labrador.getName()).thenReturn("Labrador");
        when(labrador.getContinent()).thenReturn("North America");

        Territory mexico = mock(Territory.class);
        when(mexico.getName()).thenReturn("Mexico");
        when(mexico.getContinent()).thenReturn("North America");

        Territory california = mock(Territory.class);
        when(california.getName()).thenReturn("California");
        when(california.getContinent()).thenReturn("North America");

        List<Territory> northAmericanTerritories = new ArrayList<>();
        northAmericanTerritories.add(alaska);
        northAmericanTerritories.add(mackenzie);
        northAmericanTerritories.add(vancouver);
        northAmericanTerritories.add(ottawa);
        northAmericanTerritories.add(newYork);
        northAmericanTerritories.add(labrador);
        northAmericanTerritories.add(mexico);
        northAmericanTerritories.add(california);

        when(player1.getConqueredTerritories()).thenReturn(northAmericanTerritories);
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

    @Test
    public void testValidatesTroopsSentInContinentAsia() {
        mockPlayers();
        mockAsianTerritories();
        ContinentTroopDelivery continentTroopDelivery = new ContinentTroopDelivery();

        int armiesReceived = continentTroopDelivery.deliverArmies(players);
        int expectedArmiesReceived = 7;

        assertEquals(expectedArmiesReceived, armiesReceived);
    }

    @Test
    public void testValidatesTroopsSentInContinentEuropean() {
        mockPlayers();
        mockEuropeanTerritories();
        ContinentTroopDelivery continentTroopDelivery = new ContinentTroopDelivery();

        int armiesReceived = continentTroopDelivery.deliverArmies(players);
        int expectedArmiesReceived = 5;

        assertEquals(expectedArmiesReceived, armiesReceived);
    }

    @Test
    public void testValidatesTroopsSentInContinentNorthAmerica() {
        mockPlayers();
        mockNorthAmericanTerritories();
        ContinentTroopDelivery continentTroopDelivery = new ContinentTroopDelivery();

        int armiesReceived = continentTroopDelivery.deliverArmies(players);
        int expectedArmiesReceived = 5;

        assertEquals(expectedArmiesReceived, armiesReceived);
    }

    //Criar teste para alocação de exercitos através da troca de carta
    /*Criar um método mock para alocar as cartas*/
}