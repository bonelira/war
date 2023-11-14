package br.unicap.eng2.debuggin_squad.war.interfaces;

// Altera as importações para o projeto final.
import br.unicap.eng2.debuggin_squad.war.Player;
import br.unicap.eng2.debuggin_squad.war.Territory;

public interface IObjective {

    public boolean objectiveAchieved(Territory territory, Player Player);
}
