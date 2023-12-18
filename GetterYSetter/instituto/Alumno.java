package instituto;

public class Alumno {
	private String dni;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String asignaturas;
	
	//Constructor
	public Alumno(String nombre,String apellido1,String apellido2) {
		this.dni="";
		this.nombre=nombre;
		this.apellido1=apellido1;
		this.apellido2=apellido2;
		this.asignaturas="";

	}
	//Metodo getter
	public String getDni() {
		return this.dni;

	}
	
	public String getNombre() {
		return this.nombre;

	}
	
	public String getApellido1() {
		return this.apellido1;

	}
	
	public String getApellido2() {
		return this.apellido2;

	}
	
	public String getAsignaturas() {
		return this.asignaturas;

	}
	
	//Setter
	public void setDni(String valor) {
		this.dni = valor;
	}
	
	public void setNombre (String valor) {
		this.nombre = valor;
	}
	
	public void setApellido1 (String valor) {
		this.apellido1 = valor;
	}
	
	public void setApellido2 (String valor) {
		this.apellido2 = valor;
	}
	
	public void setAsignaturas (String valor) {
		this.asignaturas = valor;
	}

}