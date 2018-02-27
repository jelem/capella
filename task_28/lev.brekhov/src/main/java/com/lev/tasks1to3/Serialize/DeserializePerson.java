package com.lev.tasks1to3.Serialize;

import com.lev.tasks1to3.entity.Person;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializePerson {

  public static Person deserialize() throws IOException, ClassNotFoundException {
    FileInputStream fin = new FileInputStream(
        "E:\\Projects\\Capella\\capella\\task_28\\lev.brekhov\\src\\main\\java\\com\\lev\\files\\person.ser");
    ObjectInputStream objectInputStream = new ObjectInputStream(fin);
    return (Person) objectInputStream.readObject();
  }
}