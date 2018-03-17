package com.sample.service.JavaPrograms;

import java.util.Stack;

public class QueueImplementationUsingStack<T> {

    private Stack<T> stack1;
    private Stack<T> stack2;

    private QueueImplementationUsingStack() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    private T pop() {
        if (stack1.empty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return stack1.pop();
    }

    private T push(T item) {

        if (stack1.isEmpty() && stack2.isEmpty()) {
           return stack1.push(item);
        }
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(item);

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return item;
    }

    public static void main(String[] args) {
        QueueImplementationUsingStack<Integer> queueImpl = new QueueImplementationUsingStack<>();

        for (int i = 0; i < 8; i++) {
            System.out.println("Element" + queueImpl.push(i) + " is added");
        }

        System.out.println("Element " + queueImpl.pop() + "is removed");
        System.out.println("Element " + queueImpl.pop() + "is removed");
        System.out.println("Element " + queueImpl.pop() + "is removed");

    }
}
