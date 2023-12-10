package br.unicap.eng2.debuggin_squad.war.controller;

import br.unicap.eng2.debuggin_squad.war.model.state.attack.GameState;
import br.unicap.eng2.debuggin_squad.war.model.state.attack.Phase;
import br.unicap.eng2.debuggin_squad.war.model.state.attack.ArmyAllocationState;

public class AttackState implements GameState {

  
    public static final String MSG_ERROR_TERRITORY_SOURCE_NOT_SELECTED = "You must select a source territory to attack";
    public static final String MSG_ERROR_TERRITORY_DESTINATION_NOT_SELECTED = "You must select a destination territory to attack";
    public static final String MSG_ERROR_CANNOT_CHANGE_STATE = "You cannot change state in actual situation";


    @Override
    public void runPhase() throws Exception {
    }

    @Override
    public void transitionToNextState() throws Exception {
        Phase.setNextState(new ArmyAllocationState());
    }

    @Override
    public void prepareAttack(Territory tSource, Territory tDestination) throws Exception {

    }

    @Override
    public void performAttack(TerritoryConfront territoryConfront) throws Exception {
 
    }

    @Override
    public void invadeTerritory(Territory territorySource, Territory territoryDestination, int invadeArmy) throws Exception {

    }

    @Override
    public void endPhase() throws Exception {
       //implement logic to end phase
    }
}
