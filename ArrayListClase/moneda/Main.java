package moneda;
import java.util.ArrayList;
import java.util.Random;



public class Main {

    public static void main(String[] args) {
        // Valores y posiciones posibles
        String[] valores = {"1 céntimo", "2 céntimos", "5 céntimos", "10 céntimos", "25 céntimos", "50 céntimos", "1 euro", "2 euros"};
        String[] posiciones = {"cara", "cruz"};

        // Lista para almacenar las monedas generadas
        ArrayList<Moneda> listaMonedas = new ArrayList<>();

        // Generar 6 monedas aleatorias
        for (int i = 0; i < 6; i++) {
            // Obtener valor y posición aleatoria
            String valor = valores[new Random().nextInt(valores.length)];
            String posicion = posiciones[new Random().nextInt(posiciones.length)];

            // Crear instancia de la clase Moneda y agregar a la lista
            Moneda moneda = new Moneda(valor, posicion);
            listaMonedas.add(moneda);
        }

        // Mostrar la secuencia de monedas generadas
        System.out.println("Secuencia de monedas generadas:");
        for (Moneda moneda : listaMonedas) {
            System.out.println(moneda);
        }
    }
}