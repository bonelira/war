package br.unicap.eng2.debuggin_squad.war.objectives;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Conquering24TerritoriesTest {

    private final String NAME = "Conquistar 24 territorio";
    private final String DESCRIPTION = "Conquiste 24 territorio da sua escolha";
    
    private Conquering24Territories conquering24Territories;
    private Player player;
    private Territory territory;
    private List<Territory> countries = new ArrayList<>();
    private String[] countriesArray = {"Mexico", "California", "Nova Iorque", "Labrador", "Ottawa", "Vancouver",
            "Mackenzie", "Alasca", "Groenlandia", "Oriente Medio", "Aral", "Omsk", "Dudinka", "Siberia",
            "Tchita", "Mongolia", "Vladivostok", "China", "India", "Japao", "Vietna", "Sumatra",
            "Nova Guine", "Australia" };
    
    @BeforeEach
    public void setUp() {
        conquering24Territories = new Conquering24Territories(NAME, DESCRIPTION, 0);
        player = new Player("player 1", "0");

    }

    @Test
    public void testPlayerWithoutTerritory() {
        boolean objective = conquering24Territories.objectiveAchieved(player);
        assertFalse(objective);
    }

    @Test
    public void testPlayerWithLessThan24Territories() {
        Arrays.stream(countriesArray)
                .limit(13)
                .forEach(country -> {
                    territory = new Territory(country, 1);
                    territory.setProprietario(player);
                    countries.add(territory);
                });

        player.setConqueredTerritories(countries);
        boolean objective = conquering24Territories.objectiveAchieved(player);
        assertFalse(objective);
    }
}
