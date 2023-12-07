/**
 * @author Abi-albom Lira <bone-lira@hotmail.com / @bonelira>
 */

package br.unicap.eng2.debuggin_squad.war.inicialization;

import br.unicap.eng2.debuggin_squad.war.Board;
import br.unicap.eng2.debuggin_squad.war.GoalCard;
import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

import java.util.List;
import java.util.ArrayList;

public class Director {

    public void constructDefaultGame(Builder builder) {
        builder.configureBoard(getBoard());
        builder.configureCards(getGoalCardsList());
        builder.configurePlayers(getPlayersList());
    }

    private List<Player> getPlayersList() {
        List<Player> playersCompleteList = new ArrayList<>();
        Player player1 = new Player("Bone", "Preto");
        Player player2 = new Player("Roosevelt", "azul");
        Player player3 = new Player("Bruno", "amarelo");
        Player player4 = new Player("Vicente", "vermelho");
        Player player5 = new Player("Igor", "verde");
        Player player6 = new Player("Leonardo", "roxo");
        playersCompleteList.add(player1);
        playersCompleteList.add(player2);
        playersCompleteList.add(player3);
        playersCompleteList.add(player4);
        playersCompleteList.add(player5);
        playersCompleteList.add(player6);

        return playersCompleteList;
    }

    // Default goal Card: Conquistar 24 territorios ou continente
    private List<GoalCard> getGoalCardsList() {
        List<GoalCard> goalCards = new ArrayList<>();
        GoalCard goalCard1 = new GoalCard("Conquistar 24 territorios ou continente");
        // GoalCard goalCard2 = new GoalCard("Conquistar continente");
        // GoalCard goalCard3 = new GoalCard("Eliminar jogador");

        goalCards.add(goalCard1);
        // goalCards.add(goalCard2);
        // goalCards.add(goalCard3);

        return goalCards;

    }

    private List<Territory> getBoard() {
        List<Territory> territories = new ArrayList<>();
        Territory sweden = new Territory("Suecia", 1);
        Territory germany = new Territory("Alemanha", 1);
        Territory poland = new Territory("Polonia", 1);
        Territory moscow = new Territory("Moscou", 1);
        Territory france = new Territory("Franca", 1);
        Territory england = new Territory("Inglaterra", 1);
        Territory iceland = new Territory("Islandia", 1);
        Territory greenland = new Territory("Groelandia", 1);

        sweden.setContinent("Europe");
        germany.setContinent("Europe");
        poland.setContinent("Europe");
        moscow.setContinent("Europe");
        france.setContinent("Europe");
        england.setContinent("Europe");
        iceland.setContinent("Europe");
        greenland.setContinent("Europe");

        // Africa // territorios: 6
        Territory algeria = new Territory("Argeria", 1);
        Territory egypt = new Territory("Egito", 1);
        Territory sudan = new Territory("Sudao", 1);
        Territory congo = new Territory("Congo", 1);
        Territory madagascar = new Territory("Madagascar", 1);
        Territory south_africa = new Territory("Africa do Sul", 1);

        algeria.setContinent("Africa");
        egypt.setContinent("Africa");
        sudan.setContinent("Africa");
        congo.setContinent("Africa");
        madagascar.setContinent("Africa");
        south_africa.setContinent("Africa");

        // Asia // territorios: 12
        Territory japan = new Territory("Japao", 1);
        Territory vietnan = new Territory("Vietna", 1);
        Territory india = new Territory("India", 1);
        Territory middle_east = new Territory("Oriente Medio", 1);
        Territory aral = new Territory("Aral", 1);
        Territory omsk = new Territory("Omsk", 1);
        Territory china = new Territory("China", 1);
        Territory dudinka = new Territory("Dudinka", 1);
        Territory tchita = new Territory("Tchita", 1);
        Territory mongolia = new Territory("Mongolia", 1);
        Territory siberia = new Territory("Siberia", 1);
        Territory vladvostok = new Territory("Vladvostok", 1);

        japan.setContinent("Asia");
        vietnan.setContinent("Asia");
        india.setContinent("Asia");
        middle_east.setContinent("Asia");
        aral.setContinent("Asia");
        omsk.setContinent("Asia");
        china.setContinent("Asia");
        dudinka.setContinent("Asia");
        tchita.setContinent("Asia");
        mongolia.setContinent("Asia");
        siberia.setContinent("Asia");
        vladvostok.setContinent("Asia");

        // America do Norte // territorios: 8
        Territory alaska = new Territory("Alasca", 1);
        Territory mackenzie = new Territory("Mackenzie", 1);
        Territory vancouver = new Territory("Vancouver", 1);
        Territory ottawa = new Territory("Otawwa", 1);
        Territory new_york = new Territory("Nova York", 1);
        Territory labrador = new Territory("Labrador", 1);
        Territory mexico = new Territory("Mexico", 1);
        Territory california = new Territory("California", 1);

        alaska.setContinent("North America");
        mackenzie.setContinent("North America");
        vancouver.setContinent("North America");
        ottawa.setContinent("North America");
        new_york.setContinent("North America");
        labrador.setContinent("North America");
        mexico.setContinent("North America");
        california.setContinent("North America");

        // America do Sul // territorios: 4
        Territory brazil = new Territory("Brasil", 1);
        Territory peru = new Territory("Peru", 1);
        Territory argentina = new Territory("Argentina", 1);
        Territory venezuela = new Territory("Venezuela", 1);

        brazil.setContinent("South America");
        peru.setContinent("South America");
        argentina.setContinent("South America");
        venezuela.setContinent("South America");

        // Oceania // territorios: 4
        Territory australia = new Territory("Australia", 1);
        Territory sumatra = new Territory("Sumatra", 1);
        Territory borneo = new Territory("Borneo", 1);
        Territory new_guinea = new Territory("Nova Guine", 1);

        australia.setContinent("Oceania");
        sumatra.setContinent("Oceania");
        borneo.setContinent("Oceania");
        new_guinea.setContinent("Oceania");

        // Europa
        territories.add(sweden); // 0
        territories.add(germany); // 1
        territories.add(poland); // 2
        territories.add(moscow); // 3
        territories.add(france); // 4
        territories.add(england); // 5
        territories.add(iceland); // 6
        territories.add(greenland); // 7
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
        // America do Norte
        territories.add(alaska); // 26
        territories.add(mackenzie); // 27
        territories.add(vancouver); // 28
        territories.add(ottawa); // 29
        territories.add(new_york); // 30
        territories.add(labrador); // 31
        territories.add(mexico); // 32
        territories.add(california); // 33
        // America do Sul
        territories.add(brazil); // 34
        territories.add(peru); // 35
        territories.add(argentina); // 36
        territories.add(venezuela); // 37
        territories.add(australia); // 38
        territories.add(sumatra); // 39
        territories.add(borneo); // 40
        territories.add(new_guinea); // 41

        // Europa adjacencias
        sweden.addAdjacentTerritory(moscow);
        sweden.addAdjacentTerritory(england);

        germany.addAdjacentTerritory(england);
        germany.addAdjacentTerritory(france);
        germany.addAdjacentTerritory(poland);

        poland.addAdjacentTerritory(germany);
        poland.addAdjacentTerritory(france);
        poland.addAdjacentTerritory(moscow);
        poland.addAdjacentTerritory(egypt);

        moscow.addAdjacentTerritory(sweden);
        moscow.addAdjacentTerritory(omsk);
        moscow.addAdjacentTerritory(aral);
        moscow.addAdjacentTerritory(poland);
        moscow.addAdjacentTerritory(middle_east);

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

        // Africa adjacencias

        algeria.addAdjacentTerritory(brazil);
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

        // Asia adjacencias
        japan.addAdjacentTerritory(vladvostok);
        japan.addAdjacentTerritory(china);

        vietnan.addAdjacentTerritory(india);
        vietnan.addAdjacentTerritory(borneo);
        vietnan.addAdjacentTerritory(china);

        india.addAdjacentTerritory(vietnan);
        india.addAdjacentTerritory(middle_east);
        india.addAdjacentTerritory(aral);
        india.addAdjacentTerritory(china);
        india.addAdjacentTerritory(sumatra);

        middle_east.addAdjacentTerritory(india);
        middle_east.addAdjacentTerritory(moscow);
        middle_east.addAdjacentTerritory(poland);
        middle_east.addAdjacentTerritory(aral);

        aral.addAdjacentTerritory(india);
        aral.addAdjacentTerritory(middle_east);
        aral.addAdjacentTerritory(moscow);
        aral.addAdjacentTerritory(omsk);
        aral.addAdjacentTerritory(china);

        omsk.addAdjacentTerritory(dudinka);
        omsk.addAdjacentTerritory(mongolia);
        omsk.addAdjacentTerritory(china);
        omsk.addAdjacentTerritory(aral);
        omsk.addAdjacentTerritory(moscow);

        china.addAdjacentTerritory(vietnan);
        china.addAdjacentTerritory(india);
        china.addAdjacentTerritory(aral);
        china.addAdjacentTerritory(omsk);
        china.addAdjacentTerritory(mongolia);
        china.addAdjacentTerritory(vladvostok);
        china.addAdjacentTerritory(tchita);
        china.addAdjacentTerritory(japan);

        dudinka.addAdjacentTerritory(omsk);
        dudinka.addAdjacentTerritory(tchita);
        dudinka.addAdjacentTerritory(siberia);
        dudinka.addAdjacentTerritory(mongolia);

        tchita.addAdjacentTerritory(dudinka);
        tchita.addAdjacentTerritory(siberia);
        tchita.addAdjacentTerritory(vladvostok);
        tchita.addAdjacentTerritory(china);
        tchita.addAdjacentTerritory(mongolia);

        mongolia.addAdjacentTerritory(tchita);
        mongolia.addAdjacentTerritory(dudinka);
        mongolia.addAdjacentTerritory(omsk);
        mongolia.addAdjacentTerritory(china);

        siberia.addAdjacentTerritory(tchita);
        siberia.addAdjacentTerritory(vladvostok);
        siberia.addAdjacentTerritory(dudinka);

        vladvostok.addAdjacentTerritory(alaska);
        vladvostok.addAdjacentTerritory(japan);
        vladvostok.addAdjacentTerritory(siberia);
        vladvostok.addAdjacentTerritory(china);
        vladvostok.addAdjacentTerritory(tchita);

        // America do Norte Adjancencias

        alaska.addAdjacentTerritory(mackenzie);
        alaska.addAdjacentTerritory(vancouver);
        alaska.addAdjacentTerritory(vladvostok);

        mackenzie.addAdjacentTerritory(alaska);
        mackenzie.addAdjacentTerritory(vancouver);
        mackenzie.addAdjacentTerritory(greenland);
        mackenzie.addAdjacentTerritory(ottawa);

        vancouver.addAdjacentTerritory(alaska);
        vancouver.addAdjacentTerritory(mackenzie);
        vancouver.addAdjacentTerritory(ottawa);
        vancouver.addAdjacentTerritory(california);

        california.addAdjacentTerritory(vancouver);
        california.addAdjacentTerritory(ottawa);
        california.addAdjacentTerritory(mexico);
        california.addAdjacentTerritory(new_york);

        ottawa.addAdjacentTerritory(vancouver);
        ottawa.addAdjacentTerritory(mackenzie);
        ottawa.addAdjacentTerritory(labrador);
        ottawa.addAdjacentTerritory(new_york);
        ottawa.addAdjacentTerritory(california);

        new_york.addAdjacentTerritory(mexico);
        new_york.addAdjacentTerritory(california);
        new_york.addAdjacentTerritory(ottawa);
        new_york.addAdjacentTerritory(labrador);

        labrador.addAdjacentTerritory(greenland);
        labrador.addAdjacentTerritory(new_york);
        labrador.addAdjacentTerritory(ottawa);

        mexico.addAdjacentTerritory(venezuela);
        mexico.addAdjacentTerritory(california);
        mexico.addAdjacentTerritory(new_york);

        // America do Sul adjacencias

        brazil.addAdjacentTerritory(algeria);
        brazil.addAdjacentTerritory(venezuela);
        brazil.addAdjacentTerritory(peru);
        brazil.addAdjacentTerritory(argentina);

        peru.addAdjacentTerritory(brazil);
        peru.addAdjacentTerritory(venezuela);
        peru.addAdjacentTerritory(argentina);

        argentina.addAdjacentTerritory(brazil);
        argentina.addAdjacentTerritory(peru);

        venezuela.addAdjacentTerritory(mexico);
        venezuela.addAdjacentTerritory(brazil);
        venezuela.addAdjacentTerritory(peru);

        // Oceania adjacencias

        australia.addAdjacentTerritory(new_guinea);
        australia.addAdjacentTerritory(borneo);
        australia.addAdjacentTerritory(sumatra);

        sumatra.addAdjacentTerritory(india);
        sumatra.addAdjacentTerritory(australia);

        borneo.addAdjacentTerritory(new_guinea);
        borneo.addAdjacentTerritory(vietnan);
        borneo.addAdjacentTerritory(australia);

        new_guinea.addAdjacentTerritory(australia);
        new_guinea.addAdjacentTerritory(borneo);

        // TODO
        // [x] criar os continentes e add os paises.
        // [x] criar um metodo para pegar a lista de paises de cada continente
        // [x] criar as subjacencias de cada pais
        // [ ] refatorar 'pertencimento a continente'

        return territories;
    }

}