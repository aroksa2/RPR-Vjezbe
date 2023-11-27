package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Predmet programiranje = new Predmet("Programiranje1", "Kod");
        Ocjena ocjena = programiranje.ocijeni(7);
        System.out.println("Ocjena iz programiranja: " + ocjena.getOcjena());

    }
}