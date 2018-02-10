package ua.pp.darknsoft.jdbc;

import ua.pp.darknsoft.entity.Author;
import ua.pp.darknsoft.entity.Book;
import ua.pp.darknsoft.entity.BookCollection;
import ua.pp.darknsoft.entity.Consumer;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBUtil {

  private DBUtil() {
    throw new AssertionError();
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

  public static List<Author> selectAuthors(PreparedStatement statement) {
    List<Author> listAuthors = new ArrayList<>();
    try (ResultSet resultSet = statement.executeQuery()) {
      while (resultSet.next()) {
        int id = resultSet.getInt("id");
        String firstName = resultSet.getString("firstName");
        String lastName = resultSet.getString("lastName");
        int age = resultSet.getInt("age");
        listAuthors.add(new Author(id, firstName, lastName, age));
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
    return listAuthors;
  }

  public static List<Consumer> selectConsumers(PreparedStatement statement) {
    List<Consumer> listConsumers = new ArrayList<>();
    try (ResultSet resultSet = statement.executeQuery()) {
      while (resultSet.next()) {
        int id = resultSet.getInt("id");
        String firstName = resultSet.getString("firstName");
        String lastName = resultSet.getString("lastName");
        int age = resultSet.getInt("age");
        listConsumers.add(new Consumer(id, firstName, lastName, age));
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
    return listConsumers;
  }

  public static List<BookCollection> selectBookCollections(PreparedStatement statement) {
    List<BookCollection> listBookCollections = new ArrayList<>();
    try (ResultSet resultSet = statement.executeQuery()) {
      while (resultSet.next()) {
        BigDecimal price = resultSet.getBigDecimal("cost");
        int count = resultSet.getInt("count");
        int authorId = resultSet.getInt("id");
        String authorFirstName = resultSet.getString("firstName");
        String authorLastName = resultSet.getString("lastName");
        int authorAge = resultSet.getInt("age");

        listBookCollections
            .add(new BookCollection(price,
                new Author(authorId, authorFirstName, authorLastName, authorAge), count));
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
    return listBookCollections;
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
