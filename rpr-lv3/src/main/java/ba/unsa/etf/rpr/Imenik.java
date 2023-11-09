package ba.unsa.etf.rpr;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.lang.StringBuilder;
public class Imenik {
    HashMap<TelefonskiBroj, String> imenik;
    public Imenik() {
        this.imenik = new HashMap<>();
    }
    public void add(String ime, TelefonskiBroj broj) {
        this.imenik.put(broj, ime);
    }
    public String getPhoneNumber(String ime) {
        for (Map.Entry<TelefonskiBroj, String> set : this.imenik.entrySet())
            if (ime.equals(set.getValue()))
                return set.getKey().toString();
        return null;
    }
    public String getName(TelefonskiBroj broj) {
        return this.imenik.get(broj);
    }
    public String DaLiJeZnak(char znak) throws Izuzetak {
        if (!Character.isLetter(znak)) throw new Izuzetak(znak + " nije znak.");
        StringBuilder info = new StringBuilder();

        for (Map.Entry<TelefonskiBroj, String> set : this.imenik.entrySet())
            if (set.getValue().charAt(0) == znak)
                info.append(set.getValue()).append(" [").append(set.getKey()).append("]\n");
        if (info.isEmpty()) return null;
        return info.toString();
    }
    public Set<String> getNamesFromCity(Grad grad) {
        Set<String> set = new TreeSet<>();

        this.imenik.forEach((broj, ime) -> {
            if (broj instanceof FiksniBroj && ((FiksniBroj) broj).dajGrad().equals(grad))
                set.add(ime);
        });
        if (set.isEmpty()) return null;
        return set;
    }

}
