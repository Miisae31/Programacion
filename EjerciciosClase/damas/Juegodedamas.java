package damas;
import java.util.*;
public class Juegodedamas {
    public static void main(String[] args) {
        Tablero tablero = new Tablero();
        tablero.inicializarTablero();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            tablero.imprimirTablero();
            System.out.println("Es el turno del jugador " + (tablero.getTurno() == Ficha.Color.BLANCA ? "Blanca" : "Negra"));
            System.out.print("Ingrese la fila de la ficha que desea mover: ");
            int filaOrigen = scanner.nextInt();
            System.out.print("Ingrese la columna de la ficha que desea mover: ");
            int columnaOrigen = scanner.nextInt();
            System.out.print("Ingrese la fila a la que desea mover la ficha: ");
            int filaDestino = scanner.nextInt();
            System.out.print("Ingrese la columna a la que desea mover la ficha: ");
            int columnaDestino = scanner.nextInt();

            // Aquí puedes implementar la lógica de movimiento y las reglas del juego
            if (tablero.moverFicha(filaOrigen, columnaOrigen, filaDestino, columnaDestino)) {
                tablero.cambiarTurno();
            } else {
                System.out.println("Movimiento no válido. Inténtelo de nuevo.");
            }
        }
    }
}
    