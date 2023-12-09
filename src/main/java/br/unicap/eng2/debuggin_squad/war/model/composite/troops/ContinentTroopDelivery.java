/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.model.composite.troops;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ContinentTroopDelivery implements TroopsComponent {
    private List<Observer> observers = new ArrayList<>();
    private int troopCount;

    public int deliverArmies(List<Player> players) {

        for (Player player : players) {
            boolean conqueredAllAfrica = conqueredAllAfrica(player);
            boolean conqueredAllAsia = conqueredAllAsia(player);

            if (conqueredAllAfrica) {
                troopCount += 3;
            }

            if (conqueredAllAsia) {
                troopCount += 7;
            }

        }

        return troopCount;
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

    private boolean conqueredAllAfrica(Player player) {
        List<String> africanTerritories = Arrays.asList("Algeria", "Egypt", "Sudan", "Congo", "Madagascar", "South Africa");
        return player.getConqueredTerritories().stream()
                .map(Territory::getName)
                .collect(Collectors.toList())
                .containsAll(africanTerritories);
    }

    private boolean conqueredAllAsia(Player player) {
        List<String> asianTerritories = Arrays.asList("Japan", "Vietnam", "India", "Middle East", "Aral", "Omsk", "China", "Dudinka", "Tchita", "Mongolia", "Siberia", "Vladvostok");
        return player.getConqueredTerritories().stream()
                .map(Territory::getName)
                .collect(Collectors.toList())
                .containsAll(asianTerritories);
    }

    @Override
    public void update(int newTroopCount) {
        this.troopCount = newTroopCount;
        notifyObservers();
    }
}
