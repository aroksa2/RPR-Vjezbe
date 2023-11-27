package org.example;
import java.util.ArrayList;
import java.util.List;
public class KolekcijaImenaIPrezimena {
    private List<String> imena;
    private List<String> prezimena;

    public KolekcijaImenaIPrezimena(List<String> imena, List<String> prezimena) {
        this.imena = imena;
        this.prezimena = prezimena;
    }

    public int getIndexNajduzegPara() {
        int indeksNajduzegPara = -1;
        int najduzaDuzina = 0;

        for (int i = 0; i < imena.size(); i++) {
            String imeIPrezime = imena.get(i) + prezimena.get(i);
            if (imeIPrezime.length() > najduzaDuzina) {
                najduzaDuzina = imeIPrezime.length();
                indeksNajduzegPara = i;
            }
        }

        return indeksNajduzegPara;
    }

    public String getImeiPrezime(int i) {
        return imena.get(i) + " " + prezimena.get(i);
    }
}
