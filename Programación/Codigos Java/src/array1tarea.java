import java.util.Scanner;

public class array1tarea {
    static class Ropa {
        private String nombre;
        private String tipo;

        public Ropa(String nombre, String tipo) {
            this.nombre = nombre;
            this.tipo = tipo;
        }

        public String getNombre() {
            return nombre;
        }

        public String getTipo() {
            return tipo;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Ropa[] prendas = new Ropa[3];

        for (int i = 0; i < prendas.length; i++) {
            System.out.println("Ingrese el nombre de la prenda " + (i + 1) + ":");
            String nombre = scanner.nextLine();  // Corregir: Se debe pedir el nombre por separado

            System.out.println("Ingrese el tipo de la prenda " + (i + 1) + ":");
            String tipo = scanner.nextLine();

            prendas[i] = new Ropa(nombre, tipo);
        }

        for (Ropa prenda : prendas) {
            System.out.println("Nombre: " + prenda.getNombre() + ", Tipo:" + prenda.getTipo());
        }
        scanner.close();
    }
}