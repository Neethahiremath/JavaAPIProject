package com.sample.service.JavaPrograms;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierAndConsumer {

    public static void main(String[] args) {

        Supplier<Person> personSupplier = ()-> {
            return new Person(12,"Neetha","Ambedkar Nagar");
        };

        System.out.println(personSupplier.get().getAge());

        Consumer<String> stringConsumer = (arg)-> {
            System.out.println(arg + "Ok");
        };
        stringConsumer.accept("Neetha");

        Consumer<String> consumer = (var)-> {
            System.out.println("Welocome"+var);

        };
        consumer.accept("Harry");

        consumer.andThen(stringConsumer).accept("Potter");

        Optional<Integer> optionalInteger = Optional.of(12);
        System.out.println(optionalInteger.get());

    }


}
