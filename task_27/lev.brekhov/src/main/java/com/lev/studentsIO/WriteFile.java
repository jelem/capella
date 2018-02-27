package com.lev.studentsIO;

import com.lev.entity.Student;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteFile {

  public static void write(ArrayList<Student> students, String path) {

    try (FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
      bufferedWriter.write("<students>");
      bufferedWriter.newLine();
      for (Student student : students) {
        bufferedWriter.write("  <student>");
        bufferedWriter.newLine();
        bufferedWriter.write("    <lastname>" + student.getLastname() + "</lastname>");
        bufferedWriter.newLine();
        bufferedWriter.write("    <firstname>" + student.getFirstname() + "</firstname>");
        bufferedWriter.newLine();
        bufferedWriter.write("    <age>" + student.getAge() + "</age>");
        bufferedWriter.newLine();
        bufferedWriter.write("  </student>");
        bufferedWriter.newLine();
      }
      bufferedWriter.write("</students>");
      bufferedWriter.newLine();
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

}
