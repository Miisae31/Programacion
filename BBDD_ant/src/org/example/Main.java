package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.sql.ResultSet;


public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://172.21.29.50:3306/sakila";
        String user = "userDAW";
        String password = "Java";
        String sql;
        Statement st;
        ResultSet rs;

        try {
            Connection cn = DriverManager.getConnection(url, user, password);
            System.out.println("Estamos conectados");
            st = cn.createStatement();
            sql = "INSERT INTO actor (first_name, last_name) VALUES ('Hugo', 'Fernandez')";
            st.executeUpdate(sql);
            sql = "SELECT * FROM actor";

            // sql = "INSERT";
            // sql = "UPDATE";
            // sql = "DELETE";

            rs = st.executeQuery(sql);
            while (rs.next()) {
                System.out.println("actor_id: " + rs.getInt("actor_id"));
                System.out.println("first_name: " + rs.getString("first_name"));
                System.out.println("last_name: " + rs.getString("last_name"));
                System.out.println("last_update: " + rs.getString("last_update"));
            }

            cn.close();

            System.out.println("Cerramos la conexion");
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,ex);
        }


    }

}