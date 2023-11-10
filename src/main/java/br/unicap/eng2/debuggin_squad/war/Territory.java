package br.unicap.eng2.debuggin_squad.war;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


// Classe temporária
public class Territory {
    private String name;
    private Player owner;
    private List<Armies> armiesList;
    private Set<Territory> adjacentTerritories;

    public Territory(String name, Player owner) {
        this.name = name;
        this.owner = owner;
        this.armiesList = new ArrayList<>();
        this.adjacentTerritories = new HashSet<>();
    }

    public void addArmies(Armies armies) {
        armiesList.add(armies);
    }

    public void removeArmies(Armies armiesToRemove) {
        armiesList.remove(armiesToRemove);
    }
    public Object[] getArmiesCount() {
        return armiesList.toArray();
    }
}
