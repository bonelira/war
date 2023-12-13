package br.unicap.eng2.debuggin_squad.war.objectives;

import java.util.LinkedList;
import java.util.Stack;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import br.unicap.eng2.debuggin_squad.war.GoalCard;
import br.unicap.eng2.debuggin_squad.war.controller.Armies;
import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.controller.Territory;
import br.unicap.eng2.debuggin_squad.war.card.CardObjective;
import br.unicap.eng2.debuggin_squad.war.enumWar.ID;
import br.unicap.eng2.debuggin_squad.war.objectives.IObjective;
import br.unicap.eng2.debuggin_squad.war.card.*;

/*ELIMINAÇÃO DE UM CONCORRENTE
Se durante o transcurso do jogo, um participante destruir por completo um outro,
não sendo este o seu objetivo (caso em que teria ganho o jogo), ele recebe as 
cartas do jogador que foi destruído e pode usá-las para troca, combinando ou não 
com as suas ao final da sua jogada. Se não o fizer, poderá guardar as caras e usá-las 
em outra oportunidade, desde que não guarde mais de 5 cartas. Por exemplo, supondo-se 
que o jogador A, que tem 1 carta, destrua o B que possuia 3, ele poderá por ocasião do 
fim da sua jogada combinar 4 cartas e conforme o resultado, trocá-las. No caso de não 
conseguir trocar como ele conquistou um território, receberá no final de sua jogada mais uma 
carta, e no início da sua próxima jogada poderá trocar as cartas.*/

public class TestGameGoalKillPlayer {
    Player player;
    GoalCard goalCard;
    private ID BLUE;
    int qtdPlayers = 3;
    int qtdTerritories = 42;
    int qtdTerritoriesForPlayer = qtdTerritories / qtdPlayers;
    Armies armiesAmount;

    @BeforeEach
    public void setup() throws Exception {
        this.goalCard = new GoalCard("Eliminate player");
        this.player = new Player("Cleiton", BLUE);
        this.armiesAmount= new Armies(1);
    }

    private GoalCard changeCard(GoalCard goalCard) {
        this.goalCard = new GoalCard();
        return goalCard;
    }

    @Test
    void testIfAPlayerKilledPlayerThatWasNotHisGoal() throws Exception {
        /*Player playerOfTheTurn = getPlayOfTheTurn();
        Player playerGoal = getPlayers().getLast();

        Territory sourceTerritory = playerOfTheTurn.getCardTerritory().get(0);
        sourceTerritory.ChangeCardQuantity(2);
        Territory goalTerritory = playerGoal.getCardTerritory().get(0);
        goalTerritory.ChangeCardQuantity(0);*/

}
}
