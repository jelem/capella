package com.hillel.student;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class StudentTest {

  @Test

  public void shouldSerializeDeserialize() {
    Student student = new Student("John", 35, "secret");

    Main.serializeStudent(student);
    Student student2 = Main.deserializeStudent();

    assertThat(student2, is(student));
  }

  @Test

  public void shouldSerializeDeserialize2() {
    Student student = new Student("Bob", 40, "zelmey");

    Main.serializeStudent(student);
    Student student2 = Main.deserializeStudent();

    assertThat(student2, is(student));
  }
}