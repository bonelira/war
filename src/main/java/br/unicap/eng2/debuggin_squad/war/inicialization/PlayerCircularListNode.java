/**
 * @author Abi-albom Lira <bone-lira@hotmail.com / @bonelira>
 */

package br.unicap.eng2.debuggin_squad.war.inicialization;

import br.unicap.eng2.debuggin_squad.war.controller.Player;

public class PlayerCircularListNode {

    private PlayerCircularListNode previous;
    private PlayerCircularListNode next;
    private Player value;

    public PlayerCircularListNode(Player player, PlayerCircularListNode next, PlayerCircularListNode previous) {
        this.value = player;
        this.next = next;
        this.previous = previous;
    }

    public PlayerCircularListNode() {
    }

    public Player getPlayer() {
        return value;
    }

    public void setPlayer(Player player) {
        this.value = player;
    }

    public PlayerCircularListNode getPrevious() {
        return this.previous;
    }

    public PlayerCircularListNode getNext() {
        return this.next;
    }

    public void setNext(PlayerCircularListNode next) {
        this.next = next;
    }

    public void setPrevious(PlayerCircularListNode previous) {
        this.previous = previous;
    }

}
