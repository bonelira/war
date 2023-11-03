/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.service;

import br.unicap.eng2.debuggin_squad.war.controller.Armies;
import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

import java.util.List;

public class FortifyService {
    public FortifyService( ) {}

    public void fortificationArmies(Player player, int armies, Territory origin) {
        List<Territory> conqueredTerritories = player.getConqueredTerritories();
        if (!conqueredTerritories.contains(origin)) {
            throw new IllegalArgumentException("O jogador não possui esse território ou não possui territórios conquistados para fortificar.");
        }
        while (armies > 0) {
            Armies armiesInTerritory = new Armies(armies); // Aloque um exército de cada vez
            origin.addArmies(armiesInTerritory);
            armies--;
        }
    }

    //Criar método para cancelar a fortificação
    /*Lógica: cancelaria a fortificação do território que ele teria colocado em um determinado local e retornaria o exercito*/


}
