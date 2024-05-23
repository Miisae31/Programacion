import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EscrituraWithTransaction {
    public static void main(String[] args) {
            String url, username, pass, sql;

            url = "jdbc:mysql://localhost:3306/java";
            username = "root";
            pass = "hola";
            sql = "INSERT INTO empleados(nombre,apellido,edad,salario,departamento) VALUES (?,?,?,?,?)";
            Connection cn = null;
            PreparedStatement st = null;
            try {
                cn = DriverManager.getConnection(url, username, pass);
                cn.setAutoCommit(false);
                st = cn.prepareStatement(sql);

                st.setString(1, "Juan");
                st.setString(2, "Barrio");
                st.setInt(3, 19);
                st.setDouble(4, 2400.00);
                st.setString(5, "Mecanica");
                int rows = st.executeUpdate();
                System.out.println("Rows affected: " + rows);


                cn.commit();
            } catch (SQLException e) {
                e.printStackTrace();
                if (cn != null) {
                    try{
                        cn.rollback();
                        System.out.println("Transaction rolled back");
                    } catch (SQLException ex){
                        ex.printStackTrace();
                    }
                }


            } finally {
                try {
                    if (st != null) st.close();
                    if (cn != null) cn.close();
                } catch (SQLException e) {
                    e.printStackTrace();


                }
            }
        }
    }

