import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Main {

  public static void main(String[] args) {
    Connection connection = null;

    try {
      connection = DriverManager.
          getConnection("jdbc:mysql://localhost:3306/books_store?serverTimezone=UTC&useSSL=false",
          "root", "dima");

      System.out.println("\n\tLIST BOOKS WITH AUTHORS");
      printAllBooksWithAuthors(connection);
      System.out.println("\n\tLIST YOUNG AUTHORS");
      printYoungAuthors(connection);
      System.out.println("\n\tLIST THE EXPENSIEVST BOOKS");
      printExpensiveBooks(connection);
      System.out.println("\n\tBOOKS WERE BEEN BOUGHT BY NIKITA MORGUNOV");
      printCustomersBooks(connection, "Nikita Morgunov");
      System.out.println("\n\tTOTAL COMPLECT WILLIAM SHAKESPEARE");
      printSummByAuthor(connection, "William Shakespeare");
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        connection.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }

  }

  private static void  prinAuthors(Connection connection) {
    String sql = "select * from authors";
    Statement statement = null;
    ResultSet resultSet = null;

    try {
      statement = connection.createStatement();
      resultSet = statement.executeQuery(sql);

      while (resultSet.next()) {
        String name = resultSet.getString("name");
        int age = resultSet.getInt("age");
        System.out.println(name + " " + age);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }  finally {
      try {
        assert resultSet != null;
        resultSet.close();
        statement.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }

    }
  }

  private static void printAllBooksWithAuthors(Connection connection) {
    String sql = "select b.name, a.name" +
        " from books b" +
        " inner join authors a" +
        " on b.author_id = a.id;";
    Statement statement = null;
    ResultSet resultSet = null;

    try {
      statement = connection.createStatement();
      resultSet = statement.executeQuery(sql);

      while (resultSet.next()) {
        String book = resultSet.getString("b.name");
        String author = resultSet.getString("a.name");
        System.out.println(book + " ************ " + author);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }  finally {
      try {
        assert resultSet != null;
        resultSet.close();
        statement.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }

    }
  }

  private static void  printYoungAuthors(Connection connection) {
    String sql = "select * from authors a " +
        "where a.age <= 50;";
    Statement statement = null;
    ResultSet resultSet = null;

    try {
      statement = connection.createStatement();
      resultSet = statement.executeQuery(sql);

      while (resultSet.next()) {
        String name = resultSet.getString("a.name");
        int age = resultSet.getInt("a.age");
        System.out.println(name + " " + age);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }  finally {
      try {
        assert resultSet != null;
        resultSet.close();
        statement.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }

  private static void printExpensiveBooks(Connection connection) {
    String sql = "select * from books b " +
        "inner join authors a " +
        "on b.author_id = a.id " +
        "order by price desc limit 10;";
    Statement statement = null;
    ResultSet resultSet = null;

    try {
      statement = connection.createStatement();
      resultSet = statement.executeQuery(sql);

      while (resultSet.next()) {
        String author = resultSet.getString("a.name");
        String book = resultSet.getString("b.name");
        int price = resultSet.getInt("b.price");
        System.out.println(book + " * " + author + " * " + price + " grn");
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }  finally {
      try {
        assert resultSet != null;
        resultSet.close();
        statement.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }

  private static void printCustomersBooks(Connection connection, String customer_name) {
    String sql = "select c.name, b.name, a.name, b.price\n" +
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
        "where c.name = " +
        "'" +
        customer_name +
        "'" +
        ";";
    Statement statement = null;
    ResultSet resultSet = null;

    try {
      statement = connection.createStatement();
      resultSet = statement.executeQuery(sql);

      while (resultSet.next()) {
        String author = resultSet.getString("a.name");
        String book = resultSet.getString("b.name");
        int price = resultSet.getInt("b.price");
        System.out.println(book + " * " + author + " * " + price + " grn");
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }  finally {
      try {
        assert resultSet != null;
        resultSet.close();
        statement.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }

  private static void printSummByAuthor(Connection connection, String author) {
    String sql = "select a.name, sum(b.price) as sum\n" +
        "from books b\n" +
        "inner join authors a\n" +
        "on b.author_id = a.id\n" +
        "where a.name = " +
        "'" + author + "'" +
        "group by a.name;";
    Statement statement = null;
    ResultSet resultSet = null;

    try {
      statement = connection.createStatement();
      resultSet = statement.executeQuery(sql);

      while (resultSet.next()) {
        int sum = resultSet.getInt("sum");
        System.out.println(author + " * " + sum + " grn");
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }  finally {
      try {
        assert resultSet != null;
        resultSet.close();
        statement.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }
}
