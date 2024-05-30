package examen.daw;


import java.io.File;

public class Ejercicio1 {
    public static void ejecutar(){
        File file = new File("Examen DAW/data/ejercicio_1");
        for (File f : file.listFiles()) {
            if (f.isDirectory()) {
                System.out.println(f.getName() + " D");
            }
            if(f.isFile()) {
                System.out.println(f.getName() + " F");
            }
        }

    }

}
