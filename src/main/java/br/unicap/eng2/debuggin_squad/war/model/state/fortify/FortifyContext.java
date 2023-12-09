/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.model.state.fortify;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

import java.util.List;

public class FortifyContext {
    private FortifyState currentState;

    public FortifyContext() {
        currentState = new FortifyNormalState();
    }

    public void fortifyArmies(List<Player> players, int armies, Territory origin) {
        currentState.fortifyArmies(players, armies, origin);
    }

    public boolean validateFortification(List<Player> players, int armies, Territory origin) {
        return currentState.validateFortification(players, armies, origin);
    }

    public void setState(FortifyState state) {
        this.currentState = state;
    }
}
