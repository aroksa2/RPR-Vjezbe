package org.example;

import java.util.List;

public class Banka {
    private long brRacuna;
    protected List<Korisnik> k;
    protected List<Korisnik> u;
    Banka() {
        brRacuna = 1;
    }
        public Korisnik kreirajKorisnika(String ime, String prezime) {
            Korisnik kor=new Korisnik(ime,prezime);
            k.add(kor);
            return kor;
        }
        public Racun kreirajRacun(Korisnik k1) {
            Racun r= new Racun(brRacuna, k1);
            k1.dodajRacun(r);
            return r;
        }
    }

