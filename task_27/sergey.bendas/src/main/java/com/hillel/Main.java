package com.hillel;

import com.hillel.Student.Builder;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


public class Main {

  public static void main(String[] args) {

    try {
      Properties properties = new Properties();
      properties.load(Main.class.getClassLoader().getResourceAsStream("filePaths.properties"));
      String pathFrom = properties.getProperty("file1");
      String pathTo = properties.getProperty("file2");

      List<String> fileContent = readFile(pathFrom);
      List<Student> students = convertToStudentsList(fileContent);
      writeStudentsAsXML(students, pathTo);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

  }

  private static void writeStudentsAsXML(List<Student> students, String pathTo) {
    try (BufferedWriter bufferedWriter = new BufferedWriter(
        new OutputStreamWriter(new FileOutputStream(pathTo), "UTF-8"))) {

      bufferedWriter.write("<students>");
      bufferedWriter.newLine();
      for (Student student : students) {
        bufferedWriter.write("  <student>");
        bufferedWriter.newLine();
        if (student.getLastName() != null) {
          bufferedWriter.write("    <lastname>" + student.getLastName() + "</lastname>");
          bufferedWriter.newLine();
        }
        if (student.getFirstName() != null) {
          bufferedWriter.write("    <fistname>" + student.getFirstName() + "</firstname>");
          bufferedWriter.newLine();
        }
        if (student.getAge() != null) {
          bufferedWriter.write("    <age>" + student.getAge() + "</age>");
          bufferedWriter.newLine();
        }
        bufferedWriter.write("  </student>");
        bufferedWriter.newLine();
      }
      bufferedWriter.write("</students>");
      bufferedWriter.newLine();
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  private static List<Student> convertToStudentsList(List<String> fileContent) {

    List<Student> students = new ArrayList<>();
    fileContent.add("");
    Student.Builder builder = new Builder();
    for (String string : fileContent) {
      String[] strings = string.split(":");
      if (strings.length == 1) {
        Student student = builder.build();
        if (student != null) {
          students.add(student);
        }
        builder.firstName(null)
            .lastName(null)
            .age(null);
      } else {
        String parameter = strings[0];
        switch (parameter) {
          case "LastName":
            String lastName = strings[1].trim();
            builder.lastName(lastName);
            break;
          case "FirstName":
            String firstName = strings[1].trim();
            builder.firstName(firstName);
            break;
          case "Age":
            int age = Integer.parseInt(strings[1].trim());
            builder.age(age);
            break;
          default:
            break;
        }
      }
    }
    return students;
  }


  private static List<String> readFile(String pathFrom) {
    List<String> text = new ArrayList<>();

    try (BufferedReader bufferedReader = new BufferedReader(
        new InputStreamReader(
            new FileInputStream(pathFrom), "UTF-8"))) {

      String line;
      while ((line = bufferedReader.readLine()) != null) {
        text.add(line);
      }
      return text;
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    return null;
  }
}
