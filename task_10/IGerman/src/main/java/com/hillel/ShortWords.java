package com.hillel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ShortWords {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
    String str = reader.readLine();
    reader.close();
    makingShortWords(str);
  }

  public static String makingShortWords(String str) {

    String[] arStr = str.split(" ");

    for (int i = 0; i < arStr.length; i++) {
      if (arStr[i].length() > 4) {
        char[] arChar = arStr[i].toCharArray();
        arStr[i] =
            arChar[0] + String.valueOf(arStr[i].length() - 2) + arChar[arStr[i].length() - 1];
      }
    }

    StringBuilder builder = new StringBuilder();
    for (String string : arStr) {
      builder.append(string + " ");
    }
    return builder.toString().trim();
  }
}
