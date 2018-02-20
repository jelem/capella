package ua.pp.darknsoft.util;

import ua.pp.darknsoft.Student;
import ua.pp.darknsoft.exception.WrongSplitterException;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoadStudentsFromFileToList {

  private LoadStudentsFromFileToList() {
    throw new AssertionError();
  }

  public static List<Student> getStudents(String fileName) {
    List<Student> studentList = new ArrayList<>();
    Map<String, String> studentMap = new HashMap<>();
    int fieldCount = 0;
    try (BufferedReader reader = new BufferedReader(
        new InputStreamReader(
            new FileInputStream(fileName), StandardCharsets.UTF_8))) {
      String line;

      while ((line = reader.readLine()) != null) {
        if (!line.isEmpty()) {
          if (!line.contains(":")) {
            throw new WrongSplitterException("Не верный разделитель : Или отсутствует");
          }
          studentMap.put(line.split(":")[0], line.split(":")[1].trim());
          fieldCount++;
        }
        if ( fieldCount == 3) {
          try {
            studentList.add(new Student(studentMap.get("Firstname"), studentMap.get("Lastname"),
                Integer.parseInt(studentMap.get("Age"))));
            fieldCount = 0;
          } catch (NumberFormatException ex) {
            ex.printStackTrace();
          }
        }

      }

    } catch (IOException ex) {
      ex.printStackTrace();
    }

    return studentList;
  }
}
