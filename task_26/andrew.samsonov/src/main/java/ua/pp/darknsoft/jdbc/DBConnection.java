package ua.pp.darknsoft.jdbc;

import ua.pp.darknsoft.Main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public enum DBConnection {

  INSTANCE;

  private static final Connection CONNECTION = createConnection();

  public Connection getConnection() {
    return CONNECTION;
  }

  private static Connection createConnection() {
    Properties properties = new Properties();
    Connection connection = null;
    try {
      properties.load(Main.class.getClassLoader().getResourceAsStream("db.properties"));
      connection = DriverManager
          .getConnection(properties.getProperty("url"),
              properties.getProperty("username"),
              properties.getProperty("password"));
    } catch (IOException ex) {
      ex.printStackTrace();
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
    return connection;
  }

}
