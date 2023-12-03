/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.model.state.relocation;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

public interface RelocationState {
    void relocateTroops(Player player, Territory origin, Territory destination, int armies);
    boolean validateRelocate(Player player, Territory origin, Territory destination, int armies);
    void setState(RelocationState state);
}
