package com.dima;

public class WrapperForChange {

  public static String changedString(String old) {

    if (!isStringIncludeChar(old, '.') && !isStringIncludeChar(old, '@')){
      return old;
    }
    String newString = "";
    for (int i = 0; i < old.length(); i++) {
      char ch = old.charAt(i);
      if ( ch != '@' && ch != '.') {
        newString += ch;
      }else if (ch == '@'){
        newString += "[at]";
      }else  {
        newString += "[dot].";
      }
    }
    return  newString;
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
