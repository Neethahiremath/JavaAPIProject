package com.sample.service.JavaPrograms;

import com.google.common.annotations.VisibleForTesting;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FindTheWordFromFile {

    private List<String> collectFileEntries;
    private Map<Character, Integer> storeValues = new HashMap<>();

    private List<String> getTheWordFromFile() {
        try {
            collectFileEntries = Files.lines(Paths.get("/vt65/Backup/MyFirstProjectDemo/src/main/resources/file.txt"))
                    .map(item -> item.split(" "))
                    .flatMap(Arrays::stream)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return collectFileEntries;
    }

    private void displayAll(String input) {
        try {
            createInitialMap(input);
        } catch (CustomException e) {
            e.printStackTrace();
        }
        System.out.println("Words that are in file that is subset of input are ");
        collectFileEntries.forEach(entity -> {
            if (findWords(entity)) {
                System.out.println(entity);
            }
        });
    }

    @VisibleForTesting
    Map<Character, Integer> createInitialMap(String input) throws CustomException {

        if (input == null) {

            throw new CustomException("Input can not be empty");
        }
        char[] chars = input.toCharArray();
        for (char ch : chars) {
            if (storeValues.containsKey(ch)) {
                int value = storeValues.get(ch);
                storeValues.put(ch, value = value + 1);
            } else {
                storeValues.put(ch, 1);
            }
        }

        return storeValues;
    }

    @VisibleForTesting
    boolean findWords(String fileWord) {

        Map<Character, Integer> temp = new HashMap<>(storeValues);

        char[] fileChars = fileWord.toCharArray();

        for (char fileChar : fileChars) {
            if (temp.containsKey(fileChar)) {
                int value = temp.get(fileChar);
                temp.put(fileChar, value = value - 1);

                if (temp.get(fileChar) < 0) {

                    return false;
                }
            } else {

                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        FindTheWordFromFile findTheWordFromFile = new FindTheWordFromFile();
        List<String> theWordFromFile = findTheWordFromFile.getTheWordFromFile();
        System.out.println("Words that are in file ");
        System.out.println(theWordFromFile);

        System.out.println("Enter the String to be found");
        Scanner inputScanner = new Scanner(System.in);
        String inputString = inputScanner.next();

        findTheWordFromFile.displayAll(inputString);
    }
}
