package br.unicap.eng2.atividade00.card;


import java.util.ArrayList;
import java.util.List;



public class CardPlayer extends Card {

    private String name;
    private String description;
    private int number;
    private String shape;
    private List<Card> cards;

    public CardPlayer() {
        this.name = "Player";
        this.description = "Player card";
        this.number = 0;
        this.shape = "Player";
        this.cards = new ArrayList<>();
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

    @Override
    public void addCardsPorContinent(Card card) {
        cards.add(card);
    }

    
}   

    
