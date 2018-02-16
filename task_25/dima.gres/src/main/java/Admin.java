import java.io.IOException;
import java.sql.Connection;
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

    } catch (SQLException exc) {

      exc.printStackTrace();

    }
  }
}
