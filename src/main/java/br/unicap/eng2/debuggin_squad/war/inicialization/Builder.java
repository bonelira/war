/**
 * @author Abi-albom Lira <bone-lira@hotmail.com / @bonelira>
 */

package br.unicap.eng2.debuggin_squad.war.inicialization;

import br.unicap.eng2.debuggin_squad.war.inicialization.Board;
import br.unicap.eng2.debuggin_squad.war.GoalCard;
import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

import java.util.List;

public interface Builder {

    public void reset();

    public void configureBoard(Board board); // mudar para Board

    public void configurePlayers(PlayerCircularLinkedList players);

    public void configureCards(List<GoalCard> goalCards) throws Exception; // Preciso de um nome melhor?

    public void configureInitialTerritoriesOwner(PlayerCircularLinkedList players, Board board);

    public void configureInitialGoalCards(PlayerCircularLinkedList players, List<GoalCard> goalCards);

    public WarGame getResult();
}
