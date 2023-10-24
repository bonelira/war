/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.service;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

import java.util.List;

public class FortifyService {
    private Territory territory;

    public FortifyService(Territory territory) {
        this.territory = territory;
    }

    public int deliverArmiesInInitialTurn(List<Player> players) {
        int totalTerritorios = 42;
        if (players.isEmpty()) {
            throw new IllegalArgumentException("O número de jogadores não pode ser zero.");
        }
        int exercitosRecebidos = totalTerritorios / players.size();
        return exercitosRecebidos;
    }


}
