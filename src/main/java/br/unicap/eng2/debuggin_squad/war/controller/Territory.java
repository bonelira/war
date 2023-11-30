/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Territory {
    private String nome;
    private Player proprietario;
    private List<Armies> armiesList;
    private Set<Territory> adjacentTerritories;
    private String continent;

    public Territory(String nome, String continent, Player proprietario) {
        this.nome = nome;
        this.proprietario = proprietario;
        this.armiesList = new ArrayList<>();
        adjacentTerritories = new HashSet<>();
        this.continent = continent;
    }

    public Player getProprietario() {
        return proprietario;
    }

    public void setProprietario(Player proprietario) {
        this.proprietario = proprietario;
    }

    public void addArmies(Armies armies) {
        armiesList.add(armies);
    }

    public void removeArmies(Armies armiesToRemove) {
        armiesList.remove(armiesToRemove);
    }

    public int getArmiesCount() {
        return armiesList.size();
    }

    public void addAdjacentTerritory(Territory territory) {
        adjacentTerritories.add(territory);
    }

    public boolean IsAdjacent(Territory territory) {
        boolean contains = this.adjacentTerritories.contains(territory);
        return contains;
    }

    public String getContinent() {
        return continent;
    }

}
