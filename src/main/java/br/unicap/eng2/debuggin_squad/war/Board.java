/**
 * @author Abi-albom Lira / @bonelira>
 */

package br.unicap.eng2.debuggin_squad.war;

import java.util.List;
import java.util.ArrayList;

import br.unicap.eng2.debuggin_squad.war.controller.Territory;

public class Board {
    private List<Territory> territories;

    public Board() {
        this.territories = new ArrayList<>();
    }

    public List<Territory> init() {

        // Criando territórios

        // Europa // territórios: 7
        Territory sweden = new Territory("Suécia", "Europe", null);
        Territory germany = new Territory("Alemanha", "Europe", null);
        Territory poland = new Territory("Polônia", "Europe", null);
        Territory moscow = new Territory("Moscou", "Europe", null);
        Territory france = new Territory("França", "Europe", null);
        Territory england = new Territory("Inglaterra", "Europe", null);
        Territory iceland = new Territory("Islândia", "Europe", null);
        Territory greenland = new Territory("Groelândia", "Europe", null);

        // TODO add groelandia

        // África // territórios: 6
        Territory algeria = new Territory("Argéria", "Africa", null);
        Territory egypt = new Territory("Egito", "Africa", null);
        Territory sudan = new Territory("Sudão", "Africa", null);
        Territory congo = new Territory("Congo", "Africa", null);
        Territory madagascar = new Territory("Madagascar", "Africa", null);
        Territory south_africa = new Territory("África do Sul", "Africa", null);

        // Ásia // territórios: 12
        Territory japan = new Territory("Japão", "Asia", null);
        Territory vietnan = new Territory("Vietnã", "Asia", null);
        Territory india = new Territory("Índia", "Asia", null);
        Territory middle_east = new Territory("Oriente Médio", "Asia", null);
        Territory aral = new Territory("Aral", "Asia", null);
        Territory omsk = new Territory("Omsk", "Asia", null);
        Territory china = new Territory("China", "Asia", null);
        Territory dudinka = new Territory("Dudinka", "Asia", null);
        Territory tchita = new Territory("Tchita", "Asia", null);
        Territory mongolia = new Territory("Mongólia", "Asia", null);
        Territory siberia = new Territory("Sibéria", "Asia", null);
        Territory vladvostok = new Territory("Vladvostok", "Asia", null);

        // América do Norte // territórios: 8
        Territory alaska = new Territory("Alasca", "North America", null);
        Territory mackenzie = new Territory("Mackenzie", "North America", null);
        Territory vancouver = new Territory("Vancouver", "North America", null);
        Territory ottawa = new Territory("Otawwa", "North America", null);
        Territory new_york = new Territory("Nova York", "North America", null);
        Territory labrador = new Territory("Labrador", "North America", null);
        Territory mexico = new Territory("México", "North America", null);
        Territory california = new Territory("Califórnia", "North America", null);

        // América do Sul // territórios: 4
        Territory brasil = new Territory("Brasil", "South America", null);
        Territory peru = new Territory("Peru", "South America", null);
        Territory argentina = new Territory("Argentina", "South America", null);
        Territory venezuela = new Territory("Venezuela", "South America", null);

        // Oceania // territórios: 4
        Territory australia = new Territory("Austrália", "Oceania", null);
        Territory sumatra = new Territory("Sumatra", "Oceania", null);
        Territory borneo = new Territory("Borneo", "Oceania", null);
        Territory new_guinea = new Territory("Nova Guiné", "Oceania", null);

        // Europa
        territories.add(sweden); // 1
        territories.add(germany); // 2
        territories.add(poland); // 3
        territories.add(moscow); // 4
        territories.add(france); // 5
        territories.add(england); // 6
        territories.add(iceland); // 7
        territories.add(greenland);
        // Africa
        territories.add(algeria); // 8
        territories.add(egypt); // 9
        territories.add(sudan); // 10
        territories.add(congo); // 11
        territories.add(madagascar); // 12
        territories.add(south_africa); // 13
        // Asia
        territories.add(japan); // 14
        territories.add(vietnan); // 15
        territories.add(india); // 16
        territories.add(middle_east); // 17
        territories.add(aral); // 18
        territories.add(omsk); // 19
        territories.add(china); // 20
        territories.add(dudinka); // 21
        territories.add(tchita); // 22
        territories.add(mongolia); // 23
        territories.add(siberia); // 24
        territories.add(vladvostok); // 25
        // América do Norte
        territories.add(alaska); // 26
        territories.add(mackenzie); // 27
        territories.add(vancouver); // 28
        territories.add(ottawa); // 29
        territories.add(new_york); // 30
        territories.add(labrador); // 31
        territories.add(mexico); // 32
        territories.add(california); // 33
        // América do Sul
        territories.add(brasil); // 34
        territories.add(peru); // 35
        territories.add(argentina); // 36
        territories.add(venezuela); // 37
        territories.add(australia); // 38
        territories.add(sumatra); // 39
        territories.add(borneo); // 40
        territories.add(new_guinea); // 41

        // Europa adjacências
        sweden.addAdjacentTerritory(moscow);
        sweden.addAdjacentTerritory(england);

        germany.addAdjacentTerritory(england);
        germany.addAdjacentTerritory(france);
        germany.addAdjacentTerritory(poland);

        poland.addAdjacentTerritory(germany);
        poland.addAdjacentTerritory(france);
        poland.addAdjacentTerritory(moscow);
        poland.addAdjacentTerritory(egypt);

        moscow.IsAdjacent(sweden);
        moscow.IsAdjacent(omsk);
        moscow.IsAdjacent(aral);
        moscow.IsAdjacent(poland);
        moscow.IsAdjacent(middle_east);

        france.addAdjacentTerritory(england);
        france.addAdjacentTerritory(algeria);
        france.addAdjacentTerritory(germany);
        france.addAdjacentTerritory(poland);

        england.addAdjacentTerritory(iceland);
        england.addAdjacentTerritory(france);
        england.addAdjacentTerritory(germany);
        england.addAdjacentTerritory(sweden);

        iceland.addAdjacentTerritory(greenland);
        iceland.addAdjacentTerritory(england);

        greenland.addAdjacentTerritory(iceland);
        greenland.addAdjacentTerritory(labrador);
        greenland.addAdjacentTerritory(mackenzie);

        // Africa adjacências

        algeria.addAdjacentTerritory(brasil);
        algeria.addAdjacentTerritory(egypt);
        algeria.addAdjacentTerritory(france);
        algeria.addAdjacentTerritory(sudan);
        algeria.addAdjacentTerritory(congo);

        egypt.addAdjacentTerritory(algeria);
        egypt.addAdjacentTerritory(sudan);
        egypt.addAdjacentTerritory(poland);
        egypt.addAdjacentTerritory(france);

        sudan.addAdjacentTerritory(congo);
        sudan.addAdjacentTerritory(algeria);
        sudan.addAdjacentTerritory(egypt);
        sudan.addAdjacentTerritory(madagascar);
        sudan.addAdjacentTerritory(south_africa);

        congo.addAdjacentTerritory(sudan);
        congo.addAdjacentTerritory(algeria);
        congo.addAdjacentTerritory(south_africa);

        madagascar.addAdjacentTerritory(sudan);
        madagascar.addAdjacentTerritory(south_africa);

        south_africa.addAdjacentTerritory(madagascar);
        south_africa.addAdjacentTerritory(congo);
        south_africa.addAdjacentTerritory(sudan);

        // Asia adjacências

        // TODO
        // [x] criar os continentes e add os países.
        // [ ] criar um método para pegar a lista de países de cada continente
        // [ ] criar as subjacências de cada país
        // [ ] refatorar 'pertencimento a continente'

        return territories;

    }

    public List<Territory> getContinentCountriesList(String continentName) {
        List<Territory> allCountries = new ArrayList<>();

        for (Territory territory : territories) {
            int i = 0;
            String actualContinent = territories.get(i).getContinent();
            if (actualContinent.equals(continentName)) {
                allCountries.add(territories.get(i));
            }
            i++;
        }
        return allCountries;
    }
}
