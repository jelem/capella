package com.lev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookShop {

  public static void main(String[] args) throws SQLException {
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshop?serverTimezone=UTC&useSSL=false", "root",
        "root");
    System.out.println("Connected");

    printBooks(connection);
    System.out.println();
    lessThen50YearsOld(connection);
    System.out.println();
    tenExpensiveBooks(connection);
    System.out.println();
    listOfBooksByCustomer(connection);
    System.out.println();
    sumOfBooksPrice(connection);
  }

  public static void printBooks(Connection connection) {
    String sql = "select name from books";

    try (Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql)) {
      while (resultSet.next()) {
        String name = resultSet.getString("name");
        System.out.println(name);
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  public static void lessThen50YearsOld(Connection connection) {
    String sql = "select firstname, lastname FROM authors where years < 50";

    try (Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery(sql)) {
      while (resultSet.next()) {
        String firstname = resultSet.getString("firstname");
        String lastname = resultSet.getString("lastname");
        System.out.println(firstname + " " + lastname + "is younger than 50");
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  public static void tenExpensiveBooks (Connection connection) {
    String sql = "SELECT name, price FROM books group by price desc limit 10";

    try (Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql)) {
      while (resultSet.next()) {
        String name = resultSet.getString("name");
        String price = resultSet.getString("price");
        System.out.println(name + " " + price);
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  public static void listOfBooksByCustomer(Connection connection) {
    String sql = "SELECT c.name, b.name FROM ((customers_books cb"
        + " inner join books b on cb.book_id = b.id)"
        + " inner join customers c on cb.customer_id = c.id)"
        + " having c.name = \"Tonya\"";

    try (Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql)) {
      while (resultSet.next()) {
        String customerName = resultSet.getString("c.name");
        String bookName = resultSet.getString("b.name");
        System.out.println(customerName + " " + bookName);
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  public static void sumOfBooksPrice (Connection connection) {
    String sql = "SELECT a.firstname, a.lastname, sum(b.price)"
        + " FROM ((authors_books ab"
        + " inner join books b on ab.book_id = b.id)"
        + " inner join authors a on ab.author_id = a.id)"
        + " group by a.firstname asc";

    try (Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql)) {
      while (resultSet.next()) {
        String authorFirstame = resultSet.getString("a.firstname");
        String authorLastname = resultSet.getString("a.lastname");
        int sum = resultSet.getInt("sum(b.price)");
        System.out.println(authorFirstame + " " + authorLastname + " " + sum);
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }
}