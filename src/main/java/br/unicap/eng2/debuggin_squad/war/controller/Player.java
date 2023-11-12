/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.controller;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String id;
    private String name;

    private List<Territory> conqueredTerritories;

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
}
