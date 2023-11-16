package org.example;
import java.io.*;
import java.util.ArrayList;
public class LaptopDaoSerializableFile implements LaptopDao{
    private File file;
    private ArrayList<Laptop> laptopi;
    public LaptopDaoSerializableFile(File file) {
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
        for (Laptop el : laptopi)
            if (el.getProcesor().equals(procesor))
                return el;
        throw new ProcesorException("Greska!");
    }
    @Override
    public void napuniListu(ArrayList<Laptop> laptopi) {
        this.laptopi = laptopi;
    }
    @Override
    public void dodajLaptopUFile(Laptop laptop) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file, true))) {
            outputStream.writeObject(laptop);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void vratiPodatkeIzDatoteke()  {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            while (true) {
                Laptop laptop = (Laptop) inputStream.readObject();
                laptopi.add(laptop);
            }
        } catch (EOFException e) {
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    }