package com.lev.task4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

  public static void main(String[] args) throws IOException, ClassNotFoundException {

    Student student = new Student("Bob", 20, "somePassword");
    serializeStudent(student);

    Student student1 = deserializeStudent();

    System.out.println(student1);
  }

  public static void serializeStudent(Student student) throws IOException {
    FileOutputStream fout = new FileOutputStream(
        "E:\\Projects\\Capella\\capella\\task_28\\lev.brekhov\\src\\main\\java\\com\\lev\\task4\\files\\student.ser");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fout);
    objectOutputStream.writeObject(student);
  }

  public static Student deserializeStudent() throws IOException, ClassNotFoundException {
    FileInputStream fin = new FileInputStream(
        "E:\\Projects\\Capella\\capella\\task_28\\lev.brekhov\\src\\main\\java\\com\\lev\\task4\\files\\student.ser");
    ObjectInputStream objectInputStream = new ObjectInputStream(fin);
    return (Student) objectInputStream.readObject();
  }
}
