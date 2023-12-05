package br.unicap.eng2.debuggin_squad.war.card;

import br.unicap.eng2.debuggin_squad.war.controller.Player;

public class CardObjective extends Card {

    private String name;
    private String description;
    private int id;
    private Boolean objective = null;

    public CardObjective(String name, String description, int id) {
        this.name = name;
        this.description = description;
        this.id = id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public int getId() {
        return this.id;
    }

}
