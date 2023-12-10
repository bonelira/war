package br.unicap.eng2.debuggin_squad.war.attack;

import br.unicap.eng2.debuggin_squad.war.controller.TerritoryConfront;
import br.unicap.eng2.debuggin_squad.war.controller.states.GameState;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

public class AttackState implements GameState {

    public static final String MSG_ERROR_TERRITORY_SOURCE_NOT_SELECTED = "You must select a source territory to attack";
    public static final String MSG_ERROR_TERRITORY_DESTINATION_NOT_SELECTED = "You must select a destination territory to attack";
    public static final String MSG_ERROR_CANNOT_CHANGE_STATE = "You cannot change state in actual situation";

    @Override
    public void runPhase() throws Exception {
    }

    @Override
    public void transitionToNextState() throws Exception {
        // Phase.setNextState(new ArmyAllocationState());
    }

    @Override
    public void prepareAttack(Territory tSource, Territory tDestination) throws Exception {
        if (tSource == null || tDestination == null) {
            throw new Exception(MSG_ERROR_CANNOT_CHANGE_STATE);
        }
    }

    @Override
    public void performAttack(TerritoryConfront territoryConfront) throws Exception {

    }

    @Override
    public void invadeTerritory(Territory territorySource, Territory territoryDestination, int invadeArmy)
            throws Exception {

    }

    @Override
    public void endPhase() throws Exception {
        // implement logic to end phase
    }
}