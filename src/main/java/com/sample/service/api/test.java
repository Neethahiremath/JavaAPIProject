package com.sample.service.api;

import com.sample.service.service.GreetingService;

public class test {

    public static void main(String[] args) {

        GreetingService greetingService = new GreetingService();


        System.out.println( greetingService.getGreetingMessage("neetha"));

        GreetingService greetingService1 = new GreetingService();

        System.out.println(greetingService1);

    }
}