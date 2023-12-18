package instituto;

public class Asignatura {
	
	String nombre;
	String profesor;
	int horasSemanales;
	
	
	public Asignatura (String nombre) {
		this.nombre = nombre;
		this.profesor = "";
		this.horasSemanales = 0;
		
	}
	
	public String getNombre() {
		return this.nombre;
				
	}
	
	public String getProfesor() {
		return this.profesor;
				
	}
	
	public int getHorasSemanales() {
		return this.horasSemanales;
				
	}
	
	public void setNombre(String valor) {
		this.nombre = valor; 
	}
	
	public void setProfesor(String valor) {
		this.profesor = valor; 
	}
	
	public void setHorasSemanales(int valor) {
		this.horasSemanales = valor; 
	}
	
	
	public String mostrar() {
		String cadena="";
		
		
		cadena = "Nombre: " + this.nombre +"\n" + this.profesor + "\n" + this.horasSemanales;
		
		return cadena;
	}
}
