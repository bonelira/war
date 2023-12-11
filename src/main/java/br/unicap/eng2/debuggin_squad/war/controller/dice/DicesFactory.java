package br.unicap.eng2.debuggin_squad.war.controller.dice;

public class DicesFactory {

    public static Dice[] createDice(int sides, int numberOfArmies) {
        if (sides <= 0) {
            throw new AssertionError("The dice must have at least one side");
        }
        if (numberOfArmies <= 0) {
            throw new AssertionError("The dice must have at least one dice");
        }
        Dice[] dices = new Dice[numberOfArmies];
        for(int j = 0; j < numberOfArmies; j++) {
            dices[j] = new Dice();
            dices[j].setSide(sides);
        }
        return dices;
    }
    
}
