package org.example;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.DriverManager;

    public class Main {

        public static void main(String[] args) {
            String url, user, password;
            url = "jdbc:mysql://172.21.29.50:3306/sakila?zeroDateTimeBehavior=CONVERT_TO_NULL";
            user = "userDAW";
            password = "Java";

            try {
                //Se crea la conexion con el connection
                Connection conn = DriverManager.getConnection(url, user, password);
                //Se crea un Statement de SQL mediante la conexion
                Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                //Se asigna a ResultSet el resultado del SELECT FROM actor
                ResultSet rs = stmt.executeQuery("SELECT * FROM actor");

                // Obtener metadatos del ResultSet
                ResultSetMetaData rsmd = rs.getMetaData();
                int columnCount = rsmd.getColumnCount();

                // Recorriendo hacia adelante
                System.out.println("Recorriendo hacia adelante:");
                while (rs.next()) {
                    for (int i = 1; i <= columnCount; i++) {
                        String columnName = rsmd.getColumnName(i);
                        String value = rs.getString(i);
                        System.out.println(columnName + ": " + value);
                    }
                    System.out.println("-------------------");
                }

                // Recorriendo hacia atrás
                System.out.println("Recorriendo hacia atrás:");
                while (rs.previous()) {
                    for (int i = 1; i <= columnCount; i++) {
                        String columnName = rsmd.getColumnName(i);
                        String value = rs.getString(i);
                        System.out.println(columnName + ": " + value);
                    }
                    System.out.println("-------------------");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
