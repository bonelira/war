package br.unicap.eng2.debuggin_squad.war.enumWar;

public enum EnumColor {
    BLUE("Blue"),
    YELLOW("Yellow"),
    BLACK("Black"),
    GREEN("Green"),
    RED("Red"),
    ORANGE("Orange");

    private final String name;

    EnumColor(String name) {
        this.name = name;
    }

    public String getColorName() {
        return name;
    }
}
