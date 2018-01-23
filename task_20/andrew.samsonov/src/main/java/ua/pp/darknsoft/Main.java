package ua.pp.darknsoft;

import ua.pp.darknsoft.strategy.SortByAddress;
import ua.pp.darknsoft.strategy.SortByAge;
import ua.pp.darknsoft.strategy.SortByAgeReverse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Address adr1 = new Address.Builder("Odessa1").houseNumber(4).build();
    Address adr2 = new Address.Builder("Odessa1").houseNumber(3).build();
    Address adr3 = new Address.Builder("Odessa2").houseNumber(1).build();

    Student st1 = new Student("John1", 12, adr1);
    Student st2 = new Student("John", 15, adr2);
    Student st3 = new Student("John", 19, adr3);

    List<Student> list = new ArrayList<>();

    list.add(st1);
    list.add(st2);
    list.add(st3);
    System.out.println("###################### Natural ordering NAME ############################");
    Collections.sort(list);
    for (Student adr : list) {
      System.out.println(adr);
    }
    System.out.println("######################### Sort By Age ##################################");
    Collections.sort(list, new SortByAge());
    for (Student adr : list) {
      System.out.println(adr);
    }
    System.out.println("#################### Sort By Age REVERSE ###############################");
    Collections.sort(list, new SortByAgeReverse());
    for (Student adr : list) {
      System.out.println(adr);
    }
    System.out.println("######################### Sort By Address ###############################");
    Collections.sort(list, new SortByAddress());
    for (Student adr : list) {
      System.out.println(adr);
    }
    System.out.println("###################### Sort by Name REVERSE #############################");
    Collections.sort(list, new Comparator<Student>() {
      @Override
      public int compare(Student o1, Student o2) {
        return o2.getName().compareTo(o1.getName());
      }
    });
    for (Student adr : list) {
      System.out.println(adr);
    }

  }

}
