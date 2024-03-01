package saifedine.week21.V01Bonus2;

// Erstelle eine Tier-Klasse mit einem Namen und einer Gattung
public class Tiere {

    // Attribute
    private String tierName;
    private String tierGattung;
    private Futter.FutterArt FutterArt;
    private int futterBedarf;
    private int maxGesundheit;
    private int bissKraft;

    private int aktuelleGesundkeit;


    // Konstruktor 1
    public Tiere(String tierName, String tierGattung) {
        this.tierName = tierName;
        this.tierGattung = tierGattung;
    }

    // Konstruktor 2
    public Tiere(String tierName, String tierGattung, Futter.FutterArt FutterArt, int futterBedarf) {
        this.tierName = tierName;
        this.tierGattung = tierGattung;
        this.FutterArt = FutterArt;
        this.futterBedarf = futterBedarf;
    }

    // Konstruktor 3
    public Tiere(String tierName, String tierGattung, int MaxGesundheit, int bissKraft) {
        this.tierName = tierName;
        this.tierGattung = tierGattung;
        this.maxGesundheit = MaxGesundheit;
        this.bissKraft = bissKraft;
    }

    // alle Methoden, wobei toString immer der erste sein soll
    @Override
    public String toString() {
        //return this.tierName + ", " + this.tierGattung + ", " + this.FutterArt + ", " + this.futterBedarf;
        return this.tierName + ", " + this.tierGattung;
    }

    public Futter.FutterArt getFutterArt() {
        return this.FutterArt;
    }

    public void setFutterArt(Futter.FutterArt FutterArt) {
        this.FutterArt = FutterArt;
    }

    public int getFutterBedarf() {
        return this.futterBedarf;
    }

    public void setFutterBedarf(int futterBedarf) {
        this.futterBedarf = futterBedarf;
    }

    public int getMaxGesundheit() {return this.maxGesundheit;}

    public void setMaxGesundheit(int maxGesundheit) {
        this.maxGesundheit = maxGesundheit;
    }

    public int getBissKraft() {return this.bissKraft;}

    public void setBissKraft(int bissKraft) {
        this.bissKraft = bissKraft;
    }

    public int getAktuelleGesundkeit() { return this.aktuelleGesundkeit;}

    public void setAktuelleGesundkeit(int aktuelleGesundkeit) { this.aktuelleGesundkeit = aktuelleGesundkeit;}
}