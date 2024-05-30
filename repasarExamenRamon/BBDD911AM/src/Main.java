import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.sql.Date;

public class Main {
    static String url = "jdbc:mysql://localhost:3306/tienda";
    static String user = "root";
    static String pass = "hola";

   static ArrayList<Departamentos> departamento = new ArrayList<>();
   static ArrayList<Empleados> empleado = new ArrayList<>();

    static ResultSet rs = null;

    static Connection cn;
    static PreparedStatement pst = null;
    static Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {
    try {
        cn = DriverManager.getConnection(url,user,pass);

        cargarDatosDepartamentos();
        cargarDatosEmpleados();
        insertarProyecto();

    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            if (cn != null) {
                cn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }

    private static void cargarDatosDepartamentos() {
        try {
            String sql = "SELECT * FROM departamentos";
            Statement st = cn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()){
                departamento.add(new Departamentos(rs.getInt("id"),rs.getString("nombre"),rs.getString("ubicacion")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
             } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        for (Departamentos datos : departamento) {
            System.out.println(datos);
        }
    }

    private static void cargarDatosEmpleados() {
        try {
            String sql = "SELECT * FROM empleados";
            Statement st = cn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()){
                empleado.add(new Empleados(rs.getInt("id"),rs.getString("nombre"),rs.getString("apellido"),rs.getString("tipo_doc"),rs.getString("nro_doc"),rs.getString("nro_tel_princ"),rs.getString("nro_tel_sec"),rs.getString("email"),rs.getInt("id_departamento")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
               if (rs != null) {
                   rs.close();
               }


            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        for (Empleados datos : empleado) {
            System.out.println(datos);
        }
    }

    private static void insertarProyecto() {
        String sql = "INSERT INTO proyectos(nombre,codigo,fecha_inicio,presupuesto) VALUES (?,?,?,?)";
        System.out.println("Introduce los valores que se añadiran a la tabla");
        System.out.println("Introduce el nombre: ");
        String nombreUsuario = scanner.next();
        System.out.println("Introduce el codigo: ");
        String codigoUsuario = scanner.next();
        System.out.println("Introduce la fecha de inicio: ");
        String fecha_inicioUsuarioCadena = scanner.next();
        LocalDate fecha_inicioUsuario = LocalDate.parse(fecha_inicioUsuarioCadena);
        System.out.println("Introduce el presupuesto: ");
        double presupuestoUsuario = scanner.nextDouble();

        try {
            pst = cn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            pst.setString(1,nombreUsuario);
            pst.setString(2,codigoUsuario);
            pst.setDate(3,Date.valueOf(fecha_inicioUsuario));
            pst.setDouble(4,presupuestoUsuario);

            pst.executeUpdate();

            rs = pst.getGeneratedKeys();
            if(rs.next()) {
                System.out.println("Id del proyecto generado: " + rs.getInt(1));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs !=null ){
                    rs.close();
                }
                if (pst !=null ){
                    pst.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}