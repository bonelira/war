package br.unicap.eng2.debuggin_squad.war.model.state.attack;

import br.unicap.eng2.debuggin_squad.war.controller.TerritoryConfront;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

public class ArmyInvadeState extends ArmyAllocationState {

    public static final String MSG_ERROR_ALLOCATE_TO_TERRITORY_ENEMY = "You cannot allocate to enemy territory!";
    public static final String MSG_ERROR_ALLOCATION_ARMY_WITH_ARMY_IN_TERRITORY_TARGET = "Enemy Territory Occupied!";
    public static final String MSG_ERROR_ALLOCATION_ARMY_WITH_OCCUPATION_ARMY = "You cannot invade a enemy territory with occupation army!";
    public static final String MSG_ERROR_ARMY_NOT_ALLOCATED_CORRECTLY = "You must invade the target territory with 1, 2 or 3 armies only";
    public static final String MSG_ERROR_QUANTITY_ARMY_TO_INVASION_INVALID = "Quantity army to invasion invalid.";

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

        if (territorySource.getOwner() != territoryDestination.getOwner()) throw new Exception(MSG_ERROR_ALLOCATE_TO_TERRITORY_ENEMY);
        if (invadeArmy <= 0 || invadeArmy > 3) throw new Exception(MSG_ERROR_ARMY_NOT_ALLOCATED_CORRECTLY);
        if (territoryDestination.getArmy() > 0) throw new Exception(MSG_ERROR_ALLOCATION_ARMY_WITH_ARMY_IN_TERRITORY_TARGET);
        if (territorySource.getArmy() < invadeArmy) throw new Exception(MSG_ERROR_QUANTITY_ARMY_TO_INVASION_INVALID);
        if (territorySource.getArmy() == invadeArmy) throw new Exception(MSG_ERROR_ALLOCATION_ARMY_WITH_OCCUPATION_ARMY);

        territorySource.setArmy(territorySource.getArmy() - invadeArmy);
        territoryDestination.setArmy(invadeArmy);
    }

    @Override
    public void transitionToNextState() throws Exception {
        Phase.setNextState(new PreparingAttackState());
    }

    @Override
    public void endPhase() throws Exception {
        throw new Exception(AttackState.MSG_ERROR_CANNOT_CHANGE_STATE);
    }
}
