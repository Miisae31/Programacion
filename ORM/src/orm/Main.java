package orm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    static void mostrarMenu() {
        System.out.println("1. Cargar actores");
        System.out.println("2. Insertar un nuevo actor");
        System.out.println("3. Modificar un actor existente");
        System.out.print("Ingrese la opción deseada: ");
    }

    static void cargarActores(ResultSet rs, ArrayList<Actor> lista) {
        try {
            while (rs.next()) {
                int id = rs.getInt("actor_id");
                String nombre = rs.getString("first_name");
                String apellido = rs.getString("last_name");
                LocalDateTime fecha = rs.getTimestamp("last_update").toLocalDateTime();
                Actor actor = new Actor(id, nombre, apellido, fecha);
                lista.add(actor);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void insertarNuevoActor(Connection cn, Scanner scanner) {
        String sql;
        PreparedStatement pst;
        System.out.print("Ingrese el nombre del actor: ");
        String nombre = scanner.next();
        System.out.print("Ingrese el apellido del actor: ");
        String apellido = scanner.next();
        sql = "INSERT INTO actor (first_name, last_name) VALUES (?, ?)";
        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, nombre);
            pst.setString(2, apellido);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void modificarActorExistente(Connection cn, Scanner scanner) {
        String sql;
        PreparedStatement pst;
        System.out.println("Ingrese el id del actor al que se le modificaran los datos");
        int id = scanner.nextInt();
        System.out.print("Ingrese el nuevo nombre del actor: ");
        String nombre = scanner.next();
        System.out.print("Ingrese el nuevo apellido del actor: ");
        String apellido = scanner.next();
        sql = "UPDATE actor SET first_name = ?, last_name = ? WHERE actor_id = ?";
        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, nombre);
            pst.setString(2, apellido);
            pst.setInt(3, id);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String url, user, pass, sql;
        url = "jdbc:mysql://172.21.29.50:3306/sakila";
        user = "userDAW";
        pass = "Java";
        PreparedStatement pst;
        ResultSet rs;
        ArrayList<Actor> lista = new ArrayList<>();
        Iterator it;
        Connection cn = null;
        Scanner scanner = new Scanner(System.in);
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
                    try {
                    sql = "SELECT * FROM actor";
                    pst = cn.prepareStatement(sql);
                    rs = pst.executeQuery();
                    cargarActores(rs, lista);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;

                case 2:
                    insertarNuevoActor(cn, scanner);
                    break;
                case 3:
                    modificarActorExistente(cn, scanner);
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
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

            try {
                sql = "SELECT * FROM actor";
                pst = cn.prepareStatement(sql);
                rs = pst.executeQuery();

                cargarActores(rs, lista);
                it = lista.iterator();
                while (it.hasNext()) {
                    System.out.println(it.next());
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }
}