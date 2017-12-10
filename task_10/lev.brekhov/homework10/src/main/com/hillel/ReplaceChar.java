package com.hillel;

public class ReplaceChar {

  public static void main(String[] args) {
    String s = "levonik99@gmail.com";
    s = s.replace("@", "[at]").replace(".", "[dot]");
    System.out.println(s);
  }
}