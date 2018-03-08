package com.sample.service.JavaPrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class ReadFromTextFile {

    public static boolean isPalindrom(String text) {
        StringBuffer stringBuffer = new StringBuffer(text);
        return stringBuffer.reverse().toString().equals(text);
    }

    public static void main(String[] args) {

        try {
           List<String> stringList = Files
                    .lines(Paths.get("/vt65/Backup/MyFirstProjectDemo/src/main/resources/file.txt"))
                    .map(words -> words.split(" "))
                    .flatMap(Arrays::stream)
                    .collect(Collectors.toList());

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
            }

          // System.out.println(stringList);

           /* long palindromeCount = stringList.stream()
                    .filter(ReadFromTextFile::isPalindrom)
                    .peek(System.out::println).count();*/

           // System.out.println("Count of palindromes: "+palindromeCount);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
