package com.lev.main;

import com.lev.entity.Student;
import com.lev.studentsIO.ReadFile;
import com.lev.studentsIO.WriteFile;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    String path = "E:\\Projects\\Capella\\capella\\task_27\\lev.brekhov\\src\\main\\java\\com\\lev\\files\\students.txt";

    ArrayList<Student> list = ReadFile.read(path);
    WriteFile.write(list, "E:\\Projects\\Capella\\capella\\task_27\\lev.brekhov\\src\\main\\java\\com\\lev\\files\\students_out.xml");
  }
}