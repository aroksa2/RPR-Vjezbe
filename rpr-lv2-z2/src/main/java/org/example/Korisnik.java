package org.example;

public class Korisnik extends Osoba {
    protected Racun r;
    Korisnik(String ime, String prezime) {
        super(ime,prezime);
    }
    public void dodajRacun(Racun r) {
        this.r=r;
    }
}

