package br.unicap.eng2.debuggin_squad.war.model.state.relocation;


import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

import java.util.List;

public class RelocationNormalState implements RelocationState{
    private RelocationState currentState;
    public static final String MSG_ERROR_RELOCATION = "Relocation failed.";
    public static final String MSG_TERRITORY_NOT_ADJACENT = "This territory is not adjacent";
    public static final String MSG_TERRITORY_NOT_CONQUERED = "This territory does not belong to the player";
    public static final String MSG_TERRITORY_ONE_ARMY = "You cannot relocate armies if there is only 1 army in the home territory";


    @Override
    public void relocateTroops(Player player, Territory origin, Territory destination, int armies) {
        if (validateRelocate(player, origin, destination, armies)) {
            origin.removeArmies(armies);
            destination.addArmies(armies);
        }else {
            throw new IllegalArgumentException(MSG_ERROR_RELOCATION);
        }
    }

    @Override
    public boolean validateRelocate(Player player, Territory origin, Territory destination, int armies) {
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
        return true;
    }

    @Override
    public void setState(RelocationState state) {this.currentState = state;}
}
