package br.unicap.eng2.debuggin_squad.war.attack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import br.unicap.eng2.debuggin_squad.war.controller.Territory;
import br.unicap.eng2.debuggin_squad.war.controller.TerritoryConfront;
import br.unicap.eng2.debuggin_squad.war.model.state.attack.GameState;
import br.unicap.eng2.debuggin_squad.war.controller.player.Player;
import br.unicap.eng2.debuggin_squad.war.model.state.attack.Phase;
import br.unicap.eng2.debuggin_squad.war.model.state.attack.PerformingAttackState;
import br.unicap.eng2.debuggin_squad.war.model.state.attack.PreparingAttackState;
import br.unicap.eng2.debuggin_squad.war.model.state.attack.ArmyInvadeState;
import br.unicap.eng2.debuggin_squad.war.model.state.attack.ArmyAllocationState;

public class AttackTest {
    static AttackState attackState;
    static GameState phase;
    Territory territorySource;
    Territory territoryTarget;
    Phase gamePhase;

    @BeforeEach
    void setUp() throws Exception {
        this.territorySource = new Territory("test1", 0);
        this.territoryTarget = new Territory("test2", 0);
        this.territorySource.addAdjacentTerritory(territorySource);
        this.territoryTarget.addAdjacentTerritory(territorySource);

        this.gamePhase = new Phase();
        // only fortifying territories (round 1)
        this.gamePhase.runPhase();
        this.gamePhase.transitionToNextState();

        // fortifying territories
        this.gamePhase.runPhase();
        this.gamePhase.transitionToNextState();

    }

    @Test
    public void test01AttackPhaseIsCorrectlyTransitioned() throws Exception {

        try {
            // attack phase
            GameState attack = gamePhase.getCurrentState();
            Assertions.assertTrue(attack.getClass().getName().contains("AttackState"));
        } catch (Exception e) {
            Assertions.fail();
        }
    }

    @Test
    public void test02PerformAttackIsNotPossibleWhenTerritorySourceIsNotSelected() {
        try {
            // attack phase
            gamePhase.prepareAttack(null, null);
            gamePhase.runPhase();
            Assertions.fail();

        } catch (Exception e) {
            Assertions.assertEquals(AttackState.MSG_ERROR_TERRITORY_SOURCE_NOT_SELECTED, e.getMessage());
        }
    }

    @Test
    public void test03PerformAttackIsNotPossibleWhenTerritoryDestinationIsNotSelected() {
        try {
            // attack phase
            Territory territorySource = new Territory("test3", 0);
            gamePhase.prepareAttack(territorySource, null);
            gamePhase.runPhase();
            Assertions.fail();

        } catch (Exception e) {
            Assertions.assertEquals(AttackState.MSG_ERROR_TERRITORY_DESTINATION_NOT_SELECTED, e.getMessage());
        }
    }

    @Test
    public void test04PerformAttackIsPossibleWhenTerritoriesAreSelected() {
        try {
            // attack phase
            // Territory territorySource = new Territory("test4", 0);
            // Territory territoryDestination = new Territory("test5", 0);
            // gamePhase.prepareAttack(territorySource, territoryDestination);
            gamePhase.transitionToNextState();

            GameState actualPhase = gamePhase.getCurrentState();
            Assertions.assertTrue(actualPhase.getClass().getName().contains("AttackState"));

        } catch (Exception e) {
            Assertions.fail();
        }
    }

    @Test
    public void test05PrepareAttackIsNotPossibleWhenStateIsNotAttackState() {

        try {
            // only fortifying territories (round 1)
            gamePhase = new Phase();
            gamePhase.runPhase();

            // trying to prepare attack in fortifying phase
            gamePhase.prepareAttack(this.territorySource, this.territoryTarget);

        } catch (Exception e) {
            Assertions.assertEquals(Phase.MSG_ERROR_INCORRECT_STATE, e.getMessage());
        }
    }

    @Test
    public void test06AttackStateIsPreparingAttackWhenPerformAttackIsSuccessful() {

        try {
            // attack phase
            gamePhase.prepareAttack(this.territorySource, this.territoryTarget);
            gamePhase.transitionToNextState();

            TerritoryConfront confront = Mockito.mock(TerritoryConfront.class);
            Territory tSource = Mockito.mock(Territory.class);
            Territory tTarget = Mockito.mock(Territory.class);

            Mockito.when(confront.getArmyLossDestination()).thenReturn(1);
            Mockito.when(confront.getTerritorySource()).thenReturn(tSource);
            Mockito.when(confront.getTerritoryTarget()).thenReturn(tTarget);
            Mockito.when(tSource.getArmy()).thenReturn(2);
            Mockito.when(tTarget.getArmy()).thenReturn(5);

            gamePhase.performAttack(confront);
            gamePhase.transitionToNextState();

            GameState actualPhase = gamePhase.getCurrentState();
            Assertions.assertTrue(actualPhase instanceof PreparingAttackState);

        } catch (Exception e) {
            Assertions.fail();
        }
    }

    @Test
    public void test07StateIsArmyInvadeStateWhenPlayerConquerTerritoryTargetAfterConfront() {
        try {
            // attack phase
            gamePhase.prepareAttack(this.territorySource, this.territoryTarget);
            gamePhase.transitionToNextState();

            TerritoryConfront confront = Mockito.mock(TerritoryConfront.class);
            Territory tSource = Mockito.mock(Territory.class);
            Territory tTarget = Mockito.mock(Territory.class);

            Mockito.when(confront.getArmyLossDestination()).thenReturn(1);
            Mockito.when(confront.getTerritorySource()).thenReturn(tSource);
            Mockito.when(confront.getTerritoryTarget()).thenReturn(tTarget);
            Mockito.when(tSource.getArmy()).thenReturn(2);
            Mockito.when(tTarget.getArmy()).thenReturn(0);

            gamePhase.performAttack(confront);
            gamePhase.transitionToNextState();

            GameState actualPhase = gamePhase.getCurrentState();
            Assertions.assertTrue(actualPhase instanceof ArmyInvadeState);

        } catch (Exception e) {
            Assertions.fail();
        }
    }

    @Test
    public void test08PrepareAttackIsNotPossibleUntilPlayerAllocateArmyToTerritoryTarget() {
        try {
            // attack phase
            gamePhase.prepareAttack(this.territorySource, this.territoryTarget);
            gamePhase.transitionToNextState();

            TerritoryConfront confront = Mockito.mock(TerritoryConfront.class);
            Territory tSource = Mockito.mock(Territory.class);
            Territory tTarget = Mockito.mock(Territory.class);

            Mockito.when(confront.getArmyLossDestination()).thenReturn(1);
            Mockito.when(confront.getTerritorySource()).thenReturn(tSource);
            Mockito.when(confront.getTerritoryTarget()).thenReturn(tTarget);
            Mockito.when(tSource.getArmy()).thenReturn(2);
            Mockito.when(tTarget.getArmy()).thenReturn(0);

            gamePhase.performAttack(confront);
            gamePhase.transitionToNextState();

            // occupation army of territoryTarget has been eliminated
            // player must allocate army to territoryTarget but decided to prepareAttack
            gamePhase.prepareAttack(territorySource, territoryTarget);
            Assertions.fail();
        } catch (Exception e) {
            Assertions.assertEquals(Phase.MSG_ERROR_INCORRECT_STATE, e.getMessage());
        }
    }

    @Test
    public void test09GameStateIsPreparingAttackWhenPlayerSuccessfullyInvadesTerritoryTargetAfterPerformAttack() {
        try {
            // attack phase
            gamePhase.prepareAttack(this.territorySource, this.territoryTarget);
            gamePhase.transitionToNextState();

            TerritoryConfront confront = Mockito.mock(TerritoryConfront.class);
            Territory tSource = Mockito.mock(Territory.class);
            Territory tTarget = Mockito.mock(Territory.class);
            Player player = Mockito.mock(Player.class);

            Mockito.when(confront.getArmyLossDestination()).thenReturn(1);
            Mockito.when(confront.getTerritorySource()).thenReturn(tSource);
            Mockito.when(confront.getTerritoryTarget()).thenReturn(tTarget);
            Mockito.when(tSource.getArmy()).thenReturn(3);
            Mockito.when(tTarget.getArmy()).thenReturn(0);
            // Mockito.when(tSource.getProprietario()).thenReturn(player);
            // Mockito.when(tTarget.getProprietario()).thenReturn(player);

            gamePhase.performAttack(confront);
            gamePhase.transitionToNextState();

            // occupation army of territoryTarget has been eliminated
            int invadeArmy = 2;
            gamePhase.invadeTerritory(tSource, tTarget, invadeArmy);
            gamePhase.transitionToNextState();

            // invade successful
            GameState actualPhase = gamePhase.getCurrentState();
            Assertions.assertTrue(actualPhase instanceof PreparingAttackState);

        } catch (Exception e) {
            Assertions.fail();
        }
    }

    @Test
    public void test10PrepareAttackIsNotPossibleWhenArmyNotAllocatedCorrectly() {
        try {
            // attack phase
            gamePhase.prepareAttack(this.territorySource, this.territoryTarget);
            gamePhase.transitionToNextState();

            TerritoryConfront confront = Mockito.mock(TerritoryConfront.class);
            Territory tSource = Mockito.mock(Territory.class);
            Territory tTarget = Mockito.mock(Territory.class);
            Player player = Mockito.mock(Player.class);

            Mockito.when(confront.getArmyLossDestination()).thenReturn(1);
            Mockito.when(confront.getTerritorySource()).thenReturn(tSource);
            Mockito.when(confront.getTerritoryTarget()).thenReturn(tTarget);
            Mockito.when(tSource.getArmy()).thenReturn(3);
            Mockito.when(tTarget.getArmy()).thenReturn(0);
            // Mockito.when(tSource.getProprietario()).thenReturn(player);
            // Mockito.when(tTarget.getProprietario()).thenReturn(player);

            gamePhase.performAttack(confront);
            gamePhase.transitionToNextState();

            // occupation army of territoryTarget has been eliminated
            int invadeArmy = 0;
            gamePhase.invadeTerritory(tSource, tTarget, invadeArmy);
            gamePhase.transitionToNextState();

            // invade not successful
            Assertions.fail();

        } catch (Exception e) {
            Assertions.assertEquals(ArmyInvadeState.MSG_ERROR_ARMY_NOT_ALLOCATED_CORRECTLY, e.getMessage());
        }

    }

    @Test
    public void test11GameStateIsCorrectlyTransitionedWhenPlayerChoosesToEndAttackWithoutAttacking() {
        try {
            // attack phase
            // player not call prepareAttack
            gamePhase.endPhase();
            gamePhase.transitionToNextState();

            GameState actualPhase = gamePhase.getCurrentState();
            Assertions.assertTrue(actualPhase instanceof ArmyAllocationState);

        } catch (Exception e) {
            Assertions.fail();
        }

    }

    @Test
    void test12TransitionToNextStateIsNotPossibleWhenAttackStateIsWaitingArmyAllocation() {
        try {
            // attack phase
            gamePhase.prepareAttack(this.territorySource, this.territoryTarget);
            gamePhase.transitionToNextState();

            TerritoryConfront confront = Mockito.mock(TerritoryConfront.class);
            Territory tSource = Mockito.mock(Territory.class);
            Territory tTarget = Mockito.mock(Territory.class);

            Mockito.when(confront.getArmyLossDestination()).thenReturn(1);
            Mockito.when(confront.getTerritorySource()).thenReturn(tSource);
            Mockito.when(confront.getTerritoryTarget()).thenReturn(tTarget);
            Mockito.when(tSource.getArmy()).thenReturn(2);
            Mockito.when(tTarget.getArmy()).thenReturn(0);

            gamePhase.performAttack(confront);
            gamePhase.transitionToNextState();

            // GameState is 'Army Invade State' but Player try to end Phase without invade
            gamePhase.endPhase();
            gamePhase.transitionToNextState();
            Assertions.fail();
        } catch (Exception e) {
            Assertions.assertEquals(AttackState.MSG_ERROR_CANNOT_CHANGE_STATE, e.getMessage());
        }
    }

}
