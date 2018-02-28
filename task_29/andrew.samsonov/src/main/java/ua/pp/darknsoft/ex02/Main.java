package ua.pp.darknsoft.ex02;

import ua.pp.darknsoft.ex02.structure.Chair;
import ua.pp.darknsoft.ex02.structure.Department;
import ua.pp.darknsoft.ex02.structure.Faculty;
import ua.pp.darknsoft.ex02.structure.ProRectorate;
import ua.pp.darknsoft.ex02.structure.Rectorate;

import java.util.List;

public class Main {

  public static void main(String[] args) {
    Department rectorate = new Rectorate("MAIN RECTORATE");
    Department pro1 = new ProRectorate("Pro1");
    Department pro2 = new ProRectorate("Pro2");
    Department faculty1 = new Faculty("faculty1");
    Department faculty2 = new Faculty("faculty2");
    Department faculty3 = new Faculty("faculty3");
    Department kaf1 = new Chair("Kaf1");
    Department kaf2 = new Chair("Kaf2");
    Department kaf3 = new Chair("Kaf3");
    UniversityStructure us = new UniversityStructure();
    us.addDepartment(rectorate, null);

    us.addDepartment(pro1, rectorate);
    us.addDepartment(pro2, rectorate);

    us.addDepartment(faculty1, pro1);
    us.addDepartment(faculty2, pro2);
    us.addDepartment(faculty3, pro2);

    us.addDepartment(kaf1, faculty1);
    us.addDepartment(kaf2, faculty2);
    us.addDepartment(kaf3, faculty3);

    System.out.println("@@@@@@@@@@@@@");
    List<Department> test1 = us.getSubDepartments(faculty2);
    for (Department d1 : test1) {
      System.out.print(d1.getName() + " ");
    }
    System.out.println();
    List<Department> test2 = us.getSubDepartments(pro2);
    for (Department d2 : test2) {
      System.out.print(d2.getName() + " ");
    }

  }

}
