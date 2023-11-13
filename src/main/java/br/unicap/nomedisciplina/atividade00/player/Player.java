package br.unicap.nomedisciplina.atividade00.player;

import java.util.ArrayList;
import java.util.List;

import br.unicap.nomedisciplina.atividade00.territory.Territorio;

public class Player implements Players {
    

  
    private String nome;
    private List<Territorio> territorios;
    private int qtdExercitos;


    public Player (String nome){
        this.nome = nome;
         this.territorios = new ArrayList<>(5);
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

    public void adicionarExercitos(int quantidade) {
        if (quantidade > 0) {
            qtdExercitos += quantidade;
        } else {
            throw new IllegalArgumentException("A quantidade de exércitos deve ser maior que zero.");
        }
    }

    public void removerExercitos(int quantidade) {
        if (quantidade > 0 && quantidade <= qtdExercitos) {
            qtdExercitos -= quantidade;
        } else {
            throw new IllegalArgumentException("Quantidade inválida de exércitos para remover.");
        }
    }
}