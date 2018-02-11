import java.io.*;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    String locStudents = "/home/dima/projects/java/task_27/dima.gres/src/main/resources/students.txt" ;

    String xmlStudents = "/home/dima/projects/java/task_27/dima.gres/src/main/resources/students_out.xml" ;

    ArrayList<Student> students =  readStudents(locStudents);

    for (Student student:students) {
      System.out.println(student);
    }

    writeStudents(xmlStudents, students);
  }

  public static ArrayList<Student> readStudents(String location) {
    final int LAST_NAME = 0;
    final int FIRST_NAME = 1;
    final int AGE = 2;
    final int SPACE = 3;

    ArrayList<Student> students = new ArrayList<>();
    File file = new File(location);

    try (FileReader fileReader = new FileReader(file);
         BufferedReader bufferedReader = new BufferedReader(fileReader)) {

      String line;
      int counter = 0;
      Student current = null;

      while ( (line = bufferedReader.readLine()) != null )  {
        counter %= 4;

        switch (counter) {
          case LAST_NAME:
            current = new Student();
            current.setLastname(line);
            break;

          case FIRST_NAME:
            current.setFirstname(line);
            break;

          case AGE:
            current.setAge(Integer.parseInt(line));
            break;

          case SPACE:
            students.add(current);
            break;
        }

        counter++;
      }

      students.add(current);

      fileReader.close();

      bufferedReader.close();

      return students;

    } catch (IOException ex) {
      ex.printStackTrace();
    }

    return null;
  }

  public  static  void writeStudents(String location, ArrayList<Student> students) {
    final String begin = "<students>";
    final String end = "\n</students>";


    File file = new File(location);

    try (FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

      bufferedWriter.write(begin);

      for (Student student : students) {
        String Lastname = student.getLastname();
        String Firsttname = student.getFirstname();
        int Age = student.getAge();

        bufferedWriter.write(String.valueOf(student));
      }

      bufferedWriter.write(end);

      bufferedWriter.close();

      fileWriter.close();

    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }
}
