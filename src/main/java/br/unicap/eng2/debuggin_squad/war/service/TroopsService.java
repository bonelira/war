/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.service;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.model.composite.troops.TroopsComponent;


import java.util.List;

public class TroopsService {
    private TroopsComponent troopsComponent;

    public TroopsService() {
        this.troopsComponent = troopsComponent;
    }

    public int deliverArmies(List<Player> players) {
        return troopsComponent.deliverArmies(players);
    }
}
