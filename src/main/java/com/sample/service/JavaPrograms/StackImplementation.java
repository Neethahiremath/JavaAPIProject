package com.sample.service.JavaPrograms;

import java.util.Arrays;
import java.util.Stack;

public class StackImplementation<T> {

    private int stackPointer;
    private T[] stackItems;

    StackImplementation() {
        this.stackPointer = 0;
        this.stackItems = (T[]) new Object[10];
    }

    private void push(T item) {
        assert stackPointer < stackItems.length : "push to full stack";
        System.out.println("before " + stackPointer);
        stackItems[stackPointer++] = item;
        System.out.println("after increa" + stackPointer);
    }

    private T pop() {
        return (T) stackItems[--stackPointer];
    }

    private void getAllItemsInStack() {
        for (int i = 0; i < stackPointer; i++) {
            System.out.println(stackItems[i]);
        }
    }

    private void pushMany(T[] items)
    {
        System.arraycopy(items,0,stackItems,stackPointer,items.length);
        stackPointer+=items.length;

    }

    public static void main(String[] args) {

        //Stack in Java
        Stack<String> stringStack = new Stack<>();

        stringStack.push("1");
        stringStack.push("2");

        System.out.println(stringStack.pop());

        //Stack Implemented by ArrayList

        StackImplementation<Integer> stackImplementation = new StackImplementation<>();

        stackImplementation.push(1);
        stackImplementation.push(2);
        stackImplementation.pop();
        stackImplementation.push(3);
        stackImplementation.getAllItemsInStack();

        Integer[] item = {11,12,13,14,15};

        stackImplementation.pushMany(item);
        stackImplementation.getAllItemsInStack();
    }
}

