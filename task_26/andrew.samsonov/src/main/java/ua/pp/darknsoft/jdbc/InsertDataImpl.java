package ua.pp.darknsoft.jdbc;

import ua.pp.darknsoft.entity.Author;
import ua.pp.darknsoft.entity.Book;
import ua.pp.darknsoft.entity.Consumer;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDataImpl implements InsertData {

  @Override
  public void addAuthor(Author author) {
    String sql = "insert into authors(firstname, lastname, age) values(?, ?, ?)";
    try (PreparedStatement statement = DBConnection.INSTANCE.getConnection()
        .prepareStatement(sql)) {
      statement.setString(1, author.getFirstName());
      statement.setString(2, author.getLastName());
      statement.setInt(3, author.getAge());
      statement.executeUpdate();
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  @Override
  public void addBook(Book book) {
    String sql = "insert into books(name, author_id, price) values(?, ?, ?)";
    try (PreparedStatement statement = DBConnection.INSTANCE.getConnection()
        .prepareStatement(sql)) {
      statement.setString(1, book.getName());
      statement.setInt(2, book.getAuthorId());
      statement.setBigDecimal(3, book.getPrice());
      statement.executeUpdate();
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  @Override
  public void addConsumer(Consumer consumer) {
    String sql = "insert into consumers(firstname, lastname, age) values(?, ?, ?)";
    try (PreparedStatement statement = DBConnection.INSTANCE.getConnection()
        .prepareStatement(sql)) {
      statement.setString(1, consumer.getFirstName());
      statement.setString(2, consumer.getLastName());
      statement.setInt(3, consumer.getAge());
      statement.executeUpdate();
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }
}
