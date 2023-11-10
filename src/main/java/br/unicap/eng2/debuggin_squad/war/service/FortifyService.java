/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.service;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;
import br.unicap.eng2.debuggin_squad.war.model.state.FortifyContext;

public class FortifyService {
    private FortifyContext fortifyContext;

    public FortifyService() {
        fortifyContext = new FortifyContext();
    }

    public void fortificationArmies(Player player, int armies, Territory origin) {
        fortifyContext.fortifyArmies(player, armies, origin);
    }
}

