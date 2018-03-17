package com.sample.service.JavaPrograms;

public class DoublyLinkedList<T> {

    private DoublyNode head;
    private int length;

    public DoublyLinkedList() {
        this.length = 0;
    }

    private int size() {
        return length;
    }

    private boolean isEmpty() {
        return length == 0;
    }

    private DoublyNode getHead() {
        return head;
    }

    private void insertAtTheBeginning(DoublyNode node) {
        if (head == null) {
            head = node;
            length++;
            System.out.println("Node Added in the front " + node.getData());
        } else {
            head.setPrevious(node);
            node.setNext(head);
            this.head = node;
            length++;
            System.out.println("Node Added in the front " + node.getData());
        }
    }

    private void insertAtTheEnd(DoublyNode node) {

        if (head == null) {
            head = node;
            length++;
        } else {
            DoublyNode current;
            DoublyNode next;

            for (current = head; (next = current.getNext()) != null; current = next) {
                continue;
            }

            node.setPrevious(current);
            current.setNext(node);
            length++;
            System.out.println("Node Added in the back " + node.getData());
        }
    }

    private void printItems() {
        DoublyNode current = head;
        do {
            System.out.println(current.getData());
            current = current.getNext();
        } while (current != null);
    }

    private void removeFront() {

        if (isEmpty()) {
            System.out.println("List is empty..no items to remove");
        } else {
            DoublyNode temp = head;
            DoublyNode node = head.getNext();
            node.setPrevious(null);
            head = node;
            length--;
            System.out.println("Element is deleted at front" + temp.getData());
        }
    }

    private void removeEnd() {

        if (isEmpty()) {
            System.out.println("List is empty..no items to remove");
        } else {
            DoublyNode current;
            DoublyNode next;

            for (current = head; (next = current.getNext()) != null; current = next) {
                continue;
            }

            DoublyNode previous = current.getPrevious();
            previous.setNext(null);
            current.setPrevious(null);
            length--;
            System.out.println("Element is deleted at front" + current.getData());
        }
    }

    public static void main(String[] args) {

        DoublyLinkedList<Integer> doubleList = new DoublyLinkedList<>();
        doubleList.insertAtTheBeginning(new DoublyNode(12));
        doubleList.insertAtTheBeginning(new DoublyNode(14));
        doubleList.insertAtTheBeginning(new DoublyNode(15));
        System.out.println(doubleList.getHead().getData());
        System.out.println("Lengh is " + doubleList.length);
        doubleList.insertAtTheEnd(new DoublyNode(45));
        doubleList.insertAtTheEnd(new DoublyNode(65));
        doubleList.insertAtTheEnd(new DoublyNode(30));
        doubleList.printItems();
        doubleList.removeFront();
        doubleList.removeFront();
        doubleList.printItems();
        doubleList.removeEnd();
        doubleList.removeEnd();
        doubleList.printItems();
        doubleList.removeEnd();
        doubleList.printItems();
        doubleList.removeEnd();
        doubleList.removeEnd();
    }
}
