package br.unicap.eng2.debuggin_squad.war.objectives;

import br.unicap.eng2.debuggin_squad.war.Player;
import br.unicap.eng2.debuggin_squad.war.Territory;
import br.unicap.eng2.debuggin_squad.war.interfaces.IObjective;

public class Conquering24Territories implements IObjective {
    @Override
    public boolean objectiveAchieved(Territory territory, Player player) {
        int conqueredTerritory = 0;
        for (Territory t : player.getConqueredTerritories()) {
            if (t.getProprietario().equals(player)) {
                conqueredTerritory++;
            }
        }
        return conqueredTerritory >= 24;
    }
}
