import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String url, user, pass, sql;
        url = "jdbc:postgresql://172.21.29.50:5432/super";
        user = "userDAW";
        pass = "Java";
        Connection cn = null;
        Scanner scanner = new Scanner(System.in);
        PreparedStatement pst = null;
        ResultSet rs = null;

        String[] nombres = {"Héctor", "Carlos", "Ramón", "Bruno", "Adrián"};
        String[] apellidos = {"Garaboa", "López", "Tutor", "Senpai", "GTA"};

        List<cliente> lista = new ArrayList<>();
        for (int i = 0; i < nombres.length; i++) {
            cliente newCliente = new cliente(1, nombres[i], apellidos[i] , "DNI", "11212" + i, "12345678" + i);
            lista.add(newCliente);
        }

        try {
            cn = DriverManager.getConnection(url, user, pass);
            cn.setAutoCommit(false);
            for (cliente cliente : lista) {
                sql = "INSERT INTO clientes (nombre, apellido, tipo_doc, nro_doc, Nro_tel_princ) VALUES (?, ?, ?, ?, ?)";
                pst = cn.prepareStatement(sql);
                pst.setString(1, cliente.getNombre());
                pst.setString(2, cliente.getApellido());
                pst.setString(3, cliente.getTipo_doc());
                pst.setString(4, cliente.getNro_doc());
                pst.setString(5, cliente.getNro_tel_princ());
                pst.executeUpdate();
            }
            cn.commit();
            sql = "DELETE FROM clientes where nombre = 'Hugo'";
            pst = cn.prepareStatement(sql);
            pst.executeUpdate();
            sql = "SELECT * FROM clientes";
            pst = cn.prepareStatement(sql);
            rs = pst.executeQuery();
            System.out.println("Lista de clientes");
            while (rs.next()) {
                System.out.println(rs.getString("nombre") + " " + rs.getString("apellido"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                if (cn != null) {
                    cn.rollback();
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}