import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class SerializarLectura {
        public static void main(String[] args) {
            ObjectInputStream entrada = null;
            try {
                entrada = new ObjectInputStream(new FileInputStream("Escribir.txt"));
                ClaseExemplo alumno = (ClaseExemplo) entrada.readObject();
                System.out.println("Nombre del alumno: " + alumno.getNome());
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (entrada != null) {
                        entrada.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

