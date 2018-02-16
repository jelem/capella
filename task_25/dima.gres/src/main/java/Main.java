

import java.io.IOException;
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

import java.util.Properties;

public class Main {

  private static final String locPropertie = "/information.properties";

  public static void main(String[] args) {



    try {
      Properties properties = new Properties();
      properties.load(Main.class.getResourceAsStream(locPropertie));

    } catch (IOException exc) {

      exc.printStackTrace();

    }



  }

}