package claudia.week15_objects;

import java.text.NumberFormat;
import java.util.Locale;


public class Auto {
    private String marke = null;
    private String modell = null;
    private int baujahr = -1;
    private double kmStand = -1;
    private String kmStandFormatiert = "";
    public double tankinhalt;
    private int tankMax = 0;
    private double verbrauch = 0;
    private String verbrauchFormatiert;

    public Auto (String marke, String modell, int baujahr, int km, int tankMax) {
        //TODO Try-Catch!
        if (baujahr < 1885) {
            throw new IllegalArgumentException("Baujahr mit vier Ziffern angeben!");
        }
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.kmStand = km;
        this.kmStandFormatiert = NumberFormat.getInstance(Locale.GERMAN).format(km) + " km";
        this.tankMax = tankMax;
        this.verbrauch = 6.0;
        this.verbrauchFormatiert = NumberFormat.getInstance(Locale.GERMAN).format(verbrauch) + " l pro 100 km" ;
    }
    public Auto () {
        this.marke = "unbekannt";
        this.modell = "unbekannt";

    }
public void volltanken(){
    System.out.println("\nEs wird vollgetankt!");
    System.out.println("Aktueller Tankinhalt " + getFormatierterTankinhalt() + ", max. Volumen " + getFormatierterTankMax());
    double differenz = tankMax - tankinhalt;
    tankinhalt = tankMax;
    System.out.println(differenz + " Liter getankt!");
}
    public void fahren(double strecke){
        System.out.println("\nEs werden " + strecke + " km gefahren:");
        System.out.println("Aktueller km-Stand " + getKmStandFormatiert());
        System.out.println("Aktueller Tankinhalt " + getFormatierterTankinhalt());
        double literVerbraucht = strecke / 100 * verbrauch;

        this.kmStand += strecke;
        this.kmStandFormatiert = NumberFormat.getInstance(Locale.GERMAN).format(kmStand) + " km";

        System.out.println("Neuer km-Stand " + kmStandFormatiert);
        System.out.println("Sprit verbraucht: " + literVerbraucht + " Liter.");
        tankinhalt -= literVerbraucht;
        System.out.println("Neuer Tankinhalt " + getFormatierterTankinhalt());
    }
    public String getFormatierterTankinhalt(){ //fragt aktuellen Wert ab und gibt ihn formatiert zurück
        return this.tankinhalt + " Liter";
    }
    public String getFormatierterTankMax(){ //fragt aktuellen Wert ab und gibt ihn formatiert zurück
        return this.tankMax + " Liter";
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
    public void setKmStand(double kmStand){
        //TODO Validierung: neue km > alte km? Sonst stimmt was nicht!
        this.kmStand = kmStand;
        this.kmStandFormatiert = NumberFormat.getInstance(Locale.GERMAN).format(kmStand);
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

    public double getKmStand() {
        return kmStand;
    }

    public String getKmStandFormatiert() {
        return kmStandFormatiert;
    }

    @Override
    public String toString() {
        if (marke == null || modell == null || baujahr < 0 || kmStand < 0 ){
            System.out.println("Achtung! Auto nicht vernünftig initialisiert - nicht genügend Daten vorhanden!");
        }
        return super.toString() + "\nMarke: " + marke + ", Modell: " + modell + ", Baujahr: " + baujahr + ", km-Stand: " + NumberFormat.getInstance(Locale.GERMAN).format(kmStand) + ", Tankvolumen: " + getFormatierterTankMax() ;
        //super -> übergeordnete Klasse, hier Object (Auto extend Object)
        //Locale.GERMAN macht Trennpunkt zwischen den Tausendern
    }
}
