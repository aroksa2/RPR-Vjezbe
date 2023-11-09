package ba.unsa.etf.rpr;
import java.util.Objects;
public class MobilniBroj extends TelefonskiBroj{
    private int mreza;
    private String br;

    public MobilniBroj(int mreza, String br){
        this.mreza = mreza;
        this.br = br;
    }

    @Override
    public String print() {
            return "0"+mreza+"/"+br;

    }

    @Override
    public int hashCode() {
        return Objects.hash(mreza, br);
    }
}
