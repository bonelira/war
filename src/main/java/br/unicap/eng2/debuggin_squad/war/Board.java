package br.unicap.eng2.debuggin_squad.war;

import java.util.List;
import java.util.ArrayList;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
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

        territories.add(sweden);
        territories.add(germany);
        territories.add(poland);
        territories.add(moscow);
        territories.add(france);
        territories.add(england);
        territories.add(iceland);
        territories.add(algeria);
        territories.add(egypt);
        territories.add(sudan);
        territories.add(congo);
        territories.add(madagascar);
        territories.add(south_africa);
        territories.add(japan);
        territories.add(vietnan);
        territories.add(india);
        territories.add(middle_east);
        territories.add(aral);
        territories.add(omsk);
        territories.add(china);
        territories.add(dudinka);
        territories.add(tchita);
        territories.add(mongolia);
        territories.add(siberia);
        territories.add(vladvostok);
        territories.add(alaska);
        territories.add(mackenzie);
        territories.add(vancouver);
        territories.add(ottawa);
        territories.add(new_york);
        territories.add(labrador);
        territories.add(mexico);
        territories.add(california);
        territories.add(brasil);
        territories.add(peru);
        territories.add(argentina);
        territories.add(venezuela);
        territories.add(australia);
        territories.add(sumatra);
        territories.add(borneo);
        territories.add(new_guinea);

        // TODO
        // [ ] criar os continentes e add os países.
        // [ ] criar um método para pegar a lista de países de cada continente
        // [ ] criar as subjacências de cada país

        return territories;

    }
}
