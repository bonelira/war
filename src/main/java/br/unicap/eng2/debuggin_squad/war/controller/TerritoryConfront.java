package br.unicap.eng2.debuggin_squad.war.controller;

import java.util.ArrayList;
import java.util.Collections;

import br.unicap.eng2.debuggin_squad.war.controller.dice.Dice;
import br.unicap.eng2.debuggin_squad.war.controller.dice.DicesFactory;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;

public class TerritoryConfront {

    public static final int MAX_DICE = 3;
    public static final String MSG_ERROR_OCCUPATION_ARMY = "Occupation Army Cannot be Used!";
    public static final String MSG_ERROR_ADJACENT_TERRITORY = "Territories not Adjacent";

    private DicesFactory diceFactory;
    private ArrayList<Dice> diceSource;
    private ArrayList<Dice> diceTarget;
    private Territory territorySource;
    private Territory territoryTarget;
    private Integer armyLossSource;
    private Integer armyLossTarget;

    public TerritoryConfront(Territory territorySource, Territory territoryTarget) {
        this.diceSource = new ArrayList<>();
        this.diceTarget = new ArrayList<>();
        this.territorySource = territorySource;
        this.territoryTarget = territoryTarget;
    }

    public TerritoryConfront(DicesFactory diceFactory, Territory territorySource, Territory territoryDestination) {
        this.diceFactory = diceFactory;
        this.diceSource = new ArrayList<>();
        this.diceTarget = new ArrayList<>();
        this.territorySource = territorySource;
        this.territoryTarget = territoryDestination;
    }

    public TerritoryConfront() {
    }

    public Territory getTerritorySource() {
        return this.territorySource;
    }

    public Territory getTerritoryTarget() {
        return this.territoryTarget;
    }

    public int getArmyLossSource() {
        return this.armyLossSource;
    }

    public int getArmyLossTarget() {
        return this.armyLossTarget;
    }

    public void confront(int army) throws Exception {
        if (this.territorySource.getArmy() - army <= 0) {
            throw new Exception(MSG_ERROR_OCCUPATION_ARMY);
        }

        if (!this.territorySource.isAdjancent(this.territoryTarget)) {
            throw new Exception(MSG_ERROR_ADJACENT_TERRITORY);
        }
        createAndRollDice(army, this.diceSource);
        createAndRollDice(this.territoryTarget.getArmy(), this.diceTarget);
        sort();
        calculateLosses();
        refreshTerritories();
    }

    private void refreshTerritories() {
        territorySource.setArmy(territorySource.getArmy() - armyLossSource);
        armyLossSource = 0;
        territoryTarget.setArmy(territoryTarget.getArmy() - armyLossTarget);
        armyLossTarget = 0;
    }

    private void createAndRollDice(int army, ArrayList<Dice> dices) {
        int maxDices = Math.min(MAX_DICE, army);
        for (int i = 0; i < maxDices; i++) {
            // Dice dice = this.diceFactory.createDice(1, 1);
            // dice.roll();
            // dices.add(dice);
        }
    }

    private void sort() {
        Collections.sort(this.diceSource, Collections.reverseOrder());
        Collections.sort(this.diceTarget, Collections.reverseOrder());
    }

    private void calculateLosses() {
        int maxBattles = Math.min(this.diceSource.size(), this.diceTarget.size());
        this.armyLossSource = 0;
        this.armyLossTarget = 0;
        for (int i = 0; i < maxBattles; i++) {
            Dice diceSource = this.diceSource.get(i);
            Dice diceDestination = this.diceTarget.get(i);
            // int cmp = diceSource.compareTo(diceDestination);
            // if (cmp > 0) {
            //     this.armyLossTarget++;
            // } else {
            //     this.armyLossSource++;
            // }
        }
    }

    public void setTerritorySource(Territory territorySource2) {
    }

    public int getArmyLossDestination() {
        return this.armyLossTarget;
    }

}