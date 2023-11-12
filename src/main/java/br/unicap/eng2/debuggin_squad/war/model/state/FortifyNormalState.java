/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.model.state;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

public class FortifyNormalState implements FortifyState {
    private FortifyState currentState;
    public static final String MSG_ERROR_FORTIFICATION = "Fortification failed.";
    public static final String MSG_TERRITORY_NOT_CONQUERED = "This territory does not belong to the player";
    public static final String MSG_ALLOCATE_MORE_ARMY = "Need to allocate one or more exercises in the conquered territory";


    @Override
    public void fortifyArmies(Player player, int armies, Territory origin) {
        if (validateFortification(player, armies, origin)) {
            origin.addArmies(armies);
        } else {
            throw new IllegalArgumentException(MSG_ERROR_FORTIFICATION);
        }
    }

    @Override
    public boolean validateFortification(Player player, int armies, Territory origin) {
        /*List<Territory> conqueredTerritories = player.getConqueredTerritories();
        if (!conqueredTerritories.contains(origin)) {
            throw new IllegalArgumentException(MSG_TERRITORY_NOT_CONQUERED);
        }*/
        if (origin.getArmiesCount() <= 0) {
            throw new IllegalArgumentException(MSG_ALLOCATE_MORE_ARMY);
        }
        return true;
    }

    @Override
    public void setState(FortifyState state) {
        this.currentState = state;
    }

}