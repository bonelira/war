package br.unicap.eng2.debuggin_squad.war.controller.dice;

public class Dice {

    private int side;
    private int rollResult;
    
    public Dice() {
        this.side = 0;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int roll() {
        this.rollResult = (int) (Math.random() * side) + 1;
        return this.rollResult;
    }

    public int getRollResult() {
        return this.rollResult;
    }

}
