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

    }
}
