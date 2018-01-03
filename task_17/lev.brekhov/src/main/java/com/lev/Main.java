package com.lev;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    CustomList list = new CustomArrayList(20);
    list.add("lol");
    System.out.println(list.size());
    list.remove("lol");
    System.out.println(list.size());
  }
}
