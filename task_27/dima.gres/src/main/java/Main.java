
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
    final int LastName = 0;
    final int FirstName = 1;
    final int Age = 2;
    final int Space = 3;

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
          case LastName:
            current = new Student();
            current.setLastname(line);
            break;

          case FirstName:
            current.setFirstname(line);
            break;

          case Age:
            current.setAge(Integer.parseInt(line));
            break;

          case Space:
            students.add(current);
            break;

          default:
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
