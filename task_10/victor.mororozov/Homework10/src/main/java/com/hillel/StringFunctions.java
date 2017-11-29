package com.hillel;

public class StringFunctions {

  public static String emailConvert(String s) {
    s = s.replace("@", "[ at ]");
    s = s.replace(".", "[ dot ]");
    return s;
  }

  public static String shorteningString(String str) {
    String s = "";
    String[] strArray = str.split(" ");
    for (String substr : strArray) {
      s = s.concat(shorteningWord(substr)).concat(" ");
    }
    return s.substring(0, s.length() - 1);
  }

  public static String shorteningWord(String str) {
    String result = "";
    if (str.length() > 3) {
      return result = str.substring(0, 1) + (str.length() - 2) + str.substring(str.length() - 1);
    }
    return str;
  }

  public static String countPalimdroms(String str) {
    int count = 0;
    String[] strArray = str.split(",");

    for (int i = 0; i < strArray.length; i++) {
      strArray[i] = strArray[i].trim();
    }

    for (String substr : strArray) {
            if (isPalindrom(substr)) {
        count++;
      }
    }
    return "There are " + count + " palindromes in the text";
  }

  private static boolean isPalindrom(String str) {
    char[] chArray = str.toCharArray();
    for (int i = 0; i < chArray.length >> 1; i++) {
      if (chArray[i] != chArray[chArray.length - i - 1]) {
        return false;
      }
    }
    return true;
  }
}
