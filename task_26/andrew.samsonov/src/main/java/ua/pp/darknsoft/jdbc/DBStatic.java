package ua.pp.darknsoft.jdbc;

import ua.pp.darknsoft.Main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBStatic {

  private DBStatic() {
  }

  public static Connection getConnection() throws SQLException {
    Properties properties = new Properties();
    try {
      properties.load(Main.class.getClassLoader().getResourceAsStream("db.properties"));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    return DriverManager
        .getConnection(properties.getProperty("url"),
            properties.getProperty("username"),
            properties.getProperty("password"));
  }

}
