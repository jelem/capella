package first;

public class Main {

  public static void main(String[] args) {
    StudentsGraduate studentsGraduate = new StudentsGraduate();
    studentsGraduate.add("Max", 4);
    studentsGraduate.add("Oleg", 3);
    studentsGraduate.add("Masha", 8);
    studentsGraduate.add("Anton", 6);
    studentsGraduate.add("Ira", 5);
    studentsGraduate.add("Artem", 5);
    studentsGraduate.add("Slavik", 4);
    studentsGraduate.add("Serega", 7);
    studentsGraduate.add("Alex", 3);

    studentsGraduate.queueTraversy();
  }
}
