/**
 * @author Bruno Iraê <brunoirae@gmail.com / @brunoirae>
 */

package br.unicap.eng2.debuggin_squad.war.relocation;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;
import br.unicap.eng2.debuggin_squad.war.model.state.relocation.RelocationContext;
import br.unicap.eng2.debuggin_squad.war.model.state.relocation.RelocationNormalState;
import br.unicap.eng2.debuggin_squad.war.service.RelocationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class RelocationServiceTest {
    private Player player1;

    private List<Territory> conqueredTerritories;
    private Territory brasil;
    private Territory argentina;
    private Territory afeganistao;
    private Territory uruguai;

    private RelocationService realocar;
    private RelocationContext relocationContext;

    @BeforeEach
    public void setup() {
        realocar = new RelocationService();
        relocationContext = new RelocationContext();
        conqueredTerritories = new ArrayList<Territory>();
    }



    @Test
    public void testValidRelocation() {
        mockTerritoryAndArmy();
        mockPlayer1Territory();
        mockAdjacents();
        int armiesTransferido = 4;

        realocar.relocationTroops(player1, brasil, argentina, armiesTransferido);

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
            realocar.relocationTroops(player1, brasil, afeganistao, armiesTransferido);
        });

        assertEquals(RelocationNormalState.MSG_TERRITORY_NOT_ADJACENT, exception.getMessage());
    }

    @Test
    public void testValidateErrorTerritoryNotConquered(){
        mockTerritoryAndArmy();
        mockPlayer1Territory();
        mockAdjacents();
        int armiesTransferido = 4;

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            realocar.relocationTroops(player1, brasil, uruguai, armiesTransferido);
        });

        assertEquals(RelocationNormalState.MSG_TERRITORY_NOT_CONQUERED, exception.getMessage());
    }
}

