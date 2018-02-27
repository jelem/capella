
import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;



import java.sql.SQLException;

import java.util.Properties;

public class Main {

  private static final String locPropertie = "/information.properties";

  public static void main(String[] args) {


    Properties properties = null;
    Connection connection = null;

    try {
      properties = new Properties();
      properties.load(Main.class.getResourceAsStream(locPropertie));

      String location = properties.getProperty("location");
      String user = properties.getProperty("user");
      String password = properties.getProperty("password");

      connection = DriverManager.getConnection(location, user, password);

      Admin admin = new Admin(connection);

      admin.printBooksAuthors();

      admin.sellBook(new Book(0, 0, "Kobzar", 0),
                     new Author("Taras Shevchenko", 0, 0),
                     new Customer(0, "Nikita Morgunov")
      );

      connection.close();

    } catch (IOException | SQLException ex) {

      ex.printStackTrace();

    }

  }

}