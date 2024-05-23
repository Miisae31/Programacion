import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileOutputStream ficheiro = null;

        try {
            ficheiro = new FileOutputStream("C:\\Users\\Administrator\\IdeaProjects\\EscrituraFicherosBinarios\\Archivos\\Escribir.txt");
            byte[] datos = {2,3,4,2,4,2,5};
            ficheiro.write(datos);



        } catch (IOException e ) {
            System.out.println("Error en la lectura del ficheiro");
        } finally {
            try {
                if (ficheiro != null) {
                    ficheiro.close();
                }
            }catch (IOException e) {
                System.out.println("Error al leer o ficheiro");
            }

        }
    }
}