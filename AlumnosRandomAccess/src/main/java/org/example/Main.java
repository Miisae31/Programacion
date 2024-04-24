package org.example;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

class Estudiante {
    String nombre;
    String dni;
    int edad;
    float nota;
    boolean repite;

    public Estudiante(String nombre, String dni, int edad, float nota, boolean repite) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.nota = nota;
        this.repite = repite;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public boolean isRepite() {
        return repite;
    }

    public void setRepite(boolean repite) {
        this.repite = repite;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Registrar nuevo estudiante");
            System.out.println("2. Modificar datos de estudiante");
            System.out.println("3. Mostrar estudiantes repetidores");
            System.out.println("4. Mostrar todos los estudiantes");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    registrarNuevoEstudiante();
                    break;
                case 2:
                    modificarDatosEstudiante();
                    break;
                case 3:
                    mostrarEstudiantesRepetidores();
                    break;
                case 4:
                    mostrarTodosLosEstudiantes();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elige de nuevo.");
            }
        } while (opcion != 5);
    }

    static void registrarNuevoEstudiante() {
        try (RandomAccessFile raf = new RandomAccessFile("C:\\Users\\HUGOFP\\IdeaProjects\\AlumnosRandomAccess\\Tarefa5_ficheiro.dat", "rw")) {
            raf.seek(raf.length()); // Move to the end of the file

            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce el nombre del estudiante:");
            String nombre = scanner.nextLine();
            raf.writeUTF(nombre);

            System.out.println("Introduce el DNI del estudiante:");
            String dni = scanner.nextLine();
            raf.writeUTF(dni);

            System.out.println("Introduce la edad del estudiante:");
            int edad = scanner.nextInt();
            raf.writeInt(edad);

            System.out.println("Introduce la nota del estudiante:");
            float nota = scanner.nextFloat();
            raf.writeFloat(nota);

            System.out.println("¿El estudiante repite? (true/false):");
            boolean repite = scanner.nextBoolean();
            raf.writeBoolean(repite);

            System.out.println("Estudiante registrado exitosamente.");
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
        } catch (IOException e) {
            System.out.println("Error de entrada/salida.");
        }
    }

    static void modificarDatosEstudiante() {
        try (RandomAccessFile raf = new RandomAccessFile("C:\\Users\\HUGOFP\\IdeaProjects\\AlumnosRandomAccess\\Tarefa5_ficheiro.dat", "rw")) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Introduce el DNI del estudiante a modificar:");
            String dni = scanner.nextLine();

            boolean found = false;
            while (raf.getFilePointer() < raf.length()) {
                String nombre = raf.readUTF();
                String dniActual = raf.readUTF();
                if (dni.equals(dniActual)) {
                    System.out.println("Introduce el nuevo nombre del estudiante:");
                    nombre = scanner.nextLine();
                    raf.seek(raf.getFilePointer() - nombre.getBytes().length - dni.getBytes().length);
                    raf.writeUTF(nombre);
                    found = true;
                    break;
                }
                raf.readInt(); // Skip edad
                raf.readFloat(); // Skip nota
                raf.readBoolean(); // Skip repite
            }

            if (!found) {
                System.out.println("No se encontró un estudiante con el DNI proporcionado.");
            } else {
                System.out.println("Datos del estudiante modificados exitosamente.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
        } catch (IOException e) {
            System.out.println("Error de entrada/salida.");
        }
    }

    static void mostrarEstudiantesRepetidores() {
        try (RandomAccessFile raf = new RandomAccessFile("C:\\Users\\HUGOFP\\IdeaProjects\\AlumnosRandomAccess\\Tarefa5_ficheiro.dat", "r")) {
            System.out.println("Estudiantes repetidores:");
            while (raf.getFilePointer() < raf.length()) {
                String nombre = raf.readUTF();
                String dni = raf.readUTF();
                int edad = raf.readInt();
                float nota = raf.readFloat();
                boolean repite = raf.readBoolean();

                if (repite) {
                    System.out.println(nombre);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
        } catch (IOException e) {
            System.out.println("Error de entrada/salida.");
        }
    }

    static void mostrarTodosLosEstudiantes() {
        try (RandomAccessFile raf = new RandomAccessFile("C:\\Users\\HUGOFP\\IdeaProjects\\AlumnosRandomAccess\\Tarefa5_ficheiro.dat", "r")) {
            System.out.println("Todos los estudiantes:");
            while (raf.getFilePointer() < raf.length()) {
                String nombre = raf.readUTF();
                String dni = raf.readUTF();
                int edad = raf.readInt();
                float nota = raf.readFloat();
                boolean repite = raf.readBoolean();

                System.out.printf("Nombre: %s, DNI: %s, Edad: %d, Nota: %.2f, Repite: %b%n", nombre, dni, edad, nota, repite);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
        } catch (IOException e) {
            System.out.println("Error de entrada/salida.");
        }
    }
}


