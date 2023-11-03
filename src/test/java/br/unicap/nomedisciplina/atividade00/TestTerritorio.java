package br.unicap.nomedisciplina.atividade00;

import org.junit.jupiter.api.Test;

import br.unicap.nomedisciplina.atividade00.territorio_controlado.Territorio;

import static org.junit.jupiter.api.Assertions.*;

public class TestTerritorio {
    
    
@Test
public void testGetNome(){
    Territorio territorio = new Territorio ("territorio 1");
    assertEquals("territorio 1", territorio.getNome());
}



}
