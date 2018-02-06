package ua.pp.darknsoft.jdbc;

import ua.pp.darknsoft.entity.Author;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;


public class SelectAuthorsImpl implements SelectAuthors {

  public Author getAuthorById(int authorId) {
    String sql = "SELECT * FROM authors WHERE id = ?";
    try (Connection connection = DBUtil.getConnection(); PreparedStatement statement = connection
        .prepareStatement(sql)) {
      statement.setInt(1, authorId);
      List<Author> list = DBUtil.selectAuthors(statement);
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
    String sql = "SELECT * FROM authors WHERE UPPER(firstname) = ?";
    return getAuthorsList(sql, firstName.toUpperCase());
  }

  public List<Author> getAuthorsByLastName(String lastName) {
    String sql = "SELECT * FROM authors WHERE UPPER(lastname) = ?";
    return getAuthorsList(sql, lastName.toUpperCase());
  }

  private List<Author> getAuthorsList(String sql, String param) {
    try (Connection connection = DBUtil.getConnection(); PreparedStatement statement = connection
        .prepareStatement(sql)) {
      statement.setString(1, param);
      List<Author> list = DBUtil.selectAuthors(statement);
      return list;
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return null;
  }

}
