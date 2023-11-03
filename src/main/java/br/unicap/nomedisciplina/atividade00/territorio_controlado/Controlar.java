package br.unicap.nomedisciplina.atividade00.territorio_controlado;

import br.unicap.nomedisciplina.atividade00.player.Jogador;

public interface Controlar {

    public String getNome();

    public Jogador getProprietario();

    public void setProprietario(Jogador proprietario);
    
}
