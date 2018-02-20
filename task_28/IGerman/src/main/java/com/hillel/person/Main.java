package com.hillel.person;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Properties;

public class Main {

  public static void main(String[] args) {

    Country country = new Country("Ukraine");
    City city = new City("Odessa", country);
    PersonalData personalData = new PersonalData("KR 620620", "Sadovaya 30", 30);

    Person person = new Person("Yuriy", "Belov", city, personalData);
    serializePerson(person);
    Person person1 = deserializePerson();
    System.out.println(person1.toString());

    Person personClone = null;
    try {
      personClone = person.clone();
      System.out.println(personClone.toString());
      System.out.println(personClone.getCity() == person.getCity());
    } catch (CloneNotSupportedException ex) {
      ex.printStackTrace();
    }
    Country country1 = new Country("USA");
    City city1 = new City("Vegas", country1);
    person.setCity(city1);
    System.out.println(personClone.getCity() == person.getCity());
    System.out.println(person.toString());
    System.out.println(personClone.toString());

  }

  public static void serializePerson(Person person) {
    Properties properties = new Properties();
    String file;

    try {
      properties.load(Main.class.getClassLoader().getResourceAsStream("/ser.property"));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    file = properties.getProperty("ser");

    FileOutputStream fileOutputStream = null;
    ObjectOutputStream objectOutputStream = null;
    try {
      fileOutputStream = new FileOutputStream(file);
      objectOutputStream = new ObjectOutputStream(fileOutputStream);
      objectOutputStream.writeObject(person);

    } catch (IOException ex) {
      ex.printStackTrace();
    } finally {
      try {
        objectOutputStream.close();
        fileOutputStream.close();

      } catch (IOException ex) {
        ex.printStackTrace();
      } catch (NullPointerException ex) {
        ex.printStackTrace();
      }
    }
  }

  public static Person deserializePerson() {
    Properties properties = new Properties();
    String file;
    Person person1 = null;

    FileInputStream fileInputStream = null;
    ObjectInputStream objectInputStream = null;
    try {
      properties.load(Main.class.getClassLoader().getResourceAsStream("/ser.property"));

      file = properties.getProperty("ser");

      fileInputStream = new FileInputStream(file);
      objectInputStream = new ObjectInputStream(fileInputStream);
      person1 = (Person) objectInputStream.readObject();

    } catch (IOException ex) {
      ex.printStackTrace();
    } catch (ClassNotFoundException ex) {
      ex.printStackTrace();
    } finally {
      try {
        objectInputStream.close();
        fileInputStream.close();

      } catch (IOException ex) {
        ex.printStackTrace();
      } catch (NullPointerException ex) {
        ex.printStackTrace();
      }
    }

    return person1;
  }
}
