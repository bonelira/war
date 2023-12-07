/**
 * @author Leonardo Cavalcanti <leonardocaturyty@gmail.com>
 */

package br.unicap.eng2.debuggin_squad.war.objectives;

import br.unicap.eng2.debuggin_squad.war.card.CardObjective;
import br.unicap.eng2.debuggin_squad.war.controller.Player;

public class ConqueringNorthAmericaAndAfrica extends CardObjective implements IObjective {

    private final String NAME = "Conquistar América do Norte e África";
    private final String DESCRIPTION = "Conquiste totalmente o continente da América do Norte e África";

    private CardObjective cardObjective = new CardObjective(NAME, DESCRIPTION, 3);
    public ConqueringNorthAmericaAndAfrica(String name, String description, int id) {
        super(name, description, id);
    }

    @Override
    public boolean objectiveAchieved(Player Player) {
        return false;
    }
}
