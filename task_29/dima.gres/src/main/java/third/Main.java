package third;

import java.util.Map;
import java.util.TreeMap;

public class Main {

  public static void main(String[] args) {

    Map<Student, Integer> treeMap = new TreeMap<>((obj1, obj2) -> obj1.getName().compareTo(obj2.getName()));
    treeMap.put(new Student("Max Green", "Odesa", 34), 6);
    treeMap.put(new Student("Sergey Porvan", "Odesa", 36), 5);
    treeMap.put(new Student("Nikola Slizovsky", "Odesa", 33), 8);
    treeMap.put(new Student("Dima Gres", "Odesa", 34), 7);
    treeMap.put(new Student("Alex Goman", "Odesa", 35), 9);
    treeMap.put(new Student("Alla Cekan", "Odesa", 34), 4);

    for (Map.Entry<Student, Integer> students : treeMap.entrySet()) {
      System.out.println(students);
    }

  }
}
