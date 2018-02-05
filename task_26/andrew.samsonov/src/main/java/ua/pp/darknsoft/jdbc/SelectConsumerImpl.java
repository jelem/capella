package ua.pp.darknsoft.jdbc;

import ua.pp.darknsoft.entity.Consumer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SelectConsumerImpl implements SelectConsumer {

  @Override
  public Consumer getConsumerById(int consumerId) {
    String sql = "SELECT * FROM consumers WHERE id = " + consumerId;
    try (Connection connection = DBStatic.getConnection()) {
      List<Consumer> list = select(connection, sql);
      if (list.isEmpty()) {
        return new Consumer(0, "", "", 0);
      } else {
        return list.get(0);
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return null;
  }

  @Override
  public List<Consumer> getConsumerByFirstName(String firstName) {
    return null;
  }

  @Override
  public List<Consumer> getConsumerByLastName(String lastName) {
    return null;
  }

  private List<Consumer> select(Connection connection, String sql) {
    List<Consumer> list = new ArrayList<>();
    try (Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql)) {

      while (resultSet.next()) {
        int id = resultSet.getInt("id");
        String firstName = resultSet.getString("firstname");
        String lastName = resultSet.getString("lastname");
        int age = resultSet.getInt("age");
        list.add(new Consumer(id, firstName, lastName, age));
      }

    } catch (SQLException ex) {
      ex.printStackTrace();
    }
    return list;
  }
}
