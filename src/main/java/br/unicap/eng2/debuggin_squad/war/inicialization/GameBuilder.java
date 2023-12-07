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
    // Por enquanto nenhuma config a mais necessaria, pois ja e passado
    public void configureBoard(List<Territory> territories) { // o mapa padrao, config so quando lidar com players !=6.
        game.setTerritoriesList(territories);
        board = new Board(territories);
        game.setBoard(board);
    }

    @Override
    // Por enquanto nenhuma config a mais e necessaria, pois ha apenas 1 goal
    public void configureCards(List<GoalCard> goalCards) { // conquistar 24 territorios ou continente.
        game.setGoalCards(goalCards);
    }

    @Override
    public void configurePlayers(List<Player> players) {
        giveInitialTerritoriesForEachPlayer(players);
        giveInitialGoalCardsForEachPlayer(players);

        game.setPlayers(players);
    }

    // TODO [ ] mudar esse método utilizando 'lista circular para os players'
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

    // metodos para inicializacao do Board (Buildar ele)

    public WarGame getResult() {
        return this.game;
    }

    @Override
    public void reset() {
        this.game = new WarGame();
    }

}
