/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.model.state.troops;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

import java.util.List;

public class DeliveryOfTerritoryState implements TroopsState{
    private TroopsState currentState;
    public static final String MSG_ERROR_TROOPS = "Delivery troops failed.";
    public static final String MSG_TERRITORY_DID_NOT_CONQUER = "The player not did not conquer territories";

    @Override
    public int deliverArmiesInInitialTurn(List<Player> players) {return 1;}

    @Override
    public int deliverArmies(Player player) {
        List<Territory> conqueredTerritories = player.getConqueredTerritories();
        if (validateTroops(player)) {
            int totalTerritorios = conqueredTerritories.size();
            int exercitosRecebidos = totalTerritorios / 2;
            return exercitosRecebidos;
        }else{
            throw new IllegalArgumentException(MSG_ERROR_TROOPS);
        }
    }

    @Override
    public boolean validateTroops(Player player) {
        List<Territory> conqueredTerritories = player.getConqueredTerritories();
        if (conqueredTerritories.isEmpty()) {
            throw new IllegalArgumentException(MSG_TERRITORY_DID_NOT_CONQUER);
        }
        return true;
    }

    @Override
    public void setState(TroopsState state) {this.currentState = state;}
}
