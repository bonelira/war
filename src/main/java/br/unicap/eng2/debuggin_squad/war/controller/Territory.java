/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Territory {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private Player proprietario;
    private int army;
    private Set<Territory> adjacentTerritories;
    private boolean hasBeenUsedInCurrentMove = false;
    private String continent;

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public Territory(String nome, int army) {
        this.nome = nome;
        this.army = army;
        adjacentTerritories = new HashSet<>();
    }

    public void addArmies(int armies) {
        army += armies;
    }

    public void removeArmies(int armies) {
        army -= armies;
    }

    public int getArmiesCount() {
        return army;
    }

    public int setArmiesCount(int newArmies) {
        return army = newArmies;
    }

    public void addAdjacentTerritory(Territory adjacentTerritory) {
        adjacentTerritories.add(adjacentTerritory);
        adjacentTerritory.adjacentTerritories.add(this);
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

    public boolean hasBeenUsedInCurrentMove() {
        return hasBeenUsedInCurrentMove;
    }

    public void setHasBeenUsedInCurrentMove(boolean used) {
        hasBeenUsedInCurrentMove = used;
    }

    public String getContinent() {
        return continent;
    }
}
