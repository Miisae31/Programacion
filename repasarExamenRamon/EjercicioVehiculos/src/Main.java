import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int opcion = 1;

        while (opcion != 0) {
            System.out.println("Seleccione una opcion: ");
            System.out.println("1.Añadir vehiculo: ");
            System.out.println("2.Visualizar vehiculos disponibles: ");
            System.out.println("3.Añadir restaurante: ");
            System.out.println("4.Ver restaurantes disponibles: ");
            System.out.println("5.Salir del programa");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    escrituraBinario();
                    break;
                case 2:
                    lecturaBinario();
                    break;
                case 3:
                    escrituraArchivo();
                    break;
                case 4:
                    lecturaArchivo();
                    break;
                case 5:
                    System.out.println("Saliendo del programa");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, seleccione una opcion valida");
                    break;
            }
        }

    }

    private static void lecturaArchivo() {
        String [] content;
        try(BufferedReader lecturaRestaurante = new BufferedReader(new FileReader("ArchivoRestaurantes.csv"))) {
            String linea =  lecturaRestaurante.readLine();
            while (linea != null) {
                 content = linea.split(";");
                 if (content[0].startsWith("C")) {
                     System.out.println("Nombre del restaurante: " + content[0] + "\tDireccion: " + content[1] + "\tTipo de cocina: " + content[2]);

                 }
                 linea = lecturaRestaurante.readLine();

            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void escrituraArchivo() {
        try (BufferedWriter escrituraRestaurante = new BufferedWriter(new FileWriter("ArchivoRestaurantes.csv",true))) {
            escrituraRestaurante.newLine();
            String contenido = "CasaPepe;Rua Da Laxe;española";
            escrituraRestaurante.write(contenido,0,contenido.length());
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void escrituraBinario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca la Matricula del coche: ");
        String matricula = scanner.next();
        System.out.println("Introduzca la marca del coche: ");
        String marca = scanner.next();
        System.out.println("Introduzca la capacidad del deposito del coche: ");
        double capacidad = scanner.nextDouble();
        System.out.println("Introduzca el modelo del coche: ");
        String modelo = scanner.next();

        try (DataOutputStream archivoBinarioEscritura = new DataOutputStream(new FileOutputStream("binario.txt", true))) {
            archivoBinarioEscritura.writeUTF(matricula);
            archivoBinarioEscritura.writeUTF(marca);
            archivoBinarioEscritura.writeDouble(capacidad);
            archivoBinarioEscritura.writeUTF(modelo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void lecturaBinario() {
            try (DataInputStream archivoBinarioLectura = new DataInputStream(new FileInputStream("binario.txt"))) {
                System.out.println("Tiene a su disposicion los siguientes vehiculos");
                    int contador = 1;
                while (archivoBinarioLectura.available() > 0) {
                    System.out.println("Coche nº " + contador ++);
                    System.out.println("Matricula del coche: " + archivoBinarioLectura.readUTF());

                    System.out.println("Marca del coche: " + archivoBinarioLectura.readUTF());

                    System.out.println("Capacidad del deposito del coche: " + archivoBinarioLectura.readDouble());

                    System.out.println("Modelo del coche: " + archivoBinarioLectura.readUTF());

                }


        } catch (IOException e) {
                e.printStackTrace();

            }
        }
    }
