/**
 * @author Bruno Irae <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.model.composite.troops;

import br.unicap.eng2.debuggin_squad.war.controller.Player;

import java.util.ArrayList;
import java.util.List;

public class DeliveryByCard implements TroopsComponent {
    private List<Observer> observers = new ArrayList<>();
    private int troopCount;
    private int troopIncrement = 4;
    private int exchangeCount;

    public int deliverArmies(List<Player> players) {
        int troopIncrement = 4;

        for (Player player : players) {
            List<String> playerCards = player.getCards();

            if (canExchangeCards(player)) {
                List<String> exchangedCards = playerCards.subList(0, 3);

                if (areCardsDifferent(exchangedCards) || areCardsEquals(exchangedCards)) {
                    troopCount += troopIncrement;
                }

                playerCards.removeAll(exchangedCards);
            }
        }

        return troopCount;
    }

    private boolean canExchangeCards(Player player) {
        return player.getCards().size() >= 3;
    }

    private boolean areCardsDifferent(List<String> cards) {
        return cards.stream().distinct().count() == cards.size();
    }

    private boolean areCardsEquals(List<String> cards) {
        String firstSymbol = cards.get(0);
        return cards.stream().allMatch(card -> card.equals(firstSymbol));
    }


    private void updateTroopIncrement() {
        if (exchangeCount < 6) {
            troopIncrement = 4 + exchangeCount * 2;
        } else {
            troopIncrement = 15 + (exchangeCount - 6) * 5;
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(troopCount);
        }
    }

    @Override
    public int getTroopCount() {
        return troopCount;
    }

    @Override
    public void update(int newTroopCount) {
        this.troopCount = newTroopCount;
        notifyObservers();
    }
}
