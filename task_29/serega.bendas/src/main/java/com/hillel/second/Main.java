package com.hillel.second;

public class Main {

  private static final String RECTORATE = "Rectorate";
  private static final String SCIENCE_PRORECTORATE = "Science prorectorate";
  private static final String HUMANITIES_PRORECTORATE = "Humanities prorectorate";
  private static final String MATH_PHYSICS_FACULTY = "Math-Physics Faculty";
  private static final String COMPUTER_FACULTY = "Computer Faculty";
  private static final String LITERATURE_FACULTY = "Literature Faculty";
  private static final String PHYSICS = "Physics";
  private static final String INTERNET_TECHNOLOGIES = "Internet Technologies";
  private static final String PROGRAMMING = "Programming";
  private static final String HISTORY_FACULTY = "History Faculty";

  public static void main(String[] args) {

    Departments uni = createUni();

    printDepartmentsByLevel(uni);
    System.out.println();
    printEmployees(uni, COMPUTER_FACULTY);
    System.out.println();
    printUpperMasters(uni, PROGRAMMING);
  }

  private static void printUpperMasters(Departments uni, String departmentName) {
    uni.printUpperMasters(departmentName);
  }

  private static void printEmployees(Departments uni, String departmentName) {
    uni.printEmployees(departmentName);
  }

  private static void printDepartmentsByLevel(Departments uni) {
    uni.traverseDepartments();
  }

  private static Departments createUni() {
    Employee wick = new Employee("John Wick", 40);
    Department rectorate = new Rectorate(RECTORATE, wick);
    rectorate.addEmployee(new Employee("Clone 1", 30));
    rectorate.addEmployee(new Employee("Clone 2", 30));
    rectorate.addEmployee(new Employee("Clone 3", 30));

    Employee einstein = new Employee("Albert Einstein", 50);
    Department science = new Prorectorate(SCIENCE_PRORECTORATE, einstein, (Rectorate) rectorate);
    science.addEmployee(new Employee("Clone 4", 30));
    science.addEmployee(new Employee("Clone 5", 30));
    science.addEmployee(new Employee("Clone 6", 30));

    Employee bond = new Employee("James Bond", 35);
    Department humanities = new Prorectorate(HUMANITIES_PRORECTORATE, bond,
        (Rectorate) rectorate);
    humanities.addEmployee(new Employee("Clone 7", 30));
    humanities.addEmployee(new Employee("Clone 8", 30));

    Employee stark = new Employee("Tony Stark", 45);
    Department mathPhysics = new Faculty(MATH_PHYSICS_FACULTY, stark, (Prorectorate) science);
    mathPhysics.addEmployee(new Employee("Clone 9", 30));
    mathPhysics.addEmployee(new Employee("Clone 23", 30));

    Employee jobs = new Employee("Steve Jobs", 60);
    Department computers = new Faculty(COMPUTER_FACULTY, jobs, (Prorectorate) science);
    computers.addEmployee(new Employee("Clone 17", 30));
    computers.addEmployee(new Employee("Clone 18", 30));
    computers.addEmployee(new Employee("Clone 19", 30));

    Employee rowling = new Employee("Joanne Rowling", 55);
    Department literature = new Faculty(LITERATURE_FACULTY, rowling, (Prorectorate) humanities);
    literature.addEmployee(new Employee("Clone 15", 30));
    literature.addEmployee(new Employee("Clone 16", 30));

    Employee musk = new Employee("Elon Musk", 46);
    Department physics = new Chair(PHYSICS, musk, (Faculty) mathPhysics);
    physics.addEmployee(new Employee("Clone 10", 30));
    physics.addEmployee(new Employee("Clone 11", 30));

    Employee zuckerberg = new Employee("Mark Zuckerberg", 30);
    Department internet = new Chair(INTERNET_TECHNOLOGIES, zuckerberg, (Faculty) computers);
    internet.addEmployee(new Employee("Clone 20", 30));
    internet.addEmployee(new Employee("Clone 21", 30));
    internet.addEmployee(new Employee("Clone 22", 30));

    Employee gates = new Employee("Bill Gates", 60);
    Department programming = new Chair(PROGRAMMING, gates, (Faculty) computers);
    programming.addEmployee(new Employee("Clone 12", 30));
    programming.addEmployee(new Employee("Clone 13", 30));

    Employee nobel = new Employee("Alfred Nobel", 65);
    Department history = new Faculty(HISTORY_FACULTY, nobel, (Prorectorate) humanities);
    history.addEmployee(new Employee("Clone 14", 30));
    history.addEmployee(new Employee("Clone 24", 30));

    Departments departments = new Departments(rectorate);
    departments.add(science);
    departments.add(humanities);
    departments.add(mathPhysics);
    departments.add(computers);
    departments.add(literature);
    departments.add(physics);
    departments.add(internet);
    departments.add(programming);
    departments.add(history);

    return departments;
  }

}
