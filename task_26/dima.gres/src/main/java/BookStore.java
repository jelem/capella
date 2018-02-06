import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class BookStore {

  public static void main(String[] args) throws IOException, SQLException {
    Properties properties = new Properties();
    properties.load(BookStore.class.getResourceAsStream("/db.properties"));

    Connection connection = DriverManager.
        getConnection(properties.getProperty("url"),
            properties.getProperty("user"),
            properties.getProperty("password"))
        ;

//    printCustomersBooks(connection, new Customer("Misha Khaminsky"));
//    addAuthors(connection, new Author("Boris Pasternak", 123));

    printBooksSAuthors(connection);

    connection.close();
  }

  private static void printBooksSAuthors(Connection connection) throws SQLException {
    String sql = "select a.name, b.name\n" +
        "from books b\n" +
        "inner join authors a\n" +
        "on b.author_id = a.id\n" +
        "order by a.name;";

    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery(sql);
    Author curAuthor = new Author();
    Book curBook = new Book();

    while (resultSet.next()) {

      curAuthor.setName(resultSet.getString("a.name"));

      curBook.setName(resultSet.getString("b.name"));
      System.out.println(curAuthor.getId(connection) + ". " + curAuthor + " -> "
          + curBook.getId(connection) + ". " + curBook);
    }

    resultSet.close();
    statement.close();
  }

  private static void printYoungAuthors(Connection connection) throws SQLException {
    String sql = "select a.name, a.age\n" +
        "from authors a\n" +
        "where a.age < 50;" ;

    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery(sql);

    Author author = new Author();

    while (resultSet.next()) {
      author.setName(resultSet.getString("a.name"));
      author.setAge(resultSet.getInt("a.age"));
      System.out.println(author.getId(connection) + ". " + author);
    }

    resultSet.close();
    statement.close();
  }

  private static void printExpensiveBooks(Connection connection) throws SQLException {
    String sql = "select a.name ,b.name, b.price\n" +
        "from books b\n" +
        "inner join authors a\n" +
        "on b.author_id = a.id\n" +
        "order by b.price desc;";
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery(sql);

    Author author = new Author();
    Book book = new Book();

    while (resultSet.next()) {
      author.setName(resultSet.getString("a.name"));
      book.setName(resultSet.getString("b.name"));
      book.setPrice(resultSet.getInt("b.price"));
      System.out.println(book + " <- " + author);
    }

    resultSet.close();
    statement.close();
  }

  private static void printCustomersBooks(Connection connection, Customer customer) throws SQLException {
    String sql = "select s.id, c.name, a.name, b.name\n" +
        "from sells s\n" +
        "inner join customers c\n" +
        "on s.customer_id = c.id\n" +
        "\n" +
        "inner join books b\n" +
        "on s.book_id = b.id\n" +
        "\n" +
        "inner join authors a\n" +
        "on b.author_id = a.id\n" +
        "\n" +
        "where c.name = \'" + customer.getName() + "\'" +
        ";"
        ;

    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery(sql);

    Book book = new Book();
    Author author = new Author();

    System.out.println(customer.getId(connection));

    while (resultSet.next()) {
      book.setName(resultSet.getString("b.name"));
      author.setName(resultSet.getString("a.name"));
      System.out.println(book + " <- " + author);
    }

    resultSet.close();
    statement.close();
  }

  private  static  void printGroupByAuthors(Connection connection) throws SQLException {
    String sql = "select a.name, sum(b.price) as summ\n" +
        "from books b\n" +
        "inner join authors a\n" +
        "on b.author_id = a.id\n" +
        "group by a.name;"
        ;

    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery(sql);

    Author author = new Author();

    while (resultSet.next()) {
      author.setName(resultSet.getString("a.name"));
      int summ = resultSet.getInt("summ");
      System.out.println(author + " -> " + summ);
    }

    resultSet.close();
    statement.close();
  }

  private static void addAuthors(Connection connection,Author author) throws SQLException {
    String sql = "insert into authors (name, age)"
     + " values(?, ?);"
        ;

    PreparedStatement statement = connection.prepareStatement(sql);

    statement.setString(1,author.getName());
    statement.setInt(2, author.getAge());

    statement.executeUpdate();

    statement.close();
  }

  private static void addBook(Connection connection, Book book, Author author) throws SQLException {
    String sql = "insert into books (name, author_id, price)"
    + " values(?, ?, ?);"
        ;

    PreparedStatement statement = connection.prepareStatement(sql);

    statement.setString(1, book.getName());

    statement.setInt(2, author.getId(connection));

    statement.setDouble(3, book.getPrice());

    statement.executeUpdate();

    statement.close();
  }
}
