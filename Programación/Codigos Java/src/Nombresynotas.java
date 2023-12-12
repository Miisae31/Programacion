import java.util.Scanner;
public class Nombresynotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el numero de alumnos");
        int numAlumnos = scanner.nextInt();

        String[][] alumnos = new String[numAlumnos][4];

        for (int i = 0; i < numAlumnos; i++) {
            scanner.nextLine();

            System.out.println("Ingrese el nombre del alumno " + (i + 1) + ":");
            alumnos[i][0] = scanner.nextLine();
            for ( int j = 1; j <= 3; j++) {
                System.out.println("Nota " + j + " para " + alumnos[i][0] + ":");
                alumnos[i][j] = String.valueOf(scanner.nextDouble());
            }
        }

        for (int i = 0; i < numAlumnos; i++) {
            double sumNotasAlumno = 0;
            for (int j = 1; j<=3; j++){
                sumNotasAlumno += Double.parseDouble (alumnos[i][j]);
            }
            double MediaAlumno = sumNotasAlumno / 3;
            System.out.println("La media de " + alumnos[i][0] + "es: " + MediaAlumno);
        }
        scanner.close();
    }

}
