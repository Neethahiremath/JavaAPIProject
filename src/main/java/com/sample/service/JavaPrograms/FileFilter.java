package com.sample.service.JavaPrograms;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FileFilter {

    public static void main(String[] args) {

        //annonomaous class instance
       /* java.io.FileFilter fileFilter = new java.io.FileFilter() {
            @Override
            public boolean accept(File pathname) {

                return pathname.getName().endsWith(".java");
            }
        };
*/

        //In java 8 we create the instance of annonomaous class as below

        java.io.FileFilter fileFilter = (File pathname) -> pathname.getName().endsWith("java");

        File fil = new File("/Users/");
        File[] files = fil.listFiles(fileFilter);

        for (File x : files) {
            System.out.println(x);
        }

        //Runnable Interface Impl with Java 8

        Runnable runnable = () -> {

            System.out.println(Thread.currentThread().getName());
        };

        Thread thread = new Thread(runnable);
        thread.start();

        //Comparator Interface Java 8

        Comparator<String> comparator = (s1, s2) -> Integer.compare(s1.length(), s2.length());

        List<String> arrayList = Arrays.asList("*", "*****", "***", "****");

        arrayList.sort(comparator);

        for (String list : arrayList) {
            System.out.println(list);
        }
    }
}
