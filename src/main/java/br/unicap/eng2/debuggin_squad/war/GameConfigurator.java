/**
 * @author Abi-albom Lira <bone-lira@hotmail.com / @bonelira>
 */

package br.unicap.eng2.debuggin_squad.war;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

public class GameConfigurator {
    private List<Player> players;
    private int numberOfPlayers;

    public List<Player> getShufflePlayersList() {
        Collections.shuffle(players);
        return players;
    }

    public GameConfigurator(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getNumbOfPlayers() {
        return numberOfPlayers;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<Player> createListOfPlayers(int numberOfPlayers) {
        players = new ArrayList<>(); // Inicialize a lista de jogadores

        for (int i = 0; i < getNumbOfPlayers(); i++) {
            // Crie instâncias de jogadores e adicione à lista
            Player player = new Player(null, null);
            players.add(player);
        }

        setInitialTerritoriesForEachPlayer(numberOfPlayers);
        return players;
    }

    private void setInitialTerritoriesForEachPlayer(int numberOfPlayers) {
        List<Territory> nullTerritories = new ArrayList<>();

        if (numberOfPlayers == 6) {
            nullTerritories.add(null);
            nullTerritories.add(null);
            nullTerritories.add(null);
            nullTerritories.add(null);
            nullTerritories.add(null);
            nullTerritories.add(null);
            nullTerritories.add(null);
        } else if (numberOfPlayers == 3) {
            nullTerritories.add(null);
            nullTerritories.add(null);
            nullTerritories.add(null);
            nullTerritories.add(null);
            nullTerritories.add(null);
            nullTerritories.add(null);
            nullTerritories.add(null);
            nullTerritories.add(null);
            nullTerritories.add(null);
            nullTerritories.add(null);
            nullTerritories.add(null);
            nullTerritories.add(null);
            nullTerritories.add(null);
            nullTerritories.add(null);
        }

        for (int i = 0; i < players.size(); i++) {
            players.get(i).setConqueredTerritories(nullTerritories);
            ;
        }
    }

    public void setGoalCards() {
        Dealer dealer = new Dealer();

        for (Player player : players) {
            player.setGoalCard(dealer.shuffleGoalCards());
        }
    }

}
