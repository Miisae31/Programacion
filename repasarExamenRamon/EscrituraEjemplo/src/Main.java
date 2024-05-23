import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter("C:\\Users\\Administrator\\IdeaProjects\\EscrituraEjemplo\\Archivos\\Escribir.txt"))) {
        buffer.write("Holaaa");
        buffer.newLine();
        buffer.write("Segunda linea");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }

        }
    }
