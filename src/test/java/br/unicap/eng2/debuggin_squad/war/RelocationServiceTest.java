package br.unicap.eng2.debuggin_squad.war;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;
import br.unicap.eng2.debuggin_squad.war.service.RelocationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RelocationServiceTest {
    private Player player1;

    private List<Territory> conqueredTerritories;
    private Territory brasil;
    private Territory argentina;
    private Territory afeganistao;
    private Territory uruguai;

    private RelocationService realocar;

    @BeforeEach
    public void setup() {
        realocar = new RelocationService();
        conqueredTerritories = new ArrayList<Territory>();
    }

    private void mockPlayer1Territory() {
        player1 = mock(Player.class);
        when(player1.getId()).thenReturn("1");

        conqueredTerritories.add(brasil);
        conqueredTerritories.add(argentina);
        conqueredTerritories.add(afeganistao);

        when(player1.getConqueredTerritories()).thenReturn(conqueredTerritories);
    }

    private void mockTerritoryAndArmy() {
        brasil = mock(Territory.class);
        when(brasil.getArmiesCount()).thenReturn(5);

        argentina = mock(Territory.class);
        when(argentina.getArmiesCount()).thenReturn(5);

        afeganistao = mock(Territory.class);
        when(afeganistao.getArmiesCount()).thenReturn(5);

        uruguai = mock(Territory.class);
        when(uruguai.getArmiesCount()).thenReturn(1);
    }

    private void mockAdjacents() {
        when(brasil.isAdjacent(argentina)).thenReturn(true);
        when(brasil.isAdjacent(uruguai)).thenReturn(true);
        when(brasil.isAdjacent(afeganistao)).thenReturn(false);
    }

    @Test
    public void testValidRelocation() {
        mockTerritoryAndArmy();
        mockPlayer1Territory();
        mockAdjacents();
        int armiesTransferido = 4;

        realocar.relocateTroops(player1, brasil, argentina, armiesTransferido);

        assertEquals(1, brasil.getArmiesCount() - armiesTransferido);
        assertEquals(9, argentina.getArmiesCount() + armiesTransferido);
    }

    @Test
    public void testValidateErrorTerritoryNotAdjacent(){
        mockTerritoryAndArmy();
        mockPlayer1Territory();
        mockAdjacents();
        int armiesTransferido = 4;

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            realocar.relocateTroops(player1, brasil, afeganistao, armiesTransferido);
        });

        assertEquals(RelocationService.MSG_TERRITORY_NOT_ADJACENT, exception.getMessage());
    }

    @Test
    public void testValidateErrorTerritoryNotConquered(){
        mockTerritoryAndArmy();
        mockPlayer1Territory();
        mockAdjacents();
        int armiesTransferido = 4;

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            realocar.relocateTroops(player1, brasil, uruguai, armiesTransferido);
        });

        assertEquals(RelocationService.MSG_TERRITORY_NOT_CONQUERED, exception.getMessage());
    }


}

