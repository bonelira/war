/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.service;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;
import br.unicap.eng2.debuggin_squad.war.model.state.relocation.RelocationContext;

public class RelocationService {
    private static RelocationContext relocationContext;

    public RelocationService(){relocationContext = new RelocationContext();}

    public static void relocationTroops(Player player, Territory origin, Territory destination, int armies) {
        relocationContext.relocateTroops(player, origin, destination, armies);
    }
}