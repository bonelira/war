package br.unicap.nomedisciplina.atividade00.territorio_controlado;

import br.unicap.nomedisciplina.atividade00.player.Jogador;


public class Territorio {


    private String nome;
    private Jogador proprietario;


    public Territorio (String nome){
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }


    public Jogador getProprietario() {
        return proprietario;
    }



    public void setProprietario(Jogador proprietario) {
        this.proprietario = proprietario;
    }


       
}
