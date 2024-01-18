package pizzeria;

public class Pizza {
	private String tamaño;
	private String tipo;
	private String estado;
	 private static int totalPedidas = 0;
	 private static int totalServidas = 0;

	 public Pizza(String tipo,String tamaño) {
		 this.tipo = tipo;
		 this.tamaño = tamaño;
		 this.estado = "pedida";
		 totalPedidas++;
	 }
	 
	 public void sirve() {
		 if (estado.equals("pedida")) {
			 estado = "servida";
			 totalServidas++;
			 System.out.println("Pizza " + tipo + " " + tamaño + " servida.");
		 } else {
			 System.out.println("Error! La pizza ya ha sido servida anteriormente");
		 }
	 }
	 
	 
	 public static int getTotalPedidas() {
		 return totalPedidas;
	 }
	 
	 public static int getTotalServidas() {
		 return totalServidas;
	 }
	 
	 @Override
	 public String toString() {
		 return "Pizza" + tipo + " " + tamaño + " - Estado: " + estado;
	 }
}
