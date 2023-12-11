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
    private PlayerCircularLinkedList playersCircularList;
    private List<GoalCard> goalCards;
    private int playersQuantity;
    private List<Territory> territories;

    @Override

    public void configureBoard(Board board) {
        game.setBoard(board);
    }

    @Override
    // Por enquanto nenhuma config a mais e necessaria, pois ha apenas 1 goal
    public void configureCards(List<GoalCard> goalCards) throws Exception { // conquistar 24 territorios ou continente.

        game.setGoalCards(goalCards);
    }

    @Override
    public void configurePlayers(PlayerCircularLinkedList players) { // No default ele apenas retorna a lista default de
                                                                     // players
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
    public void configureInitialGoalCards(PlayerCircularLinkedList players, List<GoalCard> goalCards) {
        if (players.isEmpty()) {
            return;
        }

        int territoryIndex = 0;
        PlayerCircularListNode currentPlayerNode = players.getHead();

        while (territoryIndex < goalCards.size()) {
            GoalCard currentGoalCard = goalCards.get(territoryIndex);
            Player currentPlayer = currentPlayerNode.getPlayer();

            if (currentPlayer != null) {
                currentPlayer.setGoalCard(currentGoalCard);
            }

            currentPlayerNode = players.getSuccessor(currentPlayerNode); // Utiliza getSuccessor para avançar na lista
                                                                         // circular
            territoryIndex++;
        }

    }

    @Override
    public void configureInitialTerritoriesOwner(PlayerCircularLinkedList players, Board board) throws Exception {
        if (players.isEmpty()) {
            return;
        }

        List<Territory> territories = board.getBoardsTerritoriesList();
        int territoryIndex = 0;
        PlayerCircularListNode currentPlayerNode = players.getHead();

        while (territoryIndex < territories.size()) {
            Territory currentTerritory = territories.get(territoryIndex);
            Player currentPlayer = currentPlayerNode.getPlayer();

            if (currentPlayer != null) {
                bidirecionaOwnershipPlayerBoard(currentPlayer, currentTerritory);
            }

            currentPlayerNode = players.getSuccessor(currentPlayerNode); // Utiliza getSuccessor para avançar na lista
                                                                         // circular
            territoryIndex++;
        }

    }

    private void bidirecionaOwnershipPlayerBoard(Player currentPlayer, Territory currentTerritory) {
        currentPlayer.setTerritory(currentTerritory);
        currentTerritory.setProprietario(currentPlayer);
    }
}
