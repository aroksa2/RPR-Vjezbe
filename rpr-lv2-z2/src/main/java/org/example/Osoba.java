package org.example;

public class Osoba {
    String ime, prezime;
    Osoba(String ime, String prezime) {
        this.ime=ime;
        this.prezime=prezime;
    }
    public
    String toString() {
        return ime + " " + prezime;
    }
}
