package org.example;

public class KolekcijaPoruka {
    private final String[] poruke;

    public KolekcijaPoruka(Predmet[] predmeti) {
        this.poruke = new String[predmeti.length];
        for (int i = 0; i < predmeti.length; i++) {
            poruke[i] = predmeti[i].predstavi();
        }
    }

    public String[] getPoruke() {
        return poruke;
    }
}
