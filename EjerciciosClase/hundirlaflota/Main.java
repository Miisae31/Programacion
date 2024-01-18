package hundirlaflota;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		planDePruebas_01();
	}
	
	public static void planDePruebas_01() { // Creamos el metodo que hace el tablero 
		int filas = (int) (Math.random() * 10 ) + 5;
		int columnas = (int) (Math.random() * 10 ) + 5;
		Tablero miTablero = new Tablero (filas,columnas);
		
		
		miTablero.inicializarTablero(); // Inicializamos el tablero
		
		System.out.println("Tablero con valores numericos"); // Mostramos por pantalla el tablero con valores numericos 
		miTablero.showTableroEstados();
		System.out.println();
		
		miTablero.deleteTablero();
		
		
		System.out.println("Tablero despues de borrarse");
		miTablero.showTableroEstados();
		System.out.println();
		
		filas = (int) (Math.random() * 11) + 5; // entre 5 y 15
        columnas = (int) (Math.random() * 11) + 5; // entre 5 y 15
        Tablero nuevoTablero = new Tablero(filas, columnas);
        
        
        nuevoTablero.inicializarTablero();
        
        
        System.out.println("Nuevo tablero con representacion gráfica");
        
        nuevoTablero.showTableroGrafico();
        
        System.out.println();
        
        
      
      Tablero costaTablero = new Tablero(filas, columnas); // Creamos el objeto costaTablero para implementar el metodo creado en la clase tablero
      
      costaTablero.setTableroCostaNoroeste();
      
      System.out.println("Aqui esta el tablero de la costa Noroeste");
      
      costaTablero.showTableroGrafico();
        
        
	}

}
