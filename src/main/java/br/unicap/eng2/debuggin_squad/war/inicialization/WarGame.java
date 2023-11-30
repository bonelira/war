/**
 * @author Abi-albom Lira / @bonelira>
 */

package br.unicap.eng2.debuggin_squad.war.inicialization;

import br.unicap.eng2.debuggin_squad.war.Board;
import br.unicap.eng2.debuggin_squad.war.GameConfigurator;
import br.unicap.eng2.debuggin_squad.war.GoalCard;
import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

import java.util.ArrayList;
import java.util.List;

public class WarGame {

    private Board board;
    List<Territory> territoriesList;

    public List<Territory> getTerritoriesList() {
        return territoriesList;
    }

    public void setTerritoriesList(List<Territory> territoriesList) {
        this.territoriesList = territoriesList;
    }

    private List<Player> players;
    private List<GoalCard> goalCards;

    public WarGame(List<Territory> board, List<Player> players, List<GoalCard> goalCards, int playersQuantity) {
        this.territoriesList = board;
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

    public void setPlayers(List<Player> players) {
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

    private int playersQuantity;

    public List<Player> getPlayers() {
        return players;
    }

}
