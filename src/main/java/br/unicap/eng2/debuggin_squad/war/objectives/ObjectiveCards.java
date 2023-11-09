package br.unicap.eng2.debuggin_squad.war.objectives;

import br.unicap.eng2.debuggin_squad.war.Player;
import br.unicap.eng2.debuggin_squad.war.objectives.message.CreateMessage;
import br.unicap.eng2.debuggin_squad.war.objectives.message.Message;

import java.util.ArrayList;
import java.util.List;


public class ObjectiveCards {

    private Cards cards;
    private Message message;
    private int idMessage = 0;
    private String description;
    private List<Cards> cardsList;

    public ObjectiveCards() {
        this.cardsList = new ArrayList<>();
    }

    public void addCards(String description, String player) {
        this.description = setMessage(description, player);
        cardsList.add(this.cards = new Cards(idMessage, this.description));
        idMessage++;
    }

    private String setMessage(String description, String player) {
        if (player == null) {
            message = new CreateMessage();
        }
        return message.create(description, player);
    }

    public String returnMessage(int idMessage) {
        Cards retMessage = cardsList.get(idMessage);
        if (retMessage.getId() == idMessage) {
            return retMessage.getDescription();
        }
        return "Id não identificado!";
    }

}
