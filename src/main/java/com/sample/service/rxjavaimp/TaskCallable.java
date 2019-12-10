package com.sample.service.rxjavaimp;

import java.util.concurrent.Callable;

public class TaskCallable implements Callable<Integer> {

  private Integer value;

  TaskCallable(Integer value) {
    this.value = value;
  }

  @Override
  public Integer call() throws Exception {
    System.out.println("Processing " + value + "  in thread " + Thread.currentThread().getName());
    Thread.sleep(200);
    return value;
  }
}
