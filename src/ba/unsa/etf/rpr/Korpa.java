package ba.unsa.etf.rpr;

public class Korpa {
    private    Artikl[] artikli=new Artikl[50];
    private int br_dodanih = 0;
    public  Artikl izbaciArtiklSaKodom(String k) {
        Artikl trazeni = null;
        for (int i = 0; i < br_dodanih; i++){
            if(k.equals(artikli[i].getKod())){
                trazeni=artikli[i];
                artikli[i]=artikli[br_dodanih-1];
                artikli[br_dodanih-1]=null;
                br_dodanih=br_dodanih-1;
            }
        }

        return trazeni;
    }
    public  boolean dodajArtikl(Artikl x){
        if(br_dodanih>50) return false;
        artikli[br_dodanih]=x;
        br_dodanih=br_dodanih+1;
        return true;
    }
    public  int dajUkupnuCijenuArtikala(){
        int iznos=0;
        for (int i = 0; i < artikli.length; i++){
            if(artikli[i]!=null)
                iznos=iznos+artikli[i].getCijena();
        }
        return iznos;
    }
    public Artikl[] getArtikli() {
        return artikli;
    }
    public int getBr_dodanih(){
        return br_dodanih;
    }
}
