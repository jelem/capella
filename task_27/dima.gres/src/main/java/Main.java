
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.util.ArrayList;
import java.util.Properties;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;


public class Main {

  public static void main(String[] args) throws IOException {
    Properties properties = new Properties();
    properties.load(Main.class.getResourceAsStream("/locations.properties"));

    String locStudents = properties.getProperty("locStudents") ;

    String xmlStudents = properties.getProperty("xmlStudents") ;

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

    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
        new FileInputStream(file), "UTF-8"))) {

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

    try (FileOutputStream fileOutputStream = new FileOutputStream(file);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter)) {

      bufferedWriter.write(begin);

      for (Student student : students) {
        bufferedWriter.write(String.valueOf(student));
      }

      bufferedWriter.write(end);

      bufferedWriter.close();

      outputStreamWriter.close();

      fileOutputStream.close();

    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }
}
