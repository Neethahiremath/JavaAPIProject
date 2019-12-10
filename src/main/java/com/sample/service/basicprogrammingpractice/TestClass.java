package com.sample.service.basicprogrammingpractice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.joda.time.LocalDate;

public class TestClass {

  public static void main(String args[]) throws IOException {
/*    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    String read = bufferedReader.readLine();

    System.out.print(read);*/

    Scanner scanner = new Scanner(System.in);

    int arraySize = scanner.nextInt();

    String sc = scanner.next();
    char[] chars = sc.toCharArray();
    List<String> subStrings = new ArrayList<>();


    for(int i=0;i<sc.length();i++)
    {
      for(int j=0;j<=i;j++)
      {

      }
    }

    int[] arrayNumbers = new int[arraySize];
    int sum = 0;

    for (int i = 0; i < arraySize; i++) {
      arrayNumbers[i] = scanner.nextInt();
    }

    for (int j = 5; j <= 10; j++) {
      System.out.print(j + " ");
    }
    System.out.println(Math.floorMod(8,12));

 /*   List<LocalDate> daysRange = Stream.iterate(LocalDate.now().plusDays(1), date -> date.plusDays(1)).limit(21)
        .collect(
            Collectors.toList());

    daysRange.forEach(date-> System.out.println(date.toString()));*/

    System.out.printf(LocalDate.now().minusDays(7).toString());
  }

}
