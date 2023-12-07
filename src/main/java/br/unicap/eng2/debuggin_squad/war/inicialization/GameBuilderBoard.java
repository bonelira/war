package br.unicap.eng2.debuggin_squad.war.inicialization;

import java.util.List;

import br.unicap.eng2.debuggin_squad.war.GoalCard;
import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

public class GameBuilderBoard implements Builder {
    // implementa o jogo completo:
    // players com Nome e ID, com objetivos, e territórios com owner
    @Override
    public void reset() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reset'");
    }

    @Override
    public void configureBoard(List<Territory> territories) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'configureBoard'");
    }

    @Override
    public void configurePlayers(List<Player> players) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'configurePlayers'");
    }

    @Override
    public void configureCards(List<GoalCard> goalCards) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'configureCards'");
    }

    @Override
    public WarGame getResult() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getResult'");
    }

}
