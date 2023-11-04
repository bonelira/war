/**
 * @author Abi-albom Lira <bone-lira@hotmail.com / @bonelira>
 */

package br.unicap.eng2.debuggin_squad.war;

import java.util.ArrayList;
import java.util.List;

import br.unicap.eng2.debuggin_squad.war.controller.Player;

public class GameConfigurator {
    List<Player> players;

    public GameConfigurator(int qntd, int j) {
        players = new ArrayList<>(); // Inicialize a lista de jogadores

        for (int i = 0; i < qntd; i++) {
            // Crie instâncias de jogadores e adicione à lista
            Player player = new Player(null, null);
            players.add(player);
        }

    }

    public List<Player> getListOfPlayers() {
        return null;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
    }

}
