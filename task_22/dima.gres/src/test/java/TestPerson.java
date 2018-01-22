import org.junit.Test;

public class TestPerson {

  @Test
  public void testHashCode() {
    Person oleg = new Person.Builder()
        .name("Oleg")
        .surname("Timosenko")
        .age(43).build();

    System.out.println((char) (oleg.hashCode() + 'A') );
    Person oleshka = new Person.Builder()
        .name("Olegik junior")
        .surname("timosenko")
        .age(43).build();

    System.out.println((char) (oleshka.hashCode() + 'a') );
  }
}
