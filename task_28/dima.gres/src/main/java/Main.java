import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Properties;


public class Main {

  public static void main(String[] args) throws CloneNotSupportedException, IOException {

    Person person1 = new Person("John",
        "Murphy",
        new City("Odessa",
            new Country("Ukraine")),
        new PersonalData("KK-32-16-17", "st.Malovskogo 32, r.33", 47));

    Person person2 = new Person(person1);

    System.out.println(person1);

    System.out.println(person2);
  }

  public static void serialazePerson(Person person, String location) {
    try (FileOutputStream fileOutputStream = new FileOutputStream(location);
         ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

      objectOutputStream.writeObject(person);

      objectOutputStream.close();

      fileOutputStream.close();

    } catch (FileNotFoundException exc) {
      exc.printStackTrace();
    } catch (IOException exc) {
      exc.printStackTrace();
    }
  }

  public static Person deserialaze(String location) {

    try (FileInputStream fileInputStream = new FileInputStream(location);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);) {

      return (Person) objectInputStream.readObject();

    } catch (FileNotFoundException exc) {
      exc.printStackTrace();
    } catch (IOException exc) {
      exc.printStackTrace();
    } catch (ClassNotFoundException exc) {
      exc.printStackTrace();
    }


    return null;
  }
}
