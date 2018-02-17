import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Properties;


public class Main {

  public static void main(String[] args) throws CloneNotSupportedException, IOException {

    Properties properties = new Properties();

    properties.load(Main.class.getResourceAsStream("/file.properties"));

    String location = properties.getProperty("location");

    properties.load(Main.class.getResourceAsStream("/cipher.properties"));

    int mov = Integer.parseInt(properties.getProperty("mov"));

    Student student1 = new Student("John Murphy", 34, "abxyz");

    student1.setMov(mov);

    serialazeObject(student1, location);

    Student student2 = (Student) deserialaze(location);

    System.out.println(student1);
    System.out.println(student2);

    Person person1 = new Person("John", "Murphy",
        new City("New York", new Country("USA")),
        new PersonalData("RVX 101231779", "st.Long Beach 123/45", 34));

    serialazeObject(person1, location);

    Person person2 = (Person) deserialaze(location);

    System.out.println(person1);
    System.out.println(person2);
  }

  public static void serialazeObject(Object object, String location) {
    try (FileOutputStream fileOutputStream = new FileOutputStream(location);
         ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

      objectOutputStream.writeObject(object);

      objectOutputStream.close();

      fileOutputStream.close();

    } catch (FileNotFoundException exc) {
      exc.printStackTrace();
    } catch (IOException exc) {
      exc.printStackTrace();
    }
  }

  public static Object deserialaze(String location) {

    try (FileInputStream fileInputStream = new FileInputStream(location);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);) {

      return objectInputStream.readObject();

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
