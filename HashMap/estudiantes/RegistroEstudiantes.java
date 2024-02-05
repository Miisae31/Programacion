package estudiantes;

import java.util.HashMap;
import java.util.Scanner;

public class RegistroEstudiantes {

    public static void main(String[] args) {
        HashMap<String, Estudiante> registroEstudiantes = new HashMap<>();

        Estudiante estudiante1 = new Estudiante("Jose Alberto", 48, "1 De la Eso");
        Estudiante estudiante2 = new Estudiante("Ana", 23, "Ciencias de la Medicina");

        // Agrega estudiantes al HashMap
        registroEstudiantes.put("1", estudiante1);
        registroEstudiantes.put("2", estudiante2);

        // Imprime detalles de estudiantes específicos
        imprimirDetallesEstudiante("1", registroEstudiantes);
        imprimirDetallesEstudiante("2", registroEstudiantes);

        // Imprime detalles de todos los estudiantes
        imprimirTodosEstudiante(registroEstudiantes);

        // Modifica el curso de un estudiante existente
        modificarCursoEstudiante("1", "Nuevo Curso", registroEstudiantes);

        // Vuelve a imprimir detalles del estudiante modificado
        imprimirDetallesEstudiante("1", registroEstudiantes);

        // Pide al usuario el carné y muestra detalles
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el carné del estudiante: ");
        String carnet = scanner.nextLine();
        imprimirDetallesEstudiante(carnet, registroEstudiantes);
    }

    public static void imprimirTodosEstudiante(HashMap<String, Estudiante> registro) {
        for (String carnet : registro.keySet()) {
            imprimirDetallesEstudiante(carnet, registro);
        }
    }

    public static void imprimirDetallesEstudiante(String carnet, HashMap<String, Estudiante> registro) {
        if (registro.containsKey(carnet)) {
            Estudiante estudiante = registro.get(carnet);
            System.out.println("Detalles del estudiante con carné " + carnet + ":");
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Edad: " + estudiante.getEdad());
            System.out.println("Curso: " + estudiante.getCurso());
        } else {
            System.out.println("Estudiante con carné " + carnet + " no encontrado.");
        }
    }

    public static void modificarCursoEstudiante(String carnet, String nuevoCurso, HashMap<String, Estudiante> registro) {
        if (registro.containsKey(carnet)) {
            Estudiante estudiante = registro.get(carnet);
            estudiante.setCurso(nuevoCurso);
            System.out.println("Curso modificado para el estudiante con carné " + carnet);
        } else {
            System.out.println("Estudiante con carné " + carnet + " no encontrado. No se pudo modificar el curso.");
        }
    }
}
