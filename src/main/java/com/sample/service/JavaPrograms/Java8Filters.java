package com.sample.service.JavaPrograms;

import io.swagger.models.auth.In;
import oracle.jdbc.proxy.annotation.Pre;

import javax.xml.ws.Holder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Filters {

    interface Operation {

        int add(int a, int b);
    }

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<String>() {{

            add("Neetha");
            add("Gulzar");
            add("Nikitha");
        }};

        System.out.println(stringList.stream().filter(item -> item.startsWith("N")).collect(Collectors.toList()));

        Predicate<String> integerPredicate = s -> {

            return s.startsWith("N");
        };

        Predicate<String> integerPredicate1 = integerPredicate.and(s -> s.contains("S"));

        System.out.println(integerPredicate1.test("N"));

        Operation addTwoNumbers = (a, b) -> a + b;
        System.out.println(addTwoNumbers.add(6, 8));

        /**
         *  Method reference Example
         *
         *
         *
         * */

        Map<Object, Object> example = new HashMap<>();

        example.put(2, "hi");
        example.put(6, "hiiii");
        example.put(8, "HIIIIII");

        System.out.println(example);

        example.put(2, "neet");
        System.out.println(example);
    }
}
