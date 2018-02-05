package ua.pp.darknsoft.jdbc;

import ua.pp.darknsoft.entity.Book;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SelectBooksImpl implements SelectBooks {

  @Override
  public Book getBookById(int bookId) {
    String sql = "SELECT * FROM books WHERE id = ?";
    try (Connection connection = DBStatic.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql)) {
      statement.setInt(1, bookId);
      List<Book> list = select(statement);
      if (list.isEmpty()) {
        return new Book(0, "", 0, new BigDecimal(0.00));
      } else {
        return list.get(0);
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return null;
  }

  private List<Book> select(PreparedStatement statement) {
    List<Book> list = new ArrayList<>();
    try (ResultSet resultSet = statement.executeQuery()) {

      while (resultSet.next()) {
        int id = resultSet.getInt("id");
        String name = resultSet.getString("name");
        int authorId = resultSet.getInt("author_id");
        BigDecimal price = resultSet.getBigDecimal("price");
        list.add(new Book(id, name, authorId, price));
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
    return list;
  }
}
