package com.hillel.breadth;


public class BreadthFirst {

  public static void main(String[] args) {

    BreadthFirstTree students = new BreadthFirstTree();

    students.add(1, "John");
    students.add(-5, "Kathy");
    students.add(3, "Alex");
    students.add(-9, "James");
    students.add(-3, "Dexter");
    students.add(0, "Hanna");

    students.traverseQueue();
    System.out.println();
    students.traverseStack();

  }
}
