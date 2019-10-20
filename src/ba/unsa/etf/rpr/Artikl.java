package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv;
    private int cijena;
    private String kod;

    public String getNaziv() {
        return naziv;
    }

    public int getCijena() {
        return cijena;
    }

    public String getKod() {
        return kod;
    }

    public Artikl(String a, int b, String c){
        naziv=a;
        cijena=b;
        kod=c;
    }
}
