package hotel;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Main {

  public static void main(String[] args) {
    Bucket bucket = new Bucket();

    Person alina = new Person.Builder()
        .name("Alina")
        .surname("Asanova")
        .age(34)
        .build();
    Person alla = new Person.Builder()
        .name("Alla")
        .surname("Antonenko")
        .age(26)
        .build();


    Person max = new Person.Builder()
        .name("Max")
        .surname("Ceban")
        .age(45)
        .build();

    Person masha = new Person.Builder()
        .name("Masha")
        .surname("Dombrowska")
        .age(47)
        .build();

    bucket.put(alina, "123");
    bucket.put(max, "442");
    bucket.put(alla, "103");
    bucket.put(masha, "232");

    Iterator iterator = bucket.iterator();
    while (iterator.hasNext()) {
      try {
        System.out.println(iterator.next());
      } catch (NoSuchElementException exception) {
        System.out.println("end");
      }

    }
  }
}
