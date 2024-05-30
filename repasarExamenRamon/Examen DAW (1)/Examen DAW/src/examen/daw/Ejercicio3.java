package examen.daw;
import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Ejercicio3 {
    
    public static void ejecutar() {
        try {
            FileInputStream videoLectura = new FileInputStream("Examen DAW/data/ejercicio_3/ejercicio_3.mkv");
            FileOutputStream videoEscritura = new FileOutputStream("copia_ejercicio_3.mkv");

            byte [] b = videoLectura.readAllBytes();
            videoEscritura.write(b);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
