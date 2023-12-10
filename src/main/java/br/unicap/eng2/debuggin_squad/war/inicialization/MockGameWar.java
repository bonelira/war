/**
 * @author Abi-albom Lira <bone-lira@hotmail.com / @bonelira>
 */

// Mock para representar uma lista de players do jogo + uma lista de objetivos

package br.unicap.eng2.debuggin_squad.war.inicialization;

import java.util.ArrayList;
import java.util.List;

import br.unicap.eng2.debuggin_squad.war.GoalCard;
import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.enumWar.ID;

public class MockGameWar {
    private List<Player> players;
    private List<GoalCard> goalCards;

    MockGameWar() {
        this.players = getDefaultPlayersList();
        this.goalCards = getDefaultGoalCardsList();
    }

    public List<GoalCard> getGoalCards() {
        return goalCards;
    }

    public List<Player> getPlayers() {
        return players;
    }

    private List<Player> getDefaultPlayersList() {
        List<Player> playersCompleteList = new ArrayList<>();
        Player player1 = new Player("Bone", ID.BLACK);
        Player player2 = new Player("Roosevelt", ID.BLUE);
        Player player3 = new Player("Bruno", ID.YELLOW);
        Player player4 = new Player("Vicente", ID.RED);
        Player player5 = new Player("Igor", ID.GREEN);
        Player player6 = new Player("Leonardo", ID.WHITE);
        playersCompleteList.add(player1);
        playersCompleteList.add(player2);
        playersCompleteList.add(player3);
        playersCompleteList.add(player4);
        playersCompleteList.add(player5);
        playersCompleteList.add(player6);

        return playersCompleteList;
    }

    // Default goal Card: Conquistar 24 territorios ou continente
    private List<GoalCard> getDefaultGoalCardsList() {
        List<GoalCard> goalCards = new ArrayList<>();
        GoalCard goalCard1 = new GoalCard("Conquistar 24 territorios ou continente");
        // GoalCard goalCard2 = new GoalCard("Conquistar continente");
        // GoalCard goalCard3 = new GoalCard("Eliminar jogador");

        goalCards.add(goalCard1);
        // goalCards.add(goalCard2);
        // goalCards.add(goalCard3);

        return goalCards;

    }
}
