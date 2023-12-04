package br.unicap.eng2.debuggin_squad.war.card;

import br.unicap.eng2.debuggin_squad.war.objectives.Conquering24Territories;

public class CardObjective extends Card {

    private String name;
    private String description;
    private int id;
    private Boolean objective = null;

    public CardObjective(String name, String description, int id, Boolean objective) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.objective = objective;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public Boolean getObjective() {
        return null;
    }
}
