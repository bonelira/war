package br.unicap.eng2.debuggin_squad.war.card;

public class CardObjective extends Card {

    private String name;
    private String description;
    private int number;
    private String objective;
    private String shape;

    public CardObjective() {
        this.name = "Objective";
        this.description = "Objective card";
        this.number = 2;
        this.objective = "Objective";
        this.shape = "Square";
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

    public String getObjective() {
        return this.objective;
    }

    public String getShape() {
        return this.shape;
    }

    public Object getType() {
        return null;
    }

}
