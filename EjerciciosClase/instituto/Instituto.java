package instituto;
public class Instituto {

	public static void main(String[] args) {
		
		Alumno alumno1 = new Alumno("Alberto","Chicote","Maroño");
		Alumno alumno2 = new Alumno("Adrian","Perez","Jimenez");
		Asignatura asignatura1 = new Asignatura("Biologia");
		Asignatura asignatura2 = new Asignatura("Educacion Fisica");
		
		//modificar el dni del alumno 1 y obtener apellido alumno 2
		
		alumno1.setDni("29731700A");
		System.out.println(alumno2.getApellido1());
		asignatura1.setProfesor("Ramon");
		asignatura1.setHorasSemanales(6);
		asignatura2.setProfesor("Felipe");
		asignatura2.setHorasSemanales(8);
		
		System.out.println(asignatura1.mostrar());
		System.out.println(asignatura2.mostrar());
	
	}
		
}


