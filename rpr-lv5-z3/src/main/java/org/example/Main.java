package org.example;
import java.util.ArrayList;
import java.util.List;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Amina Roksa");
        lista.add("Anel Roksa");

        KolekcijaImena kolekcija = new KolekcijaImena(lista);
        String najduzeIme = kolekcija.getNajduzeIme();

        System.out.println("Najduže ime: " + najduzeIme);
    }
}