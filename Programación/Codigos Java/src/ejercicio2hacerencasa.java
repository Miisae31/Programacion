import java.util.Scanner;
import java.text.DecimalFormat;

public class ejercicio2hacerencasa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            double Tasadecambio = 1.09;
        System.out.println("Introduzca cantidad en euros");
            double euros = scanner.nextDouble();
            double dolares = euros * Tasadecambio;
        DecimalFormat formato = new DecimalFormat("#.##");
            String resultadoFormateado = formato.format(dolares);
        System.out.println(euros + " euros equivalen a " + resultadoFormateado + "$.");
            scanner.close();
        

    }
    

    
}
