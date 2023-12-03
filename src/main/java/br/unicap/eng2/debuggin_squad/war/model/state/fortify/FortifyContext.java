/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.model.state.fortify;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

public class FortifyContext {
    private FortifyState currentState;

    public FortifyContext() {
        currentState = new FortifyNormalState();
    }

    public void fortifyArmies(Player player, int armies, Territory origin) {
        currentState.fortifyArmies(player, armies, origin);
    }

    public boolean validateFortification(Player player, int armies, Territory origin) {
        return currentState.validateFortification(player, armies, origin);
    }

    public void setState(FortifyState state) {
        this.currentState = state;
    }
}
