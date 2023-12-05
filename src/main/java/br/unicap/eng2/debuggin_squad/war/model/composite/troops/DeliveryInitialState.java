/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.model.composite.troops;

import br.unicap.eng2.debuggin_squad.war.controller.Player;

import java.util.List;

public class DeliveryInitialState implements TroopsComponent{
    private TroopsComponent currentState;
    public static final String MSG_ERROR_TROOPS = "Delivery troops failed.";
    public static final String MSG_TERRITORY_EMPTY = "The territory cannot be empty";

    @Override
    public int deliverArmies(List<Player> players) {
        if (validateTroopsInitial(players)) {
            int exercitosRecebidos = 42 / players.size();
            return exercitosRecebidos;
        } else {
            throw new IllegalArgumentException(MSG_ERROR_TROOPS);
        }
    }

    public boolean validateTroopsInitial(List<Player> players) {
        if (players.size() <= 0 ) {
            throw new IllegalArgumentException(MSG_TERRITORY_EMPTY);
        }
        return true;
    }


    public void setState(TroopsComponent state) {this.currentState = state;}
}
