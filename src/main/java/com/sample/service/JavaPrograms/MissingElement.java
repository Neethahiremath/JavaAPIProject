package com.sample.service.JavaPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class MissingElement {

  public static void main(String[] args) {

    int[] input = new int[5];

    int number;

    Scanner scanner = new Scanner(System.in);

    System.out.printf("enter number n\n");
    number = scanner.nextInt();

    System.out.printf("Enter the elemnts\n");

    for (int i = 0; i < 4; i++) {
      input[i] = scanner.nextInt();
    }

    System.out.printf("elements are\n" + Arrays.toString(input));
    getMissingElementArray(input, number);

  }

  public static void getMissingElementArray(int[] input, int num) {

    int j = 1;
    int flag = 0;

    for (int k = 0; k < num; k++) {
      for (int i = 0; i < num; i++) {
        if (input[i] == j) {
          j++;
          flag = 1;
        } else {
          i++;
          flag = 0;
        }
      }
      if (flag == 0) {
        System.out.printf("mising elemnt\n" + j);
        break;
      }
    }
  }

}
