package br.unicap.nomedisciplina.atividade00;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import br.unicap.eng2.atividade00.controller.Armies;
import br.unicap.eng2.atividade00.controller.Player;
import br.unicap.eng2.atividade00.controller.Territory;


public class TestTerritorio {


    private Player player;

   

    @Test
    public void test01GetNome() {
        Territory territorio = new Territory("Brasil","Sul americano", player);
        assertEquals("Brasil", territorio.getNome());
    }

    @Test
    public void test02AddArmies() {
        Territory territorio = new Territory("Brasil", "Sul Americano", player);
        Armies armies = new Armies(5); 
        territorio.addArmies(armies);
        assertFalse(territorio.getAdjacentTerritories().contains(territorio));
    }

}