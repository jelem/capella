package com.hillel;

public class Main {

  public static void main(String[] args) {

    CustomList list = new CustomList();

    list.add("Vadim");
    list.add("Pasha");
    list.add("Lida");
    list.add("Sergei");
    list.add("Kostya");
    list.add("Lada");

    for (String element : list) {
      System.out.println(element);
    }

  }

}
