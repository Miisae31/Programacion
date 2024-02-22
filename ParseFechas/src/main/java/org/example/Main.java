package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    LocalDate today = LocalDate.parse("2024-02-21");
    LocalDate tomorrow = LocalDate.parse("22-02-2024", DateTimeFormatter.ofPattern("dd-MM-yyyy") );
    System.out.print("Today is " +  today + " and tomorrow is " + tomorrow);
    }
}

