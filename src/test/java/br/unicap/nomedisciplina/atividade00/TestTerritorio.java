package br.unicap.nomedisciplina.atividade00;

import org.junit.jupiter.api.Test;

import br.unicap.nomedisciplina.atividade00.player.Jogador;
import br.unicap.nomedisciplina.atividade00.territorio_controlado.Territorio;

import static org.junit.jupiter.api.Assertions.*;

public class TestTerritorio {

    
@Test
public void testGetNome(){
    Territorio territorio = new Territorio ("territorio 1");
    assertEquals("territorio 1", territorio.getNome());
}


@Test
public void testSetProprietario(){
    Territorio territorio = new Territorio ("Territorio 1");
    Jogador jogador = new Jogador ("Jogador 1");
    territorio.setProprietario(jogador);
    assertEquals(jogador, territorio.getProprietario());
}


}
