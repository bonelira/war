/**
 * @author Abi-albom Lira <bone-lira@hotmail.com / @bonelira>
 */

package br.unicap.eng2.debuggin_squad.war.inicialization;

import java.util.List;
import java.util.ArrayList;

import br.unicap.eng2.debuggin_squad.war.inicialization.Board;
import br.unicap.eng2.debuggin_squad.war.GoalCard;
import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

public class DefaultGameBuilder implements Builder { // Forma padrão do jogo: (Usa uma lista de nomes pré-pronta) com 6
    // jogadores, com cores aleatorias para cada um, com objetivo único para
    // cada um (conquistar 24 territórios / derrotar um player aleatório),
    // territórios aleatórios com 1 exército para cada um e em ordem
    // aleatória.
    public DefaultGameBuilder() {
        this.game = new WarGame();
    }

    // implementar metodos para configurar alguns aspectos do jogo
    // durante a inicializacao (tabuleiro, jogadores, cartas, regras etc)
    // metodos para inicializacao das Rules (Buildar ele)

    private WarGame game;
    private Board board;
    private List<Player> players;
    private List<GoalCard> goalCards;
    private int playersQuantity;
    private List<Territory> territories;

    @Override

    public void configureBoard(Board board) {
        game.setBoard(board);
    }

    @Override
    // Por enquanto nenhuma config a mais e necessaria, pois ha apenas 1 goal
    public void configureCards(List<GoalCard> goalCards) { // conquistar 24 territorios ou continente.
        GoalCard goalCard = game.getGoalCards().get(0);
        for (Player player : players) {
            player.setGoalCard(goalCard);
        }
        game.setGoalCards(goalCards);
    }

    @Override
    public void configurePlayers(List<Player> players) { // No default ele apenas retorna a lista default de players
        // giveInitialTerritoriesForEachPlayer(players);
        // giveInitialGoalCardsForEachPlayer(players);
        game.setPlayers(players);
    }

    // // TODO [X] mudar esse método utilizando 'lista circular para os players'
    // // Depreciado: Quem fará a distribuição de territórios será o método comum da
    // // interface: configureInitialTerritoriesOwner
    // private void giveInitialGoalCardsForEachPlayer(List<Player> players) {
    // GoalCard goalCard = game.getGoalCards().get(0);
    // for (Player player : players) {
    // player.setGoalCard(goalCard);
    // }
    // }

    // private void giveInitialTerritoriesForEachPlayer(List<Player> player) {
    // List<Player> totalPlayers = player;
    // List<Territory> totalTerritories = new Board().getBoardsTerritoriesList();
    // int territoriesPerPlayer = 0;

    // territoriesPerPlayer = totalTerritories.size() / totalPlayers.size();

    // int territoryIndex = 0;
    // for (Player players : totalPlayers) {
    // List<Territory> playerTerritories = new ArrayList<>();
    // players.setConqueredTerritories(playerTerritories);
    // for (int i = 0; i < territoriesPerPlayer; i++) {
    // playerTerritories.add(totalTerritories.get(territoryIndex));
    // totalTerritories.get(territoryIndex).setProprietario(players);
    // territoryIndex++;
    // }
    // }
    // }

    // metodos para inicializacao do Board (Buildar ele)

    public WarGame getResult() {
        return this.game;
    }

    @Override
    public void reset() {
        this.game = new WarGame();
    }

    @Override
    public void configureInitialTerritoriesOwner(List<Player> players, Board board) {
        // Usando a lista circular de players adicionar território por território a
        // lista de owners e em cada território setar o dono.
        // bidirecionaOwnershipPlayerBoard()
        // Nesse método eu vou passando pela lista de players pelo tamanho do board até
        // que todos os territórios tenham sido setados

    }

    private void bidirecionaOwnershipPlayerBoard(Player player, Territory territory) {
        player.setTerritory(territory);
        territory.setProprietario(player);
    }

}
