package com.lev.readandwrite;

import com.lev.entity.Student;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class WriteFile {

  public static void write(ArrayList<Student> students, File file) {

    try (OutputStreamWriter fileWriter = new OutputStreamWriter(new FileOutputStream(file), "UTF8");
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
