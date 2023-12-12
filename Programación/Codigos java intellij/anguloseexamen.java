import java.util.*;
public class anguloseexamen {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Introduzca su angulo:");
            int angulo = scan.nextInt();

            String tipoDeAngulo = ShowTipoDeAngulo(angulo);

            System.out.println("El tipo de angulo es " + tipoDeAngulo);
        }
        public static String ShowTipoDeAngulo(int angulo) {
            String tipoDeAngulo;

            if (angulo > 0 && angulo < 90) {
                tipoDeAngulo = "Agudo"; // Angulo de 0 - 90 º
            } else if (angulo == 90) {
                tipoDeAngulo = "Recto"; // Angulo de 90º
            } else if (angulo > 90 && angulo < 180) {
                tipoDeAngulo = "Obtuso"; // Angulo de 90-180º
            } else if (angulo == 180) {
                tipoDeAngulo = "Llano"; // Angulo de 180º

            } else if (angulo > 180) {
                tipoDeAngulo = "Otro"; // Angulo superior de 180º
            } else {
                tipoDeAngulo= "Invalido";
            }

            return tipoDeAngulo;
        }
    }

