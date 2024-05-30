package examen.daw;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Ejercicio2 {

    public static void ejecutar() {
        String [] contenido;
        int contador = 0;
        Scanner scanner = new Scanner (System.in);
        String linea = "";

        System.out.println("Introduzca la palabra a buscar dentro del fichero: ");
        String respuesta = scanner.nextLine();

        try (BufferedReader lecturaPalabra = new BufferedReader(new FileReader("Examen DAW/data/ejercicio_2/ejercicio_2.txt"))){

            linea = lecturaPalabra.readLine();
            while (linea != null) {
                contenido = linea.split("\\s+");
                for (String palabra:contenido) {
                    if (palabra.equals(respuesta)){
                        contador++;
                    }
                }
                linea = lecturaPalabra.readLine();
            }

            System.out.println("La palabra " + respuesta + " aparece un total de " + contador);




        } catch (IOException e) {
            e.printStackTrace();
            }
        }

    }
