package expocoches;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de las zonas
        Zona salaPrincipal = new Zona(1000, "Sala Principal");
        Zona compraVenta = new Zona(200, "Compra-Venta");
        Zona zonaVip = new Zona(25, "Zona VIP");

        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            // Mostrar menú
            System.out.println("\nMenú de Expocoches Campanillas:");
            System.out.println("1. Mostrar número de entradas disponibles por zona");
            System.out.println("2. Comprar entradas");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");

            // Leer opción del usuario
            opcion = scanner.nextInt();

            // Realizar acciones según la opción seleccionada
            switch (opcion) {
                case 1:
                    // Mostrar número de entradas disponibles por zona
                    mostrarEntradasDisponibles(salaPrincipal);
                    mostrarEntradasDisponibles(compraVenta);
                    mostrarEntradasDisponibles(zonaVip);
                    break;

                case 2:
                    // Vender entradas
                    venderEntradas(salaPrincipal, scanner);
                    venderEntradas(compraVenta, scanner);
                    venderEntradas(zonaVip, scanner);
                    break;

                case 3:
                    // Salir del programa
                    System.out.println("¡Gracias por usar Expocoches Campanillas!");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }
        } while (opcion != 3);

        // Cerrar el scanner al salir del programa
        scanner.close();
    }

    // Método para mostrar el número de entradas disponibles de una zona
    private static void mostrarEntradasDisponibles(Zona zona) {
        System.out.println(zona.nombre + ": " + zona.getEntradasPorVender() + " entradas disponibles.");
    }

    // Método para vender entradas de una zona
    private static void venderEntradas(Zona zona, Scanner scanner) {
        System.out.print("¿Cuántas entradas desea para la zona " + zona.nombre + "? ");
        int cantidadEntradas = scanner.nextInt();
        zona.vender(cantidadEntradas);
    }
}
