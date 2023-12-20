package com.example.rprz1;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class KorisniciModelTest {
    @Test
    public void testDodajNovogKorisnika() {
        KorisniciModel model = new KorisniciModel();
        model.napuni();
        ObservableList<Korisnik> korisnici = model.getKorisnici();
        assertEquals(4, korisnici.size());

        Korisnik noviKorisnik = korisnici.get(3);
        assertEquals("", noviKorisnik.getIme());
        assertEquals("", noviKorisnik.getPrezime());
        assertEquals("", noviKorisnik.getEmail());
        assertEquals("", noviKorisnik.getKorisnicko_ime());
        assertEquals("", noviKorisnik.getLozinka());
    }
  
}