import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class Admin {
  HashSet<Author> authors;

  private static final String SELECTAUTHORS = "select a.id, a.name, a.age\n"
      + "from authors a\n"
      + ";"
      ;

  public Admin() {
    this.authors  = new HashSet<>();
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
}
