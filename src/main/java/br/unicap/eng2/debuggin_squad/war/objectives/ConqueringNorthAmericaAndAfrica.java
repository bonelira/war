/**
 * @author Leonardo Cavalcanti <leonardocaturyty@gmail.com>
 */

package br.unicap.eng2.debuggin_squad.war.objectives;

import br.unicap.eng2.debuggin_squad.war.card.CardObjective;
import br.unicap.eng2.debuggin_squad.war.controller.Player;

import java.util.Arrays;

public class ConqueringNorthAmericaAndAfrica extends CardObjective implements IObjective {
    private String[] northAmerica = {"Mexico", "California", "Nova Iorque", "Labrador",
            "Ottawa", "Vancouver", "Mackenzie", "Alasca", "Groenlandia"};
    private String[] africa = {"Argeleia", "Nigeria", "Egito", "Congo", "Sudao", "Madagascar",
            "Africa do Sul"};

    public ConqueringNorthAmericaAndAfrica(String name, String description, int id) {
        super(name, description, id);
    }

    @Override
    public boolean objectiveAchieved(Player player) {
        long northAmericaConquered = player.getConqueredTerritories().stream()
                .filter(t -> Arrays.asList(northAmerica).contains(t.getNome()))
                .count();

        long africaConquered = player.getConqueredTerritories().stream()
                .filter(t -> Arrays.asList(africa).contains(t.getNome()))
                .count();

        return northAmericaConquered == northAmerica.length && africaConquered == africa.length;
    }
}
