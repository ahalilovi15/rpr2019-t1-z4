package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    @Test
    void dajUkupnuCijenuArtikala(){
     Korpa korpa=   new Korpa();
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "2"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "3"));
    assertEquals(3000, korpa.dajUkupnuCijenuArtikala());
    }
    @Test
    void izbaciArtiklSaKodom(){
        Korpa korpica = new Korpa();
        korpica.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        korpica.dodajArtikl(new Artikl("Biciklo", 1000, "2"));
        korpica.dodajArtikl(new Artikl("Biciklo", 1000, "3"));
        korpica.dodajArtikl(new Artikl("Biciklo", 1000, "4"));
        korpica.dodajArtikl(new Artikl("Biciklo", 1000, "5"));
        korpica.dodajArtikl(new Artikl("Biciklo", 1000, "6"));
        korpica.dodajArtikl(new Artikl("Biciklo", 1000, "7"));
        int broj=korpica.getBr_dodanih();
        Artikl temp=korpica.izbaciArtiklSaKodom("3");
       assertEquals(broj-1, korpica.getBr_dodanih());

       Artikl[] tempniz=korpica.getArtikli();
       for(Artikl x: tempniz){
           if(x!=null && "3".equals(x.getKod())) fail();
       }
    }

    @Test
    void dodajArtikl() {
        Korpa k = new Korpa();
        int i;
        for(i=1; i<=1000; i=i+1)
        {
            Artikl a=new Artikl("biciklo", 1000, Integer.toString(i));
            k.dodajArtikl(a);
        }
        Artikl a=new Artikl("biciklo", 1000, Integer.toString(i+1));
        assertFalse(k.dodajArtikl(a));

    }

}