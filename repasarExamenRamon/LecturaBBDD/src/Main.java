import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;

public class Main {
    public static void main(String[] args) {
        String url, user, pass, sql;

        url = "jdbc:mysql://localhost:3306/java";
        user = "root";
        pass = "hola";
        Connection cn = null;
        try {
            cn = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            e.printStackTrace();
            return;
        }

        // Como funciona un statement y como se almacena dentro de un resultset
        // EL rs.next se utiliza para mover el puntero hacia delante
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM empleados");
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                int edad = rs.getInt("edad");
                double salario = rs.getDouble("salario");
                System.out.println("ID: " + id + " Nombre: " + nombre + " Apellido: " + apellido + " Edad: " + edad + " Salario: " + salario);
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
// Uso de metadata
        try (
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM empleados")) {

            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();

            for (int i = 1; i <= columnCount; i++) {
                String name = rsmd.getColumnName(i);
                System.out.println("La columna " + i + " es " + name);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Uso del ResultSet Insensitive
        try {
            Statement st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery("SELECT * FROM empleados");

            while (rs.next()) {
                System.out.println("Nombre: " + rs.getString("nombre"));
            }

            if (rs.first()) {
                System.out.println("Primera fila : Nombre: " + rs.getString("nombre"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}