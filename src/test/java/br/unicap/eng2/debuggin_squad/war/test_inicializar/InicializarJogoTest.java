/**
 * @author Abi-albom Lira / @bonelira>
 */
package br.unicap.eng2.debuggin_squad.war.test_inicializar;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
import br.unicap.eng2.debuggin_squad.war.inicialization.Board;
import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;
import br.unicap.eng2.debuggin_squad.war.enumWar.ID;
import br.unicap.eng2.debuggin_squad.war.inicialization.Director;
import br.unicap.eng2.debuggin_squad.war.inicialization.PlayerCircularLinkedList;
import br.unicap.eng2.debuggin_squad.war.inicialization.DefaultGameBuilder;
import br.unicap.eng2.debuggin_squad.war.inicialization.WarGame;
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
    private Board board;
    private WarGame game;
    private DefaultGameBuilder gameBuilder;
    // private GoalCard goalCard;
    // private Dealer dealer;
    // private GameRules gameRules;
    // private TurnManager turnManager;
    // private MapGenerator mapGenerator;
    // private SessionManager sessionManager;
    // private RuleManager ruleManager;
    // private Continent continent;
    // private GameConfigurator configurator;
    // private EndGamePhase endGamePhase = new EndGamePhase();
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
    public void setup() throws Exception {
        Director director = new Director();
        DefaultGameBuilder builder = new DefaultGameBuilder();
        director.constructDefaultGame(builder);
        game = builder.getResult(); // Atribuir o jogo criado ao campo 'game'
    }

    // TODO
    // [ ] refatorar classe
    // [ ] Teste inicialização: Board
    // [ ] Teste inicialização: Player
    // [ ] Teste inicialização: Dealer

    // assertEquals("Red", 0);
    // assertEquals("Blue", 1);
    // assertEquals("Green", 2);
    // assertEquals("Yellow", 3);
    // assertEquals("Orange", 4);
    // assertEquals("Black", 5);

    // lista de testes para as inicializações:
    /*
     * # Board
     * Territórios Criados:
     * Verificar se todos os territórios foram corretamente criados.
     * Certificar-se de que cada território tem um nome e uma localização válidos.
     * Testar se os territórios foram atribuídos aos continentes corretos.
     * Adjacências entre Territórios:
     * Garantir que as adjacências entre os territórios estão corretas.
     * Testar se os territórios adjacentes foram devidamente definidos para cada
     * território.
     * Verificar se as adjacências são bidirecionais (se A é adjacente a B, então B
     * deve ser adjacente a A).
     * Validação de Proprietários:
     * Testar se todos os territórios têm um proprietário válido atribuído (se
     * necessário para as regras do jogo).
     * Atribuição Correta de Continentes:
     * Certificar-se de que os territórios foram atribuídos aos continentes corretos
     * de acordo com as regras do jogo.
     * Verificar se todos os territórios pertencem a um continente válido.
     * # GoalCard
     * Distribuição correta de cartas:
     * Teste se o número total de cartas distribuídas corresponde ao número esperado
     * de jogadores.
     * Verifique se cada jogador recebe exatamente uma carta de objetivo.
     * Unicidade das cartas:
     * Garanta que nenhuma carta de objetivo seja duplicada ou repetida entre os
     * jogadores.
     * Validação dos objetivos:
     * Verifique se os objetivos são válidos de acordo com as regras do jogo, como
     * conquistar um certo número de territórios, controlar continentes específicos,
     * ou eliminar um jogador.
     * Atribuição correta aos jogadores:
     * Teste se as cartas de objetivo são atribuídas aos jogadores corretamente,
     * assegurando que cada jogador tenha uma carta distinta.
     * # Player
     * Criação de Jogadores:
     * Teste se a quantidade de jogadores criados corresponde ao número esperado.
     * Verifique se cada jogador possui um nome único.
     * Garanta que cada jogador tenha uma cor associada.
     * Atribuição de Objetivos:
     * Certifique-se de que cada jogador recebe um objetivo distinto e válido, de
     * acordo com as regras do jogo.
     * Validação de Cores:
     * Teste se as cores dos jogadores são atribuídas corretamente, sem repetições
     * ou conflitos de cores.
     * Correspondência de Nomes:
     * Verifique se os nomes atribuídos aos jogadores são não nulos e
     * significativos.
     * Integridade dos Jogadores:
     * Garanta que não haja jogadores duplicados ou ausentes na inicialização.
     * Adequação dos objetivos aos jogadores:
     * Verifique se os objetivos atribuídos são razoáveis para a o jogador (jogador
     * não pode destruir a si mesmo ou jogador não pode eliminar jogador que não
     * esteja na partida).
     */

    @Test
    // 1. verificar que a lista não tá nula e nem vazia
    // 2. ver se cada território ,individualmente, não está nulo e foi feito
    // corretamente
    public void testBoardInitializationIsNotNull() throws Exception {
        Board map = game.getBoard();
        assertNotNull(map);

        List<Territory> territories = map.getBoardsTerritoriesList();
        assertNotNull(territories);
        assertFalse(territories.isEmpty());

        for (Territory territory : territories) {
            assertNotNull(territory);
        }
    }

    @Test
    public void testTerritoryNameAndContinentNotNullValues() throws Exception {
        List<Territory> territories = game.getBoard().getBoardsTerritoriesList();

        for (Territory territory : territories) {
            assertNotNull(territory.getName()); // tem nome?
            assertFalse(territory.getName().isEmpty()); // está vazio?

            assertNotNull(territory.getContinent()); // tem continent?
            assertFalse(territory.getContinent().isEmpty()); // tá vazio?
        }
    }

    // @Test
    // public void testEachTerritoryHasOwner() {
    // List<Territory> territories = game.getBoard().getBoardsTerritoriesList();

    // for (Territory territory : territories) {
    // assertNotNull(territory.getProprietario());
    // }
    // }

    @Test
    public void testBoardTotalCountriesInOceaniaContinent() throws Exception {
        List<Territory> oceaniaTerritories = game.getBoard().getContinentCountriesList("Oceania");
        int expected = 4;
        int oceaniaTerritoriesSize = oceaniaTerritories.size();

        assertEquals(expected, oceaniaTerritoriesSize);

    }

    @Test
    public void testBoardNumberOfTerritories() throws Exception {
        int expected = 42;
        int actual = game.getBoard().getBoardsTerritoriesList().size();

        assertEquals(expected, actual);
    }

    @Test
    public void testBoarHasCorrectAdjacency() throws Exception {
        Board board = game.getBoard();
        Territory sweden = board.searchByName("Suecia");
        Territory england = board.searchByName("Inglaterra");// agora procura por nome, já que o índice é
                                                             // horrível de lidar
        assertNotNull(sweden);
        assertNotNull(england);

        // as adjacências são bidirecionais?
        assertTrue(sweden.isAdjacent(england) && england.isAdjacent(sweden));
    }

    @Test
    public void testPlayersInitialization() throws Exception {
        List<Player> players = game.getPlayersList();

        // Lsista de jogadores não é nula
        assertNotNull(players);

        // tem pelo menos um jogador na lista
        assertFalse(players.isEmpty());

        // confirmar se cada jogador na lista possui um nome não nulo e não vazio
        for (Player player : players) {
            assertNotNull(player.getName());
            assertFalse(player.getName().isEmpty());
        }

        // Verifica se cada jogador tem um ID único
        List<ID> playerIds = new ArrayList();
        for (Player player : players) {
            assertTrue(playerIds.add(player.getId()));
        }

        // // Verifica se cada jogador possui uma única carta objetivo
        // for (Player player : players) {
        // assertNotNull(player.getGoalCard());
        // }

        // Verifica se cada jogador tem territórios dentro do range de 7 ->> 14
        // territórios (no caso do default é possível deixar 7 ou alterar em outros
        // casoss)
        for (Player player : players) {
            int numOfTerritories = player.getConqueredTerritories().size();
            assertTrue(numOfTerritories >= 7 && numOfTerritories <= 14);
            // assertTrue(numOfTerritories >= 7);
        }

    }

    @Test
    public void testEachPlayerHasUnicID() {
        List<Player> players = game.getPlayersList();
        List<ID> playerIds = new ArrayList();
        for (Player player : players) {
            assertTrue(playerIds.add(player.getId()));
        }
    }

    @Test
    public void defaultPlayersListSizeEquals6() throws Exception {
        int expected = 6;
        int actual = game.getPlayers().size();
        assertEquals(expected, actual);
    }

    @Test
    public void testVerifyQuantityOfPlayersIsAllowed() throws Exception {
        int actual = game.getPlayers().size();
        assertTrue(actual >= 3 && actual <= 7);
    }

    @Test
    public void testPlayersHaveAtLeastOneGoalCard() throws Exception {
        List<Player> players = game.getPlayersList();
        assertNotNull(players);

        for (Player player : players) {
            assertNotNull(player.getGoalCard());
        }
    }

    @Test
    public void testAllPlayersStartWith7Territories() throws Exception {
        PlayerCircularLinkedList players = game.getPlayers();

        for (int i = 0; i < players.size(); i++) { // Agora verifica se TODOS tem 7 territórios (são 6 players)
            int territories = players.get(i).getConqueredTerritories().size();
            assertEquals(7, territories);
        }
    }

    @Test

    public void testAllCurrentPlayersHaveColor() throws Exception {
        List<Player> players = game.getPlayersList();
        List<ID> playerIds = new ArrayList();
        for (Player player : players) {
            assertTrue(playerIds.add(player.getId()));
        }
    }

    @Test
    public void testTerritoryHasAtLeastOneTroopAtGamesBegin() {
        List<Territory> territories = game.getBoard().getBoardsTerritoriesList();

        for (Territory territory : territories) {
            assertTrue(territory.getArmiesCount() >= 1);
        }

    }

    @Test
    public void emptyGameBuilderHasEmptyBoard() throws Exception {
        Director director = new Director();
        DefaultGameBuilder builder = new DefaultGameBuilder();
        director.constructEmptyGame(builder);
        game = builder.getResult(); // Atribuir o jogo criado ao campo 'game'

        Board actualEmptyBoard = game.getBoard();

        assertNull(actualEmptyBoard);
    }

    @Test
    public void emptyGameBuilderHasEmptyPlayers() throws Exception {
        Director director = new Director();
        DefaultGameBuilder builder = new DefaultGameBuilder();
        director.constructEmptyGame(builder);
        game = builder.getResult(); // Atribuir o jogo criado ao campo 'game'

        // int totalPlayers = game.getPlayersQuantity();

        PlayerCircularLinkedList actualEmptyPlayers = game.getPlayers();

        // assertEquals(0, totalPlayers);

        assertNull(actualEmptyPlayers);
    }

    @Test
    public void emptyGameBuilderHasEmptyAttributesButIsNotAEmptyGame() throws Exception {
        Director director = new Director();
        DefaultGameBuilder builder = new DefaultGameBuilder();
        director.constructEmptyGame(builder);
        game = builder.getResult(); // Atribuir o jogo criado ao campo 'game'

        WarGame actualEmptyGame = builder.getResult();

        assertNotNull(actualEmptyGame);
    }

}
