package com.sample.service.JavaPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class FirstNonRepeatingCharecter {

    public static Character result(Map<Character, Integer> map) {

        for (Map.Entry<Character, Integer> pair : map.entrySet()) {
            System.out.println(pair.getValue());
            System.out.println(pair.getKey());

            if (pair.getValue() == 1) {
                return pair.getKey();
            }
        }
        return null;
    }

    public static void main(String[] args) {

        HashSet in = new HashSet();

        Map<Character, Integer> map = new LinkedHashMap<>();

       /*   in.add(122);

        Hashtable<Integer,Integer> hashtable = new Hashtable<>();

        System.out.println(in);

        HashSet<Integer> input = new HashSet<>();

        Set input3 = new HashSet();
        input3.add(12);
        input3.add("e");

        System.out.println(input3);*/

        System.out.println("Enter the string");
        Scanner scanner = new Scanner(System.in);
        String inputWord = scanner.nextLine();
        char[] arr = inputWord.toCharArray();
        for (char ch : arr) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println(map);
        System.out.println("First Non repeated character is" + result(map));
    }
}

