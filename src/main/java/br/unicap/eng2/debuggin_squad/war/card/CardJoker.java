package br.unicap.eng2.debuggin_squad.war.card;

public class CardJoker extends Card {

    private String name;
    private String description;
    private int number;
    private String shape;

    public CardJoker() {
        this.name = "Joker";
        this.description = "Joker card";
        this.number = 0;
        this.shape = "Joker";
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
    public int getNumber() {
        return this.number;
    }

    @Override
    public Object getType() {
        return this;
    }

    @Override
    public String getShape() {
        return this.shape;
    }

    @Override
    public String getObjective() {
        return null;
    }
    
}
