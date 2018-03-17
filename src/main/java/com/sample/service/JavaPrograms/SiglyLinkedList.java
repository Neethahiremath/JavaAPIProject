package com.sample.service.JavaPrograms;

public class SiglyLinkedList {

    private int lenght;
    private Node head;

    private SiglyLinkedList() {
        this.lenght = 0;
    }

    private Node getHead() {
        return head;
    }

    private int size() {
        return lenght;
    }

    private synchronized void insertAtBeginning(Node node) {

        node.setNext(head);
        this.head = node;
        lenght++;
        System.out.println("Item added in the begining" + node.data);
    }

    private synchronized void insertAtTheEnd(Node node) {

        if (head == null) {
            head = node;
            lenght++;
            System.out.println("Item added in the end" + node.data);
        } else {
            Node next;
            Node current;
            for (current = head; (next = current.getNext()) != null; current = next) {
                continue;
            }
            current.setNext(node);
            System.out.println("Item added in the end" + node.data);
            lenght++;
        }
    }

    private void printElements() {
        Node current = head;
        do {
            System.out.println(current.getData());
            current = current.getNext();
        } while (current != null);
    }

    private void removeAtTheBeg() {
        head = head.getNext();
    }

    private void removeAtTheEnd() {
        Node current;
        Node next;

        for (current = head; (next = current.getNext().getNext()) != null; current = next) {
            continue;
        }
        current.setNext(null);
    }

    private int removeItem(int item) {
        Node current;
        Node next;

        if (head.data == item) {
            removeAtTheBeg();
            return item;
        } else {
            for (current = head; (next = current.getNext()) != null; current = next) {
                Node previous = current;
                if (current.data == item) {
                    previous.setNext(current.getNext());
                    return item;
                }
            }
        }

        return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {

        SiglyLinkedList siglyLinkedList = new SiglyLinkedList();
        siglyLinkedList.insertAtBeginning(new Node(9));
        siglyLinkedList.insertAtBeginning(new Node(12));
        siglyLinkedList.insertAtBeginning(new Node(23));
        siglyLinkedList.insertAtBeginning(new Node(65));
        System.out.println(siglyLinkedList.getHead().data);

        siglyLinkedList.insertAtTheEnd(new Node(13));
        siglyLinkedList.insertAtTheEnd(new Node(45));
        siglyLinkedList.insertAtTheEnd(new Node(67));

       System.out.println(siglyLinkedList.size());

        siglyLinkedList.printElements();

        siglyLinkedList.removeAtTheBeg();
        siglyLinkedList.printElements();

        siglyLinkedList.removeAtTheEnd();
        siglyLinkedList.printElements();

        System.out.println(siglyLinkedList.getHead().data);

        int removeElement = siglyLinkedList.removeItem(12);
        System.out.println(removeElement);
        siglyLinkedList.printElements();
    }
}
