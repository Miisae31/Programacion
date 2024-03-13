//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Control control = new Control();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Mostrar cola de vuelos");
            System.out.println("2. Añadir un nuevo vuelo");
            System.out.println("3. Eliminar un vuelo");
            System.out.println("4. Dar salida a un vuelo");
            System.out.println("5. Actualizar lista de vuelos");
            System.out.println("6. Modificar horarios de un vuelo");
            System.out.println("7. Salir");
            System.out.print("Ingrese su elección: ");
            int eleccion = scanner.nextInt();

            switch (eleccion) {
                case 1:
                    control.mostrarVuelos();
                    break;
                case 2:
                    System.out.print("Ingrese código de vuelo: ");
                    String codigoVuelo = scanner.next();
                    scanner.nextLine(); // consume the newline
                    System.out.print("Ingrese hora de salida (yyyy-MM-dd HH:mm): ");
                    LocalDateTime horaSalida = LocalDateTime.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
                    System.out.print("Ingrese hora de llegada (yyyy-MM-dd HH:mm): ");
                    LocalDateTime horaLlegada = LocalDateTime.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
                    control.agregarVuelo(codigoVuelo, horaSalida, horaLlegada);
                    break;
                case 3:
                    System.out.print("Ingrese código de vuelo: ");
                    codigoVuelo = scanner.next();
                    control.eliminarVuelo(codigoVuelo);
                    break;
                case 4:
                    control.darSalidaVuelo();
                    break;
                case 5:
                    control.actualizarVuelos();
                    break;
                case 6:
                    System.out.print("Ingrese código de vuelo: ");
                    codigoVuelo = scanner.next();
                    System.out.print("Ingrese retraso en minutos: ");
                    int retraso = scanner.nextInt();
                    control.retrasarVuelo(codigoVuelo, retraso);
                    break;
                case 7:
                    System.exit(0);
            }
        }
    }
}