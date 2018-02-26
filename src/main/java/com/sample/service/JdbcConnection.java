package com.sample.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {

    static final String jdbcDriverName = "com.mysql.jdbc.Driver";
   static final String url = "jdbc:mysql://localhost:3306/FirstAPIDB";
    static final String username= "root";
   static final   String password="password";

    public static void main(String[] args) throws SQLException {

        Connection conn = DriverManager.getConnection(url, username, password);

        Statement statement = conn.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from ROLES");

        while (resultSet.next())
        {
           int id= resultSet.getInt("ID");
          String name=  resultSet.getString("NAME");

            System.out.println(id);
            System.out.println(name);


        }
    }

}
