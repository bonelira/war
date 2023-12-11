/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.model.state.fortify;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

import java.util.List;

public class FortifyAfterConquerState implements FortifyState {
    private FortifyState currentState;
    public static final String MSG_ERROR_AFTER_FORTIFICATION = "Fortification after conquering failed.";
    public static final String MSG_TERRITORY_NOT_CONQUERED = "This territory does not belong to any player in the list";
    public static final String MSG_ALLOCATE_MORE_ARMY = "Need to allocate one or more armies in the conquered territory";
    public static final String ALLOCATE_ALL_ARMIES = "Cannot move your entire army";

    @Override
    public void fortifyArmies(List<Player> players, int armies, Territory origin) {
        if (validateFortification(players, armies, origin)) {
            origin.addArmies(armies);
        } else {
            throw new IllegalArgumentException(MSG_ERROR_AFTER_FORTIFICATION);
        }
    }

    @Override
    public boolean validateFortification(List<Player> players, int armies, Territory origin) {
        Player ownerOfTerritory = origin.getProprietario();

        if (origin.getArmiesCount() <= 0) {
            throw new IllegalArgumentException(MSG_ALLOCATE_MORE_ARMY);
        } else if (!players.contains(ownerOfTerritory)) {
            throw new IllegalArgumentException(MSG_TERRITORY_NOT_CONQUERED);
        } else if (origin.getArmiesCount() <= armies) {
            throw new IllegalArgumentException(ALLOCATE_ALL_ARMIES);
        }

        return true;
    }

    @Override
    public void setState(FortifyState state) {
        this.currentState = state;
    }
}
