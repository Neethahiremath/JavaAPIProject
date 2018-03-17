package com.sample.service.JavaPrograms;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;
import java.util.function.BinaryOperator;

public class FindMinNumberInStack {

    public static void main(String[] args) {

        Stack<Integer> integerStack = new Stack<>();
        Scanner inputStackValues = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            int inputValue = inputStackValues.nextInt();
            integerStack.push(inputValue);
        }

       /* if (integerStack.isEmpty()) {

            System.out.println("Stack is empty");
        } else {

            int min_value = integerStack.pop();
            while (!integerStack.isEmpty()) {
                int nextValue = integerStack.pop();
                if (min_value > nextValue) {
                    min_value = nextValue;
                }
            }
            System.out.println("MIN VALUE IS " + min_value);
        }*/
        System.out.println(integerStack.stream().min(Comparator.naturalOrder()).orElse(0));
    }
}

