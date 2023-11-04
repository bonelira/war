/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.service;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

import java.util.List;

public class TroopsService {
    public TroopsService( ) {}

    public int deliverArmiesInInitialTurn(List<Player> players) {
        int totalTerritorios = 42;
        if (players.isEmpty()) {
            throw new IllegalArgumentException("O número de jogadores não pode ser zero.");
        }
        int exercitosRecebidos = totalTerritorios / players.size();
        return exercitosRecebidos;
    }

    public int deliverArmiesByAmountOfTerritory(Player player) {
        List<Territory> conqueredTerritories = player.getConqueredTerritories();
        if (conqueredTerritories.isEmpty()) {
            throw new IllegalArgumentException("O jogador não conquistou nenhum território.");
        }
        int totalTerritorios = conqueredTerritories.size();
        int exercitosRecebidos = totalTerritorios / 2;
        return exercitosRecebidos;
    }

    //Falta alocar o recebimento de carta por {CONTINENTE}
    /* Função: Recebe um determinado número de exercitos de acordo com a tabela*/

    //Falta alocar o recebimento de carta por {TROCA DE CARTAS}
    /* Recebe um determinado número de exercitos de acordo as figuras*/
}
