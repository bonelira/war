package br.unicap.eng2.debuggin_squad.war.inicialization;

import br.unicap.eng2.debuggin_squad.war.WarGame;

public class GameBuilder implements Builder {
    public GameBuilder() {
        this.game = new WarGame();
    }

    private WarGame game;
    // implementar métodos para configurar alguns aspectos do jogo
    // durante a inicialização (tabuleiro, jogadores, cartas, regras etc)
    // métodos para inicialização das Rules (Buildar ele)

    // métodos para inicialização do Board (Buildar ele)
    @Override
    public GameBuilder boardConfiguration() {
        // TODO Auto-generated method stub
        return this;
    }

    // métodos para inicialização do Player (Buildar ele)
    @Override
    public GameBuilder playerConfiguration() {
        // TODO Auto-generated method stub
        return this;

    }

    // métodos para inicialização do Deck / Cards (Buildar ele)
    @Override
    public GameBuilder dealCards() {
        // TODO Auto-generated method stub
        return this;
    }

    @Override
    public WarGame build() {
        // simplesmente envia a instância do jogo construída aqui.
        return this.game;
    }

}
