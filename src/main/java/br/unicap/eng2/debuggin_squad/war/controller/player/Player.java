package br.unicap.eng2.debuggin_squad.war.controller.player;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import br.unicap.eng2.debuggin_squad.war.controller.army.Army;
import br.unicap.eng2.debuggin_squad.war.controller.card.Card;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

public class Player {
    private String name;
    private Army[] armies;
    private Card[] cards;
    private List<Territory> territories;

    public Player(String name) {
        this.name = name;
        this.armies = null;
        this.cards = null;
        this.territories = new  ArrayList<Territory>();
    }

    public void setArmies() {
        this.armies = armies;
    }

    public void setCards() {
        this.cards = cards;
    }

    public void setTerritories() {
        this.territories = territories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberArmies() {
        return armies.length;
    }

    public void setArmies(int armies) {
        if (armies < 0) {
            throw new AssertionError("The number of armies must be greater than 0");
        }
        this.armies = new Army[armies];
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCard(Card[] numberCards) {
        this.cards = numberCards;
    }

    public List<Territory> getTerritories() {
        return territories;
    }


    public void setTerritory(Territory territory) {
        if (territory == null) {
            throw new AssertionError("The territory must not be null");
        }
        this.territories.add(territory);
    }
    
}
