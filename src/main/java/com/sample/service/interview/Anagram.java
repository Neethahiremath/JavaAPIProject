package com.sample.service.interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram {

  static boolean areAnagram(String str1, String str2) {
    // Create a count array and initialize all values as 0

    if (str1.length() != str2.length()) {
      return false;
    }
    int count1 = 0;
    int count2 = 0;

    for (int i = 0; i < str1.length();
        i++) {
      count1 = count1 + (int) str1.charAt(i);
      count2 = count2 + (int) str2.charAt(i);
    }

    return count1 == count2;
  }

  public static void main(String[] args) {

    List<String> text = new ArrayList<>();

    text.add("code");
    text.add("doce");
    text.add("ecod");
    text.add("framer");
    text.add("frame");

//    int s=text.size();
//    boolean a[] = new boolean[s];
//    for (int j = 0; j <s;j++){
//      a[j]=false;
//    }
//
//    int j=0;
//    while (j<s){
//      String current = text.get(j);
//      for(int i =j+1;i<s;i++){
//        if(a[i]==false){
//          if (areAnagram(current, text.get(i))){
//            a[i]=true;
//          }
//        }
//      }
//      j++;
//      while(j<s&&a[j]==true)
//        j++;
//    }
//
    List<String> result = new ArrayList<>();
//    for (j = 0; j <s;j++){
//      if(a[j]=false)
//        result.add(text.get(j));
//    }

    Map<String,Integer> map = new HashMap<>();

   text.forEach(en->{
     map.put(en,0);
   });

    for(int i =text.size()-1;i>=0;i--) {
      for (int j = 0; j <=i-1;j++) {
        if (areAnagram(text.get(i), text.get(j))) {

          Integer val = map.get(text.get(i));
          map.put(text.get(i),1);
        }
      }

    }

    map.forEach((key,value)->{
      if(value==1)
        text.remove(key);
    });

    text.sort(Comparator.naturalOrder());

    text.forEach(en-> System.out.print(en));
  }

}
