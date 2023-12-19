package claudia.week15_objects;

import java.text.NumberFormat;
import java.util.Locale;


public class Auto {
    private String marke = null;
    private String modell = null;
    private int baujahr = -1;
    private int km = -1;
    private String kmFormatiert = "";
    public int tankinhalt;

    public Auto (String marke, String modell, int baujahr, int km) {
        //TODO Try-Catch!
        if (baujahr < 1885) {
            throw new IllegalArgumentException("Baujahr mit vier Ziffern angeben!");
        }
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.km = km;
        this.kmFormatiert = NumberFormat.getInstance(Locale.GERMAN).format(km);
    }
    public Auto () {
        this.marke = "unbekannt";
        this.modell = "unbekannt";

    }

    public String getFormatierterTankinhalt(){ //fragt aktuellen Wert ab und gibt ihn formatiert zurück
        return this.tankinhalt + " Liter";
    }
    public int getTankinhalt() { //unnötig, da Variable eh public
        return this.tankinhalt;
    }

    public void setMarke(String marke){
        this.marke = marke;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public void setBaujahr(int baujahr){
        this.baujahr = baujahr;
    }
    public void setKm(int km){
        //TODO Validierung: neue km > alte km? Sonst stimmt was nicht!
        this.km = km;
        this.kmFormatiert = NumberFormat.getInstance(Locale.GERMAN).format(km);
    }

    public String getMarke() {
        return marke;
    }

    public String getModell() {
        return modell;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public int getKm() {
        return km;
    }

    public String getKmFormatiert() {
        return kmFormatiert;
    }

    @Override
    public String toString() {
        if (marke == null || modell == null || baujahr < 0 || km < 0 ){
            System.out.println("Achtung! Auto nicht vernünftig initialisiert - nicht genügend Daten vorhanden!");
        }
        return super.toString() + "\nMarke: " + marke + ", Modell: " + modell + ", Baujahr: " + baujahr + ", km-Stand: " + NumberFormat.getInstance(Locale.GERMAN).format(km);
        //super -> übergeordnete Klasse, hier Object (Auto extend Object)
        //Locale.GERMAN macht Trennpunkt zwischen den Tausendern
    }
}
