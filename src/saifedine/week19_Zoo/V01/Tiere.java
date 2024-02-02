package saifedine.week19_Zoo.V01;

// Erstelle eine Tier-Klasse mit einem Namen und einer Gattung
public class Tiere {

    private String tierName;
    private String tierGattung;
    private Futter.FutterArt FutterArt;

    private int futterBedarf;

    Futter futter;


    public Tiere(String tierName, String tierGattung) {
        this.tierName = tierName;
        this.tierGattung = tierGattung;
    }

    public Tiere(String tierName, String tierGattung, Futter.FutterArt FutterArt, int futterBedarf) {
        this.tierName = tierName;
        this.tierGattung = tierGattung;
        this.FutterArt = FutterArt;
        this.futterBedarf = futterBedarf;
    }

    public String toString() {
        return this.tierName + ", " + this.tierGattung + ", " + this.FutterArt + ", " + this.futterBedarf;
    }

    public void setFutterBedarf(int futterBedarf) {
        this.futterBedarf = futterBedarf;
    }

    public int getFutterBedarf() {
        return this.futterBedarf;
    }

    public Futter.FutterArt getFutterArt(){
        return this.FutterArt;
    }

    public void setFutterArt(Futter.FutterArt FutterArt){
        this.FutterArt = FutterArt;
    }
}