/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.model.state.troops;

import br.unicap.eng2.debuggin_squad.war.controller.Player;

import java.util.List;

public class TroopsContext {
    private TroopsState currentState;

    public TroopsContext(){
        currentState = new DeliveryInitialState();
    }

    public int deliverArmiesInInitialTurn(List<Player> players){
        int exercitosRecebidos = currentState.deliverArmiesInInitialTurn((List<Player>) players);
        return exercitosRecebidos;
    }

    public int deliverArmies(Player player){
        int exercitosRecebidos = currentState.deliverArmies(player);
        return exercitosRecebidos;
    }

    public void setState(TroopsState state) {this.currentState = state;}
}
