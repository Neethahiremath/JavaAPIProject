package com.sample.service.JavaPrograms;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.StringJoiner;

public class StringsInJava8 {

    public static void main(String[] args) {

        //String Buffer/Builder for string concatenation

        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("Hello");
        strBuilder.append("World");

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(1);
        strBuilder.append("Two");

        System.out.println(strBuilder);
        System.out.println(stringBuffer);

        // String Joiner to concatenate two strings

        StringJoiner stringJoiner = new StringJoiner(" ");
        stringJoiner.add("HI").add("Neetha").add("How").add("R").add("You");
        System.out.println(stringJoiner);

        //Static method join is added in String class
        System.out.println(String.join(",","hi","neetha"));

        //Read all the directories and files
        Path path = Paths.get("/vt65/Backup/MyFirstProjectDemo");
        try {
            Files.list(path).
                    filter(pathList-> pathList.toFile().isDirectory())
                    .forEach(System.out::println);
            //Read all files recursively

            Files.walk(path,2).filter(pathFile-> pathFile.toFile().isDirectory())
                    .forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
