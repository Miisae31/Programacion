import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        String url, user, pass, slq;
        Scanner scanner = new Scanner(System.in);
        url = "jdbc:mysql://localhost:3306/progrex";
        user = "root";
        pass = "hola";
        PreparedStatement st;
        Connection cn = null;
        ResultSet rs = null;
        ArrayList<User> lista = new ArrayList<>();
        int opcion = 0;
        try {
            cn = DriverManager.getConnection(url, user, pass);
            cn.setAutoCommit(false);
            st = cn.prepareStatement("SELECT * FROM users");
            rs = st.executeQuery();
            while(rs.next()) {
                lista.add(new User(rs.getInt("id"),rs.getString("name"),rs.getString("email")));

            }

            while (opcion != 3) {
                System.out.println("#### MENU ####");
                System.out.println("Escoga una opcion");
                System.out.println("1. Listar Usuarios");
                System.out.println("2. Añadir nuevo usuario");
                System.out.println("3. Salir");
                opcion = scanner.nextInt();


                switch (opcion) {
                    case 1:
                        ListarUsuarios(lista, cn);
                        break;

                    case 2:
                        anadirNuevoUsuario(st, cn);
                        break;
                    case 3:
                        cn.commit();
                        cn.setAutoCommit(true);
                        System.exit(0);
                        break;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (cn != null){
                    cn.close();
                }
                if (rs != null) {
                    rs.close();
                }

            }catch (SQLException e) {
                System.out.println("Error en el programa");
            }
        }
    }
        static void ListarUsuarios(ArrayList<User> lista, Connection cn) {

                for (User usr : lista) {
                    System.out.println("Id: " + usr.getId() + "Name: " + usr.getNombre() + "Email: " + usr.getEmail());
                }

            }


        static void anadirNuevoUsuario(PreparedStatement st, Connection cn) {
        try {

            Scanner scanner = new Scanner(System.in);
            String nombreUsuario;
            String emailUsuario;
            st = cn.prepareStatement("INSERT INTO users (name,email) VALUES (?,?)");

            System.out.println("Introduce el nombre del usuario a ingresar");
            nombreUsuario = scanner.nextLine();
            System.out.println("Introduce el email del usuario a ingresar");
            emailUsuario = scanner.nextLine();
            st.setString(1,nombreUsuario);
            st.setString(2,emailUsuario);
            int confirmacion = st.executeUpdate();
            if (confirmacion > 0) {
                System.out.println("Usuario ingresado correctamente");
            } else {
                System.out.println("Error al ingresar el usuario");
            }


        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}