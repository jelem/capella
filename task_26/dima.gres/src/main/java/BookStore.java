import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Properties;

public class BookStore {

  public static void main(String[] args) throws IOException, SQLException {
    Properties properties = new Properties();
    properties.load(BookStore.class.getResourceAsStream("/db.properties"));

    Connection connection = DriverManager
        .getConnection(properties.getProperty("url"),
            properties.getProperty("user"),
            properties.getProperty("password")
        )
        ;


    Author shevchenko = new Author("Taras Shevchenko", 175);
    Book katerina = new Book("Katerina", 74);

    addBook(connection, katerina, shevchenko);

    Customer berzovsky = new Customer("Boris Berezovsky");


    printBooksSAuthors(connection);

    connection.close();
  }

  private static void printBooksSAuthors(Connection connection) {
    String sql = "select a.name, b.name\n"
        + "from books b\n"
        + "inner join authors a\n"
        + "on b.author_id = a.id\n"
        + "order by a.name;";

    try (Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery(sql);) {

      Author curAuthor = new Author();
      Book curBook = new Book();

      while (resultSet.next()) {

        curAuthor.setName(resultSet.getString("a.name"));

        curBook.setName(resultSet.getString("b.name"));
        System.out.println(curAuthor.getId(connection) + ". " + curAuthor + " -> "
            + curBook.getId(connection) + ". " + curBook);
      }

      resultSet.close();
      statement.close();

    } catch (SQLException exc) {
      exc.printStackTrace();
    }

  }

  private static void printYoungAuthors(Connection connection) {
    String sql = "select a.name, a.age\n"
        + "from authors a\n"
        + "where a.age < 50;" ;

    try ( Statement statement = connection.createStatement();
          ResultSet resultSet = statement.executeQuery(sql);) {

      Author author = new Author();

      while (resultSet.next()) {
        author.setName(resultSet.getString("a.name"));
        author.setAge(resultSet.getInt("a.age"));
        System.out.println(author.getId(connection) + ". " + author);
      }

      resultSet.close();

      statement.close();

    } catch (SQLException exc) {

      exc.printStackTrace();

    }
  }



  private static void printExpensiveBooks(Connection connection) {
    String sql = "select a.name ,b.name, b.price\n"
        + "from books b\n"
        + "inner join authors a\n"
        + "on b.author_id = a.id\n"
        + "order by b.price desc;"
        ;

    try ( Statement statement = connection.createStatement();
          ResultSet resultSet = statement.executeQuery(sql);) {

      Author author = new Author();
      Book book = new Book();

      while (resultSet.next()) {
        author.setName(resultSet.getString("a.name"));
        book.setName(resultSet.getString("b.name"));
        book.setPrice(resultSet.getInt("b.price"));
        System.out.println(book + " <- " + author);
      }

      resultSet.close();
      statement.close();

    } catch (SQLException exc) {
      exc.printStackTrace();
    }
  }

  private static void printCustomersBooks(Connection connection, Customer customer) {
    String sql = "select s.id, c.name, a.name, b.name\n"
        + "from sells s\n"
        + "inner join customers c\n"
        + "on s.customer_id = c.id\n"
        + "\n"
        + "inner join books b\n"
        + "on s.book_id = b.id\n"
        + "\n"
        + "inner join authors a\n"
        + "on b.author_id = a.id\n"
        + "\n"
        + "where c.name = \'"
        + customer.getName()
        + "\'"
        + ";"
        ;

    try (Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery(sql);) {

      Book book = new Book();
      Author author = new Author();

      System.out.println(customer.getId(connection));

      while (resultSet.next()) {
        book.setName(resultSet.getString("b.name"));
        author.setName(resultSet.getString("a.name"));
        System.out.println(book + " <- " + author);
      }

      resultSet.close();
      statement.close();

    } catch (SQLException exc) {

      exc.printStackTrace();

    }
  }

  private  static  void printGroupByAuthors(Connection connection) {
    String sql = "select a.name, sum(b.price) as summ\n"
        + "from books b\n"
        + "inner join authors a\n"
        + "on b.author_id = a.id\n"
        + "group by a.name;"
        ;

    try (Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery(sql);) {

      Author author = new Author();

      while (resultSet.next()) {
        author.setName(resultSet.getString("a.name"));
        int summ = resultSet.getInt("summ");
        System.out.println(author + " -> " + summ);
      }

      resultSet.close();
      statement.close();

    } catch (SQLException exc) {
      exc.printStackTrace();
    }


  }

  private static void addAuthors(Connection connection,Author author) {

    if (isAuthorExist(connection, author)) {
      System.out.println("Author is exist");
      return;
    }

    String sql = "insert into authors (name, age)"
        + " values(?, ?);"
        ;


    try (PreparedStatement statement = connection.prepareStatement(sql);) {
      statement.setString(1,author.getName());
      statement.setInt(2, author.getAge());

      statement.executeUpdate();

      statement.close();
    } catch (SQLException exc) {
      exc.printStackTrace();
    }
  }

  private static void addCustomer(Connection connection, Customer customer) {
    try {
      if (isCustomerExist(connection, customer)) {
        System.out.println("We have this customer.");
        return;
      }
    } catch (SQLException exc) {
      exc.printStackTrace();
    }

    String sql = "insert into customers (name)\n"
        + " values(?);"
        ;

    try (PreparedStatement preparedStatement = connection.prepareStatement(sql);) {

      preparedStatement.setString(1, customer.getName());

      preparedStatement.executeUpdate();

      preparedStatement.close();
    } catch (SQLException exc) {
      exc.printStackTrace();
    }
  }

  private static void addBook(Connection connection, Book book, Author author) {

    if (isBookExist(connection, book)) {
      System.out.println("This book is already exist");
      return;
    }



    if (!isAuthorExist(connection, author)) {
      addAuthors(connection, author);
    }

    String sql = "insert into books (name, author_id, price)"
        + " values(?, ?, ?);"
        ;

    try (PreparedStatement statement = connection.prepareStatement(sql);) {

      statement.setString(1, book.getName());

      statement.setInt(2, author.getId(connection));

      statement.setDouble(3, book.getPrice());

      statement.executeUpdate();

      statement.close();
    } catch (SQLException exc) {
      exc.printStackTrace();
    }


  }

  private static  void addCells(Connection connection, Customer customer,
                                Author author, Book book) {

    if (!isAuthorExist(connection ,author) || !isBookExist(connection, book)) {
      System.out.println("Sorry " + "mr.s. " + customer.getName() + " the store hasn't this book");
      return;
    }

    String sql = "insert into sells (customer_id, book_id)\n"
        + "values(?, ?);"
        ;

    try (PreparedStatement preparedStatement = connection.prepareStatement(sql);) {

      preparedStatement.setInt(1, customer.getId(connection));

      preparedStatement.setInt(2, book.getId(connection));

      preparedStatement.executeUpdate();

      preparedStatement.close();

    } catch (SQLException exc) {
      exc.printStackTrace();
    }


  }

  private static boolean isAuthorExist(Connection connection,Author author) {
    String sql = "select a.id from authors a"
        + " where a.name = \'"
        + author.getName()
        + "\';"
        ;

    boolean result = false;

    try (Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery(sql);) {

      while (resultSet.next()) {
        result = true;
        break;
      }

      resultSet.close();
      statement.close();

    } catch (SQLException exc) {
      exc.printStackTrace();
    }

    return result;
  }

  private static boolean isBookExist(Connection connection, Book book) {
    String sql = "select b.id from books b\n"
        + "where b.name = \'"
        + book.getName() + "\';"
        ;

    boolean result = false;

    try (Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery(sql);) {

      while (resultSet.next()) {
        result = true;
        break;
      }

      resultSet.close();
      statement.close();

      return result;

    } catch (SQLException exc) {

      exc.printStackTrace();

    } finally {

      return result;

    }

  }

  private static boolean isCustomerExist(Connection connection ,Customer customer) throws SQLException {
    String sql = "select c.id\n"
        + "from customers c\n"
        + "where c.name = \'"
        + customer.getName()
        + "\';"
        ;

    boolean result = false;

    try (Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery(sql);) {

      while (resultSet.next()) {
        result = true;
        break;
      }

      resultSet.close();
      statement.close();

    } catch (SQLException exc) {

      exc.printStackTrace();

    } finally {

      return result;

    }
  }

  private static void deleteBook(Connection connection, Book book) {
    String sql = "delete from books where name = \'"
        + book.getName()
        + "\';"
        ;
    try (Statement statement = connection.createStatement();) {
      statement.execute(sql);

      statement.close();

    } catch (SQLException exc) {
      exc.printStackTrace();
    }

  }
}
