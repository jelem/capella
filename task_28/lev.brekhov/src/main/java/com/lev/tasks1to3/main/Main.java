package com.lev.tasks1to3.main;

import com.lev.tasks1to3.entity.City;
import com.lev.tasks1to3.entity.Country;
import com.lev.tasks1to3.entity.Person;
import com.lev.tasks1to3.entity.PersonalData;
import com.lev.tasks1to3.serialize.DeserializePerson;
import com.lev.tasks1to3.serialize.SerializePerson;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class Main {

  public static void main(String[] args)
      throws CloneNotSupportedException, IOException, ClassNotFoundException {

    Properties properties = new Properties();
    properties.load(DeserializePerson.class.getClassLoader().getResourceAsStream("person.properties"));
    File fout = new File(properties.getProperty("serperson","UTF8"));
    File fin = new File(properties.getProperty("deserperson"));

    Country country = new Country("Ukraine");
    City city = new City("Odessa", country);
    PersonalData data = new PersonalData("KN78645D", "Pushkinskaya 2b", 25);
    Person bob = new Person("Bob", "Doe", city, data);
    //clone
    Person bob1 = bob.clonePerson();
    //constructor
    Person bob2 = new Person(bob1);
    //serialize
    SerializePerson.serialize(bob, fout);
    Person bob3 = DeserializePerson.deserialize(fin);

    System.out.println(bob + "\n" + bob1 + "\n" + bob2 + "\n" + bob3);
  }
}
