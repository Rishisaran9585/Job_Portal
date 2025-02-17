package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
   private static Connection Conn;

   public DBConnect() {
   }

   public static Connection getconn() {
      try {
         if (Conn == null) {
            // Load the MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Updated connection string with allowPublicKeyRetrieval and useSSL
            Conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/DemoJob?allowPublicKeyRetrieval=true&useSSL=false", 
                "root", 
                "password"
            );
         }
      } catch (Exception var1) {
         var1.printStackTrace();
      }

      return Conn;
   }
}
