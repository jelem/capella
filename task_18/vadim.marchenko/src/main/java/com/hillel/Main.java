package com.hillel;

import java.util.Stack;

public class Main {

  public static void main(String[] args) {

     BracketsSort sorter = new BracketsSort();

    System.out.println(sorter.isArranged("((({}()[])))"));
    System.out.println(sorter.isArranged("(({)})"));
    System.out.println(sorter.isArranged("{([])}"));
  }

}
