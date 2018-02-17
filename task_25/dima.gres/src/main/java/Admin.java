import java.io.IOException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Admin {

  private Connection connection;

  private static final String SELECTCUSTOMERS = "select c.id, c.name\n"
      + "from customers c\n"
      + ";"
      ;

  private static final String SELECTAUTHORS = "select a.id, a.name, a.age\n"
      + "from authors a\n"
      + ";"
      ;

  private static final String SELECTBOOKS = "select b.id, b.author_id, b.name, b.price\n"
      + "from books b\n"
      + ";"
      ;

  private static final String SELECTSELLS = "select s.id, s.customer_id, s.book_id\n"
      + "from sells s\n"
      + ";"
      ;

  private static final String BOOKSAUTHORS = "select a.id, a.name, a.age, b.id, b.author_id, b.name, b.price\n"
      + "from books b\n"
      + "inner join authors a\n"
      + "on b.author_id = a.id\n"
      + "order by a.name;"
      ;

  private static final String AUTHORSLESS50 = "select a.id, a.name, a.age\n"
      + "from authors a\n"
      + "where a.age < 50\n"
      + "order by a.name;"
      ;

  private static final String EXPENSIVETENBOOKS = "select b.id, b.author_id, b.name, b.price\n"
      + "from books b\n"
      + "order by b.price desc\n"
      + "limit 10;"
      ;

  private void printBorder() {
    System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .");
  }

  public Admin(Connection connection) {
    this.connection = connection;
  }


  public void printBooksAuthors() {
    Book book = new Book();
    Author author = new Author();

    try (Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery(BOOKSAUTHORS)) {

      while (resultSet.next()) {
        author.setId(resultSet.getInt("a.id"));
        author.setName(resultSet.getString("a.name"));
        author.setAge(resultSet.getInt("a.age"));

        book.setId(resultSet.getInt("b.id"));
        book.setAuthorId(resultSet.getInt("b.author_id"));
        book.setName(resultSet.getString("b.name"));
        book.setPrice(resultSet.getDouble("b.price"));

        System.out.println(author + " -> " + book);
      }

      printBorder();

      resultSet.close();

      statement.close();

    } catch (SQLException exc) {

      exc.printStackTrace();

    }
  }

  public void printYoungAuthors() {

    try (Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery(AUTHORSLESS50)) {

      Author author = new Author();

      while (resultSet.next()) {
        author.setId(resultSet.getInt("a.id"));
        author.setName(resultSet.getString("a.name"));
        author.setAge(resultSet.getInt("a.age"));

        System.out.println(author);
      }

      printBorder();

      resultSet.close();

      statement.close();

    } catch (SQLException exc) {

      exc.printStackTrace();

    }
  }

  public void printExpensiveBooks() {

    try (Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery(EXPENSIVETENBOOKS)) {

      Book book = new Book();

      while (resultSet.next()) {
        book.setId(resultSet.getInt("b.id"));
        book.setAuthorId(resultSet.getInt("b.author_id"));
        book.setName(resultSet.getString("b.name"));
        book.setPrice(resultSet.getDouble("b.price"));

        System.out.println(book);
      }

      printBorder();

      resultSet.close();

      statement.close();

    } catch (SQLException exc) {

      exc.printStackTrace();

    }
  }

  public void printAllCustomers() {

    try (Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery(SELECTCUSTOMERS);) {

      Customer customer = new Customer();

      while (resultSet.next()) {
        customer.setId(resultSet.getInt("c.id"));
        customer.setName(resultSet.getString("c.name"));

        System.out.println(customer);
      }

      printBorder();

      resultSet.close();

      statement.close();

    } catch (SQLException exc) {

      exc.printStackTrace();

    }
  }

  public void printListBooksByCustomers(int id) {

    String sql = "select b.id, b.author_id, b.name, b.price\n"
        + "from sells s\n"
        + "inner join books b\n"
        + "on s.book_id = b.id\n"
        + "where s.customer_id = ?;"
        ;

    try (PreparedStatement preparedStatement = connection.prepareStatement(sql);) {

      preparedStatement.setInt(1, id);

    } catch (SQLException exc) {

      exc.printStackTrace();

    }
  }
}
