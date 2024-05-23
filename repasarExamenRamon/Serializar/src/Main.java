import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        ObjectOutputStream saida = null;

        try {
            saida = new ObjectOutputStream(new FileOutputStream("Escribir.txt"));
            ClaseExemplo alumno = new ClaseExemplo("Juan");
            saida.writeObject(alumno);

        }catch (IOException e){
            System.out.println("Error ao serializar");
        } finally {
            try {
                if (saida != null) {
                    saida.close();
                }
            } catch (IOException e) {
                System.out.println("Error al leer el archivo");
            }
        }
    }
}