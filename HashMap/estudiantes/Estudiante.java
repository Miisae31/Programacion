package estudiantes;

public class Estudiante {
	private String nombre;
	private int edad;
	private String curso;

	public Estudiante(String nombre, int edad, String curso) {
		this.nombre = nombre;
		this.edad = edad;
		this.curso = curso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String nuevoCurso) {
		this.curso = nuevoCurso;
	}
	

}
