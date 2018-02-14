import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Author {
  private String name;
  private int age;

  public Author() {
  }

  public Author(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public int getId(Connection connection) {
    String sql = "select a.id from authors a\n"
        + " where a.name = \'"
        + name
        + "\';"
        ;

    int id = -1;

    try (Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery(sql);) {

      while (resultSet.next()) {
        id = resultSet.getInt("a.id");
      }

      resultSet.close();
      statement.close();

    } catch (SQLException exc) {
      exc.printStackTrace();

    }



    return id;
  }

  @Override
  public String toString() {
    String inforamtion = "\'" + name + "\'";
    if (age != 0) {
      inforamtion += " age = " + "\'" + age + "\'";
    }
    return inforamtion;
  }
}
