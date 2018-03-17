package com.lev.readandwrite;

import com.lev.entity.Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReadFile {

  public static ArrayList<Student> read(File file) {

    String firstname = null;
    String lastname = null;
    int age = 0;
    Student student = new Student();
    ArrayList<Student> students = new ArrayList<>();

    try (InputStreamReader readFile = new InputStreamReader(new FileInputStream(file), "UTF8");
        BufferedReader bufferedReader = new BufferedReader(readFile)) {

      String line;

      int counter = 0;
      while ((line = bufferedReader.readLine()) != null) {

        if (counter == 0) {
          for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ') {
              lastname = line.substring(i + 1, line.length()).trim();
              student.setLastname(lastname);
              counter++;
              break;
            }
          }
          continue;
        }

        if (counter == 1) {
          for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ') {
              firstname = line.substring(i + 1, line.length()).trim();
              student.setFirstname(firstname);
              counter++;
              break;
            }
          }
          continue;
        }

        if (counter == 2) {
          for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ') {
              String num = (line.substring(i + 1, line.length()).trim());
              age = Integer.parseInt(num);
              student.setAge(age);
              counter++;
              break;
            }
          }
          continue;
        }

        if (counter == 3) {
          student = new Student(firstname, lastname, age);
          students.add(student);
          counter = 0;
        }
      }

    } catch (IOException ex) {
      ex.printStackTrace();
    }
    return students;
  }

}
