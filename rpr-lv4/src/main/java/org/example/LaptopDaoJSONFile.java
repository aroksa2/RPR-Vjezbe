package org.example;
import java.io.File;
import java.util.ArrayList;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LaptopDaoJSONFile implements LaptopDao{
    private File file;
    private ArrayList<Laptop> laptopi;

    public LaptopDaoJSONFile(File file) {
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
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(file, laptopi);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void vratiPodatkeIzDatoteke() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            laptopi = objectMapper.readValue(file, objectMapper.getTypeFactory().constructCollectionType(ArrayList.class, Laptop.class));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void vratiPodatkeIzDatoteke() {
        XmlMapper xmlMapper = new XmlMapper();
        try {
            laptopi = xmlMapper.readValue(file, xmlMapper.getTypeFactory().constructCollectionType(ArrayList.class, Laptop.class));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
