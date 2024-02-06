package diccionario;
import java.util.Scanner;
import java.util.HashMap;

public class DiccionarioInglesEspañol {
	
	public static void main(String[] args) {
		 HashMap<String , String> diccionario = new HashMap<>();
		 Scanner scanner = new Scanner(System.in);
		 String palabra = "";
		 
		 diccionario.put("Hola", "Hello");
		 diccionario.put("Pajaro", "Bird");
		 diccionario.put("Agua", "Water");
		 diccionario.put("Código", "Codigo");
		 diccionario.put("Adios", "Bye");
		 diccionario.put("Ordenador", "Computer");
		 diccionario.put("Teclado", "Keyboard");
		 diccionario.put("Calvo", "Bold");
		 diccionario.put("Mantequilla de cacahuete", "Peanut Butter");
		 diccionario.put("Ratones", "Mice");
		 diccionario.put("Mujer", "Woman");
		 diccionario.put("Enano", "Dwarf");
		 diccionario.put("Pantalla", "Screen");
		 diccionario.put("Juguete", "Toy");
		 diccionario.put("Zapato", "Shoe");
		 diccionario.put("Extintor", "Extinguiser");
		 diccionario.put("Luz", "Light");
		 diccionario.put("Movil", "Phone");
		 diccionario.put("Cascos", "Headset");
		 diccionario.put("Sudadera", "Hoodie");
		
		 
		 try { 
		 System.out.println("Introduzca una palabra para su traducción");
		  palabra = scanner.nextLine();
		 if (diccionario.containsKey(palabra)) {
			 System.out.println("La traduccion de la palabra al ingles es "+ diccionario.get(palabra));
			 
		 } else {
			 System.out.println("La palabra no se encuentra en el diccionario, compruebe a revisar su ortografia ");
		 }
		 
		}catch (Exception e) {
			
		}
		 scanner.close();

	}

}
