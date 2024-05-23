import java.io.RandomAccessFile;
import java.io.IOException;
import java.io.FileNotFoundException;
public class Main {

    public static void main(String[] args) {
        RandomAccessFile ficheiro = null;
        try {
            ficheiro = new RandomAccessFile("Escribir.txt", "rw");
            System.out.println("Posicion actual do punteiro: " + ficheiro.getFilePointer());
            ficheiro.seek(0);
            ficheiro.writeInt(20);
            ficheiro.writeFloat(10.00F);
            System.out.println("Posicion del punteiro despois da escritura: " + ficheiro.getFilePointer());
            System.out.println("Tamaño del ficheiro: " + ficheiro.length());
            ficheiro.seek(0);
            System.out.println("Primer valor : " + ficheiro.readInt());
            System.out.println("Segundo valor : " + ficheiro.readFloat());
        } catch (IOException e) {
            System.out.println("Error ao leer/escribir o archivo");

        }
    }
}