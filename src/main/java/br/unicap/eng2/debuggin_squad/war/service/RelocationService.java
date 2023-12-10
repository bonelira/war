/**
 * @author Bruno Irae <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.service;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;
import br.unicap.eng2.debuggin_squad.war.model.state.relocation.RelocationContext;

import java.util.List;

public class RelocationService {
    private static RelocationContext relocationContext;

    public RelocationService(){relocationContext = new RelocationContext();}

    public static void relocationTroops(List<Player> players, Territory origin, Territory destination, int armies) {
        relocationContext.relocateTroops(players, origin, destination, armies);
    }
}