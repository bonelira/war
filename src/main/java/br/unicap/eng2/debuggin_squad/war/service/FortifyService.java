/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.service;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

import java.util.List;

public class FortifyService {
    public static final String MSG_TERRITORY_NOT_CONQUERED = "The player does not have this territory";
    public FortifyService( ) {}

    public void fortificationArmies(Player player, int armies, Territory origin) {
        List<Territory> conqueredTerritories = player.getConqueredTerritories();
        if (!conqueredTerritories.contains(origin)) {
            throw new IllegalArgumentException(MSG_TERRITORY_NOT_CONQUERED);
        }
        while (armies > 0) {
            origin.addArmies(armies);
            armies--;
        }
    }
}
