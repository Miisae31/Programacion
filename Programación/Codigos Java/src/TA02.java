import java.util.Scanner ;
public class TA02 {
    public static void main(String[] args) { 
    int a = 0 ;
    int b = 0 ;
    int resultado = 0 ;
    int operacion = 0 ;

    Scanner scan = new Scanner (System.in) ;
    System.out.println("Escribe un numero entero: ");
    a = scan.nextInt();
    System.out.println("Escribe otro numero entero");
    b = scan.nextInt();
    System.out.println("Operacion"); 
    System.out.println("Suma (1)");
    System.out.println("Resta (2)");
    operacion = scan.nextInt();
    
    System.out.println("El contenido almacenado de las variables es: ");
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("operacion = " + operacion);
    if (operacion == 1) {
        resultado = a + b;
    }else{
        resultado = a - b;
    }

    System.out.println("El resultado es " + resultado);
    scan.close();
    } 
}