package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        InformacijeOStudentu student = new InformacijeOStudentu("Amina", "Roksa", "2", "11111");
        System.out.println("Student: " + student.getIme() + " " + student.getPrezime() +
                ", Godina studija: " + student.getGodinaStudija() + ", Broj indeksa: " + student.getBrojIndexa());

        }
}