package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
    String url = "jdbc:mysql://172.21.29.50:3306/sakila";
    String user = "userDaw";
    String password = "Java";

        try {
            Connection cn = DriverManager.getConnection(url, user, password);
            cn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).severe(ex.getMessage());
        }
    }

}