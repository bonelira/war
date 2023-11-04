package br.unicap.nomedisciplina.atividade00;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.unicap.nomedisciplina.atividade00.player.Jogador;
import br.unicap.nomedisciplina.atividade00.territory.Territorio;

public class TestJogador {

    private Jogador jogador;




    @BeforeEach
    public void setUp(){
        jogador = new Jogador("nome");
    }

    
    @Test
    public void test01adicionarTerritorioDeveAdicionarNaLista() {
        Jogador jogador = new Jogador("Jogador 1");
        Territorio territorio = new Territorio("Territorio A");
        jogador.adicionarTerritorio(territorio);
        assertTrue(jogador.getTerritorios().contains(territorio));
    }

    @Test
    public void test02removerTerritorioDeveRemoverDaLista() {
        Jogador jogador = new Jogador("Jogador 2");
        Territorio territorio = new Territorio("Territorio B");
        jogador.adicionarTerritorio(territorio);
        jogador.removerTerritorio(territorio);
        assertFalse(jogador.getTerritorios().contains(territorio));
    }

    @Test
    public void test03adicionarExercitosDeveAumentarNumeroTotalDeExercitos() {
        Jogador jogador = new Jogador("Jogador 3");
        jogador.adicionarExercitos(5);
        assertEquals(5, jogador.getQtdExercitos());
    }

    @Test
    public void test04removerExercitosDeveDiminuirNumeroTotalDeExercitos() {
        Jogador jogador = new Jogador("Jogador 4");
        jogador.adicionarExercitos(10);
        jogador.removerExercitos(3);
        assertEquals(7, jogador.getQtdExercitos());
    }
       
}
