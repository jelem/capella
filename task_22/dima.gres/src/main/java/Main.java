import java.util.Iterator;

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

    Person oleg = new Person.Builder()
        .name("Oleg")
        .surname("Polishchuk")
        .age(46)
        .build();

    System.out.println(bucket.get(max));
    System.out.println(bucket.get(oleg));
  }
}
