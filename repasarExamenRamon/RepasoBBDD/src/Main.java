import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Main {
    static ResultSet rs = null;
    static Statement st = null;
    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<Productos> productos = new ArrayList<>();
    static Connection cn;
    static final String url = "jdbc:postgresql://172.21.29.50:5432/super";
    static final String user = "userDAW";

    static final String pass = "Java";

    public static void main(String[] args) {
        try {
            cn = DriverManager.getConnection(url, user, pass);

            cargarDatosClientes();
            cargarDatosProductos();
            insertarFactura();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                cn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }


    }

    private static void insertarFactura() {
        String sql = "INSERT INTO facturas(numero,codigo,fecha,hora,importe_total) VALUES (?,?,?,?,?)";

        try {
            PreparedStatement pst = cn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1,"15235");
            pst.setString(2,"c23558");
            pst.setDate(3, Date.valueOf(LocalDate.now()));
            pst.setTime(4, Time.valueOf(LocalTime.now()));
            pst.setDouble(5,156.36);

            pst.executeUpdate();
            ResultSet rs = pst.getGeneratedKeys();
            rs.next();
            System.out.println("Id generado " + rs.getInt(1));
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void cargarDatosClientes() {
        String sql = "SELECT * FROM clientes";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                clientes.add(new Cliente(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellido"), rs.getString("tipo_doc"), rs.getString("nro_doc"), rs.getString("nro_tel_princ"), rs.getString("nro_tel_sec"), rs.getString("email")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                st.close();
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        /*
        for (Cliente datos: clientes) {
            System.out.println(datos);
        }
        */
    }

    private static void cargarDatosProductos() {
        String sql = "SELECT * FROM productos";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                productos.add(new Productos(rs.getInt("id"), rs.getInt("id_proveedor"), rs.getString("codigo"), rs.getString("imagen"), rs.getString("nombre"), rs.getString("marca"), rs.getString("tipo"), rs.getString("grupo"), rs.getDouble("peso"), rs.getDouble("precio_unidad"), rs.getInt("stock")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                st.close();
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}