package com.hillel.studentmap;

import java.util.Map;
import java.util.TreeMap;

public class StudentMapMain {

  public static void main(String[] args) {

    Map<Student, Grade> studentsMap = new TreeMap<>();

    studentsMap.put(new Student("Dove", "John"), new Grade(5));
    studentsMap.put(new Student("Twain", "Mark"), new Grade(4));
    studentsMap.put(new Student("Depp", "John"), new Grade(3));
    studentsMap.put(new Student("Perry", "Kathy"), new Grade(5));
    studentsMap.put(new Student("Wats", "Melinda"), new Grade(2));

    for (Map.Entry<Student, Grade> pair : studentsMap.entrySet()) {
      System.out.println(pair.getKey() + " - " + pair.getValue());
    }

  }

}
