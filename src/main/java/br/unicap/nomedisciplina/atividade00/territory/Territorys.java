package br.unicap.nomedisciplina.atividade00.territory;

import br.unicap.nomedisciplina.atividade00.player.Player;

public interface Territorys {

    public String getNome();

    public Player getProprietario();

    public void setProprietario(Player proprietario);

    public int getExercitos();

    public void setExercitos(int exercitos);

    public void realizarConquista (Player jogador, int qtdExercitos);

    public void adicionarExercitos(int qtdExercitos);
    
}

