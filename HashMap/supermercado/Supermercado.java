package supermercado;
import java.util.Scanner;



import java.util.HashMap;

public class Supermercado {

	public static void main(String[] args) {
		 HashMap<String, Double> preciosSuper = new HashMap<>();
		 String fin = "";
		 Scanner scanner = new Scanner (System.in);
		 String producto="";
		 int cantidad=0;
		 double precio = 0;
		 
		 preciosSuper.put("Avena", 2.21);
		 preciosSuper.put("Garbanzos", 2.39);
		 preciosSuper.put("Tomate", 1.59);
		 preciosSuper.put("Jengibre", 3.13);
		 preciosSuper.put("Quinoa", 4.50);
		 preciosSuper.put("Guisantes", 1.6);
		 
		 System.out.println("Que producto desea comprar?");
		 System.out.println("Introduzca el producto y despues su cantidad"); 
		 
		 
		
		 
		
		 try { 
			
			 producto = scanner.nextLine();
			 if (preciosSuper.containsKey(producto)) {
				 System.out.println("Ingrese la cantidad de productos que quiere");
				 cantidad = scanner.nextInt();
				 scanner.nextLine();
				 double total = resultadoFinal(cantidad, preciosSuper.get(producto));
				 System.out.println("Introduzca fin para finalizar su compra");
				 fin = scanner.nextLine();	
				 if (fin.equalsIgnoreCase("fin")) {
					 System.out.println("producto\tprecios\tcantidad\ttotal");
					 System.out.println("--------------------------------------------------");
					 System.out.printf("%s\t\t%.2f\t%d\t\t%.2f\n", producto, preciosSuper.get(producto), cantidad, total);
				 }
				
				 
			 } else {
				 System.out.println("El producto no se encuentra en el supermercado");
			 }
			 
			}catch (Exception e) {
				System.out.println("Erorr al procesar la entrada " + e.getMessage());
			} finally {
				scanner.close();
			}
		 
		 

	}
	
	 public static double resultadoFinal(int cantidad, double precioUnitario) {
	        return cantidad * precioUnitario;
	    }

}
