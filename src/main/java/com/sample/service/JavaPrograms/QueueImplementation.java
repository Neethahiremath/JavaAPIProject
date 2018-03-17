package com.sample.service.JavaPrograms;

public class QueueImplementation {

    private static final int MAX = 100;
    private Integer[] queueArray;
    private Integer rear;
    private Integer front;
    private Integer size;

    private QueueImplementation() {
        this.rear = 0;
        this.front = 0;
        this.queueArray = new Integer[MAX];
        this.size = 0;
    }

    private boolean isFull(QueueImplementation queueImplementation) {
        return queueImplementation.size == QueueImplementation.MAX;
    }

    private boolean isEmpty(QueueImplementation queueImplementation) {
        return queueImplementation.size == 0;
    }

    private Integer enqueue(Integer item) {

        if (isFull(this)) {
            System.out.println("Queue is full");
            return Integer.MIN_VALUE;
        }
        System.out.println("element added at" + rear);
        queueArray[rear++] = item;
        this.size = this.size + 1;
        return item;
    }

    private void getQueueItems() {
        for (int i = front; i < size; i++) {
            System.out.println(queueArray[i]);
        }
    }

    private Integer dequeue() {
        if (isEmpty(this)) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        System.out.println("element removed at" + front);
        this.size = this.size - 1;
        return queueArray[front++];
    }

    public static void main(String[] args) {

        QueueImplementation queueImp = new QueueImplementation();
        queueImp.enqueue(12);
        queueImp.enqueue(13);
        queueImp.enqueue(30);
        System.out.println(queueImp.dequeue());
        System.out.println(queueImp.dequeue());
        System.out.println(queueImp.dequeue());
        System.out.println(queueImp.dequeue());
        System.out.println("Elements in queue are ");
        queueImp.getQueueItems();
    }
}


