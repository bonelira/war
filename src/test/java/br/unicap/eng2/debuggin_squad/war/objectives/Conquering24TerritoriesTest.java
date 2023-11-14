package br.unicap.eng2.debuggin_squad.war.objectives;

import br.unicap.eng2.debuggin_squad.war.Player;
import br.unicap.eng2.debuggin_squad.war.Territory;
import br.unicap.eng2.debuggin_squad.war.interfaces.IObjective;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Conquering24TerritoriesTest {

    private Player player;
    private Territory territory;
    private IObjective objective;

    @Test
    public void testObjectiveAchievedWithNoTerritories() {
        player = new Player("Player1", "ID1");
        objective = new Conquering24Territories();
        territory = new Territory("Territory1", 1);
        assertFalse(objective.objectiveAchieved(territory, player));
    }

    @Test
    public void testObjectiveAchievedWith24Territories() {
        player = new Player("Player1", "ID1");
        IObjective  objective = new Conquering24Territories();
        for (int i = 0; i < 24; i++) {
            territory = new Territory("Territory" + i, 1);
            territory.setProprietario(player);
            player.getConqueredTerritories().add(territory);
        }
        assertTrue(objective.objectiveAchieved(territory,player));
    }

    @Test
    public void testObjectiveAchievedWithLess24Territories() {
        player = new Player("Player1", "ID1");
        objective = new Conquering24Territories();
        for (int i = 0; i < 23; i++) {
            territory = new Territory("Territory" + i, 1);
            territory.setProprietario(player);
            player.getConqueredTerritories().add(territory);
        }
        assertFalse(objective.objectiveAchieved(territory, player));
    }


}
