package valoresAleatoriosArrayList;
import java.util.ArrayList;
import java.util.Random;

public class EstadisticasArrayList {
    public static void main(String[] args) {
        // Crear un ArrayList
        ArrayList<Integer> numeros = new ArrayList<>();

        // Generar un tamaño aleatorio entre 10 y 20
        Random random = new Random();
        int tamano = random.nextInt(11) + 10;

        // Introducir valores aleatorios entre 0 y 100 en el ArrayList
        for (int i = 0; i < tamano; i++) {
            numeros.add(random.nextInt(101));
        }

        // Mostrar la lista generada
        System.out.println("Lista de números generados: " + numeros);

        // Calcular la suma, la media, el máximo y el mínimo
        int suma = 0;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        for (int numero : numeros) {
            suma += numero;
            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }
        }

        double media = (double) suma / tamano;

        // Mostrar los resultados
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
    }
}
