package com.sample.service.JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionTest{

  int num;

  public int getNum() {
    return num;
  }

  public CollectionTest(int num) {
    this.num = num;
  }

  public static void main(String[] args) {

    int [] arr ={12,10};
    arr=null;
    for(int i=0;i<arr.length;i++)
    {
      System.out.print(arr[i]);
    }
    System.out.print(arr.length);
    List<CollectionTest> b = Arrays.asList(new CollectionTest(1),new CollectionTest(2));
Collections.sort(b, Comparator.comparingInt(a -> a.num));
  }

}

