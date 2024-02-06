package diccionarioAzar;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Diccionario {

    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        diccionario.put("Hola", "Hello");
        diccionario.put("Pajaro", "Bird");
        diccionario.put("Agua", "Water");
        diccionario.put("Código", "Code");
        diccionario.put("Adios", "Goodbye");
        diccionario.put("Ordenador", "Computer");
        diccionario.put("Teclado", "Keyboard");
        diccionario.put("Calvo", "Bald");
        diccionario.put("Mantequilla de cacahuete", "Peanut Butter");
        diccionario.put("Ratones", "Mice");
        diccionario.put("Mujer", "Woman");
        diccionario.put("Enano", "Dwarf");
        diccionario.put("Pantalla", "Screen");
        diccionario.put("Juguete", "Toy");
        diccionario.put("Zapato", "Shoe");
        diccionario.put("Extintor", "Extinguisher");
        diccionario.put("Luz", "Light");
        diccionario.put("Movil", "Mobile Phone");
        diccionario.put("Cascos", "Headphones");
        diccionario.put("Sudadera", "Sweatshirt");

        Object[] claves = diccionario.keySet().toArray();
        Random generador = new Random();
        int palabrasMaximas = 5;

        // Array para almacenar las palabras seleccionadas
        String[] palabras = new String[palabrasMaximas];

        System.out.println("¡Bienvenido al juego de traducción de palabras!");
        System.out.println("Por favor, traduce las siguientes palabras al inglés:");

        // Seleccionar palabras aleatorias y mostrarlas al usuario
        for (int i = 0; i < palabrasMaximas; i++) {
            String palabraAleatoria = (String) claves[generador.nextInt(claves.length)];
            palabras[i] = palabraAleatoria;
            System.out.println("Palabra en español " + (i + 1) + ": " + palabraAleatoria);
        }

        // Pedir al usuario que ingrese las traducciones
        for (int i = 0; i < palabrasMaximas; i++) {
            System.out.print("Traducción de la palabra " + palabras[i] + ": ");
            String traduccionUsuario = scanner.nextLine();

            // Verificar si la traducción es correcta
            if (traduccionUsuario.equalsIgnoreCase(diccionario.get(palabras[i]))) {
                System.out.println("¡Correcto!");
            } else {
                System.out.println("Incorrecto. La traducción correcta es: " + diccionario.get(palabras[i]));
            }
        }

        scanner.close();
    }
}