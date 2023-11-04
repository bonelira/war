/**
 * @author Abi-albom Lira <bone-lira@hotmail.com / @bonelira>
 */

package br.unicap.eng2.debuggin_squad.war;

import java.util.ArrayList;
import java.util.List;

import br.unicap.eng2.debuggin_squad.war.controller.Player;

public class GameConfigurator {
    private List<Player> players;
    private int numberOfPlayers;

    public GameConfigurator(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public List<Player> getListOfPlayers() {
        return this.createListOfPlayers();
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getNumbOfPlayers() {
        return numberOfPlayers;
    }

    private List<Player> createListOfPlayers(thi) {
        players = new ArrayList<>(); // Inicialize a lista de jogadores

        for (int i = 0; i < getNumbOfPlayers(); i++) {
            // Crie instâncias de jogadores e adicione à lista
            Player player = new Player(null, null);
            players.add(player);
        }
        return players;
    }

}
