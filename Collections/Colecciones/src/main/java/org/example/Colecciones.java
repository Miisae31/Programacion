package org.example;
import java.util.Stack;
import java.util.ArrayDeque;

public class Colecciones {
    public static void main(String[] args) {
        Persona p1 = new Persona("Persona 1", 20);
        Stack<Persona> variable = new Stack<>();
        for (int i = 0; i < 10; i++) {
            variable.add(new Persona("Persona " + i, 10+i));
        }

        if (variable.isEmpty()) {
            System.out.println("El tamaño de la lista deberia ser 0");

        } else {
            System.out.println("La lista no esta vacia");
        }

        System.out.println("El tamaño actual es : " + variable.size());

        variable.clear();

        if (variable.isEmpty()) {
            System.out.println("El tamaño de la lista deberia ser 0");

        } else {
            System.out.println("La lista no esta vacia");
        }

        System.out.println("El tamaño actual es : " + variable.size());

        for (int i = 0; i < 10; i++) {
            variable.add(new Persona("Persona " + i, 10+i));
        }

        if(variable.contains(p1)){
            System.out.println(p1);
        } else {
            System.out.println("No se encontro el objeto");
        }
    }

}