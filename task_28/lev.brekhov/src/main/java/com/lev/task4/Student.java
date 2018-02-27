package com.lev.task4;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.NoSuchElementException;

public class Student implements Externalizable {

  private String name;
  private int age;
  private String password;
  private String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

  public Student(String name, int age, String password) {
    this.name = name;
    this.age = age;
    this.password = password;
  }

  @Override
  public void writeExternal(ObjectOutput out) throws IOException {
    out.writeObject(name);
    out.writeInt(age);
    String encrypt = encryptPassword(password, 2);
    out.writeObject(encrypt);
  }

  private String encryptPassword(String password, int key) {
    String line = validPassword(password);
    StringBuilder encrypted = new StringBuilder();

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

  private String validPassword(String password) {
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
    password = decryptPassword(decrypt, 2);
  }

  private String decryptPassword(String code, int key) {
    code = validPassword(code);
    StringBuilder decrypted = new StringBuilder();

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

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", password='" + password + '\'' +
        '}';
  }
}
