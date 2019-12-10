package com.sample.service.JavaPrograms;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Stack;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AddTwoNumbericStringWithoutBuildInFunc {

  public String addStrings(String num1, String num2) {
    char[] chars = num1.toCharArray();
    char[] chars1 = num2.toCharArray();

    int[] chars2;
    int count = 0, i = 0, carry = 0, k;

    if (chars.length > chars1.length) {
      i = chars.length - 1;
      chars2 = new int[chars.length + 1];
      k = chars.length;
    } else {
      i = chars1.length - 1;
      chars2 = new int[chars1.length + 1];
      k = chars1.length;
    }
    for (; i >= 0; i--) {
      int value = chars[i] - '0';
      int value1 = chars1[i] - '0';
      int sum = value + value1 + carry;
      chars2[k] = (sum % 10);
      carry = sum / 10;
      k--;
    }
    if (carry > 0) {
      chars2[k] = carry;
    }

    return Arrays.toString(chars2);
  }


  static String leftrotate(String str, int d) {
    String ans = str.substring(d) + str.substring(0, d);
    return ans;
  }

  static String rightrotate(String str, int d) {
    return leftrotate(str, str.length() - d);
  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    List<String> att = Arrays.asList(input.split(" "));

    Map<String, Long> collect = att.stream()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    collect.entrySet().stream()
        .sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Entry::getKey,
        Entry::getValue, (a1, a2) -> a1, LinkedHashMap::new));
    List<String> t = att.stream().filter(entry -> entry.contains("t"))
        .map(rotate -> rightrotate(rotate, 3)).collect(Collectors.toList());

    t.forEach(ent -> System.out.printf(ent));
    AddTwoNumbericStringWithoutBuildInFunc a = new AddTwoNumbericStringWithoutBuildInFunc();

  }

}
