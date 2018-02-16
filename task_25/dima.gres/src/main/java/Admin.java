import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Admin {

  private Connection connection;

  private HashMap<Author, Integer> authors;
  private HashMap<Customer, Integer> customers;
  private HashMap<Book, Integer> books;
  private HashMap<Sell, Integer> sells;

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

  public Admin(Connection connection) {
    this.connection = connection;

    this.authors  = new HashMap<>();
    this.customers = new HashMap<>();
    this.books = new HashMap<>();
    this.sells = new HashMap<>();

    setAuthors();
    setBooks();
    setCustomers();
    setSells();
  }

  private void setAuthors() {

    try (Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery(SELECTAUTHORS)) {

      int count = 0;

      while (resultSet.next()) {

        authors.put(new Author(resultSet.getString("a.name"), resultSet.getInt("a.age"),
            resultSet.getInt("a.id")), resultSet.getInt("a.id"));

      }

      resultSet.close();

      statement.close();

    } catch (SQLException exc) {

      exc.printStackTrace();

    }
  }

  private void setCustomers() {

    try (Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery(SELECTCUSTOMERS)) {

      while (resultSet.next()) {

        customers.put(new Customer(resultSet.getInt("c.id"),
            resultSet.getString("c.name")), resultSet.getInt("c.id"));

      }

      resultSet.close();

      statement.close();

    } catch (SQLException exc) {

      exc.printStackTrace();

    }
  }

  private void setBooks() {

    try (Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery(SELECTBOOKS)) {

      while (resultSet.next()) {
        books.put(new Book(resultSet.getInt("b.id"), resultSet.getInt("b.author_id"),
            resultSet.getString("b.name"), resultSet.getDouble("b.price")), resultSet.getInt("b.id"));
      }

      resultSet.close();

      statement.close();

    } catch (SQLException exc) {

      exc.printStackTrace();

    }
  }

  private void setSells() {

    try (Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(SELECTSELLS)) {

      while (resultSet.next()) {

        sells.put(new Sell(resultSet.getInt("s.id"), resultSet.getInt("s.customer_id"),
            resultSet.getInt("s.book_id")), resultSet.getInt("s.id"));

      }

      resultSet.close();

      statement.close();

    } catch (SQLException exc) {

      exc.printStackTrace();

    }
  }
}
