package ua.pp.darknsoft.jdbc;

import ua.pp.darknsoft.entity.Author;
import ua.pp.darknsoft.entity.Book;
import ua.pp.darknsoft.entity.Consumer;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SelectDataImpl implements SelectData {

  @Override
  public List<Book> getAllBooks() {
    String sql = "SELECT * FROM books";
    try (Connection connection = DBUtil.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql)) {
      return DBUtil.selectBooks(statement);
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
    return null;
  }

  @Override
  public List<Author> getAuthorsLessThanYears(int age) {
    String sql = "SELECT * FROM authors WHERE age < ?";
    try (Connection connection = DBUtil.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql)) {
      statement.setInt(1, age);
      return DBUtil.selectAuthors(statement);
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
    return null;
  }

  @Override
  public List<Book> getBooksByExpensivePriceLimit(int limit) {
    String sql = "SELECT * FROM books ORDER BY price DESC LIMIT 0,?";
    try (Connection connection = DBUtil.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql)) {
      statement.setInt(1, limit);
      return DBUtil.selectBooks(statement);
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
    return null;
  }

  @Override
  public List<Book> getBooksByConsumer(Consumer consumer) {
    String sql = "SELECT * FROM purchases p  JOIN books b ON (b.id = p.book_id) WHERE p.consumer_id = ?";
    try (Connection connection = DBUtil.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql)) {
      statement.setInt(1, consumer.getId());
      return DBUtil.selectBooks(statement);
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
    return null;
  }

  @Override
  public BigDecimal calculateCollectionPriceByAuthor(Author author) {
    String sql = "SELECT sum(price) cost FROM books WHERE author_id = ? GROUP BY author_id";
    try (Connection connection = DBUtil.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);) {
      statement.setInt(1, author.getId());
      try (ResultSet resultSet = statement.executeQuery()) {
        BigDecimal cost = null;
        while (resultSet.next()) {
          cost = resultSet.getBigDecimal("cost");
        }
        return cost;
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
    return null;
  }

}
