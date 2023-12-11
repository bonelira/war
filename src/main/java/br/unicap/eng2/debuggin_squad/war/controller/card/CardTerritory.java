package br.unicap.eng2.debuggin_squad.war.controller.card;

public class CardTerritory extends Card {
    private String name;
    private String description;
    private int number;
    private String type;
    private String shape;
    private String objective;

    public CardTerritory() {
        this.name = "Territory";
        this.description = "Territory card";
        this.number = 1;
        this.type = "Territory";
        this.shape = "Circle";

    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public int getNumber() {
        return this.number;
    }

    public String getType() {
        return this.type;
    }

    public String getShape() {
        return this.shape;
    }

    public String getObjective() {

        return null;
    }
}
