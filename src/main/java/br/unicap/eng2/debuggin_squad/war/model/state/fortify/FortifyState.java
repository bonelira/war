/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.model.state.fortify;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

import java.util.List;

public interface FortifyState {
    void fortifyArmies(List<Player> players, int armies, Territory origin);
    boolean validateFortification(List<Player> players, int armies, Territory origin);
    void setState(FortifyState state);
}
