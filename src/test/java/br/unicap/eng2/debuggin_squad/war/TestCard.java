package br.unicap.eng2.debuggin_squad.war;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import br.unicap.eng2.debuggin_squad.war.card.Card;
import br.unicap.eng2.debuggin_squad.war.card.CardJoker;
import br.unicap.eng2.debuggin_squad.war.card.CardObjective;
import br.unicap.eng2.debuggin_squad.war.card.CardTerritory;

public class TestCard {
    @Test
    public void testCardTerritory() {
        Card card = new CardTerritory(); // inicializa uma carta de territorio
        Assertions.assertTrue(card instanceof Card); // verifica se a carta eh uma instancia de Card
        Assertions.assertTrue(card.getName() != null); // verifica se o nome da carta nao eh nulo
        Assertions.assertTrue(card.getShape() != null); // verifica se o formato da carta nao eh nulo
    }

    @Test
    public void testCardObjective() {
        Card card = new CardObjective(); // inicializa uma carta de objetivo
        Assertions.assertTrue(card instanceof CardObjective); // verifica se a carta eh uma instancia de CardObjective
        Assertions.assertTrue(card.getObjective() != null); // verifica se o objetivo da carta nao eh nulo
    }

    @Test
    public void testCardJoker() {
        Card card = new CardJoker(); // inicializa uma carta coringa
        Assertions.assertTrue(card instanceof CardJoker); // verifica se a carta eh uma instancia de CardJoker
        Assertions.assertTrue(card.getShape() != null); // verifica se o formato da carta nao eh nulo
    }
    
}
