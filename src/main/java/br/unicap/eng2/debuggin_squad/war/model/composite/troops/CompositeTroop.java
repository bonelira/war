/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.model.composite.troops;

import br.unicap.eng2.debuggin_squad.war.controller.Player;

import java.util.List;

class CompositeTroop implements TroopsComponent {
    private List<TroopsComponent> troops;

    public CompositeTroop(List<TroopsComponent> troops) {
        this.troops = troops;
    }

    @Override
    public int deliverArmies(List<Player> players) {
        int totalArmies = 0;
        for (TroopsComponent troop : troops) {
            totalArmies += troop.deliverArmies(players);
        }
        return totalArmies;
    }

}