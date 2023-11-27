package org.example;

public class InformacijeOStudentu extends LicneInformacije{
    private String godinaStudija;
    private String brIndeksa;

    public InformacijeOStudentu(String ime, String prezime, String godinaStudija, String brIndeksa) {
        super(ime, prezime);
        this.godinaStudija = godinaStudija;
        this.brIndeksa = brIndeksa;
    }

    public String getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(String godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    public String getBrojIndexa() {
        return brIndeksa;
    }

    public void setBrIndeksa(String brIndeksa) {
        this.brIndeksa = brIndeksa;
    }
}
