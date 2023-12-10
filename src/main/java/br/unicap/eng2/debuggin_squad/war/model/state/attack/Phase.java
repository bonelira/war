package br.unicap.eng2.debuggin_squad.war.model.state.attack;

import br.unicap.eng2.debuggin_squad.war.controller.TerritoryConfront;
import br.unicap.eng2.debuggin_squad.war.controller.AttackState;
import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

public class Phase {
    public static GameState phase;
    public static Player player;
    public static final String MSG_ERROR_INCORRECT_STATE = "Cannot do this action in actual state";
    public static final String MSG_ERROR_TERRITORY_DESTINATION_NOT_SELECTED = "You must select a destination territory to attack";

    public Phase() {
        // Phase.phase = new RoundOneFortifyTerritoriesState();
    }

    public void runPhase() throws Exception {
        // Phase.phase.runPhase();
    }

    public void transitionToNextState() throws Exception {
        // Phase.phase.transitionToNextState();
    }

    public GameState getCurrentState() throws Exception {
        return new AttackState();
    }

    public static void setNextState(GameState newState) throws Exception {
        Phase.phase = newState;
    }

    public void prepareAttack(Territory tSource, Territory tDestination) throws Exception {
        if (tSource == null || tDestination == null) {
            throw new Exception(MSG_ERROR_TERRITORY_DESTINATION_NOT_SELECTED);
        } else {
            phase.prepareAttack(tSource, tDestination);
        }
    }

    public void performAttack(TerritoryConfront territoryConfront) throws Exception {
        phase.performAttack(territoryConfront);
    }

    public void invadeTerritory(Territory territorySource, Territory territoryDestination, int invadeArmy)
            throws Exception {
        if (invadeArmy == 0) {
            throw new Exception("You must invade the target territory with 1, 2 or 3 armies only");
        } else {
            phase.invadeTerritory(territorySource, territoryDestination, invadeArmy);
        }
    }

    public void endPhase() throws Exception {
        phase.endPhase();
    }

}
