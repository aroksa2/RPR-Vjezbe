package org.example;
import java.util.ArrayList;
import java.util.List;
public class Predmet implements MozeOcijeniti{
    private String naziv;
    private String opis;
    private List<Ocjena> ocjene;

    public Predmet(String naziv, String opis) {
        this.naziv = naziv;
        this.opis = opis;
        this.ocjene = new ArrayList<>();
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
    public String predstavi() {
        return "Predmet: " + naziv + "\nOpis: " + opis;
    }
    @Override
    public Ocjena ocijeni(int x) {
        Ocjena nova = new Ocjena(null, x);
        ocjene.add(nova);
        return nova;
    }
}
