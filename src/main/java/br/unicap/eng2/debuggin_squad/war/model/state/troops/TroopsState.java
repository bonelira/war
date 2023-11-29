/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.model.state.troops;

import br.unicap.eng2.debuggin_squad.war.controller.Player;

import java.util.List;

public interface TroopsState {
    int deliverArmiesInInitialTurn(List<Player> players);
    int deliverArmies(Player player);
    boolean validateTroops(Player player);
    void setState(TroopsState state);
}
