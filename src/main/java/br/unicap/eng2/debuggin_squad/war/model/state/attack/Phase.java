package br.unicap.eng2.debuggin_squad.war.model.state.attack;

import br.unicap.eng2.debuggin_squad.war.controller.TerritoryConfront;
import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

public class Phase {
    public static GameState phase;
    public static Player player;
    public static final String MSG_ERROR_INCORRECT_STATE = "Cannot do this action in actual state";

    public Phase() {
        // Phase.phase = new RoundOneFortifyTerritoriesState();
    }

    public void runPhase() throws Exception {
        Phase.phase.runPhase();
    }

    public void transitionToNextState() throws Exception {
        Phase.phase.transitionToNextState();
    }

    public GameState getCurrentState() throws Exception {
        return Phase.phase;
    }

    public static void setNextState(GameState newState) throws Exception {
        Phase.phase = newState;
    }

    public void prepareAttack(Territory tSource, Territory tDestination) throws Exception {
        phase.prepareAttack(tSource, tDestination);
    }

    public void performAttack(TerritoryConfront territoryConfront) throws Exception {
        phase.performAttack(territoryConfront);
    }

    public void invadeTerritory(Territory territorySource, Territory territoryDestination, int invadeArmy) throws Exception {
        phase.invadeTerritory(territorySource, territoryDestination, invadeArmy);
    }

    public void endPhase() throws Exception {
        phase.endPhase();
    }
}
