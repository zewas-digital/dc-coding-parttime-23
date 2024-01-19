package saifedine.week18_Zoo.V02_mit_Bonus;

public class Futter {

    private String futterName;

    private String einheitKg;

    private float futterPreis;


    public Futter(String futterName, String einheitKg, float futterPreis) {
        this.futterName = futterName;
        this.einheitKg = einheitKg;
        this.futterPreis = futterPreis;
    }

    public String toString() {
        return this.futterName + ", " + this.einheitKg + ", " + this.futterPreis;
    }


    public String getFutterName() {
        return this.futterName;
    }

    public String getEinheitKg() {
        return this.einheitKg;
    }

    public float getFutterPreis() {
        return this.futterPreis;
    }
}
