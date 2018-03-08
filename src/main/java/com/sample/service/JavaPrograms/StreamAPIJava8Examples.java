package com.sample.service.JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamAPIJava8Examples {

    public Integer getOptionalExample(Integer input)
    {

        Optional<Integer> optionalInteger = Optional.ofNullable(input);
         System.out.println(optionalInteger.orElse(0));
         return optionalInteger.orElse(0);
    }
    public  String getMyDefault() {
        System.out.println("Getting Default Value");
        return "Default Value";
    }

    public void optionalOrElseOrElseGetExample()
    {
        //Optional orElse orElseGet difference

        Optional<String> stringOptional = Optional.ofNullable("hi");
        stringOptional.orElse(getMyDefault());
        stringOptional.orElseGet(this::getMyDefault);
    }

    public static void main(String[] args) {

        //ForEach function in Java -- method reference -- foreach is default method in interface
        List<String> stringList = Arrays.asList("one", "two", "three", "four", "Five");
        stringList.forEach(System.out::println);

        //Consumer Interface
        Consumer<String> s1 = System.out::println;
        List<String> result = new ArrayList<>();
        Consumer<String> s2 = result::add;

        //andThen function in Consumer
        stringList.forEach(s1.andThen(s2));

        System.out.println(result.size());

        //StreamAPI

        List<Person> personList = Arrays.asList(Person.aPerson().age(12).build(), Person.aPerson().age(15).build(),
                                                Person.aPerson().age(45).build(), Person.aPerson().age(30).build());

        personList.stream().filter(age -> age.age > 20).forEach(System.out::println);

        // using peek will return streams

        Stream<Person> peek = personList.stream().
                peek(System.out::println).
                filter(item -> item.age > 20).
                peek(System.out::println);

        System.out.println(peek); // this will have stream of objects that results nothing but a object. intermediator operation

        //flatMap


        //Optional
        Integer optionalExample = new StreamAPIJava8Examples().getOptionalExample(12);
        System.out.println(optionalExample);

        //Optional with null parameter to ofNullable
        String name = null;
        Optional<String> opt = Optional.ofNullable(name);
        System.out.println(opt);

        // Optional empty
        Optional<String> optionalS = Optional.empty();
        System.out.println(optionalS);

        new StreamAPIJava8Examples().optionalOrElseOrElseGetExample();


    }
}
