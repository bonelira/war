package br.unicap.nomedisciplina.atividade00;

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
    public void Test01adicionarTerritorioDeveAdicionarNaLista() {
        Jogador jogador = new Jogador("Jogador 1");
        Territorio territorio = new Territorio("Territorio A");
        jogador.adicionarTerritorio(territorio);
        assertTrue(jogador.getTerritorios().contains(territorio));
    }

    @Test
    public void removerTerritorioDeveRemoverDaLista() {
        Jogador jogador = new Jogador("Jogador 2");
        Territorio territorio = new Territorio("Territorio B");
        jogador.adicionarTerritorio(territorio);
        jogador.removerTerritorio(territorio);
        assertFalse(jogador.getTerritorios().contains(territorio));
    }

    
}
