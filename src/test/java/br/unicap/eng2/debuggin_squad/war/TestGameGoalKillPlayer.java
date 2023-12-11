package br.unicap.eng2.debuggin_squad.war;

import java.util.LinkedList;
import java.util.Stack;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

public class TestGameGoalKillPlayer {
    private Stack<GoalCard> goalCardsMock;
    private LinkedList<Player> players;

    @BeforeEach
    public void setup() throws Exception {
        //setGoalCardsToEachPlayer(this.players);
    }

    private Stack<GoalCard> creatMockGoals() {
        Stack<GoalCard> goalCards = new Stack<>();
        goalCards.push(new GoalCard(/*PlayerArmyColor.RED*/));
        goalCards.push(new GoalCard(/*PlayerArmyColor.BLUE*/));
        return goalCards;
    }

    private GoalCard changeCard(GoalCard goalCard) {
        this.goalCardsMock.push(goalCard);
        goalCard = this.goalCardsMock.firstElement();
        return goalCard;
    }

    @Test
    void testIfAPlayerConqueredPlayerGoal() throws Exception {
        /*Player playerOfTheTurn = this.mockGame.getPlayOfTheTurn();
        Player playerGoal = this.mockGame.getPlayers().getLast();

        Territory sourceTerritory = playerOfTheTurn.getTerritories().get(0);
        sourceTerritory.ChangeArmyQuantity(2);
        Territory goalTerritory = playerGoal.getTerritories().get(0);
        goalTerritory.ChangeArmyQuantity(0);

        this.mockGame.dominate(sourceTerritory, goalTerritory, 1);

        GameState gameStateWin = this.mockGame.getGameState();

        Assertions.assertTrue(gameStateWin instanceof FinishGameState);*/
}
}
