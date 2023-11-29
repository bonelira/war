package br.unicap.eng2.debuggin_squad.war.relocation;

import br.unicap.eng2.debuggin_squad.war.Initialization;
import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;
import br.unicap.eng2.debuggin_squad.war.model.state.relocation.RelocationContext;
import br.unicap.eng2.debuggin_squad.war.model.state.relocation.RelocationNormalState;
import br.unicap.eng2.debuggin_squad.war.service.RelocationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RelocationServiceTest extends Initialization {
    private Player player1;
    private Player player2;

    private Territory territory;
    private Territory territory2;

    private RelocationService realocar;
    private RelocationContext relocationContext;

    @BeforeEach
    public void setup() {
        realocar = new RelocationService();
        relocationContext = new RelocationContext();
    }

    @Test
    public void testValidRelocation() {
        player1 = initializePlayer();
        initializeAdjacents();
        territory = initializeTerritoryBrasil();
        territory2 = initializeTerritoryArgentina();
        int armiesTransferido = 4;

        realocar.relocationTroops(player1, territory, territory2, armiesTransferido);

        assertEquals(1, territory.getArmiesCount() - armiesTransferido);
        assertEquals(9, territory2.getArmiesCount() + armiesTransferido);
    }

    @Test
    public void testValidateErrorTerritoryNotAdjacent() {
        player1 = initializePlayer();
        territory = initializeTerritoryBrasil();
        territory2 = initializeTerritoryEmpty();
        initializeAdjacents();
        int armiesTransferido = 4;

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            realocar.relocationTroops(player1, territory, territory2, armiesTransferido);
        });

        assertEquals(RelocationNormalState.MSG_TERRITORY_NOT_ADJACENT, exception.getMessage());
    }

    @Test
    public void testValidateErrorTerritoryNotConquered() {
        player1 = initializePlayer();
        player2 = initializePlayer2();
        territory = initializeTerritoryBrasil();
        territory2 = initializeTerritoryParaguai();
        initializeAdjacents();
        int armiesTransferido = 4;

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            realocar.relocationTroops(player2, territory, territory2, armiesTransferido);
        });

        assertEquals(RelocationNormalState.MSG_TERRITORY_NOT_CONQUERED, exception.getMessage());
    }
}
