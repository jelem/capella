package com.hillel.student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Properties;

public class Main {

  public static void main(String[] args) {
    Student student = new Student("John", 35, "secret");

    serializeStudent(student);

    Student student2 = deserializeStudent();
    System.out.println(student2);
    System.out.println(student.equals(student2));
  }

  public static void serializeStudent(Student student) {
    Properties properties = new Properties();
    String file;
    FileOutputStream fileOutputStream = null;
    ObjectOutputStream objectOutputStream = null;

    try {
      properties.load(Main.class.getClassLoader().getResourceAsStream("ser.property"));

      file = properties.getProperty("serST");

      fileOutputStream = new FileOutputStream(file);
      objectOutputStream = new ObjectOutputStream(fileOutputStream);

      objectOutputStream.writeObject(student);
    } catch (IOException ex) {
      ex.printStackTrace();
    } finally {
      try {
        objectOutputStream.close();
        fileOutputStream.close();
      } catch (IOException ex) {
        ex.printStackTrace();
      } catch (NullPointerException ex) {
        ex.printStackTrace();
      }
    }
  }

  public static Student deserializeStudent() {

    Properties properties = new Properties();
    String file;
    Student student = null;
    FileInputStream fileInputStream = null;
    ObjectInputStream objectInputStream = null;
    try {
      properties.load(Main.class.getClassLoader().getResourceAsStream("ser.property"));

      file = properties.getProperty("serST");

      fileInputStream = new FileInputStream(file);
      objectInputStream = new ObjectInputStream(fileInputStream);
      student = (Student) objectInputStream.readObject();

    } catch (IOException ex) {
      ex.printStackTrace();
    } catch (ClassNotFoundException ex) {
      ex.printStackTrace();
    } finally {
      try {
        objectInputStream.close();
        fileInputStream.close();
      } catch (IOException ex) {
        ex.printStackTrace();
      } catch (NullPointerException ex) {
        ex.printStackTrace();
      }
    }
    return student;
  }
}
