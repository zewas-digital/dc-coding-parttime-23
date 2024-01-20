package saifedine.week18_Zoo.V03_mit_Bonus;

public class Futter {

    //private String futterName;
    private Futter.FutterArt FutterArt;

    private Futter.FutterEinheit FutterEinheit;

    private float futterPreis;

    Tiere tiere;


    public Futter(Futter.FutterArt FutterArt, Futter.FutterEinheit FutterEinheit, float futterPreis) {
        this.FutterArt = FutterArt;
        this.FutterEinheit = FutterEinheit;
        this.futterPreis = futterPreis;
    }

    public String toString() {
        return this.FutterArt + ", " + this.FutterEinheit + ", " + this.futterPreis;
    }

    public Futter.FutterArt getFutterArt() {
        return this.FutterArt;
    }

    public Futter.FutterEinheit getFutterEinheit() {
        return this.FutterEinheit;
    }

    public float getFutterPreis() {
        return this.futterPreis;
    }

    public enum FutterArt {
        HEU,
        MAUS,
        GETREIDE,
        SALAT
    }

    public enum FutterEinheit{
        KG,
        STK
    }
}
