/**
 * @author Abi-albom Lira <bone-lira@hotmail.com / @bonelira>
 */

package br.unicap.eng2.debuggin_squad.war.inicialization;

public class Director {

    private Board board = new Board();
    private MockGameWar mock = new MockGameWar();

    public void constructDefaultGame(Builder builder) throws Exception {
        builder.configureBoard(board);
        builder.configureCards(mock.getGoalCards());
        builder.configurePlayers(mock.getPlayers());
        builder.configureInitialTerritoriesOwner(mock.getPlayers(), board);
    }

    public void constructEmptyGame(Builder builder) throws Exception {
        builder.reset(); // mandar apenas o jogo reiniciado vazio mesmo.
    }

    // outros diretores construtores aqui:



}