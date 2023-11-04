package br.unicap.eng2.debuggin_squad.war.Card;

public abstract class Card {

    public abstract String getName(); // variavel name sera usada para identificar o tipo de carta

    public abstract String getDescription(); // variavel description sera usada para descrever a carta

    public abstract int getNumber();   // variavel number sera usada para informar o numero da carta

    public abstract Object getType(); // variavel type sera usada para informar o tipo de carta

    public abstract String getShape(); // variavel shape sera usada para informar o formato da carta

    public abstract String getObjective(); // variavel objective sera usada para informar o objetivo da carta
    
}
