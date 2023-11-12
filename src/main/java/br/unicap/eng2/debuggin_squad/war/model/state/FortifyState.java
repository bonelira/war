/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.model.state;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

public interface FortifyState {
    void fortifyArmies(Player player, int armies, Territory origin);
    boolean validateFortification(Player player, int armies, Territory origin);
    void setState(FortifyState state);
}
