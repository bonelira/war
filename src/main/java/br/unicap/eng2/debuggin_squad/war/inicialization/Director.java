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
        List<Player> playersListComplete = new ArrayList<>();
        Player player1 = new Player("Bone", "Preto");
        Player player2 = new Player("Roosevelt", "azul");
        Player player3 = new Player("Bruno", "amarelo");
        Player player4 = new Player("Vicente", "vermelho");
        Player player5 = new Player("Igor", "verde");
        Player player6 = new Player("Leonardo", "roxo");
        playersListComplete.add(player1);
        playersListComplete.add(player2);
        playersListComplete.add(player3);
        playersListComplete.add(player4);
        playersListComplete.add(player5);
        playersListComplete.add(player6);

        return playersListComplete;
    }

    // Default goal Card: Conquistar 24 territórios ou continente
    private List<GoalCard> getGoalCardsList() {
        List<GoalCard> goalCards = new ArrayList<>();
        GoalCard goalCard1 = new GoalCard("Conquistar 24 territórios ou continente");
        // GoalCard goalCard2 = new GoalCard("Conquistar continente");
        // GoalCard goalCard3 = new GoalCard("Eliminar jogador");

        goalCards.add(goalCard1);
        // goalCards.add(goalCard2);
        // goalCards.add(goalCard3);

        return goalCards;

    }

    private List<Territory> getBoard() {
        List<Territory> territories = new ArrayList<>();
        Territory sweden = new Territory("Suécia", "Europe", null);
        Territory germany = new Territory("Alemanha", "Europe", null);
        Territory poland = new Territory("Polônia", "Europe", null);
        Territory moscow = new Territory("Moscou", "Europe", null);
        Territory france = new Territory("França", "Europe", null);
        Territory england = new Territory("Inglaterra", "Europe", null);
        Territory iceland = new Territory("Islândia", "Europe", null);
        Territory greenland = new Territory("Groelândia", "Europe", null);

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

        // América do Norte Adjancências

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

        // América do Sul adjacências

        brasil.addAdjacentTerritory(algeria);
        brasil.addAdjacentTerritory(venezuela);
        brasil.addAdjacentTerritory(peru);
        brasil.addAdjacentTerritory(argentina);

        peru.addAdjacentTerritory(brasil);
        peru.addAdjacentTerritory(venezuela);
        peru.addAdjacentTerritory(argentina);

        argentina.addAdjacentTerritory(brasil);
        argentina.addAdjacentTerritory(peru);

        venezuela.addAdjacentTerritory(mexico);
        venezuela.addAdjacentTerritory(brasil);
        venezuela.addAdjacentTerritory(peru);

        // Oceania adjacências

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
        // [x] criar os continentes e add os países.
        // [x] criar um método para pegar a lista de países de cada continente
        // [x] criar as subjacências de cada país
        // [ ] refatorar 'pertencimento a continente'

        return territories;
    }

}