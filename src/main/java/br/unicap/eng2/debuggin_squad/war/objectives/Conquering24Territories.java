/**
 * @author Leonardo Cavalcanti <leonardocaturyty@gmail.com>
 */

package br.unicap.eng2.debuggin_squad.war.objectives;

import br.unicap.eng2.debuggin_squad.war.card.CardObjective;
import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

public class Conquering24Territories extends CardObjective implements IObjective {
    private final String NAME = "Conquistar 24 territorio";
    private final String DESCRIPTION = "Conquistar 24 territorio da sua escolha";
    private CardObjective cardObjective = new CardObjective(NAME, DESCRIPTION, 0);

    public Conquering24Territories(String name, String description, int id) {
        super(name, description, id);
    }

    @Override
    public boolean objectiveAchieved(Player player) {
        int conqueredTerritory = 0;
        for (Territory t : player.getConqueredTerritories()) {
            if (t.getProprietario().equals(player)) {
                conqueredTerritory++;
            }
        }
        if (conqueredTerritory == 24) {
            return true;
        }
        return false;
    }
}
