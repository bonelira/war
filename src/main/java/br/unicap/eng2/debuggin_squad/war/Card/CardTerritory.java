package br.unicap.eng2.debuggin_squad.war.Card;

public class CardTerritory extends Card {

    private String name;
    private String description;
    private int number;
    private String type;
    private String shape;
    private String objective;

    public CardTerritory() {
        this.name = "Territory";
        this.description = "Territory";
        this.number = 1; // toda carta territorio comeca com 1 exercito
        this.type = "Territory";
        this.shape = "Territory";
        this.objective = "Territory";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getObjective() {
        return null;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }
    
}
