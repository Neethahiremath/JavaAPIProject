package com.sample.service.JavaPrograms;

public class StarTriangle {
    public static void main(String[] args) {
        int i, j, k;

        /**
         *
         *
         * pattern for triangle and its mirror image
         *
         */

        for (i = 5; i >= 1; i--) {
            for (j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (i = 4; i >= 1; i--) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (k = i; k <= 5; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /**
         * pattern
         1
         1 2
         1 2 3
         1 2 3 4
         1 2 3 4 5
         1 2 3 4 5 6
         1 2 3 4 5 6 7
         1 2 3 4 5 6
         1 2 3 4 5
         1 2 3 4
         1 2 3
         1 2
         1
         *
         */

        for (i = 1; i <= 7; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (i = 6; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();

        /**
         *
         7 6 5 4 3 2 1
         7 6 5 4 3 2
         7 6 5 4 3
         7 6 5 4
         7 6 5
         7 6
         7
         */

        for (i = 1; i <= 7; i++) {
            for (j = 7; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (i = 7; i >= 1; i--) {
            for (j = 7; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}

