package examen.daw;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamenDAW {

    
    static int numEjer = 4;

    public static void main(String[] args) {
        int ejer = 0;

        menu();

        //sc.close();
        // TODO code application logic here
    }

    private static void menu() {
        int option = 0;

        do {
            System.out.println("*** MENÚ ***");
            for (int i = 1; i <= numEjer; i++) {
                System.out.println("\t(" + i + ") Ejercicio " + i + ".");
            }
            System.out.println("\t(0) Salir.");
            option = Herramientas.validarOpcion(0, numEjer);
            switch (option) {
                case 1:
                    Ejercicio1.ejecutar();
                    break;
                case 2:
                    Ejercicio2.ejecutar();
                    break;
                case 3:
                    Ejercicio3.ejecutar();
                    break;
                case 4:
                    Ejercicio4.ejecutar();
                    break;
            }
        } while (option != 0);
    }

    
}
