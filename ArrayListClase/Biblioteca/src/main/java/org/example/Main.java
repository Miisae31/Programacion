package org.example;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    static Scanner scanner = new Scanner(System.in);


    public void anadirLibro(ArrayList<Libro> libro){
        System.out.println("Introduce la firma del libro");
        String firma = scanner.nextLine();
        System.out.println("Introduce el título del libro");
        String titulo = scanner.nextLine();
        System.out.println("Introduce el autor del libro");
        String autor = scanner.nextLine();
        System.out.println("Introduce la editorial del libro");
        String editorial = scanner.nextLine();
        System.out.println("Introduce el ISBN del libro");
        String ISBN = scanner.nextLine();
        System.out.println("Introduce el número de páginas del libro");
        int paginas = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        Libro nuevoLibro = new Libro(firma, titulo, autor, editorial, ISBN, paginas);
        libro.add(nuevoLibro);
        System.out.println("Libro añadido: " + nuevoLibro);
    }

    public void borrarLibro(ArrayList<Libro> libro){
        scanner.nextLine(); // consume the newline
        System.out.println("Introduce la firma del libro que quieres borrar");
        String firma = scanner.nextLine();
        for (int i = 0; i < libro.size(); i++) {
            if (libro.get(i).getFirma().equals(firma)) {
                System.out.println("Libro borrado: " + libro.get(i).toString());
                libro.remove(i);
            }
        }
    }
    public void modificarLibro(ArrayList<Libro> libro){
        System.out.println("Introduce la firma del libro que quieres modificar");
        String firma = scanner.nextLine();
        for(int i = 0; i < libro.size(); i++) {
            if (libro.get(i).getFirma().equals(firma)){
                System.out.println("Introduce la nueva firma del libro");
                String nuevaFirma = scanner.nextLine();
                System.out.println("Introduce el nuevo título del libro");
                String nuevoTitulo = scanner.nextLine();
                System.out.println("Introduce el nuevo autor del libro");
                String nuevoAutor = scanner.nextLine();
                System.out.println("Introduce la nueva editorial del libro");
                String nuevaEditorial = scanner.nextLine();
                System.out.println("Introduce el nuevo ISBN del libro");
                String nuevoISBN = scanner.nextLine();
                System.out.println("Introduce el nuevo número de páginas del libro");
                int nuevasPaginas = scanner.nextInt();
                scanner.nextLine(); // consume the newline
                libro.set(i, new Libro(nuevaFirma, nuevoTitulo, nuevoAutor, nuevaEditorial, nuevoISBN, nuevasPaginas));
            }
        }
    }

   public void buscarLibro(ArrayList<Libro> libro){
        System.out.println("Introduce la firma del libro que quieres buscar");
        String firma = scanner.nextLine();
       for (Libro value : libro) {
           if (value.getFirma().equals(firma)) {
               System.out.println("Firma: " + value.getFirma() + " Título: " + value.getTitulo() + " Autor: " + value.getAutor() + " Editorial: " + value.getEditorial() + " ISBN: " + value.getISBN() + " Páginas: " + value.getPaginas());
           }
       }
   }

   public void salir(ArrayList<Libro> libro){
        System.out.println("Adiós");
       System.exit(0);
   }

    public static void main(String[] args) {
        ArrayList<Libro> libro = new ArrayList<>();
        libro.add(new Libro("F001", "El Quijote", "Cervantes", "Anaya", "978-84-667-0000-0", 200));
        libro.add(new Libro("F002", "El Señor de los Anillos", "Tolkien", "Minotauro", "978-84-450-0000-0", 300));
        libro.add(new Libro("F003", "El Perfume", "Suskind", "Seix Barral", "978-84-322-0000-0", 150));
        libro.add(new Libro("F004", "El Código Da Vinci", "Brown", "Planeta", "978-84-322-0000-0", 150));
        libro.add(new Libro("F005", "Harry Potter y la piedra filosofal", "Rowling", "Salamandra", "978-84-322-0000-0", 150));
        int opcion;
        do {
            System.out.println("""
                    Elige una opción:\s
                    1. Añadir libro
                    2. Borrar libro
                    3. Modificar libro
                    4. Buscar libro
                    5. Salir""");
            opcion = scanner.nextInt();
            scanner.nextLine(); // consume the newline
            Main main = new Main();
            switch (opcion) {
                case 1:
                    main.anadirLibro(libro);
                    break;
                case 2:
                    main.borrarLibro(libro);
                    break;
                case 3:
                    main.modificarLibro(libro);
                    break;
                case 4:
                    main.buscarLibro(libro);
                    break;
                case 5:
                    main.salir(libro);
                    break;
            }
        } while (opcion != 5);

    }


    }

