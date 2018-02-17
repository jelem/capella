
import java.io.IOException;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

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

      admin.printYoungAuthors();

      admin.printExpensiveBooks();

      admin.printAllCustomers();

      admin.printListBooksByCustomers(1);

      admin.printAllAuthors();

      admin.printSumsBooksGroubByAuthors(3);

      connection.close();
      

    } catch (IOException | SQLException ex) {

      ex.printStackTrace();

    }

  }

}