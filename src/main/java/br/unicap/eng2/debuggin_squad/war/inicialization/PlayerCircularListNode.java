package br.unicap.eng2.debuggin_squad.war.inicialization;

import br.unicap.eng2.debuggin_squad.war.controller.Player;

public class PlayerCircularListNode {

    private PlayerCircularListNode previous;
    private PlayerCircularListNode next;
    private Player value;

    public PlayerCircularListNode(Player value, PlayerCircularListNode next, PlayerCircularListNode previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    public PlayerCircularListNode() {
    }

    public Player getValue() {
        return value;
    }

    public void setValue(Player value) {
        this.value = value;
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
