package Examen;
import examen240314.Datos;
import examen240314.Usuarios;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Scanner;

public class GestAirport extends Datos {
    public static void main(String[] args) {
        Datos datos = new Datos();
        String[][] data = datos.getVuelos();
        Control control = new Control();
        Usuarios usuarios = new Usuarios();

        HashMap<String, String> mapaUsuarios = usuarios.getUsuarios();

        if (!login(usuarios)) {
            System.out.println("Has excedido el número máximo de intentos. El sistema se cerrará.");
            System.exit(0);
        }

        for (String[] row : data) {
            String codigo = row[0];
            String origen = row[1];
            String destino = row[2];
            LocalDateTime salida = LocalDateTime.parse(row[3]);
            LocalDateTime llegada = LocalDateTime.parse(row[4]);
            Vuelo vuelo = new Vuelo(codigo, origen, destino, salida, llegada);
            control.agregarVuelo(vuelo);
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Mostrar cola de vuelos ordenada");
            System.out.println("2. Dar salida a un vuelo");
            System.out.println("3. Actualizar lista de vuelos");
            System.out.println("4. Modificar horarios de un vuelo");
            System.out.println("5. Salir");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    control.mostrarVuelos();
                    break;
                case 2:
                    System.out.println("Ingrese el código del vuelo:");
                    String codigo = scanner.next();
                    control.salidaVuelo(codigo);
                    break;
                case 3:
                    control.actualizarVuelos();
                    break;
                case 4:
                    System.out.println("Ingrese el código del vuelo:");
                    codigo = scanner.next();
                    System.out.println("Ingrese la cantidad de minutos que se debe retrasar o adelantar la salida de un vuelo:");
                    int minutos = scanner.nextInt();
                    try {
                        control.modificarHorarioVuelo(codigo, minutos);
                    } catch (HorarioVueloException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Gracias por usar GestAirport");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    private static boolean login(Usuarios usuarios) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Por favor, introduce tu nombre de usuario:");
            String username = scanner.nextLine();
            System.out.println("Por favor, introduce tu contraseña:");
            String password = scanner.nextLine();

            if (usuarios.getUsuarios().containsKey(username) && usuarios.getUsuarios().get(username).equals(password)) {
                System.out.println("Inicio de sesión exitoso.");
                return true;
            } else {
                System.out.println("Nombre de usuario o contraseña incorrectos. Por favor, inténtalo de nuevo.");
            }
        }
        return false;
    }
}