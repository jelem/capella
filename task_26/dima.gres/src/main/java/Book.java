import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Book {
  private String name;
  private double price;

  public Book() {
  }

  public Book(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getId(Connection connection) throws SQLException {
    String sql = "select b.id from books b\n"
        + " where b.name = \'" + name + "\';"
        ;

    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery(sql);

    int id = -1;

    while (resultSet.next()) {
      id = resultSet.getInt("b.id");
    }

    resultSet.close();
    statement.close();

    return id;
  }

  @Override
  public String toString() {
    String inforamtion = "\'" + name + "\'";
    if (price != 0) {
      inforamtion += " price = " + "\'" + price + "\'";
    }
    return inforamtion;
  }
}
