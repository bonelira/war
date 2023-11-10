package br.unicap.eng2.debuggin_squad.war;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
    private List<Territory> map;
    private Territory territory;
    public Map() {
        this.map = new ArrayList<>();
    }

    public void addMap(Territory territory) {
        map.add(territory);
    }

    public List<Territory> getTerriory() {
        return map;
    }
}
