/**
 * @author Abi-albom Lira <bone-lira@hotmail.com / @bonelira>
 */
package br.unicap.eng2.debuggin_squad.war.test_inicializar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
//import br.unicap.eng2.debuggin_squad.war.Board;
import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.GoalCard;
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
    // private Board board;
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

    @Test
    public void testVerifyQuantityOfPlayersIsAllowed() {
        // verificar se a qntd de players está entre 3 - 6
        // quem deve possuir a qntd total desses jogadores é a classe GameConfigurator
        int belowMinNumberOfPlayers = 2;
        int aboveMaxNumberOfPlayers = 7;
        int numberOfPlayers = 3;

        configurator.setNumberOfPlayers(numberOfPlayers); // setNumberOfPlayers() que com o num de players na partida
        List<Player> players = configurator.getListOfPlayers();
        assertTrue(
                players.size() > belowMinNumberOfPlayers
                        &&
                        players.size() < aboveMaxNumberOfPlayers);
    }

    @Test
    public void testEachPlayerHasYourOwnID() {
        // Neste caso ID é a cor do player, porém ID será String* e pode mudar de acordo
        // com o modo de jogo
        // ID vai de 1 - 6.
        // verifica se cada jogador recebeu um ID único

        // TODO
        // [ ] refatorar classe
        List<Player> players = configurator.getListOfPlayers();
        String cor1 = players.get(0).getId();
        String cor2 = players.get(1).getId();
        String cor3 = players.get(2).getId();
        String cor4 = players.get(3).getId();
        String cor5 = players.get(4).getId();
        String cor6 = players.get(5).getId();

        assertEquals("Red", 0);
        assertEquals("Blue", 1);
        assertEquals("Green", 2);
        assertEquals("Yellow", 3);
        assertEquals("Orange", 4);
        assertEquals("Black", 5);

    }

    @Test
    public void playerHasAtLeastOneGoalCard() {
        List<Player> players = configurator.getListOfPlayers();
        GoalCard obj0 = players.get(0).getGoalCard();
        GoalCard obj1 = players.get(1).getGoalCard();
        GoalCard obj2 = players.get(2).getGoalCard();
        GoalCard obj3 = players.get(3).getGoalCard();
        GoalCard obj4 = players.get(4).getGoalCard();
        GoalCard obj5 = players.get(5).getGoalCard();

        assertNotNull(obj0);
        assertNotNull(obj1);
        assertNotNull(obj2);
        assertNotNull(obj3);
        assertNotNull(obj4);
        assertNotNull(obj5);

    }

    @Test
    public void test3playersHas7TerritoriesAtBegin() {
        List<Player> players = configurator.getListOfPlayers();
        int territoriesPlayer0 = players.get(0).getConqueredTerritories().size();
        int territoriesPlayer1 = players.get(1).getConqueredTerritories().size();
        int territoriesPlayer2 = players.get(2).getConqueredTerritories().size();
        int territoriesPlayer3 = players.get(3).getConqueredTerritories().size();
        int territoriesPlayer4 = players.get(4).getConqueredTerritories().size();
        int territoriesPlayer5 = players.get(5).getConqueredTerritories().size();

        assertTrue(territoriesPlayer0 == 7);
        assertTrue(territoriesPlayer1 == 7);
        assertTrue(territoriesPlayer2 == 7);
        assertTrue(territoriesPlayer3 == 7);
        assertTrue(territoriesPlayer4 == 7);
        assertTrue(territoriesPlayer5 == 7);

    }

    @Test
    public void test6playersHas14TerritoriesAtBegin() {
        List<Player> players = configurator.getListOfPlayers();
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
    public void testTerritoryHasAtLeastOneTroop() { 
        List<Player> players = configurator.getListOfPlayers();
        int armyInTerritoriesPlayer0 = players.get(0).getConqueredTerritories().get(0).getArmiesCount();
        int armyInTerritoriesPlayer1 = players.get(1).getConqueredTerritories().get(1).getArmiesCount();
        int armyInTerritoriesPlayer2 = players.get(2).getConqueredTerritories().get(2).getArmiesCount();
        int armyInTerritoriesPlayer3 = players.get(3).getConqueredTerritories().get(3).getArmiesCount();
        int armyInTerritoriesPlayer4 = players.get(4).getConqueredTerritories().get(4).getArmiesCount();
        int armyInTerritoriesPlayer5 = players.get(5).getConqueredTerritories().get(5).getArmiesCount();

        assertNotNull(armyInTerritoriesPlayer0);
        assertNotNull(armyInTerritoriesPlayer1);
        assertNotNull(armyInTerritoriesPlayer2);
        assertNotNull(armyInTerritoriesPlayer3);
        assertNotNull(armyInTerritoriesPlayer4);
        assertNotNull(armyInTerritoriesPlayer5);

    }

}
