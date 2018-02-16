import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class Admin {
  HashMap<Author, Integer> authors;

  private static final String SELECTAUTHORS = "select a.id, a.name, a.age\n"
      + "from authors a\n"
      + ";"
      ;

  public Admin() {
    this.authors  = new HashMap<>();
  }

  public HashMap<Author, Integer> getAuthors(Connection connection) {

    try (Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery(SELECTAUTHORS)) {

      int count = 0;

      while (resultSet.next()) {

        authors.put(new Author(resultSet.getString("a.name"), resultSet.getInt("a.age"),
            resultSet.getInt("a.id")), count++);


      }

    } catch (SQLException exc) {

      exc.printStackTrace();

    }

    return authors;
  }
}
