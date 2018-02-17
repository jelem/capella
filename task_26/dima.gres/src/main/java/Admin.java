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

  public void printAllAuthors() {

    try (Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery(SELECTAUTHORS)) {

      Author author = new Author();

      while (resultSet.next()) {

        author.setId(resultSet.getInt(1));
        author.setName(resultSet.getString(2));
        author.setAge(resultSet.getInt(3));

        System.out.println(author);
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

    ResultSet resultSet = null;

    try (PreparedStatement preparedStatement = connection.prepareStatement(sql);) {

      preparedStatement.setInt(1, 1);

      resultSet = preparedStatement.executeQuery();

      Book book = new Book();

      while (resultSet.next()) {

        book.setId(resultSet.getInt(1));
        book.setAuthorId(resultSet.getInt(2));
        book.setName(resultSet.getString(3));
        book.setPrice(resultSet.getDouble(4));

        System.out.println(book);

      }

      printBorder();

      resultSet.close();

      preparedStatement.close();

    } catch (SQLException exc) {

      exc.printStackTrace();

    }
  }

  public void printSumsBooksGroubByAuthors(int id) {

    String sql = "select a.id, a.name, a.age, sum(b.price) as s\n"
        + "from books b\n"
        + "inner join authors a\n"
        + "on b.author_id = a.id\n"
        + "where a.id = ?\n"
        + "group by a.id\n"
        + ";"
        ;

    ResultSet resultSet = null;

    try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

      preparedStatement.setInt(1, id);
      resultSet = preparedStatement.executeQuery();

      Author author = new Author();

      while (resultSet.next()) {

        author.setId(resultSet.getInt(1));
        author.setName(resultSet.getString(2));
        author.setAge(resultSet.getInt(3));

        System.out.println(author + " ---> " + resultSet.getDouble("s"));
      }

      printBorder();

      resultSet.close();

      preparedStatement.close();

    } catch (SQLException exc) {

      exc.printStackTrace();

    }
  }

  public void addAuthor(Author author) {

    if (isAuthorExist(author.getName())) {
      return ;
    }

    String sql = "insert into authors \n"
        + "(name, age) values(?, ?);"
        ;

    try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

      preparedStatement.setString(1, author.getName());

      preparedStatement.setInt(2, author.getAge());

      preparedStatement.executeUpdate();

      preparedStatement.close();

    } catch (SQLException exc) {

      exc.printStackTrace();

    }
  }

  public void addBook(Book book, Author author) {

    if (isBookExist(book.getName(), author.getName())) {
      return;
    }

    if (!isAuthorExist(author.getName())) {
      addAuthor(author);
    }

    int authorId = getAuthorId(author.getName());

    String sql = "insert into books (author_id, name, price)\n"
        + "values (?, ?, ?)\n"
        + ";"
        ;

    ResultSet resultSet = null;

    try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

      preparedStatement.setInt(1,authorId);
      preparedStatement.setString(2, book.getName());
      preparedStatement.setDouble(3, book.getPrice());

      preparedStatement.executeUpdate();

    } catch (SQLException exc) {
      exc.printStackTrace();
    }
  }

  public boolean isAuthorExist(String name) {

    String sql = "select a.name\n"
        + "from authors a\n"
        + "where a.name = ?;"
        ;

    ResultSet resultSet = null;

    boolean result = false;

    try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

      preparedStatement.setString(1, name);

      resultSet = preparedStatement.executeQuery();

      while (resultSet.next()) {
        result = true;
        break;
      }

      resultSet.close();

      preparedStatement.close();

    } catch (SQLException exc) {

      exc.printStackTrace();

    }

    return result;
  }

  public boolean isBookExist(String bookName, String authorName) {

    String sql = "select b.name, a.name\n"
        + "from books b\n"
        + "inner join authors a\n"
        + "on b.author_id = a.id\n"
        + "where b.name = ?\n"
        + "and a.name = ?;"
        ;

    boolean result = false;

    ResultSet resultSet = null;

    try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

      preparedStatement.setString(1, bookName);
      preparedStatement.setString(2, authorName);
      resultSet = preparedStatement.executeQuery();

      while (resultSet.next()) {
        result = true;
        break;
      }

      resultSet.close();

      preparedStatement.close();

      return result;

    } catch (SQLException exc) {

      exc.printStackTrace();

    }

    return result;
  }

  public int getAuthorId(String name) {

    String sql = "select a.name, a.id\n"
        + "from authors a\n"
        + "where a.name = ?;"
        ;

    int result = -1;

    ResultSet resultSet = null;

    try (PreparedStatement preparedStatement = connection.prepareStatement(sql);) {

      preparedStatement.setString(1, name);
      resultSet = preparedStatement.executeQuery();

      while (resultSet.next()) {
        result = resultSet.getInt(2);
        break;
      }

      resultSet.close();

      preparedStatement.close();

      return result;

    } catch (SQLException exc) {

      exc.printStackTrace();

    }

    return result;
  }

  public boolean isCustomerExist(String name) {

    boolean result = false;

    String sql = "select c.id, c.name\n"
        + "from customers c\n"
        + "where c.name = ?;"
        ;

    ResultSet resultSet = null;

    try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

      preparedStatement.setString(1, name);
      resultSet = preparedStatement.executeQuery();

      while (resultSet.next()) {
        result = true;
        break;
      }

      resultSet.close();

      preparedStatement.close();

    } catch (SQLException exc) {

      exc.printStackTrace();

    }

    return result;
  }

  public int getCustomerId(String name) {
    int result = -1;

    String sql = "select c.id, c.name\n"
        + "from customers c\n"
        + "where c.name = ?;"
        ;

    ResultSet resultSet = null;

    try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

      preparedStatement.setString(1, name);
      resultSet = preparedStatement.executeQuery();

      while (resultSet.next()) {
        result = resultSet.getInt(1);
        break;
      }

      resultSet.close();

      preparedStatement.close();

    } catch (SQLException exc) {

      exc.printStackTrace();

    }

    return result;
  }

  public void sellBook(Book book, Author author, Customer customer) {

    if (!isBookExist(book.getName(), author.getName())) {
      System.out.println(". . . Sorry we hav'nt this book. Stend by letter . . .");
      return;
    }

    if (!isAuthorExist(author.getName())) {
      addAuthor(author);
    }

    String sql = "insert into sells(customer_id, book_id)\n"
        + "values(?, ?)\n"
        + ";"
        ;

    try (PreparedStatement preparedStatement = connection.prepareStatement(sql);) {

      preparedStatement.setInt(1, getCustomerId(customer.getName()));
      preparedStatement.setInt(2, getBookId(book.getName()));

      preparedStatement.executeUpdate();

    } catch (SQLException exc) {

      exc.printStackTrace();

    }
  }

  public int getBookId(String name) {

    int result = -1;

    String sql = "select b.id, b.name\n"
        + "from books b\n"
        + "where b.name = ?;"
        ;

    ResultSet resultSet = null;

    try (PreparedStatement preparedStatement = connection.prepareStatement(sql);) {

      preparedStatement.setString(1, name);
      resultSet = preparedStatement.executeQuery();

      while (resultSet.next()) {
        result = resultSet.getInt(1);
        break;
      }

      resultSet.close();

      preparedStatement.close();

    } catch (SQLException exc) {

      exc.printStackTrace();

    }

    return result;
  }
}
