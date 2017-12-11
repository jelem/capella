package com.hillel;

public class Email {

  public static void main(String[] args) {
  }


  public static String emailChange(String email) {
    return email.replace("@", " at ").replace(".", " dot ");
  }
}
