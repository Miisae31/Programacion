import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class Main {

    private static void insertarNuevoEmpleado(Connection cn, Scanner scanner){
        String sql;
        PreparedStatement pst;
        System.out.print("Introduce los datos del empleado ");
        System.out.print("NIF: ");
        String nif = scanner.next();
        System.out.print("Nombre: ");
        String nombre = scanner.next();

        System.out.print("Apellidos: ");
        scanner.next();
        String apellidos = scanner.nextLine();
        System.out.println(apellidos);
        System.out.print("Salario: ");
        double salario = scanner.nextDouble();

        String cif_tienda;
        do {
            System.out.println("CIF de la tienda: ");
            cif_tienda = scanner.next();
            if (!Objects.equals(cif_tienda, "H77777777")) {
                System.out.println("El CIF de la tienda no es correcto");
                return;
            }
        } while (!Objects.equals(cif_tienda, "H77777777"));

        sql = "INSERT INTO daw_empleado (nif, nombre, apellidos, salario, cif_tienda) VALUES (?,?,?,?,?)";
        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, nif);
            pst.setString(2, nombre);
            pst.setString(3, apellidos);
            pst.setDouble(4, salario);
            pst.setString(5, cif_tienda);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private static void insertarNuevatienda(Connection cn, Scanner scanner) {
        String sql;
        PreparedStatement pst;
        String cif = "H77777777";
        String telefono = "685342123";
        String direccion = "Calle Falsa 123";
        String nombre = "HugoFPSl";
        String jefe = "21022005";
        double dinero = 10000;

        sql = "INSERT INTO daw_tienda (cif, telefono,direccion,nombre,jefe,dinero) VALUES (?,?,?,?,?,?)";
        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, cif);
            pst.setString(2, telefono);
            pst.setString(3, direccion);
            pst.setString(4, nombre);
            pst.setString(5, jefe);
            pst.setDouble(6, dinero);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void mostrarMenu() {
        System.out.println("1. Mostrar columnas de la tabla");
        System.out.println("2. Insertar la tienda de Hugo");
        System.out.println("3. Insertar un nuevo empleado (Tiene que ser de la tienda de Hugo)");
        System.out.println("4. Salir del menu");
        System.out.print("Ingrese la opción deseada: ");
    }


    public static void main(String[] args) {
        String url, user, pass, sql;
        url = "jdbc:postgresql://172.21.29.50:5432/super";
        user = "userDAW";
        pass = "Java";
        PreparedStatement pst;
        ArrayList<Empleado> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Connection cn = null;
        try {
            cn = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            e.printStackTrace();
            return;
        }
        while (true) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    try (
                         Statement st = cn.createStatement();
                         ResultSet rs = st.executeQuery("SELECT * FROM daw_tienda")) {

                        ResultSetMetaData rsmd = rs.getMetaData();
                        int columnCount = rsmd.getColumnCount();

                        for (int i = 1; i <= columnCount; i++) {
                            String name = rsmd.getColumnName(i);
                            System.out.println("La columna " + i + " es " + name);
                        }

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;

                case 2:
                    insertarNuevatienda(cn, scanner);
                    break;
                case 3:
                    insertarNuevoEmpleado(cn, scanner);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    if (cn != null) {
                        try {
                            cn.close();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}






