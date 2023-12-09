/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.fortify;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;
import br.unicap.eng2.debuggin_squad.war.inicialization.Director;
import br.unicap.eng2.debuggin_squad.war.inicialization.GameBuilder;
import br.unicap.eng2.debuggin_squad.war.inicialization.WarGame;
import br.unicap.eng2.debuggin_squad.war.model.state.fortify.FortifyAfterConquerState;
import br.unicap.eng2.debuggin_squad.war.model.state.fortify.FortifyContext;
import br.unicap.eng2.debuggin_squad.war.service.FortifyService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FortifyServiceTest  {
    private Player player1;

    private Territory territory;
    private Territory adjacent;

    private int simulationArmies = 7;

    private FortifyService fortificar;

    private FortifyContext fortifyContext;

    private Director director;

    private GameBuilder builder;

    private WarGame game;

    @BeforeEach
    public void setup() {
        fortificar = new FortifyService();
        fortifyContext = new FortifyContext();
        director = new Director();
        builder = new GameBuilder();
        game = builder.getResult();
    }

    @Test
    public void testVerifyExerciseAcquisitionAndAllocation() {
        director.constructDefaultGame(builder);
        player1 = game.getPlayers().get(0) ;
        territory = player1.getConqueredTerritories().get(0);
        territory.setProprietario(player1); territory.setArmiesCount(0);

        List<Player> listPlayers = Collections.singletonList(player1);
        fortificar.fortificationArmies(listPlayers, simulationArmies, territory);
        int totalArmies = territory.getArmiesCount();

        assertEquals(simulationArmies, totalArmies);
    }

    @Test
    public void testCheckWhetherTheArmyIsBeingAllocated() {
        director.constructDefaultGame(builder);
        player1 = game.getPlayers().get(0);
        territory = player1.getConqueredTerritories().get(0);
        territory.setProprietario(player1);territory.setArmiesCount(0);

        int initialArmies = simulationArmies;
        List<Player> listPlayers = Collections.singletonList(player1);
        fortificar.fortificationArmies(listPlayers, simulationArmies, territory);

        assertEquals(0, initialArmies - simulationArmies);
    }

    @Test
    public void testValidateErrorArmyAllocation() {
        fortifyContext.setState(new FortifyAfterConquerState());
        director.constructDefaultGame(builder);
        player1 = game.getPlayers().get(0);
        territory = player1.getConqueredTerritories().get(0);
        territory.setProprietario(player1);territory.setArmiesCount(0);

        List<Player> allPlayers = game.getPlayers();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            fortifyContext.fortifyArmies(allPlayers, 0, territory);
        });

        assertEquals(FortifyAfterConquerState.MSG_ALLOCATE_MORE_ARMY, exception.getMessage());
    }

    @Test
    public void testValidateErrorAllocateAllArmies() {
        fortifyContext.setState(new FortifyAfterConquerState());
        director.constructDefaultGame(builder);
        player1 = game.getPlayers().get(4) ;
        territory = player1.getConqueredTerritories().get(0);
        territory.setProprietario(player1); territory.setArmiesCount(1);

        List<Player> listPlayers = Collections.singletonList(player1);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            fortifyContext.fortifyArmies(listPlayers, 1, territory);
        });

        assertEquals(FortifyAfterConquerState.ALLOCATE_ALL_ARMIES, exception.getMessage());
    }
}