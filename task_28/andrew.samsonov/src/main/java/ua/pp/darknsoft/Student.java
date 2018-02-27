package ua.pp.darknsoft;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Properties;

public class Student implements Externalizable {

  private static final long serialVersionUID = 1095687126744L;

  private static final int BIG_BEGIN = 'A';
  private static final int BIG_END = 'Z';
  private static final int SMALL_BEGIN = 'a';
  private static final int SMALL_END = 'z';

  private String name;
  private int age;
  private String password;
  private int offSet;

  public Student() {
    Properties properties = new Properties();
    try {
      properties.load(Main.class.getClassLoader().getResourceAsStream("cipher.properties"));
      offSet = Integer.parseInt(properties.getProperty("offset"));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  public Student(String name, int age, String password) {
    this.name = name;
    this.age = age;
    this.password = password;
    Properties properties = new Properties();
    try {
      properties.load(Main.class.getClassLoader().getResourceAsStream("cipher.properties"));
      offSet = Integer.parseInt(properties.getProperty("offset"));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
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

    if (age != student.age) {
      return false;
    }
    if (!name.equals(student.name)) {
      return false;
    }
    return password.equals(student.password);
  }

  @Override
  public int hashCode() {
    int result = name.hashCode();
    result = 31 * result + age;
    result = 31 * result + password.hashCode();
    return result;
  }

  public void writeExternal(ObjectOutput out) throws IOException {
    out.writeObject(name);
    out.writeInt(age);
    String encoded = caesarCoding(password, offSet);
    out.writeObject(encoded);
  }

  public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    name = (String) in.readObject();
    age = in.readInt();
    String encoded = (String) in.readObject();
    password = caesarDeCoding(encoded, offSet);
  }

  private static String caesarCoding(String pwd, int offset) {
    char[] chars = pwd.toCharArray();
    for (int i = 0; i < chars.length; i++) {

      if (BIG_BEGIN <= chars[i] && chars[i] <= BIG_END) {
        if (chars[i] + offset > BIG_END) {
          chars[i] = (char) (BIG_BEGIN - 1 + ((chars[i] + offset) - BIG_END));
          continue;
        }
        if (chars[i] + offset < BIG_BEGIN) {
          chars[i] = (char) (BIG_END + 1 - (BIG_BEGIN - (chars[i] + offset)));
          continue;
        }
        chars[i] = (char) (chars[i] + offset);
      }

      if (SMALL_BEGIN <= chars[i] && chars[i] <= SMALL_END) {
        if (chars[i] + offset > SMALL_END) {
          chars[i] = (char) (SMALL_BEGIN - 1 + (chars[i] + offset) - SMALL_END);
          continue;
        }
        if (chars[i] + offset < SMALL_BEGIN) {
          chars[i] = (char) (SMALL_END + 1 - (SMALL_BEGIN - (chars[i] + offset)));
          continue;
        }
        chars[i] = (char) (chars[i] + offset);
      }
    }
    return new String(chars);
  }

  private static String caesarDeCoding(String pwd, int offset) {
    return caesarCoding(pwd, -offset);
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
