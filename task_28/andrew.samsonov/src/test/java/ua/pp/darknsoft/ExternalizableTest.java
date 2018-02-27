package ua.pp.darknsoft;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizableTest {

  @Test
  public void cloneStudent() {
    Student student = new Student("MyName", 25, "Odessa");
    Student anotherStudent = null;
    try {
      serializeStudent(student);
      anotherStudent = deserializeStudent();
    } catch (IOException ex) {
      ex.printStackTrace();
    } catch (ClassNotFoundException ex) {
      ex.printStackTrace();
    }
    assertThat(anotherStudent, is(student));
  }

  @Test
  public void cloneStudent2() {
    Student student2 = new Student("Ivanov", 48, "Aa Zz");
    Student anotherStudent2 = null;
    try {
      serializeStudent(student2);
      anotherStudent2 = deserializeStudent();
    } catch (IOException ex) {
      ex.printStackTrace();
    } catch (ClassNotFoundException ex) {
      ex.printStackTrace();
    }
    assertThat(anotherStudent2, is(student2));
  }

  public static void serializeStudent(Student student) throws IOException {
    FileOutputStream fout = new FileOutputStream("\\student.ser");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fout);
    objectOutputStream.writeObject(student);
    fout.close();
    objectOutputStream.close();
  }

  public static Student deserializeStudent() throws IOException, ClassNotFoundException {
    FileInputStream fin = new FileInputStream("\\student.ser");
    ObjectInputStream objectInputStream = new ObjectInputStream(fin);
    Student newStudent = (Student) objectInputStream.readObject();
    fin.close();
    objectInputStream.close();
    return newStudent;
  }

}
