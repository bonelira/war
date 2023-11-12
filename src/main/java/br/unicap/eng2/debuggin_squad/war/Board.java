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
        Territory sweden = new Territory("Suécia", null);
        Territory germany = new Territory("Alemanha", null);
        Territory poland = new Territory("Polônia", null);
        Territory moscow = new Territory("Moscou", null);
        Territory france = new Territory("França", null);
        Territory england = new Territory("Inglaterra", null);
        Territory iceland = new Territory("Islândia", null);

        // África // territórios: 6
        Territory algeria = new Territory("Argéria", null);
        Territory egypt = new Territory("Egito", null);
        Territory sudan = new Territory("Sudão", null);
        Territory congo = new Territory("Congo", null);
        Territory madagascar = new Territory("Madagascar", null);
        Territory south_africa = new Territory("África do Sul", null);

        // Ásia // territórios: 12
        Territory japan = new Territory("Japão", null);
        Territory vietnan = new Territory("Vietnã", null);
        Territory india = new Territory("Índia", null);
        Territory middle_east = new Territory("Oriente Médio", null);
        Territory aral = new Territory("Aral", null);
        Territory omsk = new Territory("Omsk", null);
        Territory china = new Territory("China", null);
        Territory dudinka = new Territory("Dudinka", null);
        Territory tchita = new Territory("Tchita", null);
        Territory mongolia = new Territory("Mongólia", null);
        Territory siberia = new Territory("Sibéria", null);
        Territory vladvostok = new Territory("Vladvostok", null);

        // América do Norte // territórios: 8
        Territory alaska = new Territory("Alasca", null);
        Territory mackenzie = new Territory("Mackenzie", null);
        Territory vancouver = new Territory("Vancouver", null);
        Territory ottawa = new Territory("Otawwa", null);
        Territory new_york = new Territory("Nova York", null);
        Territory labrador = new Territory("Labrador", null);
        Territory mexico = new Territory("México", null);
        Territory california = new Territory("Califórnia", null);

        // América do Sul // territórios: 4
        Territory brasil = new Territory("Brasil", null);
        Territory peru = new Territory("Peru", null);
        Territory argentina = new Territory("Argentina", null);
        Territory venezuela = new Territory("Venezuela", null);

        // Oceania // territórios: 4
        Territory australia = new Territory("Austrália", null);
        Territory sumatra = new Territory("Sumatra", null);
        Territory borneo = new Territory("Borneo", null);
        Territory new_guinea = new Territory("Nova Guiné", null);

        // Europa
        territories.add(sweden); // 1
        territories.add(germany); // 2
        territories.add(poland); // 3
        territories.add(moscow); // 4
        territories.add(france); // 5
        territories.add(england); // 6
        territories.add(iceland); // 7
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

        // TODO
        // [ ] criar os continentes e add os países.
        // [ ] criar um método para pegar a lista de países de cada continente
        // [ ] criar as subjacências de cada país

        return territories;

    }
}
