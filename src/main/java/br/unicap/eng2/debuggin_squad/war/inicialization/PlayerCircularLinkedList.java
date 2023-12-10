package br.unicap.eng2.debuggin_squad.war.inicialization;

import br.unicap.eng2.debuggin_squad.war.controller.Player;

public class PlayerCircularLinkedList {

    private PlayerCircularListNode sentinel;

    public PlayerCircularLinkedList() {
        this.sentinel = new PlayerCircularListNode(null, null, null);
        this.sentinel.setNext(this.sentinel);
        this.sentinel.setPrevious(this.sentinel);
    }

    public void addFirst(Player value) {
        PlayerCircularListNode oldhead = this.sentinel.getNext();
        PlayerCircularListNode newHead = new PlayerCircularListNode(value, this.sentinel.getNext(), this.sentinel);
        oldhead.setPrevious(newHead);
        sentinel.setNext(newHead);
    }

    public void addLast(Player value) {
        PlayerCircularListNode oldTail = this.getTail();
        PlayerCircularListNode newTail = new PlayerCircularListNode(value, this.sentinel, oldTail);

        oldTail.setNext(newTail);
        setTail(newTail);
    }

    public int size() {
        PlayerCircularListNode node = this.getHead();
        int size = 0;

        while (node != this.sentinel) {
            node = node.getNext();
            size++;
        }
        return size;
    }

    public PlayerCircularListNode search(Player value) {
        PlayerCircularListNode node = this.getHead();

        while (node != this.sentinel) {
            if (value == node.getValue()) {
                return node;
            }
            node = node.getNext();
        }
        return null;
    }

    public boolean isOrdered(boolean ascending) {
        if (isEmpty() || size() == 1) {
            return true;
        }
        PlayerCircularListNode node = this.getHead();
        String previousName;

        while (node.getNext() != this.sentinel) {
            node = node.getNext();
            previousName = node.getPrevious().getValue().getName();
            String currentNodeName = node.getValue().getName();

            if (ascending) {
                if (previousName.compareTo(currentNodeName) > 0) {
                    return false;
                }
            } else {
                if (previousName.compareTo(currentNodeName) < 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public void delete(PlayerCircularListNode nodeDelete) {
        PlayerCircularListNode previousNode = nodeDelete.getPrevious();
        PlayerCircularListNode nextNode = nodeDelete.getNext();

        previousNode.setNext(nextNode);
        nextNode.setPrevious(previousNode);
    }

    public void reverse() {
        PlayerCircularListNode node = this.sentinel;
        PlayerCircularListNode nextNode = this.getHead();

        do {
            node.setNext(node.getPrevious());
            node.setPrevious(nextNode);
            node = nextNode;
            nextNode = nextNode.getNext();
        } while (node != this.sentinel);
    }

    public PlayerCircularLinkedList copy() {
        PlayerCircularLinkedList copiedList = new PlayerCircularLinkedList();
        PlayerCircularListNode node = this.getHead();

        while (node != this.sentinel) {
            copiedList.addLast(node.getValue());
            node = node.getNext();
        }
        return copiedList;
    }

    public boolean isEquals(PlayerCircularLinkedList list) {
        if (list.size() != this.size()) {
            return false;
        }
        PlayerCircularListNode nodeListOne = this.getHead();
        PlayerCircularListNode nodeListTwo = list.getHead();

        while (nodeListOne != this.sentinel) {
            if (nodeListOne.getValue() != nodeListTwo.getValue()) {
                return false;
            }
            nodeListOne = nodeListOne.getNext();
            nodeListTwo = nodeListTwo.getNext();
        }

        return true;
    }

    public Player get(Integer index) throws Exception {
        if (isEmpty()) {
            throw new Exception("List is empty");
        }
        PlayerCircularListNode node = this.getHead();

        for (int i = 0; i < index; i++) {
            node = node.getNext();
            if (node == this.sentinel) {
                node = node.getNext();
            }
        }
        return node.getValue();
    }

    public PlayerCircularListNode getSuccessor(PlayerCircularListNode currentNode) {
        if (isEmpty()) {
            return null;
        }

        if (currentNode.getNext() == this.sentinel) {
            return this.getHead(); // o next do sentinel
        }
        return currentNode.getNext();
    }

    public void setHead(PlayerCircularListNode node) {
        this.sentinel.setNext(node);
    }

    public void setTail(PlayerCircularListNode node) {
        this.sentinel.setPrevious(node);
    }

    public PlayerCircularListNode getHead() {
        return this.sentinel.getNext();
    }

    public PlayerCircularListNode getTail() {
        return this.sentinel.getPrevious();
    }

    public boolean isEmpty() {
        return this.getHead() == this.sentinel && this.getTail() == this.sentinel;
    }

}
