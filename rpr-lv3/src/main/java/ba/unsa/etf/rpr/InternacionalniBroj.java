package ba.unsa.etf.rpr;
import java.util.Objects;
public class InternacionalniBroj extends TelefonskiBroj{
    private String drzava;
    private String broj;
    public InternacionalniBroj(String drzava, String broj) {
        this.drzava=drzava;
        this.broj=broj;
    }
    @Override
    public String print() {
            return drzava+broj;
    }

    @Override
    public int hashCode() {
        return Objects.hash(drzava, broj);
    }
}
