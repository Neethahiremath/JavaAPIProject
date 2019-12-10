package com.sample.service.JavaPrograms;

import java.util.LinkedList;
import java.util.Queue;

public class StackImplementationUsingQueue<T> {

    private Queue<T> queue1;
    private Queue<T> queue2;
    private int curr_size;

    private StackImplementationUsingQueue() {
        this.queue1 = new LinkedList<>();
        this.queue2 = new LinkedList<>();
        this.curr_size = 0;
    }

    private T push(T item) {

        curr_size++;
        queue2.add(item);

        while (!queue1.isEmpty()) {
            queue2.add(queue1.remove());
        }

        Queue<T> queueTemp = queue1;
        queue1 = queue2;
        queue2 = queueTemp;
        return item;
    }

    private T pop() {
        if (queue1.isEmpty()) {
            return null;
        }
        curr_size--;
        return queue1.remove();
    }

    private int size()
    {
        return curr_size;
    }

    public static void main(String[] args) {

        StackImplementationUsingQueue<Integer> usingQueue = new StackImplementationUsingQueue<>();
        System.out.println(usingQueue.push(1));
        System.out.println(usingQueue.push(2));
        System.out.println(usingQueue.push(13));
        System.out.println(usingQueue.push(45));
        System.out.println(usingQueue.push(33));
        System.out.println("Elements that are removed");
        System.out.println(usingQueue.pop());
        System.out.println(usingQueue.pop());
        System.out.println("Stack Size is "+ usingQueue.size());
    }
}
