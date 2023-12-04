package br.unicap.eng2.atividade00.service;

import java.util.List;

import br.unicap.eng2.atividade00.card.Card;
import br.unicap.eng2.atividade00.controller.Player;
import br.unicap.eng2.atividade00.controller.Territory;


public class TroopsService {


    public TroopsService( ) {}

    public int entregarExércitosNoTurnoInicial(List<Player> players) {
        int totalTerritorios = 42;
        if (players.isEmpty()) {
            throw new IllegalArgumentException("O número de jogadores não pode ser zero.");
        }
        int exercitosRecebidos = totalTerritorios / players.size();
        return exercitosRecebidos;
    }

    public int entregarExércitosPorQuantidadeDeTerritório(Player player) {
        List<Territory> conqueredTerritories = player.getConqueredTerritories();
        if (conqueredTerritories.isEmpty()) {
            throw new IllegalArgumentException("O jogador não conquistou nenhum território.");
        }
        int totalTerritorios = conqueredTerritories.size();
        int exercitosRecebidos = totalTerritorios / 2;
        return exercitosRecebidos;
    }

    public int alocarRecebimentoDeCartaPorContinente(Player player){
        List<Territory> conqueredTerritories = player.getConqueredTerritories();
        if (conqueredTerritories.isEmpty()){
            throw new IllegalArgumentException("O jogador não conquistou nenhum território.");
        }
        
        int totalTerritorios = conqueredTerritories.size();
        int qtdCartas = Card.add(totalTerritorios);
        return qtdCartas;
    }

}