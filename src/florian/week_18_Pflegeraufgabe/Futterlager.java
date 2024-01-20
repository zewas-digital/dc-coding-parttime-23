package florian.week_18_Pflegeraufgabe;


import java.util.HashMap;

public class Futterlager {

    public enum futterarten {
        HEU,
        FISCH,
        FLEISCH
    }

    public HashMap<futterarten, Futterdaten> lagerliste;
    public Futterlager() {
        this.lagerliste  = new HashMap<>();
        this.lagerliste.put(futterarten.HEU, new Futterdaten("Heu", " kg", 12.5f));
        this.lagerliste.put(futterarten.FISCH, new Futterdaten("Fisch", " Stk.", 52.5f));
        this.lagerliste.put(futterarten.FLEISCH, new Futterdaten("Fleisch", " kg", 22.5f));
    }
}
