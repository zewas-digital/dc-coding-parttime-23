package saifedine.week21_Zoo.V01Bonus2;

import java.util.HashMap;

public class Futter {

    // Attribute, enum immer zuerst
    public enum FutterArt {
        HEU,
        MAUS,
        GETREIDE,
        SALAT
    }

    public enum FutterEinheit {
        KG,
        STK
    }

    private FutterArt futterArt;
    private FutterEinheit futterEinheit;
    private float futterPreis;

    public static HashMap<FutterArt, Futter> FutterLagerListe = new HashMap<>();


    // Konstruktor
    public Futter(FutterArt FutterArt, FutterEinheit FutterEinheit, float futterPreis) {
        this.futterArt = FutterArt;
        this.futterEinheit = FutterEinheit;
        this.futterPreis = futterPreis;
        FutterLagerListe.put(FutterArt, this);
    }


    // alle Methoden, wobei toString immer der erste sein soll
    @Override
    public String toString() {
        return this.futterArt + ", " + this.futterEinheit + ", " + this.futterPreis;
    }

    public FutterEinheit getFutterEinheit() {
        return this.futterEinheit;
    }

    public float getFutterPreis() {return this.futterPreis;}
}
