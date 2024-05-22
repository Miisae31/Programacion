package ud05_a02_tarefa6;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        byte opcion = 0;
        boolean sair = false;
        String nome;
        String dni;
        int idade;
        float nota;
        byte repite;
        boolean repetidor;
        ArrayList<Alumno> alumnado = new ArrayList<>();

        do {
            System.out.println("MENÚ");
            System.out.println("\t1. Engadir alumno.");
            System.out.println("\t2. Saír.");
            opcion = validarOpcion(1, 2);
            switch (opcion) {
                case 1: //Engadir alumno
                    System.out.println("\t == NOVO ESTUDIANTE ==");
                    nome = lerString("\t   Nome (Máximo 10 caracteres): ")
                            +"          ";
                    dni = lerString("\t   Dni: ");
                    while (!comprobarDNI(dni)) {
                        System.out.println("\tERRO: o dni é incorrecto."
                                + "Volva a introducilo.");
                        dni = lerString("\tDNI: ");
                    }
                    idade = lerInt("\t   Idade: ");
                    nota = lerFloat("\t   Nota: ");
                    repite = lerByte("\t   Repite [0-Non 1-Si]: ");
                    while (repite != 0 && repite != 1) {
                        System.out.println("\tERRO: só opción 0 ou 1."
                                + "Volva a introducir [0-Non 1-Si]:");
                        repite = lerByte("\t   Repite [0-Non 1-Si]: ");
                    }
                    repetidor = (repite != 0);
                    alumnado.add(new Alumno(nome, dni, idade, nota, repetidor));
                    break;
                case 2:
                    boolean rdo = serializar(alumnado);
                    if (rdo) {
                        System.out.println("A escritura no ficheiro foi exitosa.");
                    } else {
                        System.out.println("AVISO: Houbo un erro, non se puido "
                                + "escribir correctamente no ficheiro.");
                    }
                    sair = true;
                    break;
            }
        }while (!sair);
    }

    public static boolean serializar(ArrayList<Alumno> alumnado) {
        boolean correcto = true;
        try (ObjectOutputStream ficheiro =
                     new ObjectOutputStream(new FileOutputStream("alumnos.dat"))){
            Iterator<Alumno> iterador = alumnado.iterator();
            while(iterador.hasNext()){
                Alumno alumno = iterador.next();
                ficheiro.writeObject(alumno);
            }
        } catch (IOException e) {
            System.out.println("ERRO: Problemas de entrada/saída");
            correcto = false;
        }
        return correcto;
    }
    public static byte validarOpcion(int min, int max) {
        byte opcion = 0;
        boolean repetir;
        Scanner sc = new Scanner(System.in);
        do {
            repetir = false;
            System.out.print ("Seleccione unha opción: ");
            if (sc.hasNextByte()) {
                opcion = sc.nextByte();
                if (opcion < min || opcion > max) {
                    System.out.println("\tATENCIÓN! Opción non dispoñible. "
                            + "Volva a seleccionar. ");
                    repetir = true;
                }
            } else {
                System.out.println("\tERRO: Débese introducir unha entre "
                        +min+" e "+max);
                sc.next();
                repetir = true;
            }
        } while (repetir);
        return opcion;
    }

    public static String lerString(String cadea) {
        String valor = "";
        boolean repetir;
        Scanner sc = new Scanner(System.in);

        System.out.print(cadea);
        repetir = true;
        while (repetir) {
            if (sc.hasNextLine()) {
                valor = sc.nextLine();
                repetir = (valor.isEmpty());
            }  else {
                sc.next();
            }
            if (repetir) {
                System.out.print("\tERRO: debe introducir algún texto. "
                        + "\n\t\tVolva a introducir o valor: ");
            }
        }
        return valor;
    }

    public static int lerInt(String cadea) {
        int valor = 0;
        boolean repetir;
        Scanner sc = new Scanner(System.in);

        System.out.print(cadea);
        repetir = true;
        while (repetir) {
            if (sc.hasNextInt()) {
                valor = sc.nextInt();
                repetir = (valor < 1);
            }  else {
                sc.next();
            }
            if (repetir) {
                System.out.print("\tERRO: debe introducir un valor numérico. "
                        + "\n\t\tVolva a introducir un número: ");
            }
        }
        return valor;
    }

    public static float lerFloat(String cadea) {
        float valor = 0;
        boolean repetir;
        Scanner sc = new Scanner(System.in);

        System.out.print(cadea);
        repetir = true;
        while (repetir) {
            if (sc.hasNextFloat()) {
                valor = sc.nextFloat();
                repetir = (valor < 1);
            }  else {
                sc.next();
            }
            if (repetir) {
                System.out.print("\tERRO: debe introducir un valor float. "
                        + "\n\t\tVolva a introducir un número: ");
            }
        }
        return valor;
    }

    public static byte lerByte(String cadea) {
        byte valor = 0;
        boolean repetir;
        Scanner sc = new Scanner(System.in);

        System.out.print(cadea);
        repetir = true;
        while (repetir) {
            if (sc.hasNextFloat()) {
                valor = sc.nextByte();
                repetir = (valor < 0);
            }  else {
                sc.next();
            }
            if (repetir) {
                System.out.print("\tERRO: debe introducir un valor numérico. "
                        + "\n\t\tVolva a introducir un número: ");
            }
        }
        return valor;
    }

    public static boolean comprobarDNI (String num) {
        boolean correcto = false;
        if (num.length() == 9){
            String letra = num.substring(8);
            num = num.substring(0,8);
            if ((num.matches("\\d{8}"))
                    && (letra.matches("[a-zA-Z]{1}"))) {
                int i  = Integer.parseInt(num);
                char a = letra.charAt(0);
                if (validarDNI(i,a)) {
                    correcto = true;
                }
            }
        }
        return correcto;
    }
    public static boolean validarDNI(int num, char letra) {
        char letras[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J',
                'Z','S','Q','V','H','L','C','K','E'};
        int resto = num % 23;
        return letras[resto] == Character.toUpperCase(letra);
    }
}