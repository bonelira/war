package br.unicap.eng2.debuggin_squad.war.model.state.attack;

import br.unicap.eng2.debuggin_squad.war.controller.TerritoryConfront;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

public class ArmyAllocationState implements GameState {

    protected TerritoryConfront confront;

    @Override
    public void runPhase() throws Exception {
        //army reallocation between player territories  
    }

    @Override
    public void transitionToNextState() throws Exception {
        // assuming everything is fine...
        Phase.setNextState(new FortifyTerritoriesState());
    }

    @Override
    public void prepareAttack(Territory tSource, Territory tDestination) throws Exception {
        throw new Exception(Phase.MSG_ERROR_INCORRECT_STATE);
    }

    @Override
    public void performAttack(TerritoryConfront territoryConfront) throws Exception {
        throw new Exception(Phase.MSG_ERROR_INCORRECT_STATE);
    }

    @Override
    public void invadeTerritory(Territory territorySource, Territory territoryDestination, int invadeArmy) throws Exception {
        throw new Exception(Phase.MSG_ERROR_INCORRECT_STATE);
    }

    @Override
    public void endPhase() throws Exception {
       //implement logic to end phase
    }

}
