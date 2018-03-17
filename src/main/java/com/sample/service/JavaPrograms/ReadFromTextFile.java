package com.sample.service.JavaPrograms;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReadFromTextFile {

    public static boolean isPalindrom(String text) {
        // StringBuffer stringBuffer = new StringBuffer(text);
        //return stringBuffer.reverse().toString().equals(text);
        char[] array = text.toCharArray();
        int low = 0;
        int high = text.length() - 1;
        int mid = low + (high - low) / 2;

        if (text.length() % 2 == 0) {
            int incrementer = 1;

            while (incrementer <= high) {
                if (array[mid - (incrementer-1)] == array[mid + incrementer]) {
                    incrementer++;
                } else {
                    return false;
                }
            }
        } else {

            int incrementer = 1;

            while (((mid - incrementer) <= low) && (mid + incrementer) >= high) {
                if (array[mid - incrementer] == array[mid + incrementer]) {
                    incrementer++;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        try {
            List<String> stringList = Files
                    .lines(Paths.get("/vt65/Backup/MyFirstProjectDemo/src/main/resources/file.txt"))
                    .map(words -> words.split(" "))
                    .flatMap(Arrays::stream)
                    .collect(Collectors.toList());
/*
            BufferedReader bf = new BufferedReader(
                    new FileReader("/vt65/Backup/MyFirstProjectDemo/src/main/resources/file.txt"));

            String line = bf.readLine();
            StringBuilder sb = new StringBuilder();
            while (line!=null)
            {
                sb.append(line);
                sb.append(System.lineSeparator());
                System.out.println(line);
                line=bf.readLine();
            }*/

            // System.out.println(stringList);

            long palindromeCount = stringList.stream()
                    .filter(ReadFromTextFile::isPalindrom).
                            count();

            System.out.println("Count of palindromes: " + palindromeCount);

            System.out.println(ReadFromTextFile.isPalindrom("Madam"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
