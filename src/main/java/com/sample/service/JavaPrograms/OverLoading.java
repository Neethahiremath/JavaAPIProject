package com.sample.service.JavaPrograms;

public class OverLoading {

  public void show(Integer integer) {
    System.out.printf("hi");
  }

  public void show(String s) {
    System.out.printf("hiii");
  }

  public void show(Object o) {
    System.out.printf("hiiiii");
  }

  public static void main(String[] args) {
    OverLoading obj = new OverLoading();

  //  obj.show(null); gives the compile time error

  }

}
