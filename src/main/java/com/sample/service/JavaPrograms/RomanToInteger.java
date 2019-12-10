package com.sample.service.JavaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RomanToInteger extends Thread {

  public int romanToInt(String s) {

      Map<String,Integer> storeValues = new HashMap<>();
      int sum=0;
      storeValues.put("I",1);
      storeValues.put("V",5);
      storeValues.put("X",10);
      storeValues.put("L",50);
      storeValues.put("C",100);
      storeValues.put("D",500);
      storeValues.put("M",1000);
      storeValues.put("IV",4);
      storeValues.put("IX",9);
      storeValues.put("XL",40);
      storeValues.put("XC",90);
      storeValues.put("CD",400);
      storeValues.put("CM",900);

      for(int i =s.length()-1;i>=0;i--)
      {

        if((i-1>=0) &&( (s.charAt(i)=='V' && s.charAt(i-1)=='I' )|| (s.charAt(i)=='X' && s.charAt(i-1)=='I') || (s.charAt(i)=='L' && s.charAt(i-1)=='X' )||(s.charAt(i)=='C' && s.charAt(i-1)=='X' )||(s.charAt(i)=='D' && s.charAt(i-1)=='C') ||(s.charAt(i)=='M' && s.charAt(i-1)=='C')))
        {
          sum= sum+  storeValues.get(String.valueOf(s.charAt(i-1))+String.valueOf(s.charAt(i)));
          i--;
        }
        else
          sum= sum+  storeValues.get(String.valueOf(s.charAt(i)));
      }
      return sum;

  }

  public static void main(String[] args) {
    ExecutorService ex;
    RomanToInteger obj = new RomanToInteger();
    System.out.print( obj.romanToInt("MCMXCIV"));
  }

  @Override
  public void run() {
    System.out.print(Thread.currentThread().getId());
  }
}
