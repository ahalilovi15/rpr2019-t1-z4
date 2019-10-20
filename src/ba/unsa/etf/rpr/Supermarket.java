package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli = new Artikl[1000];
    private int br_dodanih = 0;

    public Artikl[] getArtikli() {
        return artikli;
    }

    public boolean dodajArtikl(Artikl x) {
        if (br_dodanih > 50) return false;
        artikli[br_dodanih] = x;
        br_dodanih = br_dodanih + 1;
        return true;
    }

    public Artikl izbaciArtiklSaKodom(String k) {
        Artikl trazeni = null;
        for (int i = 0; i < br_dodanih; i++) {
            if (k.equals(artikli[i].getKod())) {
                trazeni = artikli[i];
                artikli[i] = artikli[br_dodanih - 1];
                artikli[br_dodanih - 1] = null;
                br_dodanih = br_dodanih - 1;
            }
        }
        return trazeni;
    }
}
