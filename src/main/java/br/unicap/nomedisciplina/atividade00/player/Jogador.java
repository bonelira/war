package br.unicap.nomedisciplina.atividade00.player;

public class Jogador implements Players {
    

  
    private String nome;


    public Jogador (String nome){
        this.nome = nome;
    }


    
    public String getNome() {
        return nome;
    }
}