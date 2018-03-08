package com.sample.service.JavaPrograms;

import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class TryOwnFunctionalInterface {

    interface functional{

        int add(int a,int b);
    }

    static Runnable  runnable = ()-> {

        System.out.println("Call to thread");
    };

    public static void main(String[] args) {

        Thread thread = new Thread(runnable);
        thread.start();

        functional functional = (s1,s2)->
             s1+s2;
        System.out.println(functional.add(5,5));

        Predicate<Integer> predicate = s1-> s1 > 12;

        System.out.println(predicate.test(13));

        BiFunction<Integer,Integer,Integer> function = (s1, s2)-> {
            return s1+s2;
        };

        System.out.println(function.apply(12,12));

        Optional<String> optionalS = Optional.ofNullable("hi");

    }


}
