package br.unicap.eng2.debuggin_squad.war.service;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

import java.util.List;

public class RelocationService {
    public static final String MSG_TERRITORY_NOT_ADJACENT = "This territory is not adjacent";
    public static final String MSG_TERRITORY_NOT_CONQUERED = "This territory does not belong to the player";
    public static final String MSG_TERRITORY_ONE_ARMY = "You cannot relocate armies if there is only 1 army in the home territory";

    public RelocationService(){}

    public static void relocateTroops(Player player, Territory origin, Territory destination, int armies) {
        List<Territory> conqueredTerritories = player.getConqueredTerritories();
        if (!conqueredTerritories.contains(origin) || !conqueredTerritories.contains(destination)) {
            throw new IllegalArgumentException(MSG_TERRITORY_NOT_CONQUERED);
        }
        if (!origin.isAdjacent(destination)) {
            throw new IllegalArgumentException(MSG_TERRITORY_NOT_ADJACENT);
        }
        if (origin.getArmiesCount() <= 1) {
            throw new IllegalArgumentException(MSG_TERRITORY_ONE_ARMY);
        }
        origin.removeArmies(armies);
        destination.addArmies(armies);
    }
}