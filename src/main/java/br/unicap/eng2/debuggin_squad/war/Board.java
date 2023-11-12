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

        List<Territory> territories = new ArrayList<>();

        // Europa
        Territory sweden = new Territory("Suécia", null);
        Territory germany = new Territory("Alemanha", null);
        Territory poland = new Territory("Polônia", null);
        Territory moscow = new Territory("Moscou", null);
        Territory france = new Territory("França", null);
        Territory england = new Territory("Inglaterra", null);
        Territory iceland = new Territory("Islândia", null);

        // África
        Territory algeria = new Territory("Argéria", null);
        Territory egypt = new Territory("Egito", null);
        Territory sudan = new Territory("Sudão", null);
        Territory congo = new Territory("Congo", null);
        Territory madagascar = new Territory("Madagascar", null);
        Territory south_africa = new Territory("África do Sul", null);

        // Ásia
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

        // América do Norte
        Territory alaska = new Territory("Alasca", null);
        Territory mackenzie = new Territory("Mackenzie", null);
        Territory vancouver = new Territory("Vancouver", null);
        Territory ottawa = new Territory("Otawwa", null);
        Territory new_york = new Territory("Nova York", null);
        Territory labrador = new Territory("Labrador", null);
        Territory mexico = new Territory("México", null);
        Territory california = new Territory("Califórnia", null);

        // América do Sul
        Territory brasil = new Territory("Brasil", null);
        Territory peru = new Territory("Peru", null);
        Territory argentina = new Territory("Argentina", null);
        Territory venezuela = new Territory("Venezuela", null);

        // Oceania
        Territory australia = new Territory("Austrália", null);
        Territory sumatra = new Territory("Sumatra", null);
        Territory borneo = new Territory("Borneo", null);
        Territory new_guinea = new Territory("Nova Guiné", null);

        

    }
}
