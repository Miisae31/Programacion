package org.example;

import java.io.FileOutputStream;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FileOutputStream ficheiro = null;
        try {
        ficheiro = new FileOutputStream("datos.dat");
        byte[] datos = {5,6,7,12,12,43};
        ficheiro.write(datos);
        ficheiro.write('\n');
        int[] datosInt= {5,6,7,12,12,43};
        for (int valor:datosInt) {
            ficheiro.write(valor);
        }

    } catch (IOException e) {
        System.out.println("ERRO: Ocorreu un erro na escritura do ficheiro");
    }finally {
        try {
            if (ficheiro != null) {
                ficheiro.close();
            }
        } catch (IOException e) {
            System.out.println("ERRO: Ocorreu un erro no peche do ficheiro");
        }
    }
    }
}