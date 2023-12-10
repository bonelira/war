/**
 * @author Bruno Vicente <brunohiperbole@gmail.com>
 */


package br.unicap.eng2.debuggin_squad.war.povoar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import br.unicap.eng2.debuggin_squad.war.controller.ID;
import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;
import br.unicap.eng2.debuggin_squad.war.service.PovoarTerritory;

public class PovoarTerritoryTest {


    @Test
    public void test01PopulateConqueredTerritory() {
        Territory conqueredTerritory = new Territory("ConqueredTerritory", 5);
        List<Territory> adjacentTerritories = new ArrayList<>();
        Player conqueringPlayer = new Player("ConqueringPlayer", ID.BLACK);

        PovoarTerritory.populateConqueredTerritory(conqueredTerritory, adjacentTerritories, conqueringPlayer, 3);

        assertEquals(8, conqueredTerritory.getArmiesCount());
        assertEquals(conqueringPlayer, conqueredTerritory.getProprietario());
        assertTrue(conqueringPlayer.getConqueredTerritories().contains(conqueredTerritory));
    }


    @Test
    public void test02ConquerAdjacentTerritories() {
        Territory conqueredTerritory = new Territory("ConqueredTerritory", 5);
        List<Territory> adjacentTerritories = new ArrayList<>();
        adjacentTerritories.add(new Territory("AdjacentTerritory1", 5));
        adjacentTerritories.add(new Territory("AdjacentTerritory2", 5));
        Player conqueringPlayer = new Player("ConqueringPlayer", ID.BLACK);

        PovoarTerritory.conquerAdjacentTerritories(conqueringPlayer, conqueredTerritory, adjacentTerritories);

        for (Territory adjacentTerritory : adjacentTerritories) {
            assertEquals(6, adjacentTerritory.getArmiesCount());
            assertEquals(conqueringPlayer, adjacentTerritory.getProprietario());
            assertTrue(conqueringPlayer.getConqueredTerritories().contains(adjacentTerritory));
        }
    }

    @Test
    public void test03FortifyTerritory() {
        Territory fromTerritory = new Territory("FromTerritory", 3);
        Territory toTerritory = new Territory("ToTerritory", 3);

        fromTerritory.addArmies(5);

        PovoarTerritory.fortifyTerritory(fromTerritory, toTerritory, 3);

        assertEquals(5, fromTerritory.getArmiesCount());
        assertEquals(6, toTerritory.getArmiesCount());
    }

    
}
