package br.unicap.eng2.debuggin_squad.war.objectives.message;

public class CreateMessage implements Message{

    @Override
    public String create(String description, String player) {
        if (player == null) {
            return description;
        }
        return description + player;
    }
}
