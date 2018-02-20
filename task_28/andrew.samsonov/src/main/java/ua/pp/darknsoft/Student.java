package ua.pp.darknsoft;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Student implements Externalizable {

  private static final long serialVersionUID = 1095687126744L;

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
    String encoded = caesarCoding(password);
    out.writeObject(encoded);
  }

  public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
    if (name == null || password == null) {
      throw new IllegalArgumentException();
    }
    name = (String) in.readObject();
    age = in.readInt();
    String encoded = (String) in.readObject();
    password = caesarDeCoding(encoded);
  }

  private String caesarCoding(String pwd) {
    return pwd;
  }

  private String caesarDeCoding(String pwd) {
    return pwd;
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
