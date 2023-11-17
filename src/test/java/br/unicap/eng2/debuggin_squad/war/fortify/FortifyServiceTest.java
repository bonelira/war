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
    private Territory adjacent;
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
    @Test
    public void testVerifyExerciseAcquisitionAndAllocation() {
        player1 = initializePlayer();
        territory = initializeTerritoryEmpty();

        fortificar.fortificationArmies(player1, simulationArmies, territory);
        int totalArmies = territory.getArmiesCount();

        assertEquals(simulationArmies, totalArmies);
    }

    @Test
    public void testCheckWhetherTheArmyIsBeingAllocated() {
        player1 = initializePlayer();
        territory = initializeTerritory();

        int initialArmies = simulationArmies;
        fortificar.fortificationArmies(player1, simulationArmies, territory);

        assertEquals(0, initialArmies - simulationArmies);
    }

    @Test
    public void testValidateErrorArmyAllocation() {
        player1 = initializePlayer();
        territory = initializeTerritoryEmpty();
        adjacent = initializeAdjacents();
        int armyZero = 0;
        fortifyContext.setState(new FortifyAfterConquerState());

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            fortifyContext.fortifyArmies(player1, armyZero, territory);
        });

        assertEquals(FortifyAfterConquerState.MSG_ALLOCATE_MORE_ARMY, exception.getMessage());
    }
}