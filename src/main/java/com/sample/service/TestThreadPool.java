package com.sample.service;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 10; i++) {
            Runnable worker = new WorkerThread("" + i);

            executorService.execute(worker);
        }

        while (!executorService.isTerminated()) {
        }

        System.out.println("Finished all threads");
    }
}

