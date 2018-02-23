package first;

public class Main {

  public static void main(String[] args) {
    StudentsGrade studentsGrade = new StudentsGrade();
    studentsGrade.add("Max", 4);
    studentsGrade.add("Oleg", 3);
    studentsGrade.add("Masha", 8);
    studentsGrade.add("Anton", 6);
    studentsGrade.add("Ira", 5);
    studentsGrade.add("Artem", 5);
    studentsGrade.add("Slavik", 4);
    studentsGrade.add("Serega", 7);
    studentsGrade.add("Alex", 3);

    studentsGrade.queueTraversy();

    System.out.println("* . * . * . * . * . * . * . * . * . * . *");

    studentsGrade.stackTraversy();
  }
}
