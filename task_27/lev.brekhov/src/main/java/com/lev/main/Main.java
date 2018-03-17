package com.lev.main;

import com.lev.entity.Student;
import com.lev.readandwrite.ReadFile;
import com.lev.readandwrite.WriteFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

public class Main {

  public static void main(String[] args) throws IOException {

    Properties properties = new Properties();
    properties.load(Main.class.getClassLoader().getResourceAsStream("file.properties"));
    File fin = new File(properties.getProperty("input"));
    ArrayList<Student> list = ReadFile.read(fin);

    for (Student student : list) {
      System.out.println(student);
    }

    File fout = new File(properties.getProperty("output"));
    WriteFile.write(list, fout);
  }
}