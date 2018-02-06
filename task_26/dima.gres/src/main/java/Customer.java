import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Customer {
  private String name;

  public Customer(String name) {
    this.name = name;
  }

  public Customer() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId(Connection connection) throws SQLException {
    String sql = "select c.id from customers c\n"
        + " where c.name = \'" + name + "\';"
        ;

    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery(sql);

    int id = -1;

    while (resultSet.next()) {
      id = resultSet.getInt("c.id");
    }

    resultSet.close();
    statement.close();

    return id;
  }

  @Override
  public String toString() {
    return "\'" + name + "\'";
  }
}
