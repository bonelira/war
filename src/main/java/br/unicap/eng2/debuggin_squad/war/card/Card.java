package br.unicap.eng2.debuggin_squad.war.card;

import br.unicap.eng2.debuggin_squad.war.controller.Player;

public abstract class Card {
    public abstract String getName(); // variavel name sera usada para identificar o tipo de carta
    public abstract String getDescription(); // variavel description sera usada para descrever a carta
    public abstract int getId();   // variavel number sera usada para informar o numero da carta

}
