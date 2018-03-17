package com.lev.task4;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Properties;

public class StudentTest {

  private static Student student = new Student("Bob", 20, "somePassword");

  @Test
  public void shouldSerialize() {
    try {
      Properties properties = new Properties();
      properties
          .load(getClass().getClassLoader().getResourceAsStream("student.properties"));
      File file = new File(properties.getProperty("serialize"));
      FileOutputStream fout = new FileOutputStream(file);
      ObjectOutputStream objectOutputStream = new ObjectOutputStream(fout);
      objectOutputStream.writeObject(student);
      objectOutputStream.close();
      fout.close();
    } catch (IOException ex) {
      ex.printStackTrace();
      assert false;
    }
    assert true;
  }

  @Test
  public void shouldDeserialize() {
    Student newStudent = null;
    try {
      Properties properties = new Properties();
      properties.load(getClass().getClassLoader().getResourceAsStream("student.properties"));
      File file = new File(properties.getProperty("deserialize"));
      FileInputStream fin = new FileInputStream(file);
      ObjectInputStream objectInputStream = new ObjectInputStream(fin);
      newStudent = (Student) objectInputStream.readObject();
      objectInputStream.close();
      fin.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    assertThat(newStudent, is(student));
  }

  @Test
  public void shouldEncode() {
    String encoded = Student.encryptPassword("somePassword");
    String expectedPassword = "wsqiTewwAsvh";
    assertThat(encoded, is(expectedPassword));
  }
}