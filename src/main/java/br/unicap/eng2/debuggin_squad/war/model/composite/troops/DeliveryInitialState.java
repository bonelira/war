/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.model.composite.troops;

import br.unicap.eng2.debuggin_squad.war.controller.Player;

import java.util.ArrayList;
import java.util.List;

public class DeliveryInitialState implements TroopsComponent {
    private TroopsComponent currentState;
    private List<Observer> observers = new ArrayList<>();

    public static final String MSG_ERROR_TROOPS = "Delivery troops failed.";
    public static final String MSG_TERRITORY_EMPTY = "The territory cannot be empty";

    @Override
    public int deliverArmies(List<Player> players) {
        if (validateTroopsInitial(players)) {
            int armiesReceived = 42 / players.size();
            notifyObservers();
            return armiesReceived;
        } else {
            throw new IllegalArgumentException(MSG_ERROR_TROOPS);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        int totalTroops = 42;
        for (Observer observer : observers) {
            observer.update(totalTroops);
        }
    }

    @Override
    public int getTroopCount() {
        return 0;
    }

    public boolean validateTroopsInitial(List<Player> players) {
        if (players.size() <= 0) {
            throw new IllegalArgumentException(MSG_TERRITORY_EMPTY);
        }
        return true;
    }

    @Override
    public void update(int newTroopCount) {}
}
