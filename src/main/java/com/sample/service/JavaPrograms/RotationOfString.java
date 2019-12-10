package com.sample.service.JavaPrograms;

import java.util.Arrays;

public class RotationOfString {

    public void arrayRotation(int[] input, int number) {
        for (int i = 1; i <= number; i++) {

            for (int j = 0; j < input.length - 1; j++) {
                swap(input, j, j + 1);
            }
            System.out.print(Arrays.toString(input));
        }
    }

    private void sortUsingBubble(int[] input, int length) {

        for (int i = 1; i <= length; i++) {
            for (int j = 0; j <= length - i; j++) {

                if (input[j] > input[j + 1]) {
                    swap(input, j, j + 1);
                }
            }
        }
        System.out.println(Arrays.toString(input));
    }

    private void sortAllExceptOne(int[] input, int number) {
        int[] temp = new int[input.length - 1];
        int k = 0;
        for (int i = 0; i < input.length; i++) {
            if (i + 1 != number) {
                temp[k] = input[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(temp));
        sortUsingBubble(temp, temp.length);
        k = 0;

        for (int i = 0; i < input.length; i++) {
            if (i + 1 != number && k < temp.length) {
                input[i] = temp[k];
                k++;
            }
        }
        System.out.println(Arrays.toString(input));
    }

    private void sortAllExceptOneMethod2(int[] input, int number) {
        int temp = input[input.length - 1];
        input[input.length - 1] = input[number - 1];
        input[number - 1] = temp;
        System.out.println(Arrays.toString(input));
        sortUsingBubble(input, input.length - 2);
        System.out.println(Arrays.toString(input));
        for (int i = input.length - 1; i >= number; i--) {
            swap(input, i, i - 1);
        }
        System.out.println(Arrays.toString(input));
    }

    public void swap(int[] input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }

    public static void main(String[] args) {

      /*  Scanner scanner = new Scanner(System.in);
        String rotateString = scanner.next();
        String rotationOfString = scanner.next();

        String temp = rotateString.concat(rotateString);
        System.out.println(temp.contains(rotationOfString));
*/
        // new RotationOfString().arrayRotation(new int[] {1, 2, 3, 4, 5, 6}, 2);
        new RotationOfString().sortAllExceptOneMethod2(new int[] {13, 5, 6, 1, 9}, 2);
    }
}
