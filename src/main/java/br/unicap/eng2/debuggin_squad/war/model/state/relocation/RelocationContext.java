/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.model.state.relocation;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;


public class RelocationContext {
    private RelocationState currentState;

    public RelocationContext(){currentState = new RelocationNormalState();}

    public void relocateTroops(Player player, Territory origin, Territory destination, int armies) {
        currentState.relocateTroops(player, origin, destination, armies);
    }

    public boolean validateRelocate(Player player, Territory origin, Territory destination, int armies) {
        return currentState.validateRelocate(player, origin, destination, armies);
    }

    public void setState(RelocationState state) {this.currentState = state;}
}
