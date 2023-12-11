/**
 * @author Bruno Irae <brunoirae@gmail.com / @brunoirae>
 * CO-@author Abi-albom Lira / @bonelira>
 */

package br.unicap.eng2.debuggin_squad.war.enumWar;

public enum ID {
    BLUE("Blue"),
    YELLOW("Yellow"),
    BLACK("Black"),
    GREEN("Green"),
    RED("Red"),
    WHITE("White");

    private final String name;

    ID(String name) {
        this.name = name;
    }

    public String getColorName() {
        return name;
    }
}
