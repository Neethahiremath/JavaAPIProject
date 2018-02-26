package com.sample.service;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class ThreadImplementation extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 6; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());

        ThreadImplementation runnable = new ThreadImplementation();
        ThreadGroup threadGroup = new ThreadGroup("Group A");
        Thread firstThread = new Thread(threadGroup, runnable, "one");
        firstThread.start();
        Thread secondThread = new Thread(threadGroup, runnable, "second");
        secondThread.start();
        System.out.println("Thread Group Name: " + threadGroup.getName());
        threadGroup.list();

        try {
            ThreadImplementation objectCreationWithInstance = ThreadImplementation.class.getConstructor().newInstance();
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
