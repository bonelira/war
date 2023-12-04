/**
 * @author Abi-albom Lira / @bonelira>
 */

package br.unicap.eng2.debuggin_squad.war;

import java.util.List;
import java.util.ArrayList;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

public class Board {
    private static List<Territory> territories;

    public Board() {
        this.territories = new ArrayList<>();
    }

    public Board(List<Territory> territories) {
        this.territories = territories;
    }

    public int size() {

        return this.getTerritories().size();

    }

    public List<Territory> getTerritories() {
        return this.territories;
    }

    public List<Territory> getContinentCountriesList(String continentName) {
        List<Territory> allCountries = new ArrayList<>();

        for (Territory territory : territories) {
            String actualContinent = territory.getContinent();
            if (actualContinent.equals(continentName)) {
                allCountries.add(territory);
            }

        }
        return allCountries;
    }

    public List<Territory> getPlayersTerritories(Player player) {
        List<Territory> allTerritories = new ArrayList<>();

        for (Territory territory : territories) {
            String actualOwner = territory.getProprietario().getName();
            if (actualOwner.equals(player.getName())) {
                allTerritories.add(territory);
            }

        }
        return allTerritories;
    }
}
