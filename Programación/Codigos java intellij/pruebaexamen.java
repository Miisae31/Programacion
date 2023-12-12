import java.util.*;
public class pruebaexamen {
    public static void main (String[] args) {
        String nombre = "";
        String apellido1 = "";
        String apellido2 = "";
        String Dni = "";


        Scanner scan = new Scanner(System.in);
    System.out.println("Introduzca su nombre");
    nombre = scan.next();
        System.out.println("Introduzca su 1º Apellido");
        apellido1 = scan.next();
        System.out.println("Introduzca su 2º Apellido");
        apellido2 = scan.next();
        System.out.println("Introduzca su dni");
        Dni = scan.next();
        System.out.println("Introduzca su numero de telefono");
        int telefono = scan.nextInt();

    System.out.println("Muchas gracias" + nombre + " " + apellido1+ " " + apellido2 +  "(" + Dni + ")" + "por registrarse.");
    System.out.println("Lo llamaremos al número " + telefono + "a la mayor brevedad posible.");

    }
}
