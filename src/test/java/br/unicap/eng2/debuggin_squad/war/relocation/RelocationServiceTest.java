/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.relocation;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;
import br.unicap.eng2.debuggin_squad.war.inicialization.Director;
import br.unicap.eng2.debuggin_squad.war.inicialization.DefaultGameBuilder;
import br.unicap.eng2.debuggin_squad.war.inicialization.WarGame;
import br.unicap.eng2.debuggin_squad.war.model.state.relocation.RelocationContext;
import br.unicap.eng2.debuggin_squad.war.model.state.relocation.RelocationNormalState;
import br.unicap.eng2.debuggin_squad.war.service.RelocationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RelocationServiceTest {
    private Player player1;
    private Player player2;

    private Territory territory;
    private Territory territory2;

    private RelocationService realocar;
    private RelocationContext relocationContext;

    private Director director;

    private DefaultGameBuilder builder;

    private WarGame game;

    @BeforeEach
    public void setUp() {
        realocar = new RelocationService();
        relocationContext = new RelocationContext();
        director = new Director();
        builder = new DefaultGameBuilder();
        game = builder.getResult();
    }

    @Test
    public void testValidRelocation() throws Exception {
        director.constructDefaultGame(builder);
        player1 = game.getPlayers().get(0) ;
        territory = player1.getConqueredTerritories().get(0);territory.setArmiesCount(5);
        territory2 = player1.getConqueredTerritories().get(1);territory2.setArmiesCount(5);
        territory.addAdjacentTerritory(territory2);

        List<Player> listPlayers = Collections.singletonList(player1);
        realocar.relocationTroops(listPlayers, territory, territory2, 4);

        assertEquals(1, territory.getArmiesCount() - 4);
        assertEquals(9, territory2.getArmiesCount() + 4);
    }

    @Test
    public void testValidateErrorTerritoryNotAdjacent() throws Exception {
        director.constructDefaultGame(builder);
        player1 = game.getPlayers().get(0) ;
        territory = player1.getConqueredTerritories().get(0);territory.setArmiesCount(5);
        territory2 = player1.getConqueredTerritories().get(1);territory2.setArmiesCount(5);

        List<Player> listPlayers = Collections.singletonList(player1);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            realocar.relocationTroops(listPlayers, territory, territory2, 4);
        });

        assertEquals(RelocationNormalState.MSG_TERRITORY_NOT_ADJACENT, exception.getMessage());
    }

    @Test
    public void testValidateErrorTerritoryNotConquered() throws Exception {
        director.constructDefaultGame(builder);
        player1 = game.getPlayers().get(0);
        player2 = game.getPlayers().get(1);
        territory = player1.getConqueredTerritories().get(0);territory.setArmiesCount(5);
        territory2 = player2.getConqueredTerritories().get(1);territory2.setArmiesCount(5);
        territory.addAdjacentTerritory(territory2);

        List<Player> listPlayers = Collections.singletonList(player1);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            realocar.relocationTroops(listPlayers, territory, territory2, 4);
        });

        assertEquals(RelocationNormalState.MSG_TERRITORY_NOT_CONQUERED, exception.getMessage());
    }

    @Test
    public void testValidRelocationAfterCurrentMovement() throws Exception {
        director.constructDefaultGame(builder);
        player1 = game.getPlayers().get(0) ;
        territory = player1.getConqueredTerritories().get(0);territory.setArmiesCount(5);
        territory2 = player1.getConqueredTerritories().get(1);territory2.setArmiesCount(5);
        territory.addAdjacentTerritory(territory2);

        List<Player> listPlayers = Collections.singletonList(player1);
        territory.setHasBeenUsedInCurrentMove(true);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            realocar.relocationTroops(listPlayers, territory, territory2, 4);
        });

        assertEquals(RelocationNormalState.MSG_TERRITORY_CURRENT_MOVIMENT, exception.getMessage());
    }
}
