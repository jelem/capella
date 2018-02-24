package com.hillel.student;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Objects;
import java.util.Properties;

public class Student implements Externalizable {

  private static final long serialVersionUID = -2;

  private String firstName;
  private int age;
  private String password;

  public Student() {
  }

  public Student(String firstName, int age, String password) {
    this.firstName = firstName;
    this.age = age;
    this.password = password;
  }


  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Student)) {
      return false;
    }
    Student student = (Student) obj;
    return age == student.age
        && Objects.equals(firstName, student.firstName)
        && Objects.equals(password, student.password);
  }

  @Override
  public int hashCode() {

    return Objects.hash(firstName, age, password);
  }

  @Override
  public void writeExternal(ObjectOutput out) throws IOException {
    out.writeObject(firstName);
    out.writeInt(age);
    String encoded = encodePassword(password);
    out.writeObject(encoded);
  }

  private String encodePassword(String password) {
    Properties properties = new Properties();
    int cipher = 0;
    try {
      properties.load(Student.class.getClassLoader().getResourceAsStream("cipher.property"));
      cipher = Integer.parseInt(properties.getProperty("number"));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    StringBuilder stringBuilder = new StringBuilder();
    password = password.toLowerCase();
    for (int i = 0; i < password.length(); i++) {
      char temp = password.charAt(i);
      int intChar = temp + cipher;
      if (intChar > 122) {
        intChar = 97 + (intChar - 123);
      }
      if (intChar < 97) {
        intChar = 123 - (97 - intChar);
      }
      temp = (char) intChar;
      stringBuilder.append(temp);
    }
    return stringBuilder.toString();
  }

  @Override
  public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
    firstName = (String) in.readObject();
    age = in.readInt();
    String decoded = (String) in.readObject();
    password = decodePassword(decoded);
  }

  private String decodePassword(String decoded) {
    Properties properties = new Properties();
    int cipher = 0;
    try {
      properties.load(Student.class.getClassLoader().getResourceAsStream("cipher.property"));
      cipher = Integer.parseInt(properties.getProperty("number"));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 0; i < decoded.length(); i++) {
      char temp = decoded.charAt(i);
      int intChar = temp - cipher;
      if (intChar > 122) {
        intChar = 97 + (intChar - 123);
      }
      if (intChar < 97) {
        intChar = 123 - (97 - intChar);
      }
      temp = (char) intChar;
      stringBuilder.append(temp);
    }
    return stringBuilder.toString();
  }

  @Override
  public String toString() {
    return "Student{"
        + "firstName='" + firstName + '\''
        + ", age=" + age
        + ", password='" + password + '\''
        + '}';
  }
}
