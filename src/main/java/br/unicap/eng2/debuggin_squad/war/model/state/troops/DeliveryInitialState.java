/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.model.state.troops;

import br.unicap.eng2.debuggin_squad.war.controller.Player;

import java.util.List;

public class DeliveryInitialState implements TroopsState{
    private TroopsState currentState;
    public static final String MSG_ERROR_TROOPS = "Delivery troops failed.";
    public static final String MSG_TERRITORY_EMPTY = "The territory cannot be empty";

    @Override
    public int deliverArmiesInInitialTurn(List<Player> players) {
        if (validateTroopsInitial((List<Player>) players)) {
            int exercitosRecebidos = 42 / players.size();
            return exercitosRecebidos;
        }else {
            throw new IllegalArgumentException(MSG_ERROR_TROOPS);
        }
    }

    @Override
    public int deliverArmies(Player player) {
        return 0;
    }

    @Override
    public boolean validateTroops(Player player) {return false;}

    public boolean validateTroopsInitial(List<Player> players) {
        if (players.size() <= 0 ) {
            throw new IllegalArgumentException(MSG_TERRITORY_EMPTY);
        }
        return true;
    }

    @Override
    public void setState(TroopsState state) {this.currentState = state;}
}
