/**
 * @author Leonardo Cavalcanti <leonardocaturyty@gmail.com>
 */

package br.unicap.eng2.debuggin_squad.war.objectives;

import br.unicap.eng2.debuggin_squad.war.card.CardObjective;
import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

import java.util.Arrays;

public class ConqueringAsiaAndSouthAmerica extends CardObjective implements IObjective {

    private String[] asia = {"Oriente Medio", "Aral", "Omsk", "Dudinka", "Siberia", "Tchita",
            "Mongolia", "Vladivostok", "China", "India", "Japao", "Vietna" };
    private String[] southAmerica = {"Brasil", "Argentina", "Uruguai", "Colombia", "Venezuela",
            "Peru", "Bolivia", "Chile" };

    public ConqueringAsiaAndSouthAmerica(String name, String description, int id) {
        super(name, description, id);
    }

    @Override
    public boolean objectiveAchieved(Player player) {
        long asiaConquered = player.getConqueredTerritories().stream()
                .filter(t -> Arrays.asList(asia).contains(t.getNome()))
                .count();

        long southAmericaConquered = player.getConqueredTerritories().stream()
                .filter(t -> Arrays.asList(southAmerica).contains(t.getNome()))
                .count();

        return asiaConquered == asia.length && southAmericaConquered == southAmerica.length;

        /*int countAsia = 0, countSouthAmerica = 0;

        for (Territory t : player.getConqueredTerritories()) {
            for (String a : asia) {
                if (t.getNome() == a) {
                    countAsia++;
                }
            }
            for (String s : southAmerica) {
                if (t.getNome() == s){
                    countSouthAmerica++;
                }
            }
        }

        return countAsia == 12 && countSouthAmerica == 8;*/

    }
}
