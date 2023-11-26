/**
 * @author Abi-albom Lira / @bonelira>
 */

package br.unicap.eng2.debuggin_squad.war;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

import java.util.ArrayList;
import java.util.List;

public class WarGame {

    public Object getPlayer1;
    private GameConfigurator game = new GameConfigurator(6);
    private List<Player> players;
    private Board board = new Board();

    public List<Player> getPlayers() {
        return players;
    }

    // public void setPlayers(List<Player> players) {
    // this.players = players;
    // }

    public void start() { // método principal para criação do jogo.
        this.players = game.createListOfPlayers(6);
        // players = game.createListOfPlayers(6); // o jogo que deve ter a lista de
        // jogadores ou os gerenciadores?
        board.init(); // cria os territórios

    }

}
