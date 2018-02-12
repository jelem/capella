package com.hillel;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Properties;

public class StudentTest {

  private static Student student = new Student("Sergey", 20, "helloworld");

  @Test
  public void shouldSerialize() {

    try {
      Properties properties = new Properties();
      properties.load(getClass().getClassLoader().getResourceAsStream("path.properties"));
      String path = properties.getProperty("file");
      FileOutputStream fout = new FileOutputStream(path);
      ObjectOutputStream objectOutputStream = new ObjectOutputStream(fout);
      objectOutputStream.writeObject(student);
      objectOutputStream.close();
      fout.close();
    } catch (Exception ex) {
      ex.printStackTrace();
      assert false;
    }
    assert true;
  }

  @Test
  public void shouldDeserialize() {
    Student student1 = null;
    try {
      Properties properties = new Properties();
      properties.load(getClass().getClassLoader().getResourceAsStream("path.properties"));
      String path = properties.getProperty("file");
      FileInputStream fin = new FileInputStream(path);
      ObjectInputStream objectInputStream = new ObjectInputStream(fin);
      student1 = (Student) objectInputStream.readObject();
      objectInputStream.close();
      fin.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    assertThat(student1, is(student));
  }

  @Test
  public void shouldEncode() {
    String encoded = Student.encodePassword("helloworld");
    String expectedPassword = "dahhksknhz";
    assertThat(encoded, is(expectedPassword));
  }
}
