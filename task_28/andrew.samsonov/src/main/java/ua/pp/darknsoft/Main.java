package ua.pp.darknsoft;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

  public static void main(String[] args) {

    Country country = new Country("Ukraine");
    City city = new City("Odessa", country);
    PersonalData personalData = new PersonalData("KK247597", "NoName street, 00", 25);

    Person person = new Person("Andrew", "Samsonov", city, personalData);

    //Clone with the Object.clone();
    System.out.println("#################### Clone with the Object.clone() ######################");
    try {
      Person clonePerson = (Person) person.clone();
      comparePersons(person, clonePerson);
      country.setName("France");
      comparePersons(person, clonePerson);

    } catch (CloneNotSupportedException ex) {
      ex.printStackTrace();
    }

    //Clone with the Serializable method;
    System.out.println("################## Clone with the Serializable method ###################");
    Person serialPerson = null;
    try {
      serializePerson(person);
      serialPerson = deserializePerson();
    } catch (IOException ex) {
      ex.printStackTrace();
    } catch (ClassNotFoundException ex) {
      ex.printStackTrace();
    }

    comparePersons(person, serialPerson);
    country.setName("Greece");
    comparePersons(person, serialPerson);

    //Clone with the constructor
    System.out.println("##################### Clone with the constructor ########################");
    Person constructorPerson = new Person(person);
    comparePersons(person, constructorPerson);
    country.setName("Poland");
    comparePersons(person, constructorPerson);
  }

  public static void serializePerson(Person person) throws IOException {
    FileOutputStream fout = new FileOutputStream("\\person.ser");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fout);
    objectOutputStream.writeObject(person);
    fout.close();
    objectOutputStream.close();
  }

  public static Person deserializePerson() throws IOException, ClassNotFoundException {
    FileInputStream fin = new FileInputStream("\\person.ser");
    ObjectInputStream objectInputStream = new ObjectInputStream(fin);
    Person newPerson = (Person) objectInputStream.readObject();
    fin.close();
    objectInputStream.close();
    return newPerson;
  }

  public static void comparePersons(Person person1, Person person2) {
    System.out.println("Objects equals: " + person1.equals(person2));
    System.out.println("Links == : " + (person1 == person2));
    System.out.println(person1);
    System.out.println(person2);
    System.out.println("------------------------------------------------------------------------");
  }

}
