package br.unicap.eng2.debuggin_squad.war.interfaces;

import br.unicap.eng2.debuggin_squad.war.Player;
import br.unicap.eng2.debuggin_squad.war.Territory;

public interface IObjective {

    public boolean objectiveAchieved(Territory territory, Player Player);
}
