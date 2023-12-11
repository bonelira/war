package br.unicap.eng2.debuggin_squad.war.inicialization;

import java.util.List;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

public interface Boards {
    public List<Territory> getBoardsTerritoriesList();

    public List<Territory> getContinentCountriesList(String continentName);

    public List<Territory> getPlayersTerritories(Player player);
}
