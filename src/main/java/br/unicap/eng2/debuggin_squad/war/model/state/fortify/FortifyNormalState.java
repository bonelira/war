/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.model.state.fortify;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

import java.util.List;

public class FortifyNormalState implements FortifyState {
    private FortifyState currentState;
    public static final String MSG_ERROR_FORTIFICATION = "Fortification failed.";
    public static final String MSG_TERRITORY_NOT_CONQUERED = "This territory does not belong to the player";
    public static final String MSG_ALLOCATE_MORE_ARMY = "Need to allocate one or more exercises in the conquered territory";

    @Override
    public void fortifyArmies(List<Player> players, int armies, Territory origin) {
        if (validateFortification(players, armies, origin)) {
            while (armies > 0) {
                for (Player player : players) {
                    origin.addArmies(1);
                    armies--;
                }
            }
        } else {
            throw new IllegalArgumentException(MSG_ERROR_FORTIFICATION);
        }
    }

    public boolean validateFortification(List<Player> players, int armies, Territory origin) {
        for (Player player : players) {
            Player ownerOfTerritory = origin.getProprietario();
            if (!ownerOfTerritory.equals(player)) {
                throw new IllegalArgumentException(MSG_TERRITORY_NOT_CONQUERED);
            }
        }
        return true;
    }

    @Override
    public void setState(FortifyState state) {
        this.currentState = state;
    }
}