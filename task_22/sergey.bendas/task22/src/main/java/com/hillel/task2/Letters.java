package com.hillel.task2;

import java.util.HashSet;
import java.util.Set;

public class Letters {

  public static boolean isRepeat(String string) {
    Set<Character> set = new HashSet<>();
    for (char ch : string.toCharArray()) {
      set.add(ch);
    }
    return set.size() != string.length();
  }
}
