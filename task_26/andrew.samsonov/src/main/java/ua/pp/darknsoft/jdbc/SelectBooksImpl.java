package ua.pp.darknsoft.jdbc;

import ua.pp.darknsoft.entity.Book;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class SelectBooksImpl implements SelectBooks {

  @Override
  public Book getBookById(int bookId) {
    String sql = "SELECT * FROM books WHERE id = ?";
    try (Connection connection = DBUtil.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql)) {
      statement.setInt(1, bookId);
      List<Book> list = DBUtil.selectBooks(statement);
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
}
