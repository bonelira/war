/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.model.composite.troops;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

import java.util.ArrayList;
import java.util.List;

public class DeliveryOfTerritoryState implements TroopsComponent {
    private TroopsComponent currentState;
    private List<Observer> observers = new ArrayList<>();
    private int troopCount;

    public static final String MSG_ERROR_TROOPS = "Delivery troops failed.";
    public static final String MSG_TERRITORY_DID_NOT_CONQUER = "The player did not conquer territories";

    @Override
    public int deliverArmies(List<Player> players) {
        Player player = players.get(0); // primeiro jogador
        List<Territory> conqueredTerritories = player.getConqueredTerritories();

        if (validateTroops(player)) {
            int totalTerritories = conqueredTerritories.size();
            int troopCount = totalTerritories / 2;
            notifyObservers();
            return troopCount;
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
        int totalTroops = calculateTotalTroops();
        for (Observer observer : observers) {
            observer.update(totalTroops);
        }
    }

    private int calculateTotalTroops() {
        return 0;
    }


    @Override
    public int getTroopCount() {
        return troopCount;
    }

    public boolean validateTroops(Player player) {
        List<Territory> conqueredTerritories = player.getConqueredTerritories();
        if (conqueredTerritories.isEmpty()) {
            throw new IllegalArgumentException(MSG_TERRITORY_DID_NOT_CONQUER);
        }
        return true;
    }

    @Override
    public void update(int newTroopCount) {
        this.troopCount = newTroopCount;
        notifyObservers();
    }
}
