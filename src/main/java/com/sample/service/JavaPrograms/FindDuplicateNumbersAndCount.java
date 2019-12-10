package com.sample.service.JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FindDuplicateNumbersAndCount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers to find the duplicate number");
        String input = scanner.nextLine();
        List<String> stringList = Arrays.asList(input.split(" "));
        System.out.println(stringList);
        Map<Integer, Integer> duplicateNumbers = new HashMap<>();
        stringList.forEach(item -> {
            if (stringList.contains(item)) {

                if (duplicateNumbers.containsKey(Integer.parseInt(item))) {
                    duplicateNumbers.put(Integer.parseInt(item), duplicateNumbers.get(Integer.parseInt(item)) + 1);
                } else {
                    duplicateNumbers.put(Integer.parseInt(item), 1);
                }
            }
        });
        System.out.println(duplicateNumbers);
        System.out.println(duplicateNumbers
                                   .entrySet()
                                   .stream()
                                   .filter(a1 -> a1.getValue() > 1)
                                   .collect(Collectors.toSet()));


    }
}
