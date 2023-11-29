package br.unicap.eng2.debuggin_squad.war;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

import java.util.ArrayList;
import java.util.List;

public class Initialization {
    private Player player1;
    private Player player2;

    private Territory brasil;
    private Territory argentina;
    private Territory paraguai;
    private Territory emptyTerritory;

    private List<Territory> conqueredTerritories;

    public Initialization() {
        initializeTerritoryBrasil();
        initializeTerritoryArgentina();
        initializePlayer();
        initializeAdjacents();
    }

    public Player initializePlayer() {
        player1 = new Player("Bruno", "1");
        conqueredTerritories = new ArrayList<>();

        conqueredTerritories.add(brasil);
        conqueredTerritories.add(argentina);

        player1.setConqueredTerritories(conqueredTerritories);
        return player1;
    }

    public Territory initializeTerritoryBrasil() {
        brasil = new Territory("Brasil", 5);
        brasil.setProprietario(player1);

        return brasil;
    }

    public Territory initializeTerritoryArgentina() {
        argentina = new Territory("Argentina", 5);
        argentina.setProprietario(player1);

        return argentina;
    }

    public Territory initializeTerritoryParaguai() {
        paraguai = new Territory("Paraguai", 5);
        paraguai.setProprietario(player2);


        return paraguai;
    }

    public Territory initializeTerritoryEmpty() {
        emptyTerritory = new Territory("TerritorioVazio", 0);
        emptyTerritory.setProprietario(player1);

        return emptyTerritory;
    }

    public void initializeAdjacents() {
        brasil.addAdjacentTerritory(argentina);
    }
}
