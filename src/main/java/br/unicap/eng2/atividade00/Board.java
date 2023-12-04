package br.unicap.eng2.atividade00;


import java.util.ArrayList;
import java.util.List;

import br.unicap.eng2.atividade00.controller.Territory;


public class Board{

    private List<Territory> territories;

    public Board() {
        this.territories = new ArrayList<>();
    }

        public List<Territory> getTerritories() {
            return this.territories;
        }
    
        public List<Territory> getContinentCountriesList(String continentName) {
            List<Territory> allCountries = new ArrayList<>();
    
            for (Territory territory : territories) {
                String actualContinent = territory.getContinent();
                if (actualContinent.equals(continentName)) {
                    allCountries.add(territory);
                }
    
            }
            return allCountries;
        }
        
    }

    

