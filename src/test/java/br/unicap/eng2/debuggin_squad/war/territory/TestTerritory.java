/**
 * @author Bruno Vicente <brunohiperbole@gmail.com>
 */

package br.unicap.eng2.debuggin_squad.war.territory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;


public class TestTerritory {

        
    @Test
    public void test01AddArmies() {
        Territory territory = new Territory("NomeTerritorio", 5);
        territory.addArmies(3);
        assertEquals(8, territory.getArmiesCount());
    }

    @Test
    public void test02RemoveArmies() {
        Territory territory = new Territory("NomeTerritorio", 5);
        territory.removeArmies(2);
        assertEquals(3, territory.getArmiesCount());
    }

    @Test
    public void test03SetArmiesCount() {
        Territory territory = new Territory("NomeTerritorio", 5);
        territory.setArmiesCount(10);
        assertEquals(10, territory.getArmiesCount());
    }

    @Test
    public void test04AddAdjacentTerritory() {
        Territory territory1 = new Territory("Territorio1", 3);
        Territory territory2 = new Territory("Territorio2", 2);
        territory1.addAdjacentTerritory(territory2);
        assertTrue(territory1.isAdjacent(territory2));
        assertTrue(territory2.isAdjacent(territory1));
    }

    @Test
    public void test05IsAdjacent() {
        Territory territory1 = new Territory("Territorio1", 3);
        Territory territory2 = new Territory("Territorio2", 2);

        territory1.addAdjacentTerritory(territory2);

        assertTrue(territory1.isAdjacent(territory2));
        assertFalse(territory1.isAdjacent(new Territory("Territorio3", 1)));
    }

    @Test
    public void test06SetAndGetContinent() {
        Territory territory = new Territory("NomeTerritorio", 5);
        territory.setContinent("ContinenteXYZ");
        assertEquals("ContinenteXYZ", territory.getContinent());
    }

    @Test
    public void test07SetAndGetProprietario() {
        Territory territory = new Territory("NomeTerritorio", 5);
        Player player = new Player("Jogador1", "01");
        territory.setProprietario(player);
        assertEquals(player, territory.getProprietario());
    }

    @Test
    public void test08SetAndGetHasBeenUsedInCurrentMove() {
        Territory territory = new Territory("NomeTerritorio", 5);
        territory.setHasBeenUsedInCurrentMove(true);
        assertTrue(territory.hasBeenUsedInCurrentMove());
    }



}
