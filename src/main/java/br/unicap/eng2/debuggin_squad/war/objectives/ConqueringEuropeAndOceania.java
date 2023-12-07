/**
 * @author Leonardo Cavalcanti <leonardocaturyty@gmail.com>
 */

package br.unicap.eng2.debuggin_squad.war.objectives;

import br.unicap.eng2.debuggin_squad.war.card.CardObjective;
import br.unicap.eng2.debuggin_squad.war.controller.Player;

public class ConqueringEuropeAndOceania extends CardObjective implements IObjective{

    private final String NAME = "Conquistar Europa e Oceania";
    private final String DESCRIPTION = "Conquiste totalmente o continente da Europe e Oceania";

    private CardObjective cardObjective = new CardObjective(NAME, DESCRIPTION, 2);

    public ConqueringEuropeAndOceania(String name, String description, int id) {
        super(name, description, id);
    }

    @Override
    public boolean objectiveAchieved(Player Player) {
        return false;
    }
}
