package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ImenikTest {
    @Test
    public void dodaj() {
        this.Imenik.add("Name", Mockito.mock(TelefonskiBroj.class));
        assertEquals(1, this.Imenik.size());
    }

    @Test
    void add() {
        Imenik imenik = new Imenik();
        imenik.add("Amina Hadzic", new InternacionalniBroj("+1", "44 35-37-11"));
        imenik.add("Anel Roksa", new FiksniBroj(Grad.SARAJEVO, "123-455"));
        imenik.add("Merjem Meri", new FiksniBroj(Grad.SARAJEVO, "123-456"));
        assertEquals("033/123-455", imenik.getPhoneNumber("Anel Roksa"));
    }

    @Test
    void DaLiJeZnak() {
        Imenik imenik = new Imenik();
        imenik.add("Arnela Hodzic", new FiksniBroj(Grad.SARAJEVO, "123-156"));
        imenik.add("Emina Malic", new MobilniBroj(61, "321-645"));
        imenik.add("Elvedina Music", new InternacionalniBroj("+1", "23 45-67-89"));
        assertEquals( "Elvedina Music - 061/321-645", imenik.DaLiJeZnak('I').trim());
    }


    @Test
    void izGrada() {
        Imenik imenik = new Imenik();
        imenik.add("Elvedina Music", new FiksniBroj(Grad.SARAJEVO, "123-456"));
        imenik.add("Adna Maric", new FiksniBroj(Grad.SARAJEVO, "123-455"));
        imenik.add("Emir Ramic", new MobilniBroj(64, "123-454"));
        java.util.Set<String> set = imenik.getNamesFromCity(Grad.SARAJEVO);
        String rezultat = "";
        for (String ime: set) {
            rezultat += ime + ",";
        }
        assertEquals("Adna Maric,Elvedina Music,Emir Ramic", rezultat);
    }

}