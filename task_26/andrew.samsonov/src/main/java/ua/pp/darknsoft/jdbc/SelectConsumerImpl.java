package ua.pp.darknsoft.jdbc;

import ua.pp.darknsoft.entity.Consumer;

import java.sql.PreparedStatement;
import java.util.List;

public class SelectConsumerImpl implements SelectConsumer {

  @Override
  public Consumer getConsumerById(int consumerId) {
    String sql = "SELECT * FROM consumers WHERE id = ?";
    try (PreparedStatement statement = DBConnection.INSTANCE.getConnection()
        .prepareStatement(sql)) {
      statement.setInt(1, consumerId);
      List<Consumer> list = DBUtil.selectConsumers(statement);
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
    String sql = "SELECT * FROM consumers WHERE UPPER(firstname) = ?";
    return getConsumersList(sql, firstName.toUpperCase());
  }

  @Override
  public List<Consumer> getConsumerByLastName(String lastName) {
    String sql = "SELECT * FROM consumers WHERE UPPER(lastname) = ?";
    return getConsumersList(sql, lastName.toUpperCase());
  }

  private List<Consumer> getConsumersList(String sql, String param) {
    try (PreparedStatement statement = DBConnection.INSTANCE.getConnection()
        .prepareStatement(sql)) {
      statement.setString(1, param);
      List<Consumer> list = DBUtil.selectConsumers(statement);
      return list;
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return null;
  }
}
