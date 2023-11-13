package br.unicap.nomedisciplina.atividade00.territory;

import java.util.ArrayList;
import java.util.List;

import br.unicap.nomedisciplina.atividade00.player.Player;


public class Territorio implements Territorys{


    private String nome;
    private Player propritario;
    private int exercitos;
    private List<Territorio> territorios;

    

    
    public Territorio (String nome){
        this.nome = nome;
        this.territorios = new ArrayList<>();
    }


    
    public int getExercitos() {
        return exercitos;
    }


    public void setExercitos(int exercitos) {
        this.exercitos = exercitos;
    }


        public String getNome() {
        return nome;
    }


    public Player getProprietario() {
        return propritario;
    }



    public void setProprietario(Player proprietario) {
        this.propritario = proprietario;
    }


    public void realizarConquista (Player jogador, int qtdExercitos){
        this.propritario = jogador;
        this.exercitos = qtdExercitos;
    }

    public void adicionarExercitos(int qtdExercitos){
        this.exercitos += qtdExercitos;
    }

    public void removerExercito(int qtdExercitos){
        this.exercitos -= qtdExercitos;
    }

    public void removerExercitosDeTerritorio(String nomeTerritorio, int quantidade) {
        for (Territorio territorio : territorios) {
            if (territorio.getNome().equals(nomeTerritorio)) {
                for (int i = 0; i < quantidade; i++) {
                    territorio.removerExercito(i);
                }
                return;
            }
        }
        throw new IllegalArgumentException("Território não encontrado.");
    }

}