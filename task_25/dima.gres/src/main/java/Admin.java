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

      while (resultSet.next()) {
        System.out.println("###");
      }

    } catch (SQLException exc) {

      exc.printStackTrace();

    }
    
    return authors;
  }
}
