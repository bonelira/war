/**
 * @author Leonardo Cavalcanti <leonardocaturyty@gmail.com>
 */

package br.unicap.eng2.debuggin_squad.war.objectives;

import br.unicap.eng2.debuggin_squad.war.card.CardObjective;
import br.unicap.eng2.debuggin_squad.war.controller.Player;

public class ConqueringAsiaAndSouthAmerica extends CardObjective implements IObjective {

    private final String NAME = "Conquistar Asia e America do Sul";
    private final String DESCRIPTION = "Conquiste totalmente o continente da Asia e America do Sul";

    private CardObjective cardObjective = new CardObjective(NAME, DESCRIPTION, 1);

    public ConqueringAsiaAndSouthAmerica(String name, String description, int id) {
        super(name, description, id);
    }

    @Override
    public boolean objectiveAchieved(Player Player) {
        return false;
    }
}
