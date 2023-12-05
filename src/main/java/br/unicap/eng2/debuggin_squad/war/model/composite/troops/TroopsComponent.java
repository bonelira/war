/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.model.composite.troops;

import br.unicap.eng2.debuggin_squad.war.controller.Player;

import java.util.List;

public interface TroopsComponent extends Observer {
    int deliverArmies(List<Player> players);

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

    int getTroopCount();
}
