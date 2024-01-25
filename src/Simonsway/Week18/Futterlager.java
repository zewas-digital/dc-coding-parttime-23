package Simonsway.Week18;

import java.util.HashMap;

public class Futterlager {

    public enum futterArten {
        HEU,
        FISCH,
        FLEISCH,
        WEIZEN;
    }
    public HashMap<futterArten, Futterdaten> lagerliste;

    public Futterlager(){
        this.lagerliste = new HashMap<>();
        this.lagerliste.put(futterArten.HEU, new Futterdaten("Heu", Futterdaten.Einheit.KG, 0.20F));
        this.lagerliste.put(futterArten.FISCH, new Futterdaten("Fisch", Futterdaten.Einheit.STK, 0.50F));
        this.lagerliste.put(futterArten.FLEISCH, new Futterdaten("Fleisch", Futterdaten.Einheit.KG, 0.85F));
    }


}
