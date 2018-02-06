package com.hillel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBase {

  private static final String A_ID = "a.id";
  private static final String A_DATE_OF_BIRTH = "a.date_of_birth";
  private static final String B_PRICE = "b.price";
  private static final String A_NAME = "a.author_name";
  private static final String B_NAME = "b.book_name";
  private static final String B_ID = "b.id";
  private static final String C_DATE_OF_BIRTH = "c.date_of_birth";
  private static final String C_NAME = "c.customer_name";
  private static final String C_ID = "c.id";
  private static final String TOTAL_PRICE = "total_price";

  private Connection connection;

  public DataBase(Connection connection) {
    this.connection = connection;
  }

  public Map<Author, Integer> getTotalPrice() {
    Map<Author, Integer> authorPriceMap = new HashMap<>();
    String sql = "SELECT a.id, a.author_name, a.date_of_birth, sum(b.price) as total_price "
        + "FROM authors a "
        + "INNER JOIN books b "
        + "ON a.id = b.author_id "
        + "GROUP BY a.id";
    try (Statement statement = connection.createStatement(); ResultSet resultSet = statement
        .executeQuery(sql)) {
      while (resultSet.next()) {
        int authorId = resultSet.getInt(A_ID);
        String authorName = resultSet.getString(A_NAME);
        String birthday = resultSet.getString(A_DATE_OF_BIRTH);
        int totalPrice = resultSet.getInt(TOTAL_PRICE);
        authorPriceMap.put(new Author(authorId, authorName, birthday), totalPrice);
      }
    } catch (Exception exception) {
      exception.printStackTrace();
    }
    return authorPriceMap;
  }

  public List<Book> getCustomerBooks(String name) {
    List<Book> books = new ArrayList<>();
    String sql = "SELECT * "
        + "FROM customers c "
        + "INNER JOIN selling s "
        + "ON c.id = s.customer_id "
        + "INNER JOIN books b "
        + "ON s.book_id = b.id "
        + "LEFT JOIN authors a "
        + "ON b.author_id = a.id "
        + "WHERE c.customer_name = ? ;";
    ResultSet resultSet = null;
    try (PreparedStatement statement = connection.prepareStatement(sql)) {
      statement.setString(1, name);
      resultSet = statement.executeQuery();
      while (resultSet.next()) {
        int bookId = resultSet.getInt(B_ID);
        String bookName = resultSet.getString(B_NAME);
        String authorName = resultSet.getString(A_NAME);
        int price = resultSet.getInt(B_PRICE);
        books.add(new Book(bookId, bookName, authorName, price));
      }
    } catch (SQLException exception) {
      exception.printStackTrace();
    } finally {
      if (resultSet != null) {
        try {
          resultSet.close();
        } catch (SQLException ex) {
          ex.printStackTrace();
        }
      }
    }
    return books;
  }

  public List<Book> getTenExpensiveBooks() {
    List<Book> books = new ArrayList<>();
    String sql = "SELECT * "
        + "FROM books b "
        + "LEFT JOIN authors a "
        + "ON b.author_id = a.id "
        + "ORDER BY b.price DESC "
        + "LIMIT 0, 10 ;";
    try (Statement statement = connection.createStatement(); ResultSet resultSet = statement
        .executeQuery(sql)) {
      while (resultSet.next()) {
        int bookId = resultSet.getInt(B_ID);
        String bookName = resultSet.getString(B_NAME);
        String authorName = resultSet.getString(A_NAME);
        int price = resultSet.getInt(B_PRICE);
        books.add(new Book(bookId, bookName, authorName, price));
      }
    } catch (Exception exception) {
      exception.printStackTrace();
    }
    return books;
  }

  public List<Author> getAuthors50YearsYounger() {
    List<Author> authors = new ArrayList<>();
    String sql = "SELECT * "
        + "FROM authors a "
        + "WHERE date_add(a.date_of_birth, interval 50 year) >= curdate() ;";
    try (Statement statement = connection.createStatement(); ResultSet resultSet = statement
        .executeQuery(sql)) {
      while (resultSet.next()) {
        int authorId = resultSet.getInt(A_ID);
        String authorName = resultSet.getString(A_NAME);
        String birthday = resultSet.getString(A_DATE_OF_BIRTH);
        authors.add(new Author(authorId, authorName, birthday));
      }
    } catch (SQLException exception) {
      exception.printStackTrace();
    }
    return authors;
  }

  public List<Book> getBooks() {
    List<Book> books = new ArrayList<>();
    String sql = "SELECT * "
        + "FROM books b "
        + "LEFT JOIN authors a "
        + "ON b.author_id = a.id ;";
    try (Statement statement = connection.createStatement(); ResultSet resultSet = statement
        .executeQuery(sql)) {
      while (resultSet.next()) {
        int bookId = resultSet.getInt(B_ID);
        String bookName = resultSet.getString(B_NAME);
        String authorName = resultSet.getString(A_NAME);
        int price = resultSet.getInt(B_PRICE);
        books.add(new Book(bookId, bookName, authorName, price));
      }
    } catch (SQLException exception) {
      exception.printStackTrace();
    }
    return books;
  }

  public Map<Integer, Book> getBooks(String bookName) {
    Map<Integer, Book> books = new HashMap<>();
    String sql = "SELECT * "
        + "FROM books b "
        + "LEFT JOIN authors a "
        + "ON b.author_id = a.id "
        + "WHERE b.book_name = ? ;";
    ResultSet resultSet = null;
    try (PreparedStatement statement = connection.prepareStatement(sql)) {
      statement.setString(1, bookName);
      resultSet = statement.executeQuery();
      while (resultSet.next()) {
        int id = resultSet.getInt(B_ID);
        String name = resultSet.getString(B_NAME);
        String authorName = resultSet.getString(A_NAME);
        int price = resultSet.getInt(B_PRICE);
        books.put(id, new Book(id, name, authorName, price));
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
    } finally {
      if (resultSet != null) {
        try {
          resultSet.close();
        } catch (SQLException ex) {
          ex.printStackTrace();
        }
      }
    }
    return books;
  }

  public Map<Integer, Author> getAuthors(String authorName) {
    Map<Integer, Author> authors = new HashMap<>();
    String sql = "SELECT * "
        + "FROM authors a "
        + "WHERE author_name = ? ;";
    ResultSet resultSet = null;
    try (PreparedStatement statement = connection.prepareStatement(sql)) {
      statement.setString(1, authorName);
      resultSet = statement.executeQuery();
      while (resultSet.next()) {
        int id = resultSet.getInt(A_ID);
        String name = resultSet.getString(A_NAME);
        String birthday = resultSet.getString(A_DATE_OF_BIRTH);
        authors.put(id, new Author(id, name, birthday));
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
    } finally {
      if (resultSet != null) {
        try {
          resultSet.close();
        } catch (SQLException ex) {
          ex.printStackTrace();
        }
      }
    }
    return authors;
  }

  public void insertAuthor(String authorName, String authorBirthday) {
    String sql = "INSERT INTO authors(author_name, date_of_birth) "
        + "values(?, ?);";
    try (PreparedStatement statement = connection.prepareStatement(sql)) {
      statement.setString(1, authorName);
      statement.setString(2, authorBirthday);
      statement.execute();
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  public void insertBook(String bookName, int bookPrice) {
    String sql = "INSERT INTO books(book_name, price) "
        + "VALUES(?, ?);";
    try (PreparedStatement statement = connection.prepareStatement(sql)) {
      statement.setString(1, bookName);
      statement.setInt(2, bookPrice);
      statement.execute();
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  public void insertBook(String bookName, int bookPrice, Author author) {
    String sql = "INSERT INTO books(book_name, price, author_id) "
        + "VALUES(?, ?, ?);";
    try (PreparedStatement statement = connection.prepareStatement(sql)) {
      statement.setString(1, bookName);
      statement.setInt(2, bookPrice);
      statement.setInt(3, author.getId());
      statement.execute();
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  public Map<Integer, Customer> getCustomers(String customerName) {
    Map<Integer, Customer> customers = new HashMap<>();
    String sql = "SELECT * "
        + "FROM customers c "
        + "WHERE c.customer_name = ? ;";
    ResultSet resultSet = null;
    try (PreparedStatement statement = connection.prepareStatement(sql)) {
      statement.setString(1, customerName);
      resultSet = statement.executeQuery();
      while (resultSet.next()) {
        int id = resultSet.getInt(C_ID);
        String name = resultSet.getString(C_NAME);
        String birthday = resultSet.getString(C_DATE_OF_BIRTH);
        customers.put(id, new Customer(id, name, birthday));
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
    } finally {
      if (resultSet != null) {
        try {
          resultSet.close();
        } catch (SQLException ex) {
          ex.printStackTrace();
        }
      }
    }
    return customers;
  }

  public void insertCustomerWithoutBirthday(String customerName) {
    String sql = "INSERT INTO customers(customer_name) "
        + "VALUES (?);";
    try (PreparedStatement statement = connection.prepareStatement(sql)) {
      statement.setString(1, customerName);
      statement.execute();
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  public void insertCustomer(String customerName, String birthday) {
    String sql = "INSERT INTO customers(customer_name, day_of_birth) "
        + "VALUES (?, ?);";
    try (PreparedStatement statement = connection.prepareStatement(sql)) {
      statement.setString(1, customerName);
      statement.setString(2, birthday);
      statement.execute();
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  public void insertSelling(Book book, Customer customer, String currentDate) {
    String sql = "INSERT INTO selling(book_id, customer_id, date_of_selling, price) "
        + "VALUES(?, ?, ?, ?);";
    try (PreparedStatement statement = connection.prepareStatement(sql)) {
      statement.setInt(1, book.getId());
      statement.setInt(2, customer.getId());
      statement.setString(3, currentDate);
      statement.setInt(4, book.getBookPrice());
      statement.execute();
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  public Map<Integer, Author> getAuthorsWithBirthday(String authorName, String authorBirthday) {
    Map<Integer, Author> authors = new HashMap<>();
    String sql = "SELECT * "
        + "FROM authors a "
        + "WHERE a.author_name = ? "
        + "AND a.date_of_birth = ? ;";
    ResultSet resultSet = null;
    try (PreparedStatement statement = connection.prepareStatement(sql)) {
      statement.setString(1, authorName);
      statement.setString(2, authorBirthday);
      resultSet = statement.executeQuery();
      while (resultSet.next()) {
        int id = resultSet.getInt(A_ID);
        String name = resultSet.getString(A_NAME);
        String birthday = resultSet.getString(A_DATE_OF_BIRTH);
        authors.put(id, new Author(id, name, birthday));
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
    } finally {
      if (resultSet != null) {
        try {
          resultSet.close();
        } catch (SQLException ex) {
          ex.printStackTrace();
        }
      }
    }
    return authors;
  }
}