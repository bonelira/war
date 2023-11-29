package br.unicap.eng2.debuggin_squad.war.inicialization;

import br.unicap.eng2.debuggin_squad.war.WarGame;

public interface Builder {
    public GameBuilder boardConfiguration();

    public GameBuilder playerConfiguration();

    public GameBuilder dealCards();

    public WarGame build(); // Retorna a instância do jogo que vai serconstruído
}
