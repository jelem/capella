package ua.pp.darknsoft.jdbc;

import ua.pp.darknsoft.entity.Author;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class SelectAuthorsImpl implements SelectAuthors {

  public Author getAuthorById(int authorId) {
    String sql = "SELECT * FROM authors WHERE id = ?";
    try (Connection connection = DBUtil.getConnection(); PreparedStatement statement = connection
        .prepareStatement(sql)) {
      statement.setInt(1, authorId);
      List<Author> list = select(statement);
      if (list.isEmpty()) {
        return new Author(0, "", "", 0);
      } else {
        return list.get(0);
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return null;
  }

  public List<Author> getAuthorsByFirstName(String firstName) {
    return null;
  }

  public List<Author> getAuthorByLastName(String lastName) {
    return null;
  }

  private List<Author> select(PreparedStatement statement) {
    List<Author> list = new ArrayList<>();
    try (ResultSet resultSet = statement.executeQuery()) {
      while (resultSet.next()) {
        int id = resultSet.getInt("id");
        String firstName = resultSet.getString("firstname");
        String lastName = resultSet.getString("lastname");
        int age = resultSet.getInt("age");
        list.add(new Author(id, firstName, lastName, age));
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
    return list;
  }
}
