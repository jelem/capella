package com.lev.task4;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Properties;

public class Student implements Externalizable, Serializable {

  private String name;
  private int age;
  private String password;
  private static String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
  public static final int serialVersionUID = -1;

  public Student(String name, int age, String password) {
    this.name = name;
    this.age = age;
    this.password = password;
  }

  public Student() {
  }

  @Override
  public void writeExternal(ObjectOutput out) throws IOException {
    out.writeObject(name);
    out.writeInt(age);
    String encrypt = encryptPassword(password);
    out.writeObject(encrypt);
  }

  public static String encryptPassword(String password) {
    String line = validPassword(password);
    StringBuilder encrypted = new StringBuilder();
    int key = getKey();

    for (int i = 0; i < line.length(); i++) {
      int letter = alphabet.indexOf(line.charAt(i));

      if ((letter + key) < alphabet.length()) {
        encrypted.append(alphabet.charAt(letter + key));
      } else {
        encrypted.append(alphabet.charAt(letter + key) - alphabet.length());
      }
    }
    return String.valueOf(encrypted);
  }

  private static String validPassword(String password) {
    password = password.replaceAll("\n", "");

    for (int i = 0; i < password.length(); i++) {
      if (alphabet.indexOf(password.charAt(i)) == -1) {
        throw new NoSuchElementException("Use English alphabet!");
      }
    }
    return password;
  }

  @Override
  public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
    name = (String) in.readObject();
    age = in.readInt();
    String decrypt = (String) in.readObject();
    password = decryptPassword(decrypt);
  }

  private String decryptPassword(String code) {
    code = validPassword(code);
    StringBuilder decrypted = new StringBuilder();
    int key = getKey();

    for (int i = 0; i < code.length(); i++) {
      int letter = alphabet.indexOf(code.charAt(i));

      if ((letter - key) >= 0) {
        decrypted.append(alphabet.charAt(letter - key));
      } else {
        decrypted.append(alphabet.charAt(letter - key) + alphabet.length());
      }
    }
    return String.valueOf(decrypted);
  }


  private static int getKey() {
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
  public String toString() {
    return "Student{" + "name='"
        + name + '\'' + ", age=" + age
        + ", password='" + password + '\'' + "}";
  }

  @Override
  public boolean equals(Object ob) {
    if (this == ob) {
      return true;
    }
    if (ob == null || getClass() != ob.getClass()) {
      return false;
    }
    Student student = (Student) ob;
    return age == student.age
        && Objects.equals(name, student.name)
        && Objects.equals(password, student.password);
  }

  @Override
  public int hashCode() {

    return Objects.hash(name, age, password);
  }
}