package com.sample.service.JavaPrograms;

class Counter {

    public int count;

    public synchronized void increment() {
        count++;
    }
}

class Thread1 extends Thread {

    private Counter counter;

    Thread1(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            counter.increment();
        }
    }
}

class Thread2 extends Thread {

    private Counter counter;

    Thread2(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            counter.increment();
        }
    }
}

public class ThreadSynchronization {

    public static void main(String[] args) {

        Counter counter = new Counter();

        Thread1 thread1 = new Thread1(counter);
        Thread2 thread2 = new Thread2(counter);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("count" + counter.count);
    }
}
