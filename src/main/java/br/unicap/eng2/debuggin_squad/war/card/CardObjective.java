package br.unicap.eng2.debuggin_squad.war.card;

public class CardObjective extends Card {

    private String name;
    private String description;
    private int id;

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
