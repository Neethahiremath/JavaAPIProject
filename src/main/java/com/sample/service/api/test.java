package com.sample.service.api;

import com.sample.service.service.GreetingService;
import java.util.Collections;
import java.util.PriorityQueue;

public class test {

    public static void main(String[] args) {

        GreetingService greetingService = new GreetingService();


        System.out.println( greetingService.getGreetingMessage("neetha"));

        GreetingService greetingService1 = new GreetingService();

        System.out.println(greetingService1);

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.add(10);
        queue.add(50);
        queue.add(30);

        queue.forEach(x->System.out.print(x));




    }
}