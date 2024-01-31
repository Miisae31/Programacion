package ordenar10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Ejer3Colecciones {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		
		lista.add("Caniche");
		lista.add("Avion");
		lista.add("Pajaro");
		lista.add("Amorfo");
		lista.add("Adolfo");
		lista.add("Guatemalteco");
		lista.add("Miguel");
		lista.add("Tronco");
		lista.add("Primo");
		lista.add("Zarabeto");
		
		
		
		for (int i = 0; i < 10; i++) {
			
			
		}
		
		Collections.sort(lista);
		
		for(String palabra : lista) {
			System.out.println(palabra);
		}

	}

}
