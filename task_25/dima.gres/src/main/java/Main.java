
import java.io.IOException;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

import java.util.HashMap;

import java.util.HashSet;

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

      Admin admin = new Admin();

      HashSet<Author> authors = admin.getAuthors(connection);

      HashSet<Customer> customers = admin.getCustomers(connection);

      for (Author author : authors) {
        System.out.println(author);
      }

      for (Customer customer : customers) {
        System.out.println(customer);
      }

      connection.close();

    } catch (IOException ioex) {

      ioex.printStackTrace();

    } catch (SQLException sqlex) {

      sqlex.printStackTrace();

    }

  }

}