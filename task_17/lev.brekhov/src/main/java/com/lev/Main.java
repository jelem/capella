package com.lev;

public class Main {

  public static void main(String[] args) {
    CustomList list = new CustomArrayList(20);
    list.add("first elem");
    list.add("sec elem");
    list.add("third elem");
    list.add(2, "third elem");
    list.contains("sec elem");
    System.out.println(list.get(2));
    System.out.println(list.indexOf("third elem"));
    list.set(2, "second elem");
    System.out.println(list.size());
    System.out.println(list.remove(1));
    list.remove("first elem");
    System.out.println(list.size());

    for (Object elem : list) {
      System.out.println(elem);
    }

    list.clear();
    System.out.println(list.size());
  }
}
