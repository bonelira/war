/**
 * @author Abi-albom Lira <bone-lira@hotmail.com / @bonelira>
 */

package br.unicap.eng2.debuggin_squad.war.inicialization;

import java.util.List;

import br.unicap.eng2.debuggin_squad.war.GoalCard;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

public class EmptyGameBuilder implements Builder {

    private WarGame game;
    private Board board;
    private PlayerCircularLinkedList playersCircularList;
    private List<GoalCard> goalCards;
    private int playersQuantity;
    private List<Territory> territories;

    @Override
    public void reset() {
        this.game = new WarGame();
    }

    @Override
    public void configureBoard(Board board) {
        this.board = new Board();
    }

    @Override
    public void configurePlayers(PlayerCircularLinkedList players) {
        this.playersCircularList = players;
    }

    @Override
    public void configureCards(List<GoalCard> goalCards) throws Exception {
        this.goalCards = goalCards;
    }

    @Override
    public void configureInitialTerritoriesOwner(PlayerCircularLinkedList players, Boards board) throws Exception {
        // vazio
    }

    @Override
    public void configureInitialGoalCards(PlayerCircularLinkedList players, List<GoalCard> goalCards) {
        // vazio

    }

    @Override
    public WarGame getResult() {
        return this.game;
    }

}
