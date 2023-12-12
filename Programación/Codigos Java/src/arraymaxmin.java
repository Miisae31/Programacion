import java.util.Scanner ;
public class arraymaxmin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        int men = 0 ;
        int may= 0 ;
        int PosicionMay=0 ;
        int PosicionMen=0 ;
        System.out.println("Escriba el numero de valores");
        scanner.close();
                for (int i = 0; i <numeros.length; i++) {
                numeros[i]= scanner.nextInt();
        }
        if (numeros[1] > numeros[2]) {
            may = numeros[1];
            men = numeros[2];
            PosicionMay = 1;
            PosicionMen = 2;
        }
        if (numeros[1] < numeros[2]) {
            may = numeros[2];
            men = numeros[1];
            PosicionMay = 2;
            PosicionMen = 1;
        }
        for (int i = 3 ; i < numeros.length; i++) {
            if (numeros[i]> may) {
                may = numeros[i];
                PosicionMay = i;
            } else if (numeros[i]< men) {
                men = numeros[i];
                PosicionMen = i;
            }
        } 
        System.out.println("El mayor es: " + may + " y se encuentra en la posición " + PosicionMay + "º");
        System.out.println("El mínimo es " + men + " y se encuentra en la posición " + PosicionMen +
         "º");
    }
    
}
