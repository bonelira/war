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
    public void configureBoard(List<Territory> territories) {
        game.setTerritoriesList(territories);

        List<Player> playerOwner = new ArrayList();
        game.getPlayers().forEach(player -> playerOwner.add(player));

        int i = 0;
        for (Territory territory : territories) {
            territory.setProprietario(playerOwner.get(0));

            i++;
        }

    }

    @Override
    public void configurePlayers(List<Player> players) {
        GoalCard goalCard = new GoalCard("Correr");
        int i = 0;
        for (Player player : players) {
            // player.setName("Black" + i);
            // player.setId("Black" + i);
            player.setGoalCard(goalCard);
            i++;
        }

        game.setPlayers(players);
    }

    @Override
    public void configureCards(List<GoalCard> goalCards) {
        for (GoalCard goalCard : goalCards) {
            goalCard.setGoal("Correr");
        }
        game.setGoalCards(goalCards);
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
