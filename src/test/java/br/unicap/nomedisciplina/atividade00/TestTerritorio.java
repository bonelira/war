package br.unicap.nomedisciplina.atividade00;


import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.unicap.nomedisciplina.atividade00.territory.Territorio;

public class TestTerritorio {

   
    private Territorio exercitos;
    

@BeforeEach
public void setUp (){
    exercitos = new Territorio("Territorio 1");
}

@Test
public void test01ConquistarTerritorio(){    

    Territorio exercitos = new Territorio("Territorio 1");
    exercitos.adicionarExercitos(3);
    assertEquals(3, exercitos.getExercitos());
}

@Test
public void Test02adicionarExercitoComQuantidadeEspecifica() {
    Territorio territorio = new Territorio("Territorio C");
    exercitos.adicionarExercitos(5);
    assertEquals(0, territorio.getExercitos());
}

@Test
public void Test03removerExercitoDeveDiminuirNumeroDeExercitos() {
        Territorio territorio = new Territorio("Territorio B");
        territorio.adicionarExercitos(0);
        territorio.removerExercito(0);
        assertEquals(0, territorio.getExercitos());
    }

}