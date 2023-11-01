package org.example;

public class Racun {
    protected Long brRacuna;
    protected Osoba korisnik;
    protected boolean prekoracenje;
    protected double stanje;
    Racun(Long brRacuna, Osoba korisnik) {
        this.brRacuna=brRacuna;
        this.korisnik=korisnik;
        prekoracenje=false;
        stanje=0;
    }
    private boolean provjera(double isplata) {
        return stanje>=isplata || prekoracenje;
    }
    public boolean uplati(double uplata) {
        stanje=stanje+uplata;
        return stanje>=0;
    }
    public boolean isplati(double isplata) {
        if(provjera(isplata))
            return false;
        else return true;
    }
    public void odobri() {
        prekoracenje=true;
    }
}

