package ua.pp.darknsoft.jdbc;

import ua.pp.darknsoft.entity.Author;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class SelectAuthorsImpl implements SelectAuthors {

  public Author getAuthorById(int authorId) {
    String sql = "SELECT * FROM authors WHERE id = " + authorId;
    try (Connection connection = DBStatic.getConnection()) {
      List<Author> list = select(connection, sql);
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

  private List<Author> select(Connection connection, String sql) {
    List<Author> list = new ArrayList<>();
    try (Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql)) {

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
