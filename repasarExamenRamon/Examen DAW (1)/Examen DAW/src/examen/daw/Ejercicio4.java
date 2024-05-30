package examen.daw;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Ejercicio4 {

    static List<Actor> actores = new ArrayList<Actor>();
    static Connection cn;
   static Statement st = null;
    static String url = "jdbc:mysql://localhost:3306/DAW_codigoAlumno";
    static String user = "root";
    static  String pass = "hola";
    static ResultSet rs = null;

    public static void ejecutar() {

/*
*
*       
*
*/
            cargarDatos();
            menu();
            actualizarDatos();
/*
*

*
*/
    }

    private static void menu() {
        byte option;
        int id = 0;

        do {
            System.out.println("**************************");
            System.out.println("*** Ejercicio 4 - MENÚ ***");
            System.out.println("**************************");

            System.out.println("\t(1) Mostrar actores.");
            System.out.println("\t(2) Modificar un actor.");
            System.out.println("\t(3) Añadir nuevo actor.");
            System.out.println("\t(4) Elminar actor.");
            System.out.println("\t(0) Salir.");
            option = Herramientas.validarOpcion(0, 4);
            switch (option) {
                case 1:
                    mostrarActores();
                    break;
                case 2:
                    modificarActor();
                    break;
                case 3:
                    addActor();
                    break;
                case 4:
                    eliminarActor();
                    break;
            }
        } while (option != 0);

    }

    private static void mostrarActores() {
        Iterator it = actores.iterator();
        Actor act;
        System.out.println("*** Listado de actores ***");

        while (it.hasNext()) {
            act = (Actor) it.next();
            if (!act.isEliminado()) {
                System.out.println(act);
            }
        }

        System.out.println("");
    }

    private static void modificarActor() {
        Actor actor;
        boolean realizado = false;
        int id = Herramientas.leerInt("Introduce el id del actor: ");
        for (Actor act : actores) {
            if (act.getId() == id) {
                actor = act;
                System.out.println("Datos originales del actor: ");
                System.out.println(act);
                System.out.println("");
                actor.setNombre(Herramientas.leerString("Introduce el nombre: "));
                actor.setApellidos(Herramientas.leerString("Introduce los apellidos: "));
                actor.setFechaNacimiento(Herramientas.leerFecha("Introduce la fecha de nacimiento: "));
                realizado = true;
            }

        }
        if (!realizado) {
            System.out.println("El id = " + id + " no ha sido encontrado.");
        }
    }

    private static void addActor() {
        String nombre, apellidos;
        LocalDate fecha;
        nombre = Herramientas.leerString("Inroduce el nombre: ");
        apellidos = Herramientas.leerString("Inroduce los apellidos: ");
        fecha = LocalDate.parse(Herramientas.leerString("Inroduce la fecha de nacimiento: "));
        actores.add(new Actor(nombre, apellidos, fecha));
    }

    private static void eliminarActor() {
        boolean realizado = false;
        int id = Herramientas.leerInt("Introduce el id del actor: ");
        for (Actor act : actores) {
            if (act.getId() == id) {
                if(act.isNuevo()){
                    actores.remove(act);
                }else{
                    act.setEliminado(true);
                }
                realizado = true;
            }

        }
        if (!realizado) {
            System.out.println("El id = " + id + " no ha sido encontrado.");
        }
    }

    private static void cargarDatos() {
        try {
            cn = DriverManager.getConnection(url,user,pass);
            String slq = "SELECT * FROM actor ";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(slq);

            actores.add(new Actor(rs.getString("first_name"),rs.getString("last_name"),rs.getDate("last_update").toLocalDate()));



        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    private static void actualizarDatos() {
        try {
            cn = DriverManager.getConnection(url,user,pass);
            cn.setAutoCommit(false);
            PreparedStatement pstInsert = cn.prepareStatement("INSERT INTO actor (first_name,last_name,last_update) VALUES (?,?,?)");
            PreparedStatement pstUpdate = cn.prepareStatement("UPDATE actor SET first_name = ?, last_name = ?, last_update = ? WHERE actor_id = ? ");
            PreparedStatement pstDelete = cn.prepareStatement("DELETE FROM actor WHERE actor_id = ?");
            for (Actor actor : actores) {
                if (actor.isNuevo()){
                    pstInsert.setString(1, actor.getNombre());
                    pstInsert.setString(2, actor.getApellidos());
                    pstInsert.setString(3,actor.getFechaNacimiento().toString());
                    pstInsert.executeQuery();

                }
                if (actor.isModificado()){
                    pstUpdate.setString(1, actor.getNombre());
                    pstUpdate.setString(2, actor.getApellidos());
                    pstUpdate.setString(3,actor.getFechaNacimiento().toString());
                    pstUpdate.setInt(4,actor.getId());
                    pstUpdate.executeUpdate();
                }
                if (actor.isEliminado()){
                    pstDelete.setInt(1, actor.getId());
                    pstUpdate.executeUpdate();
                }


            }
            cn.commit();
            cn.setAutoCommit(false);
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
}
