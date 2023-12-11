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

    // outros diretores construtores aqui:

    // public

}