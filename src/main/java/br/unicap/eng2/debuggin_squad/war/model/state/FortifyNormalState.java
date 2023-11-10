package br.unicap.eng2.debuggin_squad.war.model.state;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

import java.util.List;

public class FortifyNormalState implements FortifyState {
    public static final String MSG_ERROR_FORTIFICATION = "Fortification failed.";
    public static final String MSG_TERRITORY_NOT_CONQUERED = "This territory does not belong to the player";

    @Override
    public void fortifyArmies(Player player, int armies, Territory origin) {
        if (validateFortification(player, armies, origin)) {
            origin.addArmies(armies);
        } else {
            throw new IllegalArgumentException(MSG_ERROR_FORTIFICATION);
        }
    }

    @Override
    public boolean validateFortification(Player player, int armies, Territory origin) {
        List<Territory> conqueredTerritories = player.getConqueredTerritories();
        if (!conqueredTerritories.contains(origin)) {
            throw new IllegalArgumentException(MSG_TERRITORY_NOT_CONQUERED);
        }
        return true;
    }
}