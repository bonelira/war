/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.model.state.fortify;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

public class FortifyAfterConquerState implements FortifyState {
    private FortifyState currentState;
    public static final String MSG_ERROR_AFTER_FORTIFICATION = "Fortification after conquering failed.";
    public static final String MSG_TERRITORY_NOT_CONQUERED = "This territory does not belong to the player1";
    public static final String MSG_ALLOCATE_MORE_ARMY = "Need to allocate one or more exercises in the conquered territory";

    @Override
    public void fortifyArmies(Player player, int armies, Territory origin) {
        if (validateFortification(player, armies, origin)) {
            origin.addArmies(armies);
        } else {
            throw new IllegalArgumentException(MSG_ERROR_AFTER_FORTIFICATION);
        }
    }

    @Override
    public boolean validateFortification(Player player, int armies, Territory origin) {
        Player ownerOfTerritory = origin.getProprietario();
        if (origin.getArmiesCount() <= 0) {
            throw new IllegalArgumentException(MSG_ALLOCATE_MORE_ARMY);
        }
        else if (!ownerOfTerritory.equals(player)) {
            throw new IllegalArgumentException(MSG_TERRITORY_NOT_CONQUERED);
        }
        return true;
    }

    @Override
    public void setState(FortifyState state) {
        this.currentState = state;
    }
}
