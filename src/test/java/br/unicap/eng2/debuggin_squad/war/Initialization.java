package br.unicap.eng2.debuggin_squad.war;

import java.util.ArrayList;
import java.util.List;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

public class Initialization {
    private Player player1;

    private Territory brasil;
    private Territory argentina;

    private List<Territory> conqueredTerritories;

    public Initialization() {
        initializeTerritory();
        initializePlayer();
    }

        public Player initializePlayer() {
        player1 = new Player("Bruno", "1");
        conqueredTerritories = new ArrayList<>();

        conqueredTerritories.add(brasil);
        conqueredTerritories.add(argentina);

        player1.setConqueredTerritories(conqueredTerritories);
        return player1;
    }

    public Territory initializeTerritory() {
        brasil = new Territory("Brasil", 5);
        brasil.setProprietario(player1);

        return brasil;
    }

    public Territory initializeTerritoryEmpty() {
        argentina = new Territory("Argentina", 0);
        argentina.setProprietario(player1);

        return argentina;
    }
    
}
