/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;
import br.unicap.eng2.debuggin_squad.war.service.FortifyService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FortifyServiceTest {
    private List<Player> players;
    private FortifyService fortificar;
    private Territory territory;

    @BeforeEach
    public void setUp() {
        // Inicialize a lista de jogadores com a alocação de exércitos diretamente na classe Player
        players = new ArrayList<>();
        players.add(new Player("Jogador1", "10"));
        players.add(new Player("Jogador2", "15"));
        players.add(new Player("Jogador3", "8"));
        players.add(new Player("Jogador4", "9"));

        fortificar = new FortifyService(territory);
    }

    @Test
    public void testValidatesTroopsSentInTheInitialTurn() {
        int totalTerritoriosValue = 42;
        int qtdPlayers = players.size();
        int expectedExercitosRecebidos = totalTerritoriosValue / qtdPlayers;

        int exercitosRecebidos = fortificar.deliverArmiesInInitialTurn(players);

        assertEquals(expectedExercitosRecebidos, exercitosRecebidos);
    }
}