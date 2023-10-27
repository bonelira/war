package br.unicap.eng2.debuggin_squad.war;

public class Player {
    private String name;
    private String id;
    private String color;

    public Player(String name, String id, String color) {
        this.name = name;
        this.id = id;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getColor() {
        return color;
    }
}
