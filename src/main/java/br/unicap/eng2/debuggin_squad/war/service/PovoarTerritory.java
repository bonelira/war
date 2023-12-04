/**
 * @author Bruno Vicente <brunohiperbole@gmail.com>
 */

package br.unicap.eng2.debuggin_squad.war.service;

import java.util.ArrayList;
import java.util.List;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

public class PovoarTerritory {

    private List<Territory> territory;

    public List<Territory> getTerritory() {
        return territory;
    }


    public PovoarTerritory() {
        territory = new ArrayList<>();
    }
    


    // Add exércitos ao território conquistado
    // novo proprietário do território
    // Adiciona o território conquistado à lista de territórios conquistados pelo jogador

    public static void populateConqueredTerritory(Territory conqueredTerritory, List<Territory> adjacentTerritories, Player conqueringPlayer, int numberOfArmies) {      
        conqueredTerritory.addArmies(numberOfArmies);
        conqueredTerritory.setProprietario(conqueringPlayer);  
        conqueringPlayer.getConqueredTerritories().add(conqueredTerritory); 

    }


    //Adiciona exércitos ao território adjacente
    // Define o novo proprietário do território adjacente
    // Adiciona o território adjacente à lista de territórios conquistados pelo jogador

    public static void conquerAdjacentTerritories(Player conqueringPlayer, Territory conqueredTerritory, List<Territory> adjacentTerritories) {
        for (Territory adjacentTerritory : adjacentTerritories) {
            adjacentTerritory.addArmies(1); 
            adjacentTerritory.setProprietario(conqueringPlayer); 
            conqueringPlayer.getConqueredTerritories().add(adjacentTerritory);
        }
    }




     // Remove exércitos do território de origem
     // Adiciona exércitos ao território de destino

    public static void fortifyTerritory(Territory fromTerritory, Territory toTerritory, int numberOfArmies) {       
        fromTerritory.removeArmies(numberOfArmies);        
        toTerritory.addArmies(numberOfArmies);
    }



    
    
}