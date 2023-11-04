package br.unicap.nomedisciplina.atividade00.board;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.unicap.nomedisciplina.atividade00.player.Jogador;
import br.unicap.nomedisciplina.atividade00.territory.Territorio;


public class Tabuleiro implements Boards{

    private List<Territorio> territorios;
    private List<Jogador> jogadores;


    public Tabuleiro (List<Territorio> territorios, List<Jogador> jogadores){
        this.territorios = territorios;
        this.jogadores = jogadores;
    }

   
    public void obterTerritorioDoJogador(){
        List<Territorio> territoriosEmbaralhados = new ArrayList<>(territorios);
        Collections.shuffle(territoriosEmbaralhados);

        
        int indiceJogador = 0;
        for(Territorio territorio : territoriosEmbaralhados){
            Jogador jogadorAtual = jogadores.get(indiceJogador);
            territorio.setProprietario(jogadorAtual);
            indiceJogador = (indiceJogador + 1) % jogadores.size();  
                
        }
        
    }

    
}
