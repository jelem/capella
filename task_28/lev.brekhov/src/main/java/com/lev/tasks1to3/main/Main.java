package com.lev.tasks1to3.main;

import com.lev.tasks1to3.Serialize.DeserializePerson;
import com.lev.tasks1to3.Serialize.SerializePerson;
import com.lev.tasks1to3.entity.City;
import com.lev.tasks1to3.entity.Country;
import com.lev.tasks1to3.entity.Person;
import com.lev.tasks1to3.entity.PersonalData;
import java.io.IOException;

public class Main {

  public static void main(String[] args)
      throws CloneNotSupportedException, IOException, ClassNotFoundException {

    Country country = new Country("Ukraine");
    City city = new City("Odessa", country);
    PersonalData data = new PersonalData("KN78645D", "Pushkinskaya 2b", 25);
    Person bob = new Person("Bob", "Doe", city, data);
    //clone
    Person bob1 = bob.clonePerson();
    //constructor
    Person bob2 = new Person(bob1);
    //serialize
    SerializePerson.serialize(bob);
    Person bob3 = DeserializePerson.deserialize();

    System.out.println(bob + "\n" + bob1 + "\n" + bob2 + "\n" + bob3);
  }
}
