package com.sample.service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class CompletableFutureExample {

  public static void main(String[] args) {

    Executor executor = Executors.newFixedThreadPool(10);
    CompletableFuture<String> future = CompletableFuture
        .supplyAsync(() -> "Result of the asynchronous computation", executor);

    System.out.println(future.thenRunAsync(() -> Thread.currentThread().getName(), executor));
    System.out.println("hi" + Thread.currentThread().getName());

  }

}
