import java.util.Scanner;
public class Ejercicio1hacerencasa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numeroUsuario = scanner.nextInt();
        int suma = 0;
        scanner.close();
        
            for (int i = 0 ; i< 100; i++) {
                suma += numeroUsuario + i;
            }
            System.out.println("La suma de los 100 siguientes numeros a " + numeroUsuario + " es: " + suma);
    }

}
