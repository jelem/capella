package com.hillel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Properties;

public class Main {


  public static void main(String[] args) {

    Country england = new Country("England");
    City london = new City("London", england);

    PersonalData personalData = new PersonalData("123456", "Baker Street", 30);
    Person person = new Person("Sherlok", "Holms", personalData, london);

    System.out.println(person);

    try {
      Person person1 = person.clone();
      System.out.println(person1);
      System.out.println(person == person1);
    } catch (CloneNotSupportedException ex) {
      ex.printStackTrace();
    }

    try {
      Properties properties = new Properties();
      properties.load(Main.class.getClassLoader().getResourceAsStream("paths.properties"));
      String path = properties.getProperty("file");
      serializePerson(person, path);
      Person person2 = deserializePerson(path);
      System.out.println(person2);
      System.out.println(person == person2);
    } catch (IOException | ClassNotFoundException ex) {
      ex.printStackTrace();
    }

    Person person3 = new Person(person);
    System.out.println(person3);
    System.out.println(person == person3);

  }

  public static Person deserializePerson(String path) throws IOException, ClassNotFoundException {
    FileInputStream fin = new FileInputStream(path);
    ObjectInputStream objectInputStream = new ObjectInputStream(fin);
    Person person = (Person) objectInputStream.readObject();
    objectInputStream.close();
    fin.close();
    return person;
  }

  public static void serializePerson(Person person, String path) throws IOException {
    FileOutputStream fout = new FileOutputStream(path);
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fout);
    objectOutputStream.writeObject(person);
    objectOutputStream.close();
    fout.close();
  }
}
