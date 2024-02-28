package org.example;

public class Persona {
    private String name;
    private int age;

    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Mi nombre es " + name  + " y tengo  " + age + "años";
    }
}
