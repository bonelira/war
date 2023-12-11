/**
 * @author Bruno Irae <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.service;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;
import br.unicap.eng2.debuggin_squad.war.model.state.fortify.FortifyContext;

import java.util.List;

public class FortifyService {
    private FortifyContext fortifyContext;

    public FortifyService() {
        fortifyContext = new FortifyContext();
    }

    public void fortificationArmies(List<Player> players, int armies, Territory origin) {
        fortifyContext.fortifyArmies(players, armies, origin);
    }
}

