package org.example;
import java.util.ArrayList;
import java.util.List;
public class Pobjednik {
    private String ime;
    private String prezime;
    private int brojZnakova;
    private KolekcijaImena kolekcija;

    public Pobjednik(KolekcijaImena kolekcija) {
        this.kolekcija = kolekcija;
        postaviAtribute();
    }
    private void postaviAtribute() {
        String najduzeIme = kolekcija.getNajduzeIme();
        String[] dijelovi = najduzeIme.split(" ");
    }
}
