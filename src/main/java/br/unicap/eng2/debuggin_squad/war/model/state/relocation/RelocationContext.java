/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.model.state.relocation;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

import java.util.List;


public class RelocationContext {
    private RelocationState currentState;

    public RelocationContext(){currentState = new RelocationNormalState();}

    public void relocateTroops(List<Player> players, Territory origin, Territory destination, int armies) {
        currentState.relocateTroops(players, origin, destination, armies);
    }

    public boolean validateRelocate(List<Player> players, Territory origin, Territory destination, int armies) {
        return currentState.validateRelocate(players, origin, destination, armies);
    }

    public void setState(RelocationState state) {this.currentState = state;}
}
