package com.dima;

public class WrapperForChange {

  public static String changedString(String old) {

    if (!isStringIncludeChar(old, '.') && !isStringIncludeChar(old, '@')){
      return old;
    }
    return old.replace("@","[at]").replace(".","[dot].");
  }

  public static boolean isStringIncludeChar(String old, char ch) {

    for (int i = 0; i < old.length(); i++) {
      if (old.charAt(i) == ch) {
        return true;
      }
    }
    return false;
  }
}
