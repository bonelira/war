/**
 * @author Abi-albom Lira / @bonelira>
 */

package br.unicap.eng2.debuggin_squad.war;

import br.unicap.eng2.debuggin_squad.war.controller.Player;

import java.util.ArrayList;
import java.util.List;

public class WarGame {

    public Object getPlayer1;
    private GameConfigurator game = new GameConfigurator(6);
    private List<Player> players;

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void start() { // método principal para criação do jogo.
        players = game.createListOfPlayers(6);
    }

    public Object getPlayer(Player player1) {
        return null;
    }

}
