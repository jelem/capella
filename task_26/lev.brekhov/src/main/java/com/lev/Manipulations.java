package com.lev;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Manipulations {

  private static String sql;

  public static void printBooks(Connection connection) {
    sql = "select name from books";

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
    sql = "select firstname, lastname FROM authors where years < 50";

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

  public static void tenExpensiveBooks(Connection connection) {
    sql = "SELECT name, price FROM books group by price desc limit 10";

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
    sql = "SELECT c.name, b.name FROM ((customers_books cb"
        + " inner join books b on cb.book_id = b.id)"
        + " inner join customers c on cb.customer_id = c.id)"
        + " having c.name = \"Tonya\"";

    try (Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql)) {
      while (resultSet.next()) {
        String customerName = resultSet.getString("c.name");
        String bookName = resultSet.getString("b.name");
        System.out.println(customerName + ": " + bookName);
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  public static void sumOfBooksPrice(Connection connection) {
    sql = "SELECT a.firstname, a.lastname, sum(b.price)"
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

  public static void addAuthor(Connection connection, Author author) {
    sql = "insert into authors(firstname, lastname, years) "
        + "values(?, ?, ?)";

    try (PreparedStatement statement = connection.prepareStatement(sql)) {
      statement.setString(1, author.getFirstName());
      statement.setString(2, author.getLastName());
      statement.setInt(3, author.getAge());
      statement.executeUpdate();
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  public static void addBook(Connection connection, Book book) {
    sql = "insert into books(name, price) "
        + "values(?, ?)";

    try (PreparedStatement statement = connection.prepareStatement(sql)) {
      statement.setString(1, book.getName());
      statement.setInt(2, book.getPrice());
      statement.executeUpdate();
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  public static void buyBook(Connection connection) {
    sql = "insert into customers_books(customer_id, book_id) "
        + "values(?, ?)";

    try (PreparedStatement statement = connection.prepareStatement(sql)) {
      statement.setInt(1, 13);
      statement.setInt(2, 3);
      statement.executeUpdate();
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }
}