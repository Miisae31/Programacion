package vehiculo;
import java.util.Scanner;
	public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		Bicicleta bicicleta = new Bicicleta();
		Coche coche = new Coche();
		
		int opcion;
		
		
		do {
			 System.out.println("\nVEHÍCULOS");
	            System.out.println("--------------");
	            System.out.println("1. Anda con la bicicleta");
	            System.out.println("2. Haz el caballito con la bicicleta");
	            System.out.println("3. Anda con el coche");
	            System.out.println("4. Quema rueda con el coche");
	            System.out.println("5. Ver kilometraje de la bicicleta");
	            System.out.println("6. Ver kilometraje del coche");
	            System.out.println("7. Salir");
	            System.out.print("Seleccione una opción: ");

	            opcion = scanner.nextInt();
	            
	            switch (opcion) {
	            case 1:
	            	System.out.println("Introduce la distancia a andar en la bicicleta: ");
	            	int distanciaBicicleta = scanner.nextInt();
	            	bicicleta.andar(distanciaBicicleta);
	            	break;
	            case 2: 
	            	bicicleta.hacerCaballito();
	            	break;
	            case 3:
	            	System.out.println("Introduce la distancia a andar en coche: ");
	            	int distanciaCoche = scanner.nextInt();
	            	coche.andar(distanciaCoche);
	            	break;
	            case 4:
	            	coche.quemarRueda();
	            	break;
	            case 5:
	            	bicicleta.verKilometraje();
	            	break;
	            case 6:
	            	coche.verKilometraje();
	            	break;
	            case 7:
	            	System.out.println("Saliendo del programa. Hasta luego!");
	            	break;
	            default:
	            	System.out.println("Opcion no valida. Intentelo de nuevo");
	            }
	            
		} while (opcion !=7);
		scanner.close();
	}
}


