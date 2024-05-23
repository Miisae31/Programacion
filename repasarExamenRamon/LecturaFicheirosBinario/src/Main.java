import java.io.IOException;
import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {
        FileInputStream ficheiro = null;
        try {
            ficheiro = new FileInputStream("C:\\Users\\Administrator\\IdeaProjects\\LecturaFicheirosBinario\\Archivos\\Escribir.txt");
            byte[] datos= new byte [ficheiro.available()];
            int valor = ficheiro.read(datos);
            if (valor != 0) {
                for (int i = 0; i< datos.length; i++) {
                    System.out.println(datos[i] + "\t");
                }
            }

        }catch (IOException e) {
            System.out.println("Error al leer el ficheiro");
        } finally {
            try{
                if (ficheiro != null) {
                    ficheiro.close();
                }
            }catch (IOException e ) {
                System.out.println("Error al leer el ficheiro");
            }
        }

    }
}