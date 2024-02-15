package solicitarNumero;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa calcula la media de dos números");
        double numero1 = 0;
        double numero2;
        boolean datosCorrectos = false;
        do {
            try {
                System.out.print("Introduzca el primer número: ");
                numero1 = Double.parseDouble(s.nextLine());
                datosCorrectos = true;
            } catch (NumberFormatException e) {
                System.out.println("Excepción: " + e.getClass().getSimpleName());
                System.out.println("El primer numero introducido no es valido");
                System.out.println("Vuelva a introducir el primer número");

            }
        } while (!datosCorrectos);
        datosCorrectos = false;
        do {
            try {
                System.out.print("Introduzca el segundo número: ");
                numero2 = Double.parseDouble(s.nextLine());
                double media = (numero1 + numero2) / 2;
                System.out.println("La media de " + numero1 + " y " + numero2 + " es " + media);
                datosCorrectos = true;
            } catch (NumberFormatException e) {
                System.out.println("Excepción: " + e.getClass().getSimpleName());
                System.out.println("El segundo numero introducido no es valido");
                System.out.println("Vuelva a introducir el segundo número");

            }
        } while (!datosCorrectos);
        System.out.println("Gracias por utilizar este programa ¡hasta la próxima!");
        System.out.println("Fin del programa");
        s.close();
    }
}