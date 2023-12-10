/**
 * @author Bruno Irae <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.model.state.relocation;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

import java.util.List;

public class RelocationNormalState implements RelocationState {
    private RelocationState currentState;
    public static final String MSG_ERROR_RELOCATION = "Relocation failed.";
    public static final String MSG_TERRITORY_NOT_ADJACENT = "This territory is not adjacent";
    public static final String MSG_TERRITORY_NOT_CONQUERED = "This territory does not belong to the player";
    public static final String MSG_TERRITORY_ONE_ARMY = "You cannot relocate armies if there is only 1 army in the home territory";
    public static final String MSG_TERRITORY_CURRENT_MOVIMENT = "Territory was used in the current movement";

    @Override
    public void relocateTroops(List<Player> players, Territory origin, Territory destination, int armies) {
        if (validateRelocate(players, origin, destination, armies)) {
            while (armies > 0) {
                origin.addArmies(1);
                origin.removeArmies(1);
                armies--;
            }
        } else {
            throw new IllegalArgumentException(MSG_ERROR_RELOCATION);
        }
    }

    @Override
    public boolean validateRelocate(List<Player> players, Territory origin, Territory destination, int armies) {
        Player player = players.stream()
                .filter(p -> p.getConqueredTerritories().contains(origin))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(MSG_TERRITORY_NOT_CONQUERED));

        if (!player.getConqueredTerritories().contains(destination)) {
            throw new IllegalArgumentException(MSG_TERRITORY_NOT_CONQUERED);
        }

        if (!origin.isAdjacent(destination)) {
            throw new IllegalArgumentException(MSG_TERRITORY_NOT_ADJACENT);
        }

        if (origin.getArmiesCount() <= 1) {
            throw new IllegalArgumentException(MSG_TERRITORY_ONE_ARMY);
        }

        if (origin.hasBeenUsedInCurrentMove()) {
            throw new IllegalArgumentException(MSG_TERRITORY_CURRENT_MOVIMENT);
        }

        origin.setHasBeenUsedInCurrentMove(true);

        return true;
    }

    @Override
    public void setState(RelocationState state) {
        this.currentState = state;
    }
}
