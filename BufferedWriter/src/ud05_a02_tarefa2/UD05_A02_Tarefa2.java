package ud05_a02_tarefa2;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UD05_A02_Tarefa2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String linha = "";
        ArrayList<Empregado> empregados = new ArrayList<>();
        Iterator it;
        try (BufferedReader buffer = new BufferedReader(new FileReader("Tarefa3_empregados.txt"))) {
            linha = buffer.readLine();
            while (linha != null) {
                engadirLinha(empregados, linha);
                linha = buffer.readLine();
            }


        } catch (FileNotFoundException e) {
            System.out.println("ERRO: O ficheiro é un directorio ou ben non existe.");
        } catch (IOException e) {
            System.out.println("ERRO: Ocorreu un erro na lectura do ficheiro");
        }
        boolean continuar = true;
do {
    int menu = 0;
    System.out.println("Menu");
    System.out.println("\n 1.Listar empregador alfabeticamente");
    System.out.println("\n 2.Listar empregados por departamento e alfabeticamente");
    System.out.println("\n 3.Engadir nuevo empleado");
    System.out.println("\n 4.Eliminar empleado");
    System.out.println("\n 5.Salir");

    menu = scanner.nextInt();


    switch (menu) {
        case 1:

            System.out.println("Empregados ordenados por orde alfabética:");
            empregados.sort(new OrdeAlfabetico());
            it = empregados.iterator();
            while (it.hasNext()) {
                Empregado emp = (Empregado) it.next();
                System.out.println(emp);
            }

            break;
        case 2:
            System.out.println("Empregados ordenados por departamento e por orde "
                    + "alfabética :");
            empregados.sort(new OrdeDepartamento());
            it = empregados.iterator();
            while (it.hasNext()) {
                Empregado emp = (Empregado) it.next();
                System.out.println(emp);
            }
            System.out.println("");
            break;
        case 3:
            do {
                System.out.println("Nome do empregado a engadir:");
                String nome = scanner.next();
                System.out.println("Dni do empregado a engadir: ");
                String dni = scanner.next();

                System.out.println("Idade do empregado a engadir: ");
                int idade = scanner.nextInt();
                System.out.println("Departamento do empregado a engadir: ");
                String departamento = scanner.next();
                boolean dniRepetido = false;
                for (Empregado empregado : empregados) {
                    if (empregado.dni.equals(dni)) {
                        dniRepetido = true;
                        System.out.println("O dni xa existe");
                        break;
                    }
                }
                if (!dniRepetido) {
                    Empregado emp = new Empregado(nome, dni, idade, departamento);
                    empregados.add(emp);
                    System.out.println("Empregado engadido");
                    break;
                }
            } while (true);
            break;

        case 4:
            System.out.println("Eliminar empregado");
            System.out.println("Introduce el DNI del empleado a eliminar:");
            String dniEliminar = scanner.next();
            boolean empleadoEliminado = false;
            for (Iterator<Empregado> iterator = empregados.iterator(); iterator.hasNext();) {
                Empregado empregado = iterator.next();
                if (empregado.dni.equals(dniEliminar)) {
                    iterator.remove();
                    System.out.println("Empleado eliminado");
                    empleadoEliminado = true;
                    break;
                }
            }
            if (!empleadoEliminado) {
                System.out.println("No se encontró un empleado con el DNI proporcionado");
            }
            break;
        case 5:
            System.out.println("Sair");
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("Tarefa3_empregados.txt"))) {
                for (Empregado empregado : empregados) {
                    writer.write(empregado.nome + ";" + empregado.dni + ";" + empregado.idade + ";" + empregado.departamento);
                    writer.newLine();
                }
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo");
            }
            continuar = false;
            break;


    }
    } while (continuar);
    }

    public static void engadirLinha(ArrayList<Empregado> lista, String lin)     {
        String[] valores = lin.split(";");
        lista.add(new Empregado(valores[0],valores[1],Integer.valueOf(valores[2]),
                valores[3]));
    }

}











