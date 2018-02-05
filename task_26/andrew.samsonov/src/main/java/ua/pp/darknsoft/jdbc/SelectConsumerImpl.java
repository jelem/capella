package ua.pp.darknsoft.jdbc;

import ua.pp.darknsoft.entity.Consumer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SelectConsumerImpl implements SelectConsumer {

  @Override
  public Consumer getConsumerById(int consumerId) {
    String sql = "SELECT * FROM consumers WHERE id = ?";
    try (Connection connection = DBStatic.getConnection(); PreparedStatement statement = connection
        .prepareStatement(sql)) {
      statement.setInt(1, consumerId);
      List<Consumer> list = select(statement);
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

  private List<Consumer> select(PreparedStatement statement) {
    List<Consumer> list = new ArrayList<>();
    try (ResultSet resultSet = statement.executeQuery()) {
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
