package com.hillel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in, "UTF-8");
    System.out.println("Enter password");
    String password = scanner.nextLine();

    Connection connection;
    try {
      connection = DriverManager
          .getConnection("jdbc:mysql://localhost:3306/bookstore?serverTimezone=UTC&useSSL=false",
              "root",
              password);
    } catch (SQLException exception) {
      exception.printStackTrace();
      return;
    }

    System.out.println("Books:");
    printBooks(connection);
    System.out.println();

    System.out.println("Authors that younger then 50 years:");
    printAuthors50YearsYounger(connection);
    System.out.println();

    System.out.println("10 most expensive books:");
    printTenExpensiveBooks(connection);
    System.out.println();

    String name = "Сергей Бендас";
    System.out.println("Books that " + name + " have bought:");
    printCustomerBooks(connection, name);
    System.out.println();

    System.out.println("Total price of books of each author:");
    printTotalPrice(connection);
    System.out.println();

  }

  private static void printTotalPrice(Connection connection) {
    String sql = "SELECT a.author_name, sum(b.price) as total_price "
        + "FROM authors a "
        + "INNER JOIN books b "
        + "ON a.id = b.author_id "
        + "GROUP BY a.id";

    try (Statement statement = connection.createStatement(); ResultSet resultSet = statement
        .executeQuery(sql)) {
      while (resultSet.next()) {
        String authorName = resultSet.getString("a.author_name");
        int totalPrice = resultSet.getInt("total_price");
        System.out.println(authorName + " - " + totalPrice);
      }
    } catch (Exception exception) {
      exception.printStackTrace();
    }
  }

  private static void printCustomerBooks(Connection connection, String name) {
    String sql = "SELECT b.book_name "
        + "FROM customers c "
        + "INNER JOIN selling s "
        + "ON c.id = s.customer_id "
        + "INNER JOIN books b "
        + "ON s.book_id = b.id "
        + "WHERE c.customer_name = ?";

    try (PreparedStatement statement = connection.prepareStatement(sql)) {
      statement.setString(1, name);
      ResultSet resultSet = statement.executeQuery();
      while (resultSet.next()) {
        String bookName = resultSet.getString("b.book_name");
        System.out.println(bookName);
      }
    } catch (Exception exception) {
      exception.printStackTrace();
    }
  }

  private static void printTenExpensiveBooks(Connection connection) {
    String sql = "SELECT book_name, price "
        + "FROM books "
        + "ORDER BY price DESC "
        + "LIMIT 0, 10";

    try (Statement statement = connection.createStatement(); ResultSet resultSet = statement
        .executeQuery(sql)) {
      while (resultSet.next()) {
        String bookName = resultSet.getString("book_name");
        int price = resultSet.getInt("price");
        System.out.println(bookName + " - " + price);
      }
    } catch (Exception exception) {
      exception.printStackTrace();
    }
  }

  private static void printAuthors50YearsYounger(Connection connection) {
    String sql = "SELECT author_name "
        + "FROM authors "
        + "WHERE date_add(date_of_birth, interval 50 year) >= curdate()";

    try (Statement statement = connection.createStatement(); ResultSet resultSet = statement
        .executeQuery(sql)) {

      while (resultSet.next()) {
        String authorName = resultSet.getString("author_name");
        System.out.println(authorName);
      }
    } catch (SQLException exception) {
      exception.printStackTrace();
    }
  }

  private static void printBooks(Connection connection) {

    String sql = "SELECT b.book_name, a.author_name "
        + "FROM books b "
        + "LEFT JOIN authors a "
        + "ON b.author_id = a.id";

    try (Statement statement = connection.createStatement(); ResultSet resultSet = statement
        .executeQuery(sql)) {

      while (resultSet.next()) {
        String bookName = resultSet.getString("book_name");
        String authorName = resultSet.getString("author_name");
        if (authorName == null) {
          authorName = "Автор неизвестен";
        }
        System.out.println(bookName + " - " + authorName);
      }

    } catch (SQLException exception) {
      exception.printStackTrace();
    }
  }
}
