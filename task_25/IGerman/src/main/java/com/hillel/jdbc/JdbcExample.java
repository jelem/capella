package com.hillel.jdbc;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcExample {

  public static void main(String[] args) throws SQLException, IOException {
    /*
    Connection connection = DriverManager
        .getConnection("jdbc:mysql://localhost:3306/bookshop?serverTimezone=UTC&useSSL=false",
            "root", "root");
    */

    Properties properties = new Properties();
    properties.load(JdbcExample.class.getResourceAsStream("/db.properties"));
    Connection connection = DriverManager
        .getConnection(properties.getProperty("url"), properties.getProperty("userName"),
            properties.getProperty("password"));

    printBooksAndAutors(connection);

    printAuthorsBefore50(connection);

    print10Expensive(connection);

    printBooksByCustomer(connection);

    printSumOfAuthor(connection);

    Book book = new Book("Stories", new BigDecimal(120), 4);
    addBook(connection, book);

    Author author = new Author("Heminguey", 55);
    addAuthor(connection, author);

    Customer customer = new Customer("White", 7);
    addBuying(connection, customer);
  }

  private static void printBooksAndAutors(Connection connection) {
    String sql = "select book.name, autor.name \n"
        + "from book, autor \n"
        + "where book.autor_id = autor.id";

    try (Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql)) {

      while (resultSet.next()) {
        String bookName = resultSet.getString("book.name");
        String authorName = resultSet.getString("autor.name");
        System.out.println(bookName + " " + authorName);
      }
      System.out.println();

    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  private static void printAuthorsBefore50(Connection connection) {
    String sql = "select name, age\n"
        + "from  autor\n"
        + "where age <= 50";

    try (Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql)) {

      while (resultSet.next()) {
        String authorName = resultSet.getString("autor.name");
        int authorAge = resultSet.getInt("autor.age");
        System.out.println(authorName + " " + authorAge);
      }
      System.out.println();

    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  private static void print10Expensive(Connection connection) {
    String sql = "select  name, price \n"
        + "from  book\n"
        + "order by price desc\n"
        + "limit 10";

    try (Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql)) {

      while (resultSet.next()) {
        String bookName = resultSet.getString("book.name");
        BigDecimal price = resultSet.getBigDecimal("book.price");
        System.out.println(bookName + " " + price);
      }
      System.out.println();

    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  private static void printBooksByCustomer(Connection connection) {
    String sql = "select customer.name as CustName, book.name as BookName \n"
        + "from customer\n"
        + "inner join book\n"
        + "on customer.book_id = book.id\n"
        + "where customer.name = 'Ivanov'";

    try (Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql)) {

      while (resultSet.next()) {
        String custName = resultSet.getString("CustName");
        String book = resultSet.getString("BookName");
        System.out.println(custName + " " + book);
      }
      System.out.println();

    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  private static void printSumOfAuthor(Connection connection) {
    String sql = "select autor.name, sum(book.price)\n"
        + "from autor \n"
        + "inner join book\n"
        + "on autor.id = book.autor_id\n"
        + "group by autor_id\n"
        + "order by autor.name";

    try (Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql)) {

      while (resultSet.next()) {
        String autName = resultSet.getString("autor.name");
        BigDecimal sum = resultSet.getBigDecimal("sum(book.price)");
        System.out.println(autName + " " + sum);
      }
      System.out.println();

    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  private static void addAuthor(Connection connection, Author author) {

    if (!repeatTest(connection, author.getName(), "autor")) {

      String sql = "insert into autor(name, age) "
          + "values(?, ?)";

      try (PreparedStatement statement = connection.prepareStatement(sql)) {
        statement.setString(1, author.getName());
        statement.setInt(2, author.getAge());
        statement.executeUpdate();
      } catch (SQLException ex) {
        ex.printStackTrace();
      }
    }
  }

  private static void addBook(Connection connection, Book book) throws SQLException {

    if (!repeatTest(connection, book.getName(), "book")) {

      String sql = "insert into book(name, price, autor_id) "
          + "values(?, ?, ?)";

      try (PreparedStatement statement = connection.prepareStatement(sql)) {
        statement.setString(1, book.getName());
        statement.setBigDecimal(2, book.getPrice());
        statement.setInt(3, book.getAuthorId());
        statement.executeUpdate();

      } catch (SQLException ex) {
        ex.printStackTrace();
      }
    }
  }

  private static void addBuying(Connection connection, Customer customer) {

    if (!repeatTest(connection, customer.getName(), "customer")) {

      String sql = "insert into customer(name, book_id) "
          + "values(?, ?)";

      try (PreparedStatement statement = connection.prepareStatement(sql)) {
        statement.setString(1, customer.getName());
        statement.setInt(2, customer.getBookId());
        statement.executeUpdate();

      } catch (SQLException ex) {
        ex.printStackTrace();
      }
    }
  }

  private static boolean repeatTest(Connection connection, String value, String tableName) {
    String sql = "select " + tableName + ".name from " + tableName;

    try (Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql)) {

      while (resultSet.next()) {
        String val = resultSet.getString(tableName + ".name");
        if (val.equals(value)) {
          System.out.println("There is " + value + " in the table");
          return true;
        }
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
    return false;
  }
}



