import java.util.*;
public class AñodenaciminetoExamen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduzca su año de nacimiento:");
        int añoNacimiento = scan.nextInt();

        System.out.println("Introduzca el año actual:");
        int añoActual = scan.nextInt();

        int edad = calcularEdad(añoNacimiento, añoActual);

        System.out.println("Habiendo nacido en el año " + añoNacimiento + " y estando en el año " + añoActual +
                " tiene una edad de " + edad + " años.");
    }
    public static int calcularEdad(int añoNacimiento, int añoActual) {
        int edad = 0;

        for (int i = añoNacimiento; i < añoActual; i++) {
            edad++;
        }

        return edad;
        }
    }
