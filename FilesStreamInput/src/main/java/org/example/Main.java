package org.example;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileOutputStream ficheiro = new FileOutputStream("datos1.dat");
             DataOutputStream ficheiroData = new DataOutputStream(ficheiro)) {
            byte[] datos = {1, 6, 7, 12, 12, 43};
            for (byte dato : datos) {
                ficheiroData.writeByte(dato);
            }
            ficheiroData.write('\n');
        } catch (IOException e) {
            System.out.println("Erro: Ocorreu un erro na escritura do ficheiro");
        }

        try (FileInputStream ficheiro = new FileInputStream("datos2.dat")) {
            byte[] datos = new byte[ficheiro.available()];
            int valor = ficheiro.read(datos);
            if (valor != -1) {
                for (int i = 0; i < valor; i++) {
                    System.out.print(datos[i] + "\t");
                }
            }
        } catch (IOException e) {
            System.out.println("ERRO: Ocorreu un erro na escritura do ficheiro");
        }

        try (FileInputStream ficheiro = new FileInputStream("datos2.dat")) {
            int valor;
            while ((valor = ficheiro.read()) != -1) {
                System.out.print((char) valor);
            }
        } catch (IOException e) {
            System.out.println("ERRO: Ocorreu un erro na escritura do ficheiro");
        }
    }
}