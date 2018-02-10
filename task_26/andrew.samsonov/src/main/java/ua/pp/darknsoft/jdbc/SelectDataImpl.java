package ua.pp.darknsoft.jdbc;

import ua.pp.darknsoft.entity.Author;
import ua.pp.darknsoft.entity.Book;
import ua.pp.darknsoft.entity.BookCollection;
import ua.pp.darknsoft.entity.Consumer;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class SelectDataImpl implements SelectData {

  @Override
  public List<Book> getAllBooks() {
    String sql = "SELECT * FROM books";
    try (PreparedStatement statement = DBConnection.INSTANCE.getConnection()
        .prepareStatement(sql)) {
      return DBUtil.selectBooks(statement);
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
    return Collections.emptyList();
  }

  @Override
  public List<Author> getAuthorsLessThanYears(int age) {
    String sql = "SELECT * FROM authors WHERE age < ?";
    try (PreparedStatement statement = DBConnection.INSTANCE.getConnection()
        .prepareStatement(sql)) {
      statement.setInt(1, age);
      return DBUtil.selectAuthors(statement);
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
    return Collections.emptyList();
  }

  @Override
  public List<Book> getBooksByExpensivePriceLimit(int limit) {
    String sql = "SELECT * FROM books ORDER BY price DESC LIMIT 0,?";
    try (PreparedStatement statement = DBConnection.INSTANCE.getConnection()
        .prepareStatement(sql)) {
      statement.setInt(1, limit);
      return DBUtil.selectBooks(statement);
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
    return Collections.emptyList();
  }

  @Override
  public List<Book> getBooksByConsumer(Consumer consumer) {
    String sql = "SELECT * FROM purchases p JOIN books b ON (b.id = p.book_id) WHERE p.consumer_id = ?";
    try (PreparedStatement statement = DBConnection.INSTANCE.getConnection()
        .prepareStatement(sql)) {
      statement.setInt(1, consumer.getId());
      return DBUtil.selectBooks(statement);
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
    return Collections.emptyList();
  }

  @Override
  public BookCollection calculateCollectionPriceByAuthor(Author author) {
    String sql = "SELECT sum(price) cost, COUNT(*) cnt FROM books WHERE author_id = ?";
    try (PreparedStatement statement = DBConnection.INSTANCE.getConnection()
        .prepareStatement(sql)) {
      statement.setInt(1, author.getId());
      try (ResultSet resultSet = statement.executeQuery()) {
        BookCollection bookCollection = null;
        if (resultSet.next()) {
          BigDecimal price = resultSet.getBigDecimal("cost");
          int numberOfBooks = resultSet.getInt("cnt");
          bookCollection = new BookCollection(price, author, numberOfBooks);
        }
        return bookCollection;
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
    return null;
  }

  @Override
  public List<BookCollection> calculateCollectionPriceByAllAuthors() {
    String sql = "SELECT sum(price) cost, count(*) count, a.* FROM books b "
        + "INNER JOIN authors a ON (a.id = author_id) GROUP BY author_id";
    try (PreparedStatement statement = DBConnection.INSTANCE.getConnection()
        .prepareStatement(sql)) {
      return DBUtil.selectBookCollections(statement);
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
    return Collections.emptyList();
  }

}
