/**
 * @author Abi-albom Lira / @bonelira>
 */

package br.unicap.eng2.debuggin_squad.war.inicialization;

import br.unicap.eng2.debuggin_squad.war.inicialization.Board;
import br.unicap.eng2.debuggin_squad.war.GameConfigurator;
import br.unicap.eng2.debuggin_squad.war.GoalCard;
import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

import java.util.ArrayList;
import java.util.List;

public class WarGame {

    private Board board;
    private PlayerCircularLinkedList players;
    private List<Player> playersList;
    private List<GoalCard> goalCards;
    private List<Territory> territoriesList;
    // private CircularPlayerList playersOrder;
    private int playersQuantity;

    public List<Territory> getTerritoriesList() {
        return territoriesList;
    }

    public void setTerritoriesList(List<Territory> territoriesList) {
        this.territoriesList = territoriesList;
    }

    public WarGame(Board board, PlayerCircularLinkedList players, List<GoalCard> goalCards, int playersQuantity) {
        this.board = board;
        this.players = players;
        this.goalCards = goalCards;
        this.playersQuantity = playersQuantity;
    }

    public WarGame() {

    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public void setPlayers(PlayerCircularLinkedList players) {
        this.players = players;
    }

    public List<GoalCard> getGoalCards() {
        return goalCards;
    }

    public void setGoalCards(List<GoalCard> goalCards) {
        this.goalCards = goalCards;
    }

    public int getPlayersQuantity() {
        return playersQuantity;
    }

    public PlayerCircularLinkedList getPlayers() {
        return players;
    }

    public List<Player> getPlayersList() {

        List<Player> playerList = new ArrayList<>();

        if (players.isEmpty()) {
            return playerList;
        }

        PlayerCircularListNode currentNode = players.getHead();

        do {
            Player currentPlayer = currentNode.getPlayer();
            playerList.add(currentPlayer);
            currentNode = players.getSuccessor(currentNode);
        } while (currentNode != players.getHead());

        return playerList;
    }
}
