package com.lev.tasks1to3.serialize;

import com.lev.tasks1to3.entity.Person;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializePerson {

  public static Person deserialize(File file) throws IOException, ClassNotFoundException {
    FileInputStream fin = new FileInputStream(file);
    ObjectInputStream objectInputStream = new ObjectInputStream(fin);
    return (Person) objectInputStream.readObject();
  }
}