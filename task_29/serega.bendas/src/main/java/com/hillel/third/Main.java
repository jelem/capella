package com.hillel.third;

import java.util.Map;
import java.util.TreeMap;

public class Main {

  public static void main(String[] args) {
    Map<Student, Grade> map = new TreeMap<>((student1, student2) -> {
      if (student1.getName().equals(student2.getName())) {
        return Integer.compare(student1.getAge(), student2.getAge());
      } else {
        return student1.getName().compareTo(student2.getName());
      }
    });

    map.put(new Student("Sergey Bendas", 20), Grade.EXCELLENT);
    map.put(new Student("Bob Marley", 30), Grade.GOOD);
    map.put(new Student("Sergey Bendas", 50), Grade.NORM);

    System.out.println(map);
  }

}
