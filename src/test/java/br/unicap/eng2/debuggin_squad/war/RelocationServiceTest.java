package br.unicap.eng2.debuggin_squad.war;
import br.unicap.eng2.debuggin_squad.war.controller.Armies;
import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;
import br.unicap.eng2.debuggin_squad.war.service.RelocationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RelocationServiceTest {
    private Player player1;

    private Territory territory;
    private List<Territory> conqueredTerritories;
    private Territory brasil;
    private Territory argentina;

    private List<Armies> armiesList;
    private int simulationArmies = 7;

    private RelocationService realocar;

    @BeforeEach
    public void setup() {
        realocar = new RelocationService();
        conqueredTerritories = new ArrayList<Territory>();
        armiesList = new ArrayList<Armies>();
    }

    private void mockPlayer1Territory() {
        player1 = mock(Player.class);
        when(player1.getId()).thenReturn("1");

        conqueredTerritories.add(brasil);
        conqueredTerritories.add(argentina);

        when(player1.getConqueredTerritories()).thenReturn(conqueredTerritories);
    }

    private void mockTerritory() {
        brasil = mock(Territory.class);
        when(brasil.getArmiesCount()).thenReturn(5);

        argentina = mock(Territory.class);
        when(argentina.getArmiesCount()).thenReturn(5);
    }

    private void mockAdjacents() {
        brasil.addAdjacentTerritory(argentina);
        argentina.addAdjacentTerritory(brasil);
    }

    @Test
    public void testValidRelocation() {
        mockTerritory();
        mockPlayer1Territory();
        mockAdjacents();
        int armiesTransferido = 4;

        realocar.relocateTroops(player1, brasil, argentina, armiesTransferido);

        assertEquals(1, brasil.getArmiesCount() - armiesTransferido);
        assertEquals(9, argentina.getArmiesCount() + armiesTransferido);
    }
}
