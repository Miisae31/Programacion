import javax.sound.midi.Soundbank;
import java.io.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    // leer();
    // escribir();
    // coches();

    }

    private static void coches() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la matricula del vehiculo");
        String matricula = scanner.next();
        System.out.println("Introduce la marca del vehiculo");
        String marca = scanner.next();
        System.out.println("Introduce el tamaño del deposito del vehiculo");
        double deposito = scanner.nextDouble();
        System.out.println("Introduce el modelo del vehiculo");
        String modelo = scanner.next();
        try(DataOutputStream escrituraBinario = new DataOutputStream(new FileOutputStream("Binario.txt",true))){
            escrituraBinario.writeUTF(matricula);
            escrituraBinario.writeUTF(marca);
            escrituraBinario.writeDouble(deposito);
            escrituraBinario.writeUTF(modelo);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (DataInputStream lecturaBinario = new DataInputStream(new FileInputStream("Binario.txt"))) {
            System.out.println("Tiene a su disposicion los siguientes vehiculos: ");
            int contador = 1;
            while (lecturaBinario.available() > 0) {

                System.out.println("Coche nº" + contador++ );
                System.out.println("Matricula del vehiculo: " + lecturaBinario.readUTF());
                System.out.println("Marca del coche: " + lecturaBinario.readUTF());
                System.out.println("Deposito del coche: " + lecturaBinario.readDouble());
                System.out.println("Modelo del coche: " + lecturaBinario.readUTF());
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void escribir() {
        try (BufferedWriter escritura = new BufferedWriter(new FileWriter("src/Archivos.csv",true))){
            escritura.newLine();
            String contenido = "7;Casa Pepe7;777";
            escritura.write(contenido, 0, contenido.length());

            // Se puede directamente hacer de la siguiente manera
            // escritura.append("7;Casa Pepe7;777")

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void leer() {

        String [] content;

        try (BufferedReader lectura = new BufferedReader( new FileReader("src/Archivos.csv"))) {
            String linea = lectura.readLine();
            while (linea != null) {
                content = linea.split(";");
                if (content[0].startsWith("6")) {
                    System.out.println("Codigo postal: " + content[0] + "\tNombre :" + content[1] + "\t Dinero: " + content[2]);
                }
                linea = lectura.readLine();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}