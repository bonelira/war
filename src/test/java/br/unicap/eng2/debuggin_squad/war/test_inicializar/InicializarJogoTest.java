/**
 * @author Abi-albom Lira / @bonelira>
 */
package br.unicap.eng2.debuggin_squad.war.test_inicializar;

import static org.junit.Assert.assertFalse;
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
import br.unicap.eng2.debuggin_squad.war.inicialization.Director;
import br.unicap.eng2.debuggin_squad.war.inicialization.GameBuilder;
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
    private GameBuilder gameBuilder;
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
    public void setup() throws Exception {
        Director director = new Director();
        GameBuilder builder = new GameBuilder();
        director.constructDefaultGame(builder);
        WarGame game = builder.getResult();

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
    public void testBoardInitializationIsNotNull() {
        Director director = new Director();
        GameBuilder builder = new GameBuilder();
        director.constructDefaultGame(builder);
        WarGame game = builder.getResult();

        Board map = game.getBoard();
        assertNotNull(map);

    }

    @Test
    public void testBoardEachTerritoryHasNameAndContinentNotNullValues() {
        Director director = new Director();
        GameBuilder builder = new GameBuilder();
        director.constructDefaultGame(builder);
        WarGame game = builder.getResult();

        List<Territory> territories = game.getTerritoriesList();
        boolean nameIsInitialized = true;
        boolean continentIsInitialized = true;

        for (Territory territory : territories) {
            if (territory.getNome().isEmpty()) {
                nameIsInitialized = false;
                return;
            } else if (territory.getContinent().isEmpty()) {
                continentIsInitialized = false;
                return;
            }
        }

        assertTrue(continentIsInitialized && nameIsInitialized);

    }

    // @Test
    // public void testEachTerritoryHasOwner() {
    // Director director = new Director();
    // GameBuilder builder = new GameBuilder();
    // director.constructDefaultGame(builder);
    // WarGame game = builder.getResult();
    // List<Territory> territories = game.getTerritoriesList();
    // boolean territoryHasOwner = true;

    // for (Territory territory : territories) {
    // if (territory.getProprietario().equals(null)) {
    // territoryHasOwner = false;
    // return;
    // }
    // }

    // assertTrue(territoryHasOwner);
    // }

    @Test
    public void testBoardTotalCountriesInOceaniaContinent() {
        Director director = new Director();
        GameBuilder builder = new GameBuilder();
        director.constructDefaultGame(builder);
        WarGame game = builder.getResult();

        List<Territory> oceaniaTerritories = game.getBoard().getContinentCountriesList("Oceania");
        int expected = 4;
        int oceaniaTerritoriesSize = oceaniaTerritories.size();

        assertEquals(expected, oceaniaTerritoriesSize);

    }

    @Test
    public void testBoardNumberOfTerritories() {
        Director director = new Director();
        GameBuilder builder = new GameBuilder();
        director.constructDefaultGame(builder);
        WarGame game = builder.getResult();

        int expected = 42;
        int actual = game.getTerritoriesList().size();

        assertEquals(expected, actual);
    }

    @Test
    public void testBoarHasCorrectAdjacency() {
        Director director = new Director();
        GameBuilder builder = new GameBuilder();
        director.constructDefaultGame(builder);
        WarGame game = builder.getResult();

        List<Territory> map = game.getTerritoriesList();

        // Suécia --> Inglaterra
        // se n funcionar é pq a contagem do index está errada (considerando que o
        // método está correto)

        int indexTerritoryA = 34;
        int indexTerritoryB = 36;

        // Verificar se as adjacências são bidirecionais (se A é adjacente a B, então B
        // deve ser adjacente a A).
        assertTrue(map.get(indexTerritoryA).isAdjacent(map.get(indexTerritoryB))
                && map.get(indexTerritoryB).isAdjacent(map.get(indexTerritoryA)));
    }

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

        Director director = new Director();
        GameBuilder builder = new GameBuilder();
        director.constructDefaultGame(builder);
        WarGame game = builder.getResult();
        // verificando se os players foram criados
        assertNotNull(game.getPlayers()); // lista de players não está vazia(null)
        // assertNotNull(game.getPlayers().get(0)); // para verificar individualmente se
        // um player (.get(index do player)) foi criado.

    }

    @Test
    public void testPlayerHasAtLeastOneGoalCard() {
        Director director = new Director();
        GameBuilder builder = new GameBuilder();
        director.constructDefaultGame(builder);
        WarGame game = builder.getResult();

        assertNotNull(game.getPlayers().get(0).getGoalCard());

    }

    @Test
    public void test3playersHas14TerritoriesAtBegin() {
        Director director = new Director();
        GameBuilder builder = new GameBuilder();

        director.constructDefaultGame(builder);

        WarGame game = builder.getResult();

        List<Player> players = game.getPlayers();
        int territoriesPlayer0 = players.get(0).getConqueredTerritories().size();

        assertTrue(territoriesPlayer0 == 7);

    }

    @Test
    public void test6playersHas7TerritoriesAtBegin() {
        Director director = new Director();
        GameBuilder builder = new GameBuilder();

        director.constructDefaultGame(builder);

        WarGame game = builder.getResult();

        List<Player> players = game.getPlayers();
        int territoriesPlayer0 = players.get(0).getConqueredTerritories().size();

        assertTrue(territoriesPlayer0 == 7);

    }

    // @Test

    // // DEPRECATED
    // public void testIsPlayerListOrderShuffle() {
    // Director director = new Director();
    // GameBuilder builder = new GameBuilder();

    // director.constructDefaultGame(builder);

    // WarGame game = builder.getResult();
    // List<Player> actualList = new ArrayList<>(game.getPlayers());
    // List<Player> expecList = configurator.getShufflePlayersList();

    // assertNotEquals(expecList, actualList);

    // }

    @Test

    public void testAllCurrentPlayersHaveColor() {
        Director director = new Director();
        GameBuilder builder = new GameBuilder();
        director.constructDefaultGame(builder);
        WarGame game = builder.getResult();

        List<Player> players = game.getPlayers();

        for (Player player : players) {
            assertNotNull(player.getId());
        }

    }

    // @Test
    // public void testTerritoryHasAtLeastOneTroopAtGamesBegin() {
    // board = new Board();
    // game = new WarGame();
    // game.start();
    // List<Territory> territories = board.getTerritories();

    // int actual = territories.get(35).getArmiesCount();
    // assertEquals(1, actual);

    // }

    @Test
    public void testVerifyQuantityOfPlayersIsAllowed() {
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
        Director director = new Director();
        GameBuilder builder = new GameBuilder();
        director.constructDefaultGame(builder);
        WarGame game = builder.getResult();

        int numbOfPlayers = game.getPlayers().size();

        assertTrue(numbOfPlayers < 7 && numbOfPlayers > 2);

    }

    // @Test
    // public void testEachPlayerHasUnicID() {
    // // Neste caso ID é a cor do player, porém ID será String* e pode mudar de
    // acordo
    // // com o modo de jogo
    // // ID vai de 1 - 6.
    // // verifica se cada jogador recebeu um ID único
    // }

}
