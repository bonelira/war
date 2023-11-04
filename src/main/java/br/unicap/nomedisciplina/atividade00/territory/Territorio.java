package br.unicap.nomedisciplina.atividade00.territory;

import java.util.List;

import br.unicap.nomedisciplina.atividade00.player.Jogador;


public class Territorio implements Territorys{


    private String nome;
    private Jogador propritario;
    private int exercitos;
    private List<CartaTerritorio> cartaTerritorio;

    
    public Territorio (String nome){
        this.nome = nome;
    }


    public List<CartaTerritorio> getCartaTerritorio() {
        return cartaTerritorio;
    }


    public void setCartaTerritorio(List<CartaTerritorio> cartaTerritorio) {
        this.cartaTerritorio = cartaTerritorio;
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


    public Jogador getProprietario() {
        return propritario;
    }



    public void setProprietario(Jogador proprietario) {
        this.propritario = proprietario;
    }


    public void realizarConquista (Jogador jogador, int qtdExercitos){
        this.propritario = jogador;
        this.exercitos = qtdExercitos;
    }

    public void adicionarExercitos(int qtdExercitos){
        this.exercitos += qtdExercitos;
    }

    
          
}
