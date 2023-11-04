/**
 * @author Abi-albom Lira <bone-lira@hotmail.com / @bonelira>
 */
package br.unicap.eng2.debuggin_squad.war.test_inicializar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
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
import br.unicap.eng2.debuggin_squad.war.Board;
import br.unicap.eng2.debuggin_squad.war.Player;
import br.unicap.eng2.debuggin_squad.war.GoalCard;
import br.unicap.eng2.debuggin_squad.war.Dealer;
import br.unicap.eng2.debuggin_squad.war.GameRules;
import br.unicap.eng2.debuggin_squad.war.TurnManager;
import br.unicap.eng2.debuggin_squad.war.GameConfigurator;
import br.unicap.eng2.debuggin_squad.war.SessionManager;
import br.unicap.eng2.debuggin_squad.war.RuleManager;
import br.unicap.eng2.debuggin_squad.war.MapGenerator;
import br.unicap.eng2.debuggin_squad.war.Continent;
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
// import br.unicap.eng2.debuggin_squad.war.EndGamePhase;
// import br.unicap.eng2.debuggin_squad.war.GoalConquerContinent;
// import br.unicap.eng2.debuggin_squad.war.GoalConquer24Territory;
// import br.unicap.eng2.debuggin_squad.war.GoalEliminatePlayer;
// import br.unicap.eng2.debuggin_squad.war.Deck;
// import br.unicap.eng2.debuggin_squad.war.Card;

public class TestInicializarJogo {

    // private GameWar CurrentGame = new GameWar();
    private Player player;
    private Board board;
    private GoalCard goalCard;
    private Dealer dealer;
    private GameRules gameRules;
    private TurnManager turnManager;
    private MapGenerator mapGenerator;
    private SessionManager sessionManager;
    private RuleManager ruleManager;
    private Continent continent;
    private GameConfigurator configurator;
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
    // private EndGamePhase endGamePhase = new EndGamePhase();
    // private GoalConquerContinent goalConquerContinent = new
    // GoalConquerContinent();
    // private GoalConquer24Territory goalConquer24Territory = new
    // GoalConquer24Territory();
    // private GoalEliminatePlayer goalEliminatePlayer = new GoalEliminatePlayer();

    // private Deck deck = new Deck();
    // private Card ard = new Card();

    @BeforeEach
    public void setup() {
        configurator = new GameConfigurator(6, 1); // qntd de jogadores e o tipo do jogo, sendo 1 default param(int
                                                   // numOfPlayers, int typeOfGame)
        player = new Player();

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
        // Neste caso ID é a cor do player, porém ID será Integer*
        // ID vai de 1 - 6.
        // verifica se cada jogador recebeu um ID único

        List<Player> players = configurator.getListOfPlayers();
        for (Player player : players) {
            
        }

    }

}
