package br.unicap.nomedisciplina.atividade00;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.unicap.eng2.atividade00.card.Card;
import br.unicap.eng2.atividade00.card.CardObjective;
import br.unicap.eng2.atividade00.card.CardPlayer;
import br.unicap.eng2.atividade00.card.CardTerritory;

public class TestCard {

    @Test
    public void test01CardTerritory() {
        Card card = new CardTerritory(); // inicializa uma carta de territorio
        Assertions.assertTrue(card instanceof Card); // verifica se a carta eh uma instancia de Card
        Assertions.assertTrue(card.getName() != null); // verifica se o nome da carta nao eh nulo
        Assertions.assertTrue(card.getShape() != null); // verifica se o formato da carta nao eh nulo
    }

    @Test
    public void test02CardObjective() {
        Card card = new CardObjective(); // inicializa uma carta de objetivo
        Assertions.assertTrue(card instanceof CardObjective); // verifica se a carta eh uma instancia de CardObjective
        Assertions.assertTrue(card.getObjective() != null); // verifica se o objetivo da carta nao eh nulo
    }

    @Test
    public void test03CardPlayer() {
        Card card = new CardPlayer(); // inicializa uma carta coringa
        Assertions.assertTrue(card instanceof CardPlayer); // verifica se a carta eh uma instancia de CardJoker
        Assertions.assertTrue(card.getShape() != null); // verifica se o formato da carta nao eh nulo
    }
    
}
