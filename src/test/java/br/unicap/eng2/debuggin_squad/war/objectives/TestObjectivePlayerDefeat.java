package br.unicap.eng2.debuggin_squad.war.objectives;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import br.unicap.eng2.debuggin_squad.war.GoalCard;
import br.unicap.eng2.debuggin_squad.war.controller.Armies;
import br.unicap.eng2.debuggin_squad.war.controller.Player;
import br.unicap.eng2.debuggin_squad.war.enumWar.ID;

/*ELIMINAÇÃO DE UM CONCORRENTE
Se durante o transcurso do jogo, um participante destruir por completo um outro,
não sendo este o seu objetivo (caso em que teria ganho o jogo), ele recebe as 
cartas do jogador que foi destruído e pode usá-las para troca, combinando ou não 
com as suas ao final da sua jogada. Se não o fizer, poderá guardar as caras e usá-las 
em outra oportunidade, desde que não guarde mais de 5 cartas. Por exemplo, supondo-se 
que o jogador A, que tem 1 carta, destrua o B que possuia 3, ele poderá por ocasião do 
fim da sua jogada combinar 4 cartas e conforme o resultado, trocá-las. No caso de não 
conseguir trocar como ele conquistou um território, receberá no final de sua jogada mais uma 
carta, e no início da sua próxima jogada poderá trocar as cartas.*/

public class TestObjectivePlayerDefeat {
    Player player;
    GoalCard goalCard;
    private ID BLUE;
    int qtdPlayers = 3;
    int qtdTerritories = 42;
    int qtdTerritoriesForPlayer = qtdTerritories / qtdPlayers;
    Armies armiesAmount;

    @BeforeEach
    public void setUp() {
        this.goalCard = new GoalCard("Eliminate player");
        this.player = new Player("Cleiton", BLUE);
        this.armiesAmount= new Armies(1);
    }

    @Test
    public void testPlayerAliveBeforeCombat() {
        boolean expected = true;
        boolean actual = player.getLife();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testObjectiveIsEliminatePlayer() {
        GoalCard expected = new GoalCard("Eliminate player");
        GoalCard actual = player.getGoalCard();
        Assertions.assertFalse(expected.equals(actual));
    }

    @Test
    public void testAfterCombatResult(){
        this.armiesAmount= new Armies(0);
    }

    @Test
    public void testPlayerHasNoTerritoriesAfterCombat() {
        Integer expected = 0;
        Armies actual = armiesAmount;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPlayerIsDeadAfterCombat(){
        boolean expected = false;
        boolean actual = player.getLife();
        Assertions.assertEquals(expected, actual);

    }

}

/*package br.unicap.eng2.jogowar;

public class Player {
    private String name;
    private Army[] armies;
    private Card[] cards;
    private List<Territory> territories;

    private ID id;
    private String name;
    private GoalCard goalCard;
    private List<Territory> conqueredTerritories;
    private List<String> cards;
    private Life life;

public class Player {
    private int amount;
    private final String name;
    private final String color;
    private Objective objective; // GoalCard goalCard
    private boolean active;
    //private AttackStrategy attackStrategy;
    //private String lastAttackStrategyUsed;
    //private DefenseStrategy defenseStrategy;

    public static final String MSG_OCCUPATE_TERRITORY = "You Don´t have any armies in territory";

    public Player(String name, String color, Objective objective) {
        this.name = name;
        this.color = color;
        this.objective = objective;
        this.active = true;
    }

    public int getArmiesAmount() {
        return this.amount;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return color;
    }

    public Objective getObjective() {
        return objective;
    }

    public boolean getActive() {
        return active;
    }

    public void addArmiesAmount(int amount) {
        this.amount += amount;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public AttackStrategy getAttackStrategy() {
        return attackStrategy;
    }

    public String getLastAttackStrategyUsed() {
        return lastAttackStrategyUsed;
    }

    public DefenseStrategy getDefenseStrategy() {
        return defenseStrategy;
    }

    public void setDefenseStrategy(DefenseStrategy defenseStrategy) {
        this.defenseStrategy = defenseStrategy;
    }

 
    public void removeArmiesAmount(int armiesAmount) {
        if (this.amount - armiesAmount < 0) {
            throw new RuntimeException(MSG_OCCUPATE_TERRITORY);
        }
        this.amount -= armiesAmount;
    }

    public void attack() {
        if (attackStrategy != null) {
            attackStrategy.attack();
            lastAttackStrategyUsed = attackStrategy.getName();
        } else {
            // Trate o caso em que a estratégia de ataque não foi definida
            System.out.println("Attack strategy not defined.");
        }
    }

    public void defend() {
        if (defenseStrategy != null) {
            defenseStrategy.defend();
            defenseStrategy.getName();
        } else {
            // Trate o caso em que a estratégia de ataque não foi definida
            System.out.println("defend strategy not defined.");
        }
    }*/