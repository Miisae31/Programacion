import java.io.*;
public class ReadEjemplo {
public static void main(String[] args) {
    FileReader fileReader = null;
    try {
        fileReader = new FileReader("C:\\Users\\Administrator\\IdeaProjects\\ComoLeerArchivo\\Archivos\\Cesta1.prp");
        int caracter;
        StringBuilder linea = new StringBuilder();
        Double total = 0.0;
        String[] valores;
        while ((caracter = fileReader.read()) != -1) {
            if (caracter != '\n' && caracter != '\r') {
                linea.append((char) caracter);
            } else {
                valores = linea.toString().split("=");
                System.out.println(valores[0] + "\t=\t" + valores[1]);
                total += Double.parseDouble(valores[1]);
                linea.setLength(0); // Reiniciar el StringBuilder
            }
        }
        if (linea.length() > 0) { // Procesar la última línea si no está vacía
            valores = linea.toString().split("=");
            System.out.println(valores[0] + "\t=\t" + valores[1]);
            total += Double.parseDouble(valores[1]);
        }
        System.out.println("El total de la compra es " + total);
    } catch (FileNotFoundException e) {
        System.out.println("Error al leer el archivo: archivo no encontrado.");
    } catch (IOException e) {
        System.out.println("Error al leer el archivo.");
    } finally {
        if (fileReader != null) {
            try {
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo.");
            }
        }
    }
}
}