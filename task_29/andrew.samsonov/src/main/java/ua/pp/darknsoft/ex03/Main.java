package ua.pp.darknsoft.ex03;

import java.util.Map;
import java.util.TreeMap;

public class Main {

  public static void main(String[] args) {
    Map<Student, Rating> treeMap = new TreeMap<>();
    Student student01 = new Student("Jimi", "Hendrix", 45);
    Student student02 = new Student("Eric", "Clapton", 34);
    Student student03 = new Student("Richards", "Keith", 72);
    Student student04 = new Student("Carlos", "Santana", 58);
    Student student05 = new Student("Neil", "Young", 64);

    treeMap.put(student01, Rating.FIVE);
    treeMap.put(student02, Rating.TWO);
    treeMap.put(student05, Rating.FIVE);
    treeMap.put(student04, Rating.FOUR);
    treeMap.put(student03, Rating.THREE);

    treeMap.forEach((k, v) -> System.out.println("STUDENT: " + k + " RATING: " + v));
  }

}
