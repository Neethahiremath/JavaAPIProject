package com.sample.service.JavaPrograms;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringJoiner;

public class RotationOfString {

    /*private String getTheRotation(String rotateString) {
        Queue queueToStore = new LinkedList();

        char[] chars = rotateString.toCharArray();
        for (char input : chars) {
            queueToStore.add(input);
        }
        Object remove = queueToStore.remove();
        queueToStore.add(remove);

        char[] afterRotation = new char[chars.length];

        while (!queueToStore.isEmpty()) {
            for (int i = 0; i < afterRotation.length; i++) {
                Object rev = queueToStore.remove();
                afterRotation[i] = (char) rev;
            }
        }
        return Arrays.toString(afterRotation);
    }*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String rotateString = scanner.next();
        String rotationOfString = scanner.next();

      /*  RotationOfString rotation = new RotationOfString();
        String passString = rotateString;
        for (int i = 0; i < rotateString.length(); i++) {

            String output = rotation.getTheRotation(passString);
            System.out.println(output);
            if (output.equals(rotationOfString)) {
                System.out.println("Inputs are rotation of");
                return;
            }
            passString = output;
        }
        System.out.println("Does not match");*/

        String temp = rotateString.concat(rotateString);
        System.out.println(temp.contains(rotationOfString));


    }
}
