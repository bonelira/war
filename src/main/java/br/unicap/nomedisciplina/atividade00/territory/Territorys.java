package br.unicap.nomedisciplina.atividade00.territory;

import br.unicap.nomedisciplina.atividade00.player.Jogador;

public interface Territorys {

    public String getNome();

    public Jogador getProprietario();

    public void setProprietario(Jogador proprietario);

    public int getExercitos();

    public void setExercitos(int exercitos);

    public void realizarConquista (Jogador jogador, int qtdExercitos);

    public void adicionarExercitos(int qtdExercitos);
    
}

