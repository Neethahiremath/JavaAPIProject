package com.sample.service.JavaPrograms;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.xml.parsers.DocumentBuilderFactory;

public class test {

  public static void main(String[] args) {

    System.out.printf(Country.GBR.getCountryName());

          /*  InputStream inputStream = new FileInputStream(new File("/Users/neethahiremath/data/2018/P3/44505-GP3.pdf"));
            System.out.println(inputStream.read());

            String name="P3";
            System.out.println(new StringBuffer(name).insert(1,0));*/

         /*catch (IOException e) {
            e.printStackTrace();
        }*/

    final List<String> list = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h");

    System.out.println(partition(list, 2));  // [[1, 2], [3, 4], [5, 6], [7]]
    System.out.println(partition(list, 3));  // [[1, 2, 3], [4, 5, 6], [7]]

    Collections.sort(list, Comparator.naturalOrder());

    Predicate<Integer> predicate = (s) -> s > 2;

    Integer integer = 12;
    boolean test = predicate.test(integer);

    Calendar.getInstance(); //factory design pattern
    DocumentBuilderFactory.newInstance(); //abstract design pattern

    List<String> stringList = null;

    if (Optional.ofNullable(stringList).isPresent()) {
      System.out.printf("xxxxxxx");
    }
   /* if (stringList.isEmpty()) {
      System.out.printf("yyyyy");
    }
*/
    if (Optional.ofNullable(stringList).isPresent() && !stringList.isEmpty()) {
      System.out.printf("zzzzz");
    }

    if (stringList != null && !stringList.isEmpty()) {
      System.out.printf("pppppp");
    }

    if (!stringList.isEmpty() && stringList != null) {
      System.out.printf("ggg");
    }
  }

  private static <T> Collection<List<T>> partition(List<T> list, int size) {
    final AtomicInteger counter = new AtomicInteger(0);

    return list.stream()
        .collect(Collectors.groupingBy(it -> counter.getAndIncrement() / size))
        .values();

  }


}

