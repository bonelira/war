[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-718a45dd9cf7e7f842a935f5ebbe5719a5e09af4491e668f4dbf3b35d5cca122.svg)](https://classroom.github.com/online_ide?assignment_repo_id=11586913&assignment_repo_type=AssignmentRepo)
# Lista de Exercícios
<img src="assets/images/Unicap_Icam_Tech-01.png" alt="drawing" width="200"/>

## Identificação
**Professor**: Diego Pinheiro, PhD

**Disciplina**: Engenharia de Software 2

**Atividade**: Projeto War

## Descrição da Atividade
### TroopsServiceTest
Implementei a classe `TroopsServiceTest` para checar a distribuição de exercitos alocados corretamente e através dela criei os métodos da classe `TroopsService`.

A classe `TroopsService` possui dois método a seguir:
1. Método `deliverArmiesInInitialTurn` que faz o calculo correto da quantidade de exercitos a ser alocado na primeira rodada e retorna o resultado.
2. Método `deliverArmiesByAmountOfTerritory` que faz o calculo da quantidade de exercitos através do território do player e divide por 2.

### FortifyServiceTest
Implementei a classe `FortifyServiceTest` para verificar a alocação do exercito dentro do território do player e através dela criei os métodos da classe `FortifyService`.

A classe `TroopsService` possui um método a seguir:
1. Método `fortificationArmies` que realiza a função de alocar o exercito dentro do território do player.

### RelocationServiceTest
Implementei a classe `RelocationServiceTest` para verificar a alocação do exercito dentro do território do player e através dela criei os métodos da classe `RelocationService`.

A classe `RelocationService` possui um método a seguir:
1. Método `relocateTroops` que realiza a realocação do exercito do player no final do turno.

