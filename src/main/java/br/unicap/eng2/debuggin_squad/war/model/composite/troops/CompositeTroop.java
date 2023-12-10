/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.model.composite.troops;

import br.unicap.eng2.debuggin_squad.war.controller.Player;

import java.util.ArrayList;
import java.util.List;

public class CompositeTroop implements TroopsComponent {
    private List<TroopsComponent> troops = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public CompositeTroop(List<TroopsComponent> troops) {
        this.troops = troops;
    }

    @Override
    public int deliverArmies(List<Player> players) {
        int totalArmies = 0;
        for (TroopsComponent troop : troops) {
            totalArmies += troop.deliverArmies(players);
        }
        notifyObservers();
        return totalArmies;
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
        int totalTroops = getTroopCount();
        for (Observer observer : observers) {
            observer.update(totalTroops);
        }
    }

    public int getTroopCount() {
        int totalTroops = 0;
        for (TroopsComponent troop : troops) {
            totalTroops += troop.getTroopCount();
        }
        return totalTroops;
    }

    @Override
    public void update(int newTroopCount) {}
}
