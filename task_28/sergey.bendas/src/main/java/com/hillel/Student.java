package com.hillel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Objects;
import java.util.Properties;

public class Student implements Externalizable {

  private static final long serialVersionUID = 1858475884626565189L;
  private static final int ABCLEN = 'z' - 'a' + 1;
  private String name;
  private int age;
  private String password;

  public Student() {
  }

  public Student(String name, int age, String password) {
    this.name = name;
    this.age = age;
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getPassword() {
    return password;
  }

  @Override
  public void writeExternal(ObjectOutput out) throws IOException {
    out.writeUTF(name);
    out.writeInt(age);
    String encoded = encodePassword(password);
    out.writeUTF(encoded);
  }

  public static String encodePassword(String password) {
    StringBuilder stringBuilder = new StringBuilder();
    int number = getNumber();
    for (int i = 0; i < password.length(); i++) {
      char letter = password.charAt(i);
      if (letter + number > 'z') {
        stringBuilder.append((char) (letter + number - ABCLEN));
      } else if (letter + number < 'a') {
        stringBuilder.append((char) (letter + number + ABCLEN));
      } else {
        stringBuilder.append((char) (letter + number));
      }
    }
    return stringBuilder.toString();
  }

  private static int getNumber() {
    Properties properties = new Properties();
    try {
      properties.load(Student.class.getClassLoader().getResourceAsStream("cipher.properties"));
      return Integer.parseInt(properties.getProperty("number"));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    return 0;
  }

  @Override
  public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
    this.name = in.readUTF();
    this.age = in.readInt();
    String encoded = in.readUTF();
    this.password = decodePassword(encoded);
  }

  public static String decodePassword(String encoded) {
    StringBuilder stringBuilder = new StringBuilder();
    int number = getNumber();
    for (int i = 0; i < encoded.length(); i++) {
      char letter = encoded.charAt(i);
      if (letter - number < 'a') {
        stringBuilder.append((char) (letter - number + ABCLEN));
      } else if (letter - number > 'z') {
        stringBuilder.append((char) (letter - number - ABCLEN));
      } else {
        stringBuilder.append((char) (letter - number));
      }
    }
    return stringBuilder.toString();
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    Student student = (Student) object;
    return age == student.age
        && Objects.equals(name, student.name)
        && Objects.equals(password, student.password);
  }

  @Override
  public int hashCode() {

    return Objects.hash(name, age, password);
  }

  @Override
  public String toString() {
    return "Student{"
        + "name='" + name + '\''
        + ", age=" + age
        + ", password='" + password + '\''
        + '}';
  }
}
