package br.unicap.nomedisciplina.atividade00.player;

import java.util.ArrayList;
import java.util.List;

import br.unicap.nomedisciplina.atividade00.territory.Territorio;

public class Jogador implements Players {
    

  
    private String nome;
    private List<Territorio> territorios;
    private int qtdExercitos;


    public Jogador (String nome){
        this.nome = nome;
         this.territorios = new ArrayList<>(6);
        this.qtdExercitos = 0;
    }


    public int getQtdExercitos() {
        return qtdExercitos;
    }



    public void setQtdExercitos(int qtdExercitos) {
        this.qtdExercitos = qtdExercitos;
    }


    
    public String getNome() {
        return nome;
    }


    public List<Territorio> getTerritorios() {
        return territorios;
    }


    public void adicionarTerritorio(Territorio territorio) {
        territorios.add(territorio);
    }


    public void removerTerritorio(Territorio territorio) {
        territorios.remove(territorio);
    }

    public boolean possuiTerritorio(String nomeTerritorio) {
        for (Territorio territorio : territorios) {
            if (territorio.getNome().equals(nomeTerritorio)) {
                return true;
            }
        }
        return false;
    }

    public void mostrarTerritorios() {
        System.out.println("Territórios de " + nome + ":");
        for (Territorio territorio : territorios) {
            System.out.println(territorio.getNome());
        }
    }
}