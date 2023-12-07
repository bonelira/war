package br.unicap.eng2.debuggin_squad.war.model.state.attack;

import br.unicap.eng2.debuggin_squad.war.controller.TerritoryConfront;
import br.unicap.eng2.war.entities.controller.Territory;

public interface GameState {
    void runPhase() throws Exception;

    void endPhase() throws Exception;

    void transitionToNextState() throws Exception;

    void prepareAttack(Territory tSource, Territory tDestination) throws Exception;

    void performAttack(TerritoryConfront confront) throws Exception;

    void invadeTerritory(Territory territorySource, Territory territoryDestination, int invadeArmy) throws Exception;
    
}
