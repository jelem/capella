package com.lev.tasks1to3.Serialize;

import com.lev.tasks1to3.entity.Person;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializePerson {

  public static void serialize(Person person) throws IOException {
    FileOutputStream fout = new FileOutputStream(
        "E:\\Projects\\Capella\\capella\\task_28\\lev.brekhov\\src\\main\\java\\com\\lev\\files\\person.ser");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fout);
    objectOutputStream.writeObject(person);
  }
}
