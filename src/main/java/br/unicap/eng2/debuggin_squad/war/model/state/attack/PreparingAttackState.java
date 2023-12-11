package br.unicap.eng2.debuggin_squad.war.model.state.attack;

import br.unicap.eng2.debuggin_squad.war.controller.TerritoryConfront;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

public class PreparingAttackState extends AttackState {

    @Override
    public void prepareAttack(Territory tSource, Territory tDestination) throws Exception {
        if (tSource == null) {
            throw new Exception(MSG_ERROR_TERRITORY_SOURCE_NOT_SELECTED);
        } else if (tDestination == null) {
            throw new Exception(MSG_ERROR_TERRITORY_DESTINATION_NOT_SELECTED);
        }
        super.prepareAttack(tSource, tDestination);
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
    public void transitionToNextState() throws Exception {
        Phase.setNextState(new PerformingAttackState());
    }

    @Override
    public void endPhase() throws Exception {
        Phase.setNextState(new AttackState());
    }

}
