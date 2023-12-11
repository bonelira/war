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
    private PlayerCircularLinkedList players;
    private List<GoalCard> goalCards;

    MockGameWar() {
        this.players = getDefaultPlayersList();
        this.goalCards = getDefaultGoalCardsList();
    }

    public List<GoalCard> getGoalCards() {
        return goalCards;
    }

    public PlayerCircularLinkedList getPlayers() {
        return players;
    }

    private PlayerCircularLinkedList getDefaultPlayersList() {
        PlayerCircularLinkedList playersCompleteList = new PlayerCircularLinkedList();
        playersCompleteList.addLast(new Player("Bone", ID.BLACK));
        playersCompleteList.addLast(new Player("Roosevelt", ID.BLUE));
        playersCompleteList.addLast(new Player("Bruno", ID.YELLOW));
        playersCompleteList.addLast(new Player("Vicente", ID.RED));
        playersCompleteList.addLast(new Player("Igor", ID.GREEN));
        playersCompleteList.addLast(new Player("Leonardo", ID.WHITE));

        return playersCompleteList;

    }

    // Default goal Card: Conquistar 24 territorios ou continente
    private List<GoalCard> getDefaultGoalCardsList() {
        List<GoalCard> goalCards = new ArrayList<>();
        GoalCard goalCard1 = new GoalCard("Conquistar 24 territorios ou continente");
        GoalCard goalCard2 = new GoalCard("Conquistar continente");
        GoalCard goalCard3 = new GoalCard("Eliminar jogador");

        goalCards.add(goalCard1);
        goalCards.add(goalCard2);
        goalCards.add(goalCard3);

        return goalCards;

    }
}
