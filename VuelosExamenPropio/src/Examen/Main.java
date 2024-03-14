package Examen;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        System.out.println("Menu interactivo de vuelos");
        Scanner scanner = new Scanner(System.in);
        ControlVuelos control = new ControlVuelos();
        int opcion;
        String codigoVuelo = "";
        Vuelo vuelo;

        do {

            System.out.println("1. Mostrar cola de vuelos");
            System.out.println("2. Añadir un nuevo vuelo");
            System.out.println("3. Eliminar un vuelo");
            System.out.println("4. Dar salida a un vuelo");
            System.out.println("5. Actualizar lista de vuelos");
            System.out.println("6. Modificar horarios de un vuelo");
            System.out.println("7. Salir");
            System.out.print("Ingrese su elección: ");
            opcion = scanner.nextInt();
            scanner.nextLine();


            switch (opcion) {
                case 1:
                    control.mostrarVuelos();
                    break;

                case 2:
                    System.out.println("Ingrese el codigo del vuelo");
                    codigoVuelo = scanner.nextLine();
                    System.out.println("Ingrese la hora de salida (yyyy-MM-dd HH:mm)");
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                    LocalDateTime codigoSalida = LocalDateTime.parse(scanner.nextLine(), formatter);
                    System.out.println("Ingrese la hora de llegada (yyyy-MM-dd HH:mm)");
                    LocalDateTime codigoLlegada = LocalDateTime.parse(scanner.nextLine(), formatter);
                    vuelo = new Vuelo(codigoVuelo, codigoSalida, codigoLlegada);
                    control.agregarVuelo(vuelo);
                    break;

                case 3:
                    System.out.println("Ingrese el codigo del vuelo");
                    String codigoVuelo2 = scanner.nextLine();
                    Iterator<Vuelo> iterator = control.obtenerIterator();
                    while (iterator.hasNext()) {
                        Vuelo vuelo2 = iterator.next();
                        if (codigoVuelo2.equals(vuelo2.getCodigoVuelo())) {
                            System.out.println("Se ha eliminado el vuelo " + codigoVuelo2);
                            iterator.remove();
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.println("Introduzca el codigo del vuelo que desee despegar");
                    String codigoVuelo3 = scanner.nextLine();
                    Iterator<Vuelo> iterator2 = control.obtenerIterator();
                    while (iterator2.hasNext()) {
                        Vuelo vueloActual = iterator2.next();
                        if (vueloActual.getCodigoVuelo().equals(codigoVuelo3)) {
                            System.out.println("El avion con el siguiente codigo " + vueloActual.getCodigoVuelo() + " ha despegado.");
                            iterator2.remove();
                            break;
                        }
                    }
                    break;
                case 5:
                    control.actualizarVuelos();
                    System.out.println("Vuelo actualizado");
                    break;

                case 6:
                    System.out.print("Ingrese código de vuelo: ");
                    codigoVuelo = scanner.next();
                    System.out.print("Ingrese retraso en minutos: ");
                    int retraso = scanner.nextInt();
                    Iterator<Vuelo> iterator3 = control.obtenerIterator();
                    while (iterator3.hasNext()) {
                        Vuelo vueloActual = iterator3.next();
                        if (vueloActual.getCodigoVuelo().equals(codigoVuelo)) {
                            LocalDateTime nuevaHoraLlegada = vueloActual.getHoraLlegada().plusMinutes(retraso);
                            vueloActual.setHoraLlegada(nuevaHoraLlegada);
                            break;
                        }
                    }
                    break;
                case 7:
                    System.out.println("Saliendo del programa");
                    System.exit(0);
                    break;
            }
        } while (opcion != 7);
    }
}