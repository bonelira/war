/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.model.composite.troops;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

import java.util.List;

public class DeliveryOfTerritoryState implements TroopsComponent{
    private TroopsComponent currentState;
    public static final String MSG_ERROR_TROOPS = "Delivery troops failed.";
    public static final String MSG_TERRITORY_DID_NOT_CONQUER = "The player not did not conquer territories";

    @Override
    public int deliverArmies(List<Player> players) {
        Player player = players.get(0); // primeiro jogador
        List<Territory> conqueredTerritories = player.getConqueredTerritories();

        if (validateTroops(player)) {
            int totalTerritories = conqueredTerritories.size();
            int armiesReceived = totalTerritories / 2;
            return armiesReceived;
        } else {
            throw new IllegalArgumentException(MSG_ERROR_TROOPS);
        }
    }

    public boolean validateTroops(Player player) {
        List<Territory> conqueredTerritories = player.getConqueredTerritories();
        if (conqueredTerritories.isEmpty()) {
            throw new IllegalArgumentException(MSG_TERRITORY_DID_NOT_CONQUER);
        }
        return true;
    }


    public void setState(TroopsComponent state) {this.currentState = state;}
}
