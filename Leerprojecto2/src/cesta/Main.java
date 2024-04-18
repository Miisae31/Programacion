package cesta;

import java.io.*;
import java.util.ArrayList;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) {
        String linea;
        try (BufferedReader buffer = new BufferedReader(new FileReader("C:\\Users\\HUGOFP\\IdeaProjects\\Leerprojecto2\\archivos\\cestas\\Cesta1.prp"))) {
            linea = buffer.readLine();
            Double total = 0.0;
            String [] valores;
            while(linea!=null) {
                valores = linea.split("=");
                System.out.println(valores[0] + "\t=\t" + valores[1]);
               total += Double.parseDouble(valores[1]);
               linea = buffer.readLine();
           }
            System.out.println(total);

        }
        catch (FileNotFoundException e) {
            System.out.println("Error leer el fichero");
        }
        catch (IOException e ) {
            System.out.println("Error al leer el fichero");
        }



    }



}

// Sacar por pantalla el listado de productos  el total de la compra