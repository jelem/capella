package com.hillel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Main {

  public static void main(String[] args) {

    Connection connection;
    try {
      Properties properties = new Properties();
      properties.load(Main.class.getClassLoader().getResourceAsStream("db.properties"));
      connection = DriverManager
          .getConnection(properties.getProperty("url"),
              properties.getProperty("username"),
              properties.getProperty("password"));

    } catch (Exception ex) {
      ex.printStackTrace();
      return;
    }
    BookStore bookStore = new BookStore(connection);
    bookStore.printBooks();
    System.out.println();

    bookStore.printTotalPrice();
    System.out.println();

    bookStore.printTenExpensiveBooks();
    System.out.println();

    bookStore.printAuthors50YearsYounger();
    System.out.println();

    bookStore.printCustomerBooks("Сергей Бендас");
    System.out.println();

    bookStore.addAuthor();

    try {
      bookStore.addBook();
    } catch (Exception ex) {
      ex.printStackTrace();
    }

    try {
      bookStore.buyBook();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}