/**
 * @author Bruno Irae <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.controller;

import br.unicap.eng2.debuggin_squad.war.GoalCard;
import br.unicap.eng2.debuggin_squad.war.enumWar.ID;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private ID id;
    private String name;
    private GoalCard goalCard;
    private List<Territory> conqueredTerritories;
    private List<String> cards;
    private Life life;

    public Player(String name, ID id) {
        this.name = name;
        this.id = id;
        this.conqueredTerritories = new ArrayList<>();
        this.cards = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setId(ID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGoalCard(GoalCard goalCard) {
        this.goalCard = goalCard;
    }

    public void setConqueredTerritories(List<Territory> conqueredTerritories) {
        this.conqueredTerritories = conqueredTerritories;
    }

    public void setTerritory(Territory territory) {
        this.conqueredTerritories.add(territory);
    }

    public GoalCard getGoalCard() {
        return goalCard;
    }

    public ID getId() {
        return id;
    }

    public List<Territory> getConqueredTerritories() {
        return conqueredTerritories;
    }

    public boolean getLife() {
        return true;
    }

    public void addCard(String card) {
        this.cards.add(card);
    }

    public List<String> getCards() {
        return new ArrayList<>(cards);
    }
}
