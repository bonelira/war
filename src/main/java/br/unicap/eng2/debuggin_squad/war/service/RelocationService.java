/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.service;

import br.unicap.eng2.debuggin_squad.war.controller.Armies;
import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

import java.util.List;


public class RelocationService {
    public RelocationService(){}

    public void relocateTroops(Player player, Territory origin, Territory destination, int armies) {
        List<Territory> conqueredTerritories = player.getConqueredTerritories();
        if (origin.getArmiesCount() <= 1) {
            throw new IllegalArgumentException("Você não pode realocar exércitos se houver apenas 1 exército no território de origem.");
        }
        Armies armiesToTransfer = new Armies(armies);
        // Realizar a operação de realocação
        origin.removeArmies(armiesToTransfer);
        destination.addArmies(armiesToTransfer);
    }
}