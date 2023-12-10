/**
 * @author Leonardo Cavalcanti <leonardocaturyty@gmail.com>
 */

package br.unicap.eng2.debuggin_squad.war.objectives;

import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContinentsObjectiveTest {
    private final String NAME_ASIA_AND_SOUTH_AMERICA = "Conquistar Asia e America do Sul";
    private final String DESCRIPTION_ASIA_AND_SOUTHAMERICA = "Conquiste totalmente o continente da Asia e America do Sul";

    private final String NAME_EUROPE_AND_OCEANIA = "Conquistar Europa e Oceania";
    private final String DESCRIPTION_EUROPE_AND_OCEANIA = "Conquiste totalmente o continente da Europe e Oceania";

    private final String NAME_NORTH_AMERICA_AND_AFRICA = "Conquistar América do Norte e Africa";
    private final String DESCRIPTION_NORTH_AMERICA_AND_AFRICA = "Conquiste totalmente o continente da America do Norte e Africa";

    private ConqueringAsiaAndSouthAmerica asiaAndSouthAmerica;
    private ConqueringEuropeAndOceania europeAndOceania;
    private ConqueringNorthAmericaAndAfrica northAmericaAndAfrica;

    private Territory territory;
    private List<Territory> countries = new ArrayList<>();
    private Player player;

    private String[] countriesAsiaAndSouthAmerica = {"Oriente Medio", "Aral", "Omsk", "Dudinka", "Siberia", "Tchita",
            "Mongolia", "Vladivostok", "California", "Nova Iorque", "Labrador", "Ottawa", "Vancouver",
            "China", "India", "Japao", "Vietna", "Brasil", "Argentina", "Uruguai", "Colombia",
            "Venezuela", "Peru", "Bolivia", "Chile", "Mexico", "California",};
    private String[] asia = {"Oriente Medio", "Aral", "Omsk", "Dudinka", "Siberia", "Tchita",
            "Mongolia", "Vladivostok", "China", "India", "Japao", "Vietna" };
    private String[] southAmerica = {"Brasil", "Argentina", "Uruguai", "Colombia", "Venezuela",
            "Peru", "Bolivia", "Chile" };

    private String[] countriesEuropeAndOceania = {"Brasil", "Argentina", "Uruguai", "Colombia",
            "Islandia", "Inglaterra", "Suecia", "Alemanha", "Espanha", "Portugal", "Franca",
            "Italia", "Polonia", "Iugoslavia", "Moscou", "Oriente Medio", "Aral", "Omsk",
            "Borneu", "Sumatra", "Nova Guine", "Australia"};

    private String[] countriesNorthAmericaAndAfrica = {"Mexico", "California", "Nova Iorque",
            "Labrador", "Ottawa", "Vancouver", "Mackenzie", "Alasca", "Groenlandia",
            "Borneu", "Sumatra", "Nova Guine", "Australia", "Argeleia", "Nigeria", "Egito",
            "Congo", "Sudao", "Madagascar", "Africa do Sul"};

    @BeforeEach
    public void setUp() {
        asiaAndSouthAmerica = new ConqueringAsiaAndSouthAmerica
                (NAME_ASIA_AND_SOUTH_AMERICA, DESCRIPTION_ASIA_AND_SOUTHAMERICA, 0);
        europeAndOceania = new ConqueringEuropeAndOceania
                (NAME_EUROPE_AND_OCEANIA, DESCRIPTION_EUROPE_AND_OCEANIA, 1);
        northAmericaAndAfrica = new ConqueringNorthAmericaAndAfrica
                (NAME_NORTH_AMERICA_AND_AFRICA, DESCRIPTION_NORTH_AMERICA_AND_AFRICA, 2);
        player = new Player("player 1", "0");
    }

    private void setCountries(String[] countrie) {
        Arrays.stream(countrie)
                .forEach(country -> {
                    territory = new Territory(country, 1);
                    territory.setProprietario(player);
                    countries.add(territory);
                });
    }


    // Asia and South America //
    @Test
    public void testDominatingTheAsianContinent() {
        setCountries(asia);
        player.setConqueredTerritories(countries);
        boolean objective = asiaAndSouthAmerica.objectiveAchieved(player);
        assertFalse(objective);
    }

    @Test
    public void testDominatingTheContinentOfSouthAmerica() {
        setCountries(southAmerica);
        player.setConqueredTerritories(countries);
        boolean objective = asiaAndSouthAmerica.objectiveAchieved(player);
        assertFalse(objective);
    }


    @Test
    public void testDominatingSomeTerritoriesOnTheContinentsOfAsiaAndSouthAmerica() {
        Arrays.stream(countriesAsiaAndSouthAmerica)
                .limit(13)
                .forEach(country -> {
                    territory = new Territory(country, 1);
                    territory.setProprietario(player);
                    countries.add(territory);
                });
        player.setConqueredTerritories(countries);
        boolean objective = asiaAndSouthAmerica.objectiveAchieved(player);
        assertFalse(objective);
    }

    @Test
    public void testDominatingTheContinentsOfAsiaAndSouthAmerica() {
        setCountries(countriesAsiaAndSouthAmerica);
        player.setConqueredTerritories(countries);
        boolean objective = asiaAndSouthAmerica.objectiveAchieved(player);
        assertTrue(objective);
    }

    // Europe And Oceania //
    @Test
    public void testDominatingTheContinentsOfEuropeAndOceania() {
        setCountries(countriesEuropeAndOceania);
        player.setConqueredTerritories(countries);
        boolean objective = europeAndOceania.objectiveAchieved(player);
        assertTrue(objective);
    }

    // Nort America And Africa //
    @Test
    public void testDominatingTheContinentsOfNorthAmericaAndAfrica() {
        setCountries(countriesNorthAmericaAndAfrica);
        player.setConqueredTerritories(countries);
        boolean objective = northAmericaAndAfrica.objectiveAchieved(player);
        assertTrue(objective);
    }
}
