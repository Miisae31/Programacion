
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class BufferedReaderEjemplo {
    public static void main(String[] args) {
    String linea;
    try (BufferedReader buffer = new BufferedReader(new FileReader("C:\\Users\\Administrator\\IdeaProjects\\ComoLeerArchivo\\Archivos\\Cesta1.prp"))) {
        linea = buffer.readLine();
        Double total = 0.0;
        String [] valores;
        while (linea != null){
            valores = linea.split("=");
            System.out.println(valores [0] + "\t=\t"+ valores [1]);
            total += Double.parseDouble(valores[1]);
            linea = buffer.readLine();
        }
            System.out.println("El total de la compra es " + total);

        }
    catch (FileNotFoundException e) {
        System.out.println("Error al leer el archivo");
    }

    catch (IOException e) {
        System.out.println("Error al leer el archivo");
    }

    }
}