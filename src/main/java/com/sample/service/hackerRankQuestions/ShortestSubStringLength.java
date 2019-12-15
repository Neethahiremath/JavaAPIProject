package com.sample.service.hackerRankQuestions;

import java.util.HashMap;
import java.util.Map;

public class ShortestSubStringLength {

  static int max_distinct_char(String s, int n) {

    if (s.isEmpty())
      return 0;
    Map<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < n; i++) {
      if (map.containsKey(s.charAt(i))) {
        int count = map.get(s.charAt(i));
        map.put(s.charAt(i), count + 1);
      } else {
        map.put(s.charAt(i), 1);
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
        if (i < j)
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
}
