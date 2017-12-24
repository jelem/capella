package ua.pp.darknsoft;

import java.util.Iterator;

public class Main {

  public static void main(String[] args) {
    CustomList<String> ctm = new CustomArrayList<String>();

    ctm.add("1");
    ctm.add("2");
    ctm.add("3");
    ctm.add("4");
    ctm.add("5");
    ctm.add("6");
    ctm.add("7");
    ctm.add("8");
    ctm.add("9");

    ctm.add(4, "test");
    ctm.add(5, "test");
    ctm.add(5, "test");

    Iterator iterator = ctm.iterator();

    for (String str : ctm
        ) {
      System.out.println(str);
    }

  }

}
