# Classes

1. ## Tabuleiro (Board)

**Representa o tabuleiro do jogo e contém informações sobre os territórios e suas conexões.**

* Atributos:

  * `territorios: Lista<Territorio>`: Mantém uma lista de todos os territórios no tabuleiro.

* Métodos:

  * `obterTerritorio(nome: String): Territorio`: Permite a recuperação de um território com base em seu nome.
  * `obterTerritoriosDoJogador(jogador: Jogador): Lista<Territorio>`: Retorna uma lista de territórios pertencentes a um jogador específico.

* Ligações com outras classes:

  * Está ligado à classe Territorio para manter uma lista de todos os territórios no tabuleiro.

1. ## Jogador (Player)

**Representa um jogador do jogo e armazena informações como cor do exército, cartas-objetivo e exércitos conquistados.**

* Atributos:

  * `nome: String`: Armazena o nome do jogador.
  * `corExercito: String`: Representa a cor dos exércitos do jogador.
  * `cartasObjetivo: Lista<CartaObjetivo>`: Mantém as cartas de objetivo que o jogador possui.
  * `exercitosConquistados: Lista<Territorio>`: Registra os territórios conquistados pelo jogador.
* Métodos:
  * `conquistarTerritorio(territorio: Territorio): void`: Registra a conquista de um território pelo jogador.
  * `realizarAtaque(origem: Territorio, destino: Territorio, exercitos: int): boolean`: Permite que o jogador realize um ataque a partir de um território de origem para um território de destino.
  * `realizarDeslocamento(origem: Territorio, destino: Territorio, exercitos: int): boolean`: Permite que o jogador mova exércitos entre territórios.
* Ligações com outras classes:
  * Possui uma associação com a classe Territorio para registrar os territórios conquistados pelo jogador.
  * Mantém uma lista de CartaObjetivo para representar as cartas de objetivo do jogador.

1. ## Território (Territory)

**Cada território é uma instância dessa classe, que armazena informações como proprietário, número de exércitos, cartas de território associadas e sua posição no tabuleiro.**

* Atributos:

  * `nome: String`: Armazena o nome do território.
  * `proprietario: Jogador`: Indica o jogador que possui o território.
  * `exercitos: int`: Registra a quantidade de exércitos no território.
  * `cartasTerritorio: Lista<CartaTerritorio>`: Mantém as cartas de território que podem estar associadas ao território.
* Métodos:
  * `realizarConquista(jogador: Jogador, exercitos: int): void`: Registra a conquista do território por um jogador e atualiza o   número de exércitos.
* Ligações com outras classes:
  * Está associado à classe Jogador como proprietário do território.
  * Mantém uma lista de CartaTerritorio para representar possíveis cartas associadas ao território.

4. ## Exército (Army)

**Representa um conjunto de peças de cores diferentes para identificar os jogadores e realizar algumas ações como ataques, conquista de território, etc.**

* Atributos:
  * `tipo: String`: Representa o tipo de exército.
  * `quantidade: int`: Registra a quantidade de exércitos desse tipo.
* Métodos:
  * Nenhum método específico associado a esta classe.
* Ligações com outras classes:
  * Pode ser usado pela classe Territorio para representar os exércitos presentes em um território.

5. ## CartaObjetivo (GoalCard)

**Cada carta-objetivo é uma instância dessa classe, que contém informações sobre o objetivo secreto do jogador.**

* Atributos:

  * `descricao: String`: Descreve o objetivo da carta.
  * `condicoes: String`: Especifica as condições para alcançar o objetivo da carta.
* Métodos:
  * Nenhum método específico associado a esta classe.
* Ligações com outras classes:
  * Pode ser associado à classe Jogador como parte de suas cartas de objetivo.

6. ## CartaTerritório (TerritoryCard)

**Cada carta de território é uma instância dessa classe, que guarda informações sobre o território e sua figura.**

* Atributos:

  * `territorio: Territorio`: Representa o território associado à carta.
  * `icone: String`: Indica o ícone ou imagem que representa o território na carta.
* Métodos:
  * `obterTerritorio(): Territorio`: Retorna o território associado à carta.
* Ligações com outras classes:
  * Está associado à classe Territorio para representar o território na carta.

7. ## DadosVermelhos (RedDice)

**Representa os dados vermelhos usados para ataques.**

* Atributos:

  * `territorio: Territorio`: Representa o território associado à carta.
  * `icone: String`: Indica o ícone ou imagem que representa o território na carta.
* Métodos:
  * `obterTerritorio(): Territorio`: Retorna o território associado à carta.
* Ligações com outras classes:
  * Está associado à classe Territorio para representar o território na carta.

8. ## DadosAmarelos (YellowDice)

**Representa os dados amarelos usados para defesa.**

* Atributos:

  * `lados: int`: Armazena o número de lados do dado, que geralmente é 6.
* Métodos:
  * `rolarDado(): int`: Simula o lançamento do dado e retorna um valor aleatório entre 1 e o número de lados.
* Ligações com outras classes:
  * Usado em combinação com a classe Batalha para resolver confrontos de dados nas batalhas.

9. ## Distribuidor (Dealer)

**Responsável por distribuir as cartas de territórios no início do jogo.**

* Atributos:

  * `baralhoTerritorios: Lista<CartaTerritorio>`: Representa o baralho de cartas de território disponíveis no jogo.
  * `baralhoObjetivos: Lista<CartaObjetivo>`: Representa o baralho de cartas de objetivo disponíveis no jogo.
  * `baralhoTerritoriosDescartados: Lista<CartaTerritorio>`: Mantém as cartas de território descartadas pelos jogadores.
  * `baralhoObjetivosDescartados: Lista<CartaObjetivo>`: Mantém as cartas de objetivo descartadas pelos jogadores.
* Métodos:
  * `embaralharCartasTerritorios(): void`: Embaralha o baralho de cartas de território.
  * `embaralharCartasObjetivos(): void`: Embaralha o baralho de cartas de objetivo.
  * `distribuirCartasTerritorios(jogadores: Lista<Jogador>): void`: Distribui cartas de território para os jogadores.
  * `distribuirCartasObjetivos(jogadores: Lista<Jogador>): void`: Distribui cartas de objetivo para os jogadores.
  * `descartarCartaTerritorio(carta: CartaTerritorio): void`: Permite aos jogadores descartar cartas de território.
  * `descartarCartaObjetivo(carta: CartaObjetivo): void`: Permite aos jogadores descartar cartas de objetivo.
* Ligações com outras classes:
  * Está ligado às classes Jogador para distribuir cartas de território e objetivo.
  * Mantém os baralhos de cartas de território e objetivo, bem como as cartas descartadas.

10. ## ControleDeTurno (TurnManager)

**Gerencia a ordem dos turnos e acompanha de quem é a vez de jogar.**

* Atributos:

  * `jogadores: Lista<Jogador>`: Mantém uma lista de jogadores no jogo.
  * `jogadorAtual: Jogador`: Representa o jogador atual em seu turno.
  * `faseAtual: FaseDeJogo`: Indica a fase atual do jogo (ex: Fase de Ataque, Fase de Deslocamento).
  * `numeroRodada: int`: Registra o número da rodada atual.
* Métodos:
  * `avançarParaProximaFase(): void`: Move o jogo para a próxima fase, como de Ataque para Deslocamento.
  * `avançarParaProximoJogador(): void`: Passa o controle para o próximo jogador.
  * `verificarVitoria(): Jogador?`: Verifica se um jogador alcançou o objetivo e venceu o jogo.
* Ligações com outras classes:
  * Está associado à classe Jogador para controlar a ordem dos turnos e a fase atual do jogo.
  * Utiliza FaseDeJogo para gerenciar as diferentes fases do jogo.

11. ## RegrasDoJogo (GameRules)

**Contém as regras do jogo e verifica se os movimentos dos jogadores são válidos.**

* Atributos:

  * `objetivo: String`: Descreve o objetivo do jogo War, que os jogadores devem alcançar para vencer.
  * `condicoesVitoria: String`: Especifica as condições necessárias para um jogador vencer o jogo.
* Métodos:
  * `verificarVitoria(jogador: Jogador): boolean`: Verifica se um jogador atingiu o objetivo e venceu o jogo.
  * `verificarFimDeJogo(jogadores: Lista<Jogador>): boolean`: Verifica se o jogo chegou ao seu fim, com um vencedor ou empate.
* Ligações com outras classes:
  * Utiliza a classe Jogador para verificar o estado de vitória e o fim do jogo.

12. ## Ataque (Attack)

**Representa um ataque, contendo informações sobre o atacante, o defensor e o resultado da batalha.**

* Atributos:

  * `jogadorAtacante: Jogador`: Representa o jogador que está realizando o ataque.
  * `origem: Territorio`: Indica o território de origem do ataque.
  * `destino: Territorio`: Indica o território de destino do ataque.
  * `exercitosAtacantes: int`: Registra a quantidade de exércitos utilizados no ataque.
* Métodos:
  * `realizarAtaque(): boolean`: Realiza o ataque, envolvendo os jogadores, territórios e a classe Batalha.
* Ligações com outras classes:
  * Está associado às classes Jogador, Territorio e Batalha para realizar a mecânica de ataque no jogo.

1.  ## Batalha (Battle)

**Classe que gerencia a lógica das batalhas, incluindo a comparação dos dados lançados.**

* Atributos:
  * `dadoVermelho: DadosVermelhos`: Representa o dado vermelho usado pelo atacante.
  * `dadoAmarelo: DadosAmarelos`: Representa o dado amarelo usado pelo defensor.
* Métodos:
  * `resolverConfronto(): boolean`: Simula o confronto de dados entre o atacante e o defensor e determina o resultado da batalha.
* Ligações com outras classes:
  * Utiliza as classes DadosVermelhos e DadosAmarelos para resolver as batalhas de dados nas mecânicas de ataque.

14. ## TrocaDeCartas (CardExchange)

**Controla as trocas de cartas por exércitos extras.**

* Atributos:

  * `jogador: Jogador`: Representa o jogador que está trocando cartas.
  * `cartasTroca: Lista<CartaTerritorio>`: Mantém as cartas de território que o jogador deseja trocar.
  * `exercitosRecebidos: int`: Registra a quantidade de exércitos recebidos em troca das cartas.
* Métodos:
  * `realizarTroca(): void`: Permite ao jogador trocar cartas por exércitos extras de acordo com as regras do jogo.
* Ligações com outras classes:
  * Está associado à classe Jogador para realizar a mecânica de troca de cartas e receber exércitos extras.

15. ## EliminacaoDeJogador (PlayerElimination)

**Lida com a eliminação de um jogador e a redistribuição das cartas.**

* Atributos:
  * `jogadoresEliminados: Lista<Jogador>`: Mantém uma lista de jogadores que foram eliminados do jogo.
* Métodos:
  * `verificarEliminacao(jogador: Jogador): boolean`: Verifica se um jogador foi eliminado do jogo e o move para a lista de jogadores eliminados.
* Ligações com outras classes:
  * Utiliza a classe Jogador para verificar a eliminação de jogadores e mantém uma lista dos jogadores eliminados.

1.  ## FaseDeConquista (ConquestPhase)

**Classe para gerenciar a fase de conquista de territórios após uma batalha.**

* Atributos:
  * `nome: String`: Define o nome da fase, que é "Fase de Conquista".
  * `descricao: String`: Fornece uma descrição da fase, explicando sua finalidade e regras.
* Métodos:
  * `realizarConquistas(): void`: Implementa a lógica da fase de conquista, permitindo que os jogadores conquistem territórios.
* Ligações com outras classes:
  * Está associado às classes Jogador, Territorio, Exercito, Distribuidor e Mapa para executar a mecânica da fase de conquista.

17. ## FaseDeDeslocamento (MovementPhase)

**Responsável por controlar a fase de deslocamento de exércitos após os ataques.**

* Atributos:

  * `nome: String`: Define o nome da fase, que é "Fase de Deslocamento".
  * `descricao: String`: Fornece uma descrição da fase, explicando sua finalidade e regras.
* Métodos:
  * `realizarDeslocamentos(): void`: Implementa a lógica da fase de deslocamento, permitindo que os jogadores movam seus exércitos entre territórios.
* Ligações com outras classes:
  * Está associado às classes Jogador, Territorio, Exercito e Mapa para executar a mecânica da fase de deslocamento.

1.  ## FaseDeFinalDeJogo (EndGamePhase)

**Gerencia a fase final do jogo, incluindo a verificação de objetivos alcançados.**

* Atributos:

  * `nome: String`: Define o nome da fase, que é "Fase de Final de Jogo".
  * `descricao: String`: Fornece uma descrição da fase, explicando como determinar o vencedor e encerrar o jogo.
* Métodos:
  * `verificarVencedor(): Jogador?`: Determina o jogador vencedor com base nas regras do jogo e condições de vitória.
  * `encerrarJogo(): void`: Finaliza o jogo, anunciando o vencedor e encerrando a sessão de jogo.
* Ligações com outras classes:
  * Está associado à classe RegrasDoJogo, Jogador e GerenciadorDeSessoes para determinar o vencedor e encerrar o jogo.

19. ## GeradorDeMapa (MapGenerator)

**Se desejar criar mapas aleatórios, esta classe pode ser usada para gerar tabuleiros diferentes.**

* Atributos:

  * `mapa: Mapa`: Representa o mapa do jogo War, que consiste em territórios e suas conexões.
  * `distribuidor: Distribuidor`: Gerencia a distribuição de exércitos e cartas no início do jogo.
* Métodos:
  * `criarMapa(): Mapa`: Gera o mapa do jogo com territórios e suas conexões de acordo com as regras do jogo War.
  * `configurarDistribuicaoInicial(): void`: Configura a distribuição inicial de exércitos e cartas para os jogadores.
* Ligações com outras classes:
  * Está associado à classe Mapa, Distribuidor e Territorio para criar o mapa do jogo e configurar a distribuição inicial.

20. ## GerenciadorDeSessões (SessionManager)

**Responsável por criar e gerenciar sessões de jogo, incluindo a adição e remoção de jogadores.**

* Atributos:

  * `sessoesAtivas: Lista<SessaoJogo>`: Mantém uma lista de sessões de jogo em andamento.
  * `sessaoAtual: SessaoJogo?`: Representa a sessão de jogo atual em execução.
* Métodos:
  * `iniciarSessao(jogadores: Lista<Jogador>): void`: Cria uma nova sessão de jogo com os jogadores fornecidos e a configuração atual.
  * `encerrarSessao(): void`: Encerra a sessão de jogo atual e a remove da lista de sessões ativas.
* Ligações com outras classes:
  * Está associado à classe SessaoJogo para gerenciar sessões de jogo, bem como à classe Jogador para criar sessões com jogadores específicos.

1.  ## GerenciadorDeRegras (RuleManager)

**Uma classe que permite personalizar as regras do jogo, como o número mínimo/máximo de jogadores, configurações específicas, etc.**

* Atributos:
  * `regras: RegrasDoJogo`: Armazena as regras do jogo War, que incluem o objetivo, condições de vitória e outras regras específicas do jogo.
* Métodos:
  * `obterRegras(): RegrasDoJogo`: Retorna as regras do jogo atual.
  * `alterarRegras(novasRegras: RegrasDoJogo): void`: Permite a modificação das regras do jogo, se aplicável.
* Ligações com outras classes:
  * Está associado à classe RegrasDoJogo para gerenciar e fornecer as regras do jogo War.

22. ## ConfiguradorDeJogo (GameConfigurator)

**Uma classe que permite aos jogadores configurar as regras do jogo antes de começar.**

* Atributos:

  * `regras: RegrasDoJogo`: Define as regras do jogo War, incluindo o objetivo e as condições de vitória.
  * `mapa: Mapa`: Representa o mapa do jogo, que consiste em territórios e suas conexões.
  * `distribuidor: Distribuidor`: Gerencia a distribuição inicial de exércitos e cartas no jogo.
  * `sessoesAtivas: Lista<SessaoJogo>`: Mantém uma lista de sessões de jogo em andamento.
* Métodos:
  * `configurarJogo(): void`: Configura todas as características do jogo, incluindo regras, mapa, distribuição inicial e sessões de   jogo.
  * `iniciarJogo(): void`: Inicia o jogo com as configurações definidas e cria uma nova sessão de jogo.
* Ligações com outras classes:
  * Está associado às classes RegrasDoJogo, Mapa, Distribuidor, SessaoJogo e outras classes relacionadas à configuração e início do jogo War.

23. ## GoalConquerContinent

**Representa um objetivo específico de conquistar continentes.**

* Atributos:
  * `continenteAlvo: Continente`: Representa o continente que o jogador deve conquistar para alcançar o objetivo.
  * `pontosRecompensa: int`: Indica a quantidade de pontos que o jogador ganhará ao completar este objetivo.
* Métodos:
  * `verificarObjetivoAlcancado(jogador: Jogador): boolean`: Verifica se o jogador alcançou o objetivo de conquistar o continente. Isso envolve verificar se ele possui todos os territórios desse continente.
* Ligações com outras classes:
  * Está associado à classe CartaObjetivo como uma subclasse específica de objetivo.
  * Liga-se à classe Continente para identificar o continente-alvo do objetivo.

1.  ## GoalConquer24Territory

**Representa um objetivo específico de conquistar 24 territórios.**

* Atributos:
  * `descricao: String`: Fornece uma descrição geral do objetivo para o jogador entender o que deve alcançar.
  * `pontosRecompensa: int`: Indica a quantidade de pontos que o jogador ganhará ao completar este objetivo.
* Métodos:
  * `verificarObjetivoAlcancado(jogador: Jogador): boolean`: Verifica se o jogador alcançou o objetivo com base nas condições específicas definidas para esse objetivo.
* Ligações com outras classes:
  * Está associado à classe CartaObjetivo como uma subclasse genérica de objetivo.

1.  ## GoalEliminatePlayer

**Representa um objetivo específico de eliminar um jogador.**

* Atributos:

  * `jogadorAlvo: Jogador`: Representa o jogador que o jogador atual deve eliminar para cumprir o objetivo.
  * `pontosRecompensa: int`: Indica a quantidade de pontos que o jogador ganhará ao eliminar o jogador-alvo.
* Métodos:
  * `verificarObjetivoAlcancado(jogador: Jogador): boolean`: Verifica se o jogador alcançou o objetivo de eliminar o jogador-alvo, ou seja, se o jogador-alvo foi eliminado.
* Ligações com outras classes:
  * Está associado à classe CartaObjetivo como uma subclasse específica de objetivo.
  * Liga-se à classe Jogador para identificar o jogador-alvo.

1.  ## Deck

**Representa um conjunto de cartas.**

* Atributos:

  * `cartas: Lista<Card>`: Mantém a lista de cartas contidas no deck.
  * `cartasDescartadas: Lista<Card>`: Armazena as cartas descartadas durante o jogo, se aplicável.
* Métodos:
  * `embaralhar(): void`: Embaralha as cartas no deck, se necessário.
  * `distribuirCarta(jogador: Jogador): Card`: Distribui uma carta para um jogador específico, se aplicável.
  * `descartarCarta(carta: Card): void`: Descarta uma carta do jogo, se necessário.
* Ligações com outras classes:
  * Liga-se a classes específicas de cartas, como CartaObjetivo e CartaTerritório, para gerenciar esses decks de cartas.
  * Pode estar associado ao GameWar para realizar operações de distribuição e descarte de cartas.

1.  ## Continente

**Representa um continente no jogo.**

* Atributos:

  * `nome: String`: Representa o nome do continente.
  * `territorios: Lista<Território>`: Mantém uma lista de territórios que compõem o continente.
  * `exercitosBonus: int`: Indica a quantidade de exércitos de bônus que um jogador recebe ao conquistar todo o continente.
* Métodos:
  * `verificarConquistaCompleta(jogador: Jogador): boolean`: Verifica se o jogador conquistou todos os territórios do continente, cumprindo assim as condições de conquista.
* Ligações com outras classes:
  * Está associado à classe Território, pois contém uma lista de territórios que compõem o continente.
  * Pode estar associado à classe GameWar para aplicar as regras de conquista de continentes.

1.  ## Card

**Representa uma carta genérica no jogo.**

* Atributos:

  * `nome: String`: Representa o nome da carta.
  * `tipo: TipoCarta`: Indica o tipo da carta (por exemplo, CartaObjetivo, CartaTerritório).
  * `descricao: String`: Fornece uma descrição da carta, que pode incluir informações relevantes ao jogo.
* Métodos:
  * Os métodos específicos variam com base no tipo de carta, como verificarObjetivoAlcancado() para CartaObjetivo ou métodos relacionados a territórios para CartaTerritório.
* Ligações com outras classes:
  * Está associado a classes específicas de cartas, como CartaObjetivo e CartaTerritório.
  * Pode estar associado ao Deck para gerenciar as cartas no jogo.

1.  ## GameWar

**O jogo em si, que usa todas as outras classes.**

* Atributos:

  * `tabuleiro: Tabuleiro`: Representa o tabuleiro do jogo War.
  * `jogadores: Lista<Jogador>`: Mantém uma lista de todos os jogadores no jogo.
  * `regras: RegrasDoJogo`: Armazena as regras do jogo War.
  * `deckObjetivos: Deck`: Representa o deck de cartas de objetivo.
  * `deckTerritorios: Deck`: Representa o deck de cartas de território.
  * `faseAtual: FaseDeJogo`: Indica a fase atual do jogo (por exemplo, fase de conquista, fase de deslocamento).
  * `jogadorDaVez: Jogador`: Representa o jogador atual cujo turno está em andamento.
* Métodos:
  * `iniciarJogo(): void`: Inicia o jogo e configura as condições iniciais, incluindo a distribuição de territórios e exércitos.
  * `avançarParaProximaFase(): void`: Move o jogo para a próxima fase, de acordo com as regras.
  * `realizarAçãoDeAtaque(jogador: Jogador, origem: Território, destino: Território, numExercitos: int): void`: Permite que um  jogador realize uma ação de ataque, conforme as regras do jogo War.
* Ligações com outras classes:
  * Está associado a todas as classes mencionadas anteriormente, uma vez que coordena e gerencia todas as interações no jogo.
