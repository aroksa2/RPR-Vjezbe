package org.example;
import java.util.ArrayList;
import java.util.List;

public class KolekcijaImena {
    private List<String> lista;

    public KolekcijaImena(List<String> lista) {
        this.lista = lista;
    }

    public String getNajduzeIme() {
        String najduzeIme = "";
        for (String pom : lista) {
            if (pom.length() > najduzeIme.length()) {
                najduzeIme = pom;
            }
        }
        return najduzeIme;
    }
}
