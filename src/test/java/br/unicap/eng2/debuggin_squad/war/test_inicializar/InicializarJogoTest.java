/**
 * @author Abi-albom Lira / @bonelira>
 */
package br.unicap.eng2.debuggin_squad.war.test_inicializar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** abaixo estão todas as classes atuais do modelo de domínio e  diagrama de classe */
// TODO O QUE DEVE SER FEITO:
// [ ] Criar todas as classes dos imports abaixo
// [ ] excluir todos os imports que não deveriam estar nessa clase: exp:: RedDice,YellowDice,Attack etc
// [ ] configurar todos os atributos 
// [ ] Refatorar classe.
// [x] Comentar as linhas que eu não for usar diretamente para poder criar as classes faltantes depois.
// [ ] adicionar a cada nova classe criada o comentário de criador de classe:

/**
 * @author Abi-albom Lira <bone-lira@hotmail.com / @bonelira>
 */

// import br.unicap.eng2.debuggin_squad.war.GameWar;
import br.unicap.eng2.debuggin_squad.war.Board;
import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;
import br.unicap.eng2.debuggin_squad.war.GoalCard;
import br.unicap.eng2.debuggin_squad.war.WarGame;
//import br.unicap.eng2.debuggin_squad.war.Dealer;
//import br.unicap.eng2.debuggin_squad.war.GameRules;
//import br.unicap.eng2.debuggin_squad.war.TurnManager;
import br.unicap.eng2.debuggin_squad.war.GameConfigurator;
// import br.unicap.eng2.debuggin_squad.war.SessionManager;
// import br.unicap.eng2.debuggin_squad.war.RuleManager;
// import br.unicap.eng2.debuggin_squad.war.MapGenerator;
// import br.unicap.eng2.debuggin_squad.war.Continent;
import br.unicap.eng2.debuggin_squad.war.EndGamePhase;
// import br.unicap.eng2.debuggin_squad.war.Territory;
// import br.unicap.eng2.debuggin_squad.war.Army;
// import br.unicap.eng2.debuggin_squad.war.TerritoryCard;
// import br.unicap.eng2.debuggin_squad.war.RedDice;
// import br.unicap.eng2.debuggin_squad.war.YellowDice;
// import br.unicap.eng2.debuggin_squad.war.Attack;
// import br.unicap.eng2.debuggin_squad.war.Battle;
// import br.unicap.eng2.debuggin_squad.war.CardExchange;
// import br.unicap.eng2.debuggin_squad.war.PlayerElimination;
// import br.unicap.eng2.debuggin_squad.war.ConquerPhase;
// import br.unicap.eng2.debuggin_squad.war.MovementPhase;
// import br.unicap.eng2.debuggin_squad.war.GoalConquerContinent;
// import br.unicap.eng2.debuggin_squad.war.GoalConquer24Territory;
// import br.unicap.eng2.debuggin_squad.war.GoalEliminatePlayer;
// import br.unicap.eng2.debuggin_squad.war.Deck;
// import br.unicap.eng2.debuggin_squad.war.Card;

public class InicializarJogoTest {

    // private GameWar CurrentGame = new GameWar();
    private Player player;
    private Board board;
    private WarGame game;
    // private GoalCard goalCard;
    // private Dealer dealer;
    // private GameRules gameRules;
    // private TurnManager turnManager;
    // private MapGenerator mapGenerator;
    // private SessionManager sessionManager;
    // private RuleManager ruleManager;
    // private Continent continent;
    private GameConfigurator configurator;
    private EndGamePhase endGamePhase = new EndGamePhase();
    // private Territory territory = new Territory();
    // private Army army = new Army();
    // private TerritoryCard territoryCard = new TerritoryCard();
    // private RedDice redDice = new RedDice();
    // private YellowDice yellowDice = new YellowDice();
    // private Attack attack = new Attack();
    // private Battle battle = new Battle();
    // private CardExchange cardExchange = new CardExchange();
    // private PlayerElimination playerElimination = new PlayerElimination();
    // private ConquerPhase conquerPhase = new ConquerPhase();
    // private MovementPhase movementPhase = new MovementPhase();
    // private GoalConquerContinent goalConquerContinent = new
    // GoalConquerContinent();
    // private GoalConquer24Territory goalConquer24Territory = new
    // GoalConquer24Territory();
    // private GoalEliminatePlayer goalEliminatePlayer = new GoalEliminatePlayer();

    // private Deck deck = new Deck();
    // private Card ard = new Card();

    @BeforeEach
    public void setup() {
        configurator = new GameConfigurator(6); // qntd de jogadores e o tipo do jogo, sendo 1 default param(int
                                                // numOfPlayers, int typeOfGame)
        player = new Player("Bone", null);
        GoalCard goal = new GoalCard();
        EndGamePhase endGame = new EndGamePhase();

    }

    // TODO
    // [ ] refatorar classe
    // [ ] Teste inicialização: Board
    // [ ] Teste inicialização: Player
    // [ ] Teste inicialização: Dealer
    // [ ] Teste inicialização: RuleManager
    // [ ] Teste inicialização: GameConfigurator

    // List<Player> players = configurator.getListOfPlayers();
    // String cor1 = players.get(0).getId();
    // String cor2 = players.get(1).getId();
    // String cor3 = players.get(2).getId();
    // String cor4 = players.get(3).getId();
    // String cor5 = players.get(4).getId();
    // String cor6 = players.get(5).getId();

    // assertEquals("Red", 0);
    // assertEquals("Blue", 1);
    // assertEquals("Green", 2);
    // assertEquals("Yellow", 3);
    // assertEquals("Orange", 4);
    // assertEquals("Black", 5);

    // }

    // testes das inicializações:

    @Test
    public void testPlayersInitialization() {

        // Verificar se os player foram criados (3 - 6)
        /*
         * // TODO
         * ESSES TESTES DEVEM SER FEITOS PELA CLASSE DE TESTES DO PLAYER:
         * Testar se a inicialização dos Players acontece da forma correta, que seria:
         * Player possui um nome, valor diferente de null.
         * Player possui um Id único.
         * Player possui uma, apenas uma, carta objetivo.
         * Player tem uma lista de territórios entre 7 e 14 territórios
         *
         */

        game = new WarGame();

        game.start();

        // verificando se os players foram criados
        assertNotNull(game.getPlayers()); // lista de players não está vazia(null)
        // assertNotNull(game.getPlayers().get(0)); // para verificar individualmente se
        // um player (.get(index do player)) foi criado.

    }

    @Test
    public void testBoardInitializationIsNotNull() {
        board = new Board();
        game = new WarGame();
        game.start();

        List<Territory> map = board.getTerritories();
        assertNotNull(map);

    }

    @Test
    public void testBoardNumberOfTerritories() {
        board = new Board();
        game = new WarGame();
        game.start();
        assertEquals(42, board.getTerritories().size());
    }

    @Test
    public void testBoarHasCorrectAdjacency() {
        board = new Board();
        game = new WarGame();
        game.start();
        List<Territory> map = board.getTerritories();

        // Suécia --> Inglaterra
        // se n funcionar é pq a contagem do index está errada (considerando que o
        // método está correto)
        assertTrue(map.get(11).IsAdjacent(map.get(8)));
    }

    @Test
    public void testPlayerHasAtLeastOneGoalCard() {
        game = new WarGame();
        game.start();
        List<Player> players = configurator.getPlayers();

        GoalCard goal1 = new GoalCard("Correr");
        GoalCard goal2 = new GoalCard("Correr");
        GoalCard goal3 = new GoalCard("Correr");
        GoalCard goal4 = new GoalCard("Correr");
        GoalCard goal5 = new GoalCard("Correr");
        GoalCard goal6 = new GoalCard("Correr");

        players.get(0).setGoalCard(goal1);
        players.get(1).setGoalCard(goal2);
        players.get(2).setGoalCard(goal3);
        players.get(3).setGoalCard(goal4);
        players.get(4).setGoalCard(goal5);
        players.get(5).setGoalCard(goal6);

        assertNotNull(players.get(0).getGoalCard());
        assertNotNull(players.get(1).getGoalCard());
        assertNotNull(players.get(2).getGoalCard());
        assertNotNull(players.get(3).getGoalCard());
        assertNotNull(players.get(4).getGoalCard());
        assertNotNull(players.get(5).getGoalCard());

    }

    @Test
    public void test3playersHas14TerritoriesAtBegin() {
        game = new WarGame();
        game.start();
        List<Player> players = configurator.getPlayers();

        int territoriesPlayer0 = players.get(0).getConqueredTerritories().size();
        int territoriesPlayer1 = players.get(1).getConqueredTerritories().size();
        int territoriesPlayer2 = players.get(2).getConqueredTerritories().size();

        assertTrue(territoriesPlayer0 == 7);
        assertTrue(territoriesPlayer1 == 7);
        assertTrue(territoriesPlayer2 == 7);

    }

    @Test
    public void test6playersHas7TerritoriesAtBegin() {
        List<Player> players = configurator.createListOfPlayers(3);
        int territoriesPlayer0 = players.get(0).getConqueredTerritories().size();
        int territoriesPlayer1 = players.get(1).getConqueredTerritories().size();
        int territoriesPlayer2 = players.get(2).getConqueredTerritories().size();
        int territoriesPlayer3 = players.get(3).getConqueredTerritories().size();
        int territoriesPlayer4 = players.get(4).getConqueredTerritories().size();
        int territoriesPlayer5 = players.get(5).getConqueredTerritories().size();

        assertTrue(territoriesPlayer0 == 14);
        assertTrue(territoriesPlayer1 == 14);
        assertTrue(territoriesPlayer2 == 14);
        assertTrue(territoriesPlayer3 == 14);
        assertTrue(territoriesPlayer4 == 14);
        assertTrue(territoriesPlayer5 == 14);

    }

    @Test

    public void testIsPlayerListOrderShuffle() {
        game = new WarGame();
        game.start();
        List<Player> actualList = new ArrayList<>(configurator.getPlayers());
        List<Player> expecList = configurator.getShufflePlayersList();

        assertNotEquals(expecList, actualList);

    }

    @Test

    public void testAllCurrentPlayersHaveColor() {
        game = new WarGame();
        game.start();
        List<Player> players = configurator.getPlayers();

        assertNotNull(players.get(0).getId());
        assertNotNull(players.get(1).getId());
        assertNotNull(players.get(0).getId());

    }
    // Deprecated

    // @Test
    // public void testTerritoryHasAtLeastOneTroop() {
    // List<Player> players = configurator.createListOfPlayers(6);
    // int armyInTerritoriesPlayer0 =
    // players.get(0).getConqueredTerritories().get(0).getArmiesCount();
    // int armyInTerritoriesPlayer1 =
    // players.get(1).getConqueredTerritories().get(0).getArmiesCount();
    // int armyInTerritoriesPlayer2 =
    // players.get(2).getConqueredTerritories().get(0).getArmiesCount();
    // int armyInTerritoriesPlayer3 =
    // players.get(3).getConqueredTerritories().get(0).getArmiesCount();
    // int armyInTerritoriesPlayer4 =
    // players.get(4).getConqueredTerritories().get(0).getArmiesCount();
    // int armyInTerritoriesPlayer5 =
    // players.get(5).getConqueredTerritories().get(0).getArmiesCount();

    // assertNotNull(armyInTerritoriesPlayer0);
    // assertNotNull(armyInTerritoriesPlayer1);
    // assertNotNull(armyInTerritoriesPlayer2);
    // assertNotNull(armyInTerritoriesPlayer3);
    // assertNotNull(armyInTerritoriesPlayer4);
    // assertNotNull(armyInTerritoriesPlayer5);

    // }

    // @Test
    // public void testVerifyQuantityOfPlayersIsAllowed() {
    // // verificar se a qntd de players está entre 3 - 6
    // // quem deve possuir a qntd total desses jogadores é a classe
    // GameConfigurator
    // int belowMinNumberOfPlayers = 2;
    // int aboveMaxNumberOfPlayers = 7;
    // int numberOfPlayers = 3;
    // configurator.setNumberOfPlayers(numberOfPlayers); // setNumberOfPlayers() que
    // com o num de players na partida
    // List<Player> players = configurator.getListOfPlayers();
    // assertTrue(
    // players.size() > belowMinNumberOfPlayers
    // &&
    // players.size() < aboveMaxNumberOfPlayers);
    // }

    // @Test
    // public void testEachPlayerHasYourOwnID() {
    // // Neste caso ID é a cor do player, porém ID será String* e pode mudar de
    // acordo
    // // com o modo de jogo
    // // ID vai de 1 - 6.
    // // verifica se cada jogador recebeu um ID único
    // }

}
