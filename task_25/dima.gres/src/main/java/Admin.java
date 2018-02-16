import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class Admin {

  private HashSet<Author> authors;
  private HashSet<Customer> customers;
  private HashSet<Book> books;

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

  public Admin() {
    this.authors  = new HashSet<>();
    this.customers = new HashSet<>();
    this.books = new HashSet<>();
  }

  public HashSet<Author> getAuthors(Connection connection) {

    try (Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery(SELECTAUTHORS)) {

      int count = 0;

      while (resultSet.next()) {

        authors.add(new Author(resultSet.getString("a.name"), resultSet.getInt("a.age"),
            resultSet.getInt("a.id")));

      }

      resultSet.close();

      statement.close();

    } catch (SQLException exc) {

      exc.printStackTrace();

    }

    return authors;
  }

  public HashSet<Customer> getCustomers(Connection connection) {

    try (Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery(SELECTCUSTOMERS)) {

      while (resultSet.next()) {

        customers.add(new Customer(resultSet.getInt("c.id"), resultSet.getString("c.name")));

      }

      resultSet.close();

      statement.close();

    } catch (SQLException exc) {

      exc.printStackTrace();

    }

    return customers;
  }

  public HashSet<Book> getBooks(Connection connection) {

    try (Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery(SELECTBOOKS)) {

      while (resultSet.next()) {
        books.add(new Book(resultSet.getInt("b.id"), resultSet.getInt("b.author_id"),
            resultSet.getString("b.name"), resultSet.getDouble("b.price")));
      }

      resultSet.close();

      statement.close();

    } catch (SQLException exc) {

      exc.printStackTrace();

    }

    return books;
  }
}
