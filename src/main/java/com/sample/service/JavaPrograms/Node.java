package com.sample.service.JavaPrograms;

public class Node {

    int data;
    Node next;

    public int getData() {
        return data;
    }
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
    }
}
