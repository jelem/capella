package com.hillel;

public class Task_1 {

  public static void main(String[] args) {
    // Task_1
    String str1 = "person@gmail.com";
    str1 = zamena(str1);
    System.out.println(str1);

    // Task_2
    String str2 = "internationalization localization cat elephant monitor";
    String[] arr = str2.split(" ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(sokrachenie(arr[i]) + " ");
    }

    // Task_3
    int countPal = 0;
    String str3 = "deleveled, evitative, cat, dog, deified";
    String[] arr1 = str3.split(",");
    for (int i = 0; i < arr1.length; i++) {
      arr1[i] = arr1[i].trim();
      if (isPalindrom(arr1[i])) {
        countPal++;
      }
    }
    System.out.println("\nThere are " + countPal + " palindromes in the text");

  }


  public static String zamena(String str) {
    str = str.replace("@", "[ at ]");
    str = str.replace(".", "[ dot ]");
    return str;
  }

  public static String sokrachenie(String str) {
    if (str.length() >= 4) {
      int count = str.length() - 2;
      str = str.charAt(0) + Integer.toString(count) + str.charAt(str.length() - 1);
    }
    return str;
  }

  public static boolean isPalindrom(String str) {
    int begin = 0;
    int end = str.length() - 1;
    int palin = 0;
    int count = 0;
    while (begin <= end) {
      if (str.charAt(begin) == str.charAt(end)) {
        count++;
      }
      palin++;
      begin++;
      end--;
    }
    if (palin == count) {
      return true;
    } else {
      return false;
    }
  }

}
