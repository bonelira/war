/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.service;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.model.state.troops.TroopsContext;

import java.util.List;

public class TroopsService {
    private TroopsContext troopsContext;

    public TroopsService( ) { troopsContext = new TroopsContext();}

    public int deliverArmiesInTerritory(List<Player> players) {
        List<Player> Player = players;
        return troopsContext.deliverArmiesInInitialTurn(Player);
    }

    //Falta alocar o recebimento de carta por {CONTINENTE}
    /* Função: Recebe um determinado número de exercitos de acordo com a tabela*/

    //Falta alocar o recebimento de carta por {TROCA DE CARTAS}
    /* Recebe um determinado número de exercitos de acordo as figuras*/
}
