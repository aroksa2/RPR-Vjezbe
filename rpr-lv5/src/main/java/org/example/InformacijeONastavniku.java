package org.example;
import java.util.ArrayList;
import java.util.List;
public class InformacijeONastavniku implements MozeOcijeniti{
    private String ime;
    private String prezime;
    private String titula;
    private List<Ocjena> ocjene;

    public InformacijeONastavniku(String ime, String prezime, String titula) {
        this.ime = ime;
        this.prezime = prezime;
        this.titula = titula;
        this.ocjene = new ArrayList<>();
    }

    public String getTitula() {
        return titula;
    }

    public void setTitula(String titula) {
        this.titula = titula;
    }
    @Override
    public Ocjena ocijeni(int x) {
        Ocjena nova = new Ocjena(null, x);
        ocjene.add(nova);
        return nova;
    }
}
