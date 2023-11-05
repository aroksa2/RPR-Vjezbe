package ba.unsa.etf.rpr;

public enum Grad {
    SARAJEVO("033"),
    TUZLA("035"),
    ZENICA("032"),
    TRAVNIK("030"),
    MOSTAR("036");
    private String brTel;

    Grad(String brTel){
        this.brTel = brTel;
    }

    public static Grad br1(String brTel){
        for(Grad g: Grad.values()){
            if (g.getBrTel().equals(brTel)){
                return g;
            }
        }
        return null;
    }

    public String getBrTel() {
        return brTel;
    }
}
