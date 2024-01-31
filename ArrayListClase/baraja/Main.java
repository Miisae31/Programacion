package baraja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class Main {

    public static void main(String[] args) {
        // Definir arrays para números de cartas y nombres de palos
        int[] numerosCartas = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};
        String[] nombresPalos = {"OROS", "COPAS", "ESPADAS", "BASTOS"};
        
        ArrayList<String> baraja = new ArrayList<>();
        for (String nombrePalo : nombresPalos) {
        	for (int numero : numerosCartas) {
        		baraja.add(numero + " de " + nombrePalo);
        	}
        }
        Collections.shuffle(baraja);
        
        
      
        
       
        
        Set<String> cartasUnicas = new HashSet<>();
       
        ArrayList<String> mano = new ArrayList<>();
   
        while (cartasUnicas.size() < 10) {
            String carta = baraja.remove(0); 
            cartasUnicas.add(carta);  
            mano.add(carta);  
        
    }
        System.out.println("Cartas seleccionadas al azar:");
        for (String carta : mano) {
            System.out.println(carta);
}  
    
}
}