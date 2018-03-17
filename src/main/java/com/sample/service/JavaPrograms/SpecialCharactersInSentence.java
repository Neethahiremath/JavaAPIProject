package com.sample.service.JavaPrograms;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

public class SpecialCharactersInSentence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputSentence = scanner.nextLine();
        Set<Character> specialCharacters = new HashSet<>();

        Pattern compile = Pattern.compile("[^a-zA-Z0-9]");

        char[] chars = inputSentence.toCharArray();

        for (char ch : chars) {
            if (compile.matcher(Character.toString(ch)).find()) {
                specialCharacters.add(ch);
            }
        }
        System.out.println("characters are " + specialCharacters);
        System.out.println("character count is " + (long) specialCharacters.size());

    }
}
