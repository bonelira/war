package br.unicap.eng2.debuggin_squad.war.objectives;

import br.unicap.eng2.debuggin_squad.war.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStrategyMessage {

  private String descriptions;
  private List<Player> players;

  @BeforeEach
  public void setUp() {
    players = new ArrayList<>();
    players.add(new Player("Jogador1", "10", "verde"));
    players.add(new Player("Jogador2", "15", "amarelo"));
    players.add(new Player("Jogador3", "8", "vermelho"));
    players.add(new Player("Jogador4", "9", "rosa"));
  }

  @Test
  public void testCreateMessage() {
    Message message = new CreateMessage();
    descriptions = "New message";
    String actual = message.create(descriptions, null);
    String expected = "New message";
    assertEquals(expected, actual);
  }

  @Test
  public void testColorRelatedMessage() {
    Message message = new CreateMessageRelatedtoColor();
    descriptions = "Domine o território do";
    String actual = message.create(descriptions, players.get(1).getColor());
    String expected = "Domine o território do" + players.get(1).getColor();
    assertEquals(expected, actual);
  }
}
