package saifedine.week18_Zoo.V02_mit_Bonus;

// Erstelle eine Tier-Klasse mit einem Namen und einer Gattung
public class Tiere {

    private String tierName;
    private String tierGattung;

    private int futterBedarf;

    Futter futter;


    public Tiere(String tierName,String tierGattung){
        this.tierName = tierName;
        this.tierGattung = tierGattung;
    }

    public String toString(){
        return this.tierName + ", " + this.tierGattung + ", " + this.futter + ", " + this.futterBedarf;
    }

    public Tiere(String tierName,String tierGattung, Futter futter, int futterBedarf){
        this.tierName = tierName;
        this.tierGattung = tierGattung;
        this.futter = futter;
        this.futterBedarf = futterBedarf;
    }

    public void setFutterBedarf(int futterBedarf) {
        this.futterBedarf = futterBedarf;
    }

    public int getFutterBedarf() {
        return futterBedarf;
    }
}
