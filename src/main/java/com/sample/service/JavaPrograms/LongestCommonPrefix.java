package com.sample.service.JavaPrograms;

import java.util.stream.Stream;

public class LongestCommonPrefix {

  // Horizontal scan
  public String longestCommonPrefix(String[] strs) {

    if (strs.length == 0) return "";
      String prefix = strs[0];
      for (int i = 1; i < strs.length; i++)
        while (strs[i].indexOf(prefix) != 0) {
          prefix = prefix.substring(0, prefix.length() - 1);
          if (prefix.isEmpty()) return "";
        }
      return prefix;
    }

    //vertical scan
  public String longestCommonPrefix1(String[] strs) {
    if (strs == null || strs.length == 0) return "";
    for (int i = 0; i < strs[0].length() ; i++){
      char c = strs[0].charAt(i);
      for (int j = 1; j < strs.length; j ++) {
        if (i == strs[j].length() || strs[j].charAt(i) != c)
          return strs[0].substring(0, i);
      }
    }
    return strs[0];
  }
  public static void main(String[] args) {

  String[] input = new String[]{"flower","flow","flight"};
    LongestCommonPrefix l = new LongestCommonPrefix();

    System.out.print(input[0].indexOf("low"));

    l.longestCommonPrefix1(input);
  }
}

