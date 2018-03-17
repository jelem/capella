package com.lev;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Main {

  public static void main(String[] args) throws SQLException, IOException {
    Properties properties = new Properties();
    properties.load(Main.class.getClassLoader().getResourceAsStream("db.properties"));

    Connection connection = DriverManager
        .getConnection(properties.getProperty("url"),
            properties.getProperty("username"),
            properties.getProperty("password"));

    Book book = new Book("1984", 100);
    Author author = new Author("George", "Orwell", 80);

    Manipulations.printBooks(connection);
    Manipulations.lessThen50YearsOld(connection);
    Manipulations.listOfBooksByCustomer(connection);
    Manipulations.sumOfBooksPrice(connection);
    Manipulations.tenExpensiveBooks(connection);
    Manipulations.addBook(connection, book);
    Manipulations.addAuthor(connection, author);
    Manipulations.buyBook(connection);

  }
}
