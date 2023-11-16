package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.File;
class LaptopDaoJSONFileTest {
    private LaptopDaoJSONFile laptop;
    @Test
    void dodajLaptopUListu() {
        Laptop laptop = new Laptop("Lenovo", "IdeaPad", 1000.0, 16, 512, 0, "Procesor", "123", 15.6);

        laptop.dodajLaptopUListu(laptop);

        assertEquals(1, laptop.getLaptop().size());
    }

    @Test
    void dodajLaptopUFile() {
        Laptop laptop = new Laptop("Lenovo", "IdeaPad", 1000.0, 16, 512, 0, "Procesor", "123", 15.6);

        LaptopDaoJSONFile l = laptop(laptop);
        l.dodajLaptopUFile(laptop);
        assertEquals(1, l.getLaptop().size());
        verify(l, times(1)).vratiPodatkeUDatoteku();
    }

}