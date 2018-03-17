package com.lev.tasks1to3.serialize;

import com.lev.tasks1to3.entity.Person;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializePerson {

  public static void serialize(Person person, File file) throws IOException {

    FileOutputStream fout = new FileOutputStream(file);
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fout);
    objectOutputStream.writeObject(person);
  }
}
