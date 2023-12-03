/**
 * @author Abi-albom Lira / @bonelira>
 */

package br.unicap.eng2.debuggin_squad.war;

import br.unicap.eng2.debuggin_squad.war.controller.Territory;
import java.util.ArrayList;
import java.util.List;

public class Dealer {
    private List<Territory> deckTerritories;
    private List<GoalCard> deckG;
    private List<Territory> deckEmptyTerritories;
    private List<GoalCard> deckEmptyGoalCards;

    public Territory shuffleTerritoryCards() { // distribuir as cartas

        return null;
    }

    public GoalCard shuffleGoalCards() { // distribuir as cartas
        return null;
    }

    public void putGoalCardBackInDeck(GoalCard goalCard) {
        deckEmptyGoalCards.add(goalCard);
    }

    public void putTerritoryCardBackInDeck(Territory territoryCard) {
        deckEmptyTerritories.add(territoryCard);
    }

}
