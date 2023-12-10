/**
 * @author Leonardo Cavalcanti <leonardocaturyty@gmail.com>
 */

package br.unicap.eng2.debuggin_squad.war.objectives;

import br.unicap.eng2.debuggin_squad.war.card.CardObjective;
import br.unicap.eng2.debuggin_squad.war.controller.Player;

import java.util.Arrays;

public class ConqueringEuropeAndOceania extends CardObjective implements IObjective{
    private String[] europe = {"Islandia", "Inglaterra", "Suecia", "Alemanha", "Espanha", 
            "Portugal", "Franca", "Italia", "Polonia", "Iugoslavia", "Moscou"};

    private String[] oceania = {"Borneu", "Sumatra", "Nova Guine", "Australia"};

    public ConqueringEuropeAndOceania(String name, String description, int id) {
        super(name, description, id);
    }

    @Override
    public boolean objectiveAchieved(Player player) {
        long europeConquered = player.getConqueredTerritories().stream()
                .filter(t -> Arrays.asList(europe).contains(t.getName()))
                .count();

        long oceaniaConquered = player.getConqueredTerritories().stream()
                .filter(t -> Arrays.asList(oceania).contains(t.getName()))
                .count();

        return europeConquered == europe.length && oceaniaConquered == oceania.length;
    }
}
