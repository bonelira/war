package br.unicap.eng2.debuggin_squad.war.controller;

import java.util.ArrayList;
import java.util.List;

import br.unicap.eng2.debuggin_squad.war.GoalCard;

public class Player {
    private String id;
    private String name;
    private GoalCard goalCard;
    private List<Territory> conqueredTerritories;
  
    private Life life;

    public String getName() {
        return name;
    }

    public void setId(String id) {
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

    public GoalCard getGoalCard() {
        return goalCard;
    }

    public Player(String name, String id) {
        this.name = name;
        this.id = id;
        this.conqueredTerritories = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public List<Territory> getConqueredTerritories() {
        return conqueredTerritories;
    }

    public boolean getLife(){
        this.life = life;
        return false;
        }
    }
