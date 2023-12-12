import java.util.Scanner ;
public class tarea7 {
    public static void main(String[] args) {
        int a, b, operacion;
        int resultado=0;

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Escriba un numero entero");
        a = scanner.nextInt();
        System.out.println("Escriba un segundo numero entero");
        b = scanner.nextInt();
        System.out.println("Escriba la operacion");
        
        System.out.println("Suma (1)");
        System.out.println("Resta (2)");
        System.out.println("Multiplicación (3)");
        System.out.println("Division (4)");

            operacion = scanner.nextInt();
            scanner.close();
           
            
 switch (operacion) {
            case 1:
                resultado = a + b;
                break;
            case 2:
                resultado = a - b;
                break;
            case 3:
                resultado = a * b;
                break;
            case 4:
                if (b != 0) {
                    resultado = a / b;
            } else {
                System.out.println("Error: No se puede dividir por cero");
                return;
            }        
             
            System.out.println("El resultado es: " + resultado);
            
    
            
           
        } 
    }
}    