package com.sample.service.JavaPrograms;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ShortestSubStringLength {

    /*
     * Complete the 'shortestSubstring' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */
    final static int NO_OF_CHARS = 256;
  static int max_distinct_char(String str, int n) {

      // Initialize all character's count with 0
      int count[] = new int[NO_OF_CHARS];

      // Increase the count in array if a character
      // is found
      for (int i = 0; i < n; i++) {
        count[str.charAt(i)]++;
      }

      int max_distinct = 0;
      for (int i = 0; i < NO_OF_CHARS; i++) {
        if (count[i] != 0) {
          max_distinct++;
        }
      }

      return max_distinct;
    }
  static int max_distinct_char1(String s, int n) {

    if(s.isEmpty())
      return 0;

      Map<Character,Integer> map = new HashMap<>();

      for(int i=0;i<n;i++)
      {
        if(map.containsKey(s.charAt(i))) {
          int count = map.get(s.charAt(i));
          map.put(s.charAt(i),count+1);
        }
        else
        {
          map.put(s.charAt(i),1);
        }
      }

      return map.size();
    }

    public static int shortestSubstring(String s) {
      int n = s.length();

      int max_distinct = max_distinct_char(s, n);
      int minl = n;

      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {

          String subs = null;
          if(i<j)
            subs = s.substring(i, j);
          else
            subs = s.substring(j, i);
          int subs_lenght = subs.length();
          int sub_distinct_char = max_distinct_char(subs, subs_lenght);

          if (subs_lenght < minl && max_distinct == sub_distinct_char) {
            minl = subs_lenght;
          }
        }
      }
      return minl;

    }

  public static void main(String[] args) {
    int bab = ShortestSubStringLength.shortestSubstring("aabcce");
    System.out.print(bab);
   // int i = ShortestSubStringLength.max_distinct_char("bad", 0);

  }

  }

