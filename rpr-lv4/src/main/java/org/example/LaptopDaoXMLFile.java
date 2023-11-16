package org.example;
import java.io.File;
import java.util.ArrayList;
import java.io.IOException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
public class LaptopDaoXMLFile implements LaptopDao{
    private File file;
    private ArrayList<Laptop> laptopi;

    public LaptopDaoXMLFile(File file) {
        this.file = file;
        this.laptopi = new ArrayList<>();
    }
    @Override
    public void dodajLaptopUListu(Laptop laptop) {
        laptopi.add(laptop);
    }
    @Override
    public Laptop getLaptop(String procesor) {
        Laptop temp = new Laptop();
        for (Laptop l : laptopi)
            if (l.getProcesor().equals(procesor))
                return l;
        throw new ProcesorException("Greska!");
    }
    @Override
    public void napuniListu(ArrayList<Laptop> laptopi) {
        this.laptopi = laptopi;
    }
    @Override
    public void dodajLaptopUFile(Laptop laptop) {
        XmlMapper xmlMapper = new XmlMapper();
        try {
            xmlMapper.writerWithDefaultPrettyPrinter().writeValue(file, laptopi);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
