package br.unicap.eng2.debuggin_squad.war;

import java.util.HashSet;
import java.util.Set;


// Classe temporária
public class Territory {
    private String nome;
    private Player proprietario;
    private int army;
    private Set<Territory> adjacentTerritories;

    public Territory(String nome, int army) {
        this.nome = nome;
        this.army = army;
        adjacentTerritories = new HashSet<>();
    }

    public void addArmies(int armies) {
        army+= armies;
    }

    public void removeArmies(int armies) {
        army-= armies;
    }

    public int getArmiesCount() {
        return army;
    }

    public int setArmiesCount(int newArmies) {
        return army = newArmies;
    }

    public boolean isAdjacent(Territory territoryDestination) {
        return adjacentTerritories.contains(territoryDestination);
    }

    public boolean isNotAdjacent(Territory territoryDestination) {
        return !isAdjacent(territoryDestination);
    }

    public Player getProprietario() {
        return proprietario;
    }

    public void setProprietario(Player proprietario) {
        this.proprietario = proprietario;
    }

    public boolean belongsToPlayer(Player player) {
        return this.proprietario == player;
    }
}
