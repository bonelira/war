/**
 * @author Abi-albom Lira <bone-lira@hotmail.com / @bonelira>
 */

/*
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%!!!!!DEPRECATED CLASS!!!!!%%%%%%%%%%%%%%%%%%%%%%%%%%%% 
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 */

package br.unicap.eng2.debuggin_squad.war;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;
import br.unicap.eng2.debuggin_squad.war.enumWar.ID;

public class GameConfigurator {
    private static List<Player> players;
    private int numberOfPlayers;
    private ID color;

    public List<Player> getShufflePlayersList() {
        Collections.shuffle(players); // toda as variáveis que apontam para Players irão apontar para o objeto da
                                      // memória que vai ser alterado, sendo assim n é necessário retornar a 'lista
                                      // embaralhada' apneas chamar esse método e todas as referências a lista d e
                                      // players serão atualizadas para a nova ordem embaralhada.
        return players; // coloco para retornar o novo valor apenas para facilitar, talvez refatorar
                        // para n fazer esse retorno desnecessário. Se eu chamar o método no começo da
                        // configuração do jogo todo o resto estará embaralhado...
    }

    public GameConfigurator(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public GameConfigurator() {
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

    // public void setPlayerID() {
    // EnumColor[] cores = color.values();
    // int i = 0;
    // for (Player player : players) {
    // player.setId(cores[i].getColorName());
    // i++;
    // }
    // }

    // deveria ser void:
    // public List<Player> createListOfPlayers(int numberOfPlayers) {
    // players = new ArrayList<>(); // Inicialize a lista de jogadores

    // for (int i = 0; i < getNumbOfPlayers(); i++) {
    // // Crie instâncias de jogadores e adicione à lista
    // Player player = new Player(null, null);
    // players.add(player);
    // }

    // getShufflePlayersList();
    // setInitialTerritoriesForEachPlayer(numberOfPlayers);
    // setPlayerID();
    // return players;
    // }

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
