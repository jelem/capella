package com.dima;

public class WrapperForPalindromeMethod {

  public static boolean isPolindrome(String str) {

    int length = str.length();
    for (int i = 0; i < length / 2; i++) {
      if (str.charAt(i) != str.charAt(length - 1 - i)) {
        return false;
      }
    }
    return true;
  }

  public static int  howManyPolindromsAreInTheText(String str) {

    int count = 0;
    String[] buffer = str.split(",");
    for (int i = 0; i < buffer.length; i++) {
      buffer[i] = buffer[i].trim();
      if (isPolindrome(buffer[i])) {
        count++;
      }
    }
    return  count;
  }

  public static String sayCountOfPolindroms(String str){

    String result = "There are " + String.valueOf(howManyPolindromsAreInTheText(str)) +

        " palindromes in the text";
    return result;
  }
}
