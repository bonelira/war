package br.unicap.eng2.debuggin_squad.war.objectives;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestObjectiveCards {

    private ObjectiveCards objectiveCards;

    @BeforeEach
    public void setUp() {
        objectiveCards = new ObjectiveCards();
    }

    @Test
    public void testSetMessage() {
        String[] texts = {"Conquistar na totalidade a EUROPA, a OCEANIA e mais um terceiro",
                "Conquistar na totalidade a ASIA e a AMERICA DO SUL.",
                "Conquistar na totalidade a EUROPA, a AMERICA DO SUL e mais um terceiro."};
        for (String t : texts) {
            objectiveCards.addCards(t, null);
        }

        String actual = objectiveCards.returnMessage(0);
        String expected = "Conquistar na totalidade a EUROPA, a OCEANIA e mais um terceiro";
        assertEquals(expected, actual);
    }
}
