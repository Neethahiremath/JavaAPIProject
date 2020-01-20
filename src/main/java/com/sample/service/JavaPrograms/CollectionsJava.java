package com.sample.service.JavaPrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionsJava {

  /*
    advantage of using generics
   * strong type checking of compile time ex: List list = new ArrayList(); list.add(1); list.add("hello");
   * elimination of type casting
   * ex: List list = new ArrayList();
   * list.add("q");
   * list.add("w");
   * String s = list.get(0); // compile time error (can not convert object to string) if its List<String> it works
   * Generic Algo

   * public void pushAll(Collection<? extends T>)
   * public collection<? super T>
   * add uses extends
   * remove uses super
   * */

  public <T extends Number & Comparable> long getCount(Collection<T> items, T item) {
    return items.stream().filter(ite -> ite.compareTo(item) > 1).count();
  }

  public static void main(String[] args) {

    List list = new ArrayList();
    list.add("1");
    list.add("2");
    List<Number> list2 = new ArrayList<>();

    // String s= list.get(0);

    List<String> list1 = new ArrayList();
    list1.add("1");
    list1.add("2");

    String s = list1.get(0);

  }

}
