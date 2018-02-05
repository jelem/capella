package ua.pp.darknsoft.jdbc;

import ua.pp.darknsoft.Main;
import ua.pp.darknsoft.entity.Author;
import ua.pp.darknsoft.entity.Book;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DBUtil {

  private DBUtil() {
  }

  public static Connection getConnection() throws SQLException {
    Properties properties = new Properties();
    try {
      properties.load(Main.class.getClassLoader().getResourceAsStream("db.properties"));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    return DriverManager
        .getConnection(properties.getProperty("url"),
            properties.getProperty("username"),
            properties.getProperty("password"));
  }

  public static List<Book> selectBooks(PreparedStatement statement) {
    List<Book> listBooks = new ArrayList<>();
    try (ResultSet resultSet = statement.executeQuery()) {
      while (resultSet.next()) {
        int id = resultSet.getInt("id");
        String name = resultSet.getString("name");
        int authorId = resultSet.getInt("author_id");
        BigDecimal price = resultSet.getBigDecimal("price");
        listBooks.add(new Book(id, name, authorId, price));
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
    return listBooks;
  }

  public static void printFullBook(Book book) {
    SelectAuthors selectAuthors = new SelectAuthorsImpl();
    System.out.println("ID: " + book.getId());
    System.out.println("NAME: " + book.getName());
    Author thisAuthor = selectAuthors.getAuthorById(book.getAuthorId());
    System.out.println("AUTHOR: " + thisAuthor.getLastName() + " " + thisAuthor.getFirstName());
    System.out.println("PRICE: " + book.getPrice());
    thisAuthor = null;
    selectAuthors = null;
  }

}
