/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.fortify;

import br.unicap.eng2.debuggin_squad.war.Initialization;
import br.unicap.eng2.debuggin_squad.war.controller.Armies;
import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;
import br.unicap.eng2.debuggin_squad.war.model.state.fortify.FortifyAfterConquerState;
import br.unicap.eng2.debuggin_squad.war.model.state.fortify.FortifyContext;
import br.unicap.eng2.debuggin_squad.war.service.FortifyService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class FortifyServiceTest extends Initialization {
    private Player player1;

    private Territory territory;
    private List<Territory> conqueredTerritories;
    private Territory brasil;
    private Territory argentina;
    private Territory colombia;

    private List<Armies> armiesList;
    private int simulationArmies = 7;

    private FortifyService fortificar;

    private FortifyContext fortifyContext;

    @BeforeEach
    public void setup() {
        fortificar = new FortifyService();
        fortifyContext = new FortifyContext();
        conqueredTerritories = new ArrayList<Territory>();
        armiesList = new ArrayList<Armies>();
    }

    private void mockTerritory() {
        brasil = mock(Territory.class);
        argentina = mock(Territory.class);
        colombia = mock(Territory.class);

        territory = mock(Territory.class);
        conqueredTerritories.add(territory);

        // Mock do método getArmies
        when(territory.getArmiesCount()).thenReturn(0);
    }

    private void mockTerritoryAndArmy() {
        brasil = mock(Territory.class);
        when(brasil.getArmiesCount()).thenReturn(5);
        when(brasil.getProprietario()).thenReturn(player1); 

        argentina = mock(Territory.class);
        when(argentina.getArmiesCount()).thenReturn(5);
        when(argentina.getProprietario()).thenReturn(player1); 

        colombia = mock(Territory.class);
        when(colombia.getArmiesCount()).thenReturn(5);
        when(colombia.getProprietario()).thenReturn(player1); 
    }
    
    private void mockPlayer1Territory() {
        player1 = mock(Player.class);
        when(player1.getId()).thenReturn("1");

        conqueredTerritories.add(brasil);
        conqueredTerritories.add(argentina);
        conqueredTerritories.add(colombia);

        when(player1.getConqueredTerritories()).thenReturn(conqueredTerritories);
    }

    private void mockArmies() {
        Armies armies = mock(Armies.class);
        when(armies.getArmies()).thenReturn(simulationArmies);
        armiesList.add(armies);
    }

    @Test
    public void testVerifyExerciseAcquisitionAndAllocation() {
        mockPlayer1Territory();mockArmies();mockTerritoryAndArmy();

        fortificar.fortificationArmies(player1, simulationArmies, brasil);
        int totalArmies = armiesList.stream().mapToInt(Armies::getArmies).sum();

        assertEquals(simulationArmies, totalArmies);
    }

    @Test
    public void testCheckWhetherTheArmyIsBeingAllocated() {
        mockPlayer1Territory();mockArmies();mockTerritoryAndArmy();

        int initialArmies = simulationArmies;
        fortificar.fortificationArmies(player1, simulationArmies, brasil);

        assertEquals(0, initialArmies - simulationArmies);
    }

    @Test
    public void testValidateErrorArmyAllocation() {
        mockPlayer1Territory();
        mockArmies();
        mockTerritory();
        int armyZero = 0;
        fortifyContext.setState(new FortifyAfterConquerState());

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            fortifyContext.fortifyArmies(player1, armyZero, brasil);
        });

        assertEquals(FortifyAfterConquerState.MSG_ALLOCATE_MORE_ARMY, exception.getMessage());
    }
}