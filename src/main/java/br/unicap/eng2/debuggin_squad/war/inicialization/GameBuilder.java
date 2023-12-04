/**
 * @author Abi-albom Lira <bone-lira@hotmail.com / @bonelira>
 */

package br.unicap.eng2.debuggin_squad.war.inicialization;

import java.util.List;
import java.util.ArrayList;

import br.unicap.eng2.debuggin_squad.war.Board;
import br.unicap.eng2.debuggin_squad.war.GoalCard;
import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

public class GameBuilder implements Builder {
    public GameBuilder() {
        this.game = new WarGame();
    }

    // implementar métodos para configurar alguns aspectos do jogo
    // durante a inicialização (tabuleiro, jogadores, cartas, regras etc)
    // métodos para inicialização das Rules (Buildar ele)

    private WarGame game;
    private Board board;
    private List<Player> players;
    private List<GoalCard> goalCards;
    private int playersQuantity;
    private List<Territory> territories;

    @Override
    // Por enquanto nenhuma config a mais necessária, pois já é passado
    public void configureBoard(List<Territory> territories) { // o mapa padrão, config só quando lidar com players !=6.
        game.setTerritoriesList(territories);
        board = new Board(territories);
        game.setBoard(board);
    }

    @Override
    // Por enquanto nenhuma config a mais é necessária, pois há apenas 1 goal
    public void configureCards(List<GoalCard> goalCards) { // conquistar 24 territórios ou continente.
        game.setGoalCards(goalCards);
    }

    @Override
    public void configurePlayers(List<Player> players) {
        giveInitialTerritoriesForEachPlayer(players);
        giveInitialGoalCardsForEachPlayer(players);

        game.setPlayers(players);
    }

    private void giveInitialGoalCardsForEachPlayer(List<Player> players) {
        GoalCard goalCard = game.getGoalCards().get(0);
        for (Player player : players) {
            player.setGoalCard(goalCard);
        }
    }

    private void giveInitialTerritoriesForEachPlayer(List<Player> player) {
        List<Player> totalPlayers = player;
        List<Territory> totalTerritories = game.getTerritoriesList();
        int territoriesPerPlayer = 0;

        territoriesPerPlayer = totalTerritories.size() / totalPlayers.size();

        int territoryIndex = 0;
        for (Player players : totalPlayers) {
            List<Territory> playerTerritories = new ArrayList<>();
            players.setConqueredTerritories(playerTerritories);
            for (int i = 0; i < territoriesPerPlayer; i++) {
                playerTerritories.add(totalTerritories.get(territoryIndex));
                totalTerritories.get(territoryIndex).setProprietario(players);
                territoryIndex++;
            }
        }
    }

    // métodos para inicialização do Board (Buildar ele)

    public WarGame getResult() {
        return this.game;
    }

    @Override
    public void reset() {
        this.game = new WarGame();
    }

}
