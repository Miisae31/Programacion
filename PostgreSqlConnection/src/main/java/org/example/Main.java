package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection connectionPg = null;
        Connection connectionMysql = null;
        String MysqlUser = "userDAW";
        String MysqlPass = "Java";
        String MysqlUrl = "jdbc:mysql://172.21.29.50:3306/sakila";
        String pgUser = "userDAW";
        String pgPass = "Java";
        String pgUrl = "jdbc:postgresql://172.21.29.50:5432/super";
        try {
            connectionMysql = DriverManager.getConnection(MysqlUrl, MysqlUser, MysqlPass);
            connectionPg = DriverManager.getConnection(pgUrl, pgUser, pgPass);
            System.out.println("Conexións correctas");
        } catch( SQLException e ) {
            e.printStackTrace( );
        }
    }
}
