package br.unicap.eng2.debuggin_squad.war.model.state.attack;

import br.unicap.eng2.debuggin_squad.war.controller.TerritoryConfront;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

public class PerformingAttackState extends AttackState {

    int territoryTargetArmy;

    @Override
    public void prepareAttack(Territory tSource, Territory tDestination) throws Exception {
        throw new Exception(Phase.MSG_ERROR_INCORRECT_STATE);
    }

    @Override
    public void performAttack(TerritoryConfront territoryConfront) throws Exception {

        territoryConfront.confront(territoryConfront.getTerritorySource().getArmy());

        this.territoryTargetArmy = territoryConfront.getTerritoryTarget().getArmy()
                - territoryConfront.getArmyLossDestination();
    }

    @Override
    public void invadeTerritory(Territory territorySource, Territory territoryDestination, int invadeArmy) throws Exception {
        throw new Exception(Phase.MSG_ERROR_INCORRECT_STATE);
    }

    @Override
    public void transitionToNextState() throws Exception {

        if (this.territoryTargetArmy <= 0) {
            Phase.setNextState(new ArmyInvadeState());
        } else {
            Phase.setNextState(new PreparingAttackState());
        }
    }

}