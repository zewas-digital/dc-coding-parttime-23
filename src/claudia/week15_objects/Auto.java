package claudia.week15_objects;

import java.text.NumberFormat;
import java.util.Locale;

public class Auto {
    private String marke = null;
    private String modell = null;
    private int baujahr = -1;
    private double tankMax = 0;
    private String tankMaxFormatiert;
    private double tankAktuell = 0;
    private String tankAktuellFormatiert;
    private double kmStand = -1;
    private String kmStandFormatiert;
    private double verbrauch = 0;
    private String verbrauchFormatiert;

    public Auto (String marke, String modell, int baujahr, double kmStand, double tankMax, double tankAktuell, double verbrauch) {
        //TODO Try-Catch!
        if (baujahr < 1885) {
            throw new IllegalArgumentException("Baujahr mit vier Ziffern angeben!");
        }
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.kmStand = kmStand;
        this.kmStandFormatiert = NumberFormat.getInstance(Locale.GERMAN).format(kmStand) + " km";
        this.tankMax = tankMax;
        this.tankMaxFormatiert = NumberFormat.getInstance(Locale.GERMANY).format(tankMax) + " Liter";
        this.tankAktuell = tankAktuell;
        this.tankAktuellFormatiert = NumberFormat.getInstance(Locale.GERMANY).format(tankAktuell) + " Liter";
        this.verbrauch = verbrauch;
        this.verbrauchFormatiert = NumberFormat.getInstance(Locale.GERMAN).format(verbrauch) + " l pro 100 km" ;
    }
    public Auto () {
        this.marke = "unbekannt";
        this.modell = "unbekannt";
    }
public void volltanken(){
    System.out.println("\nEs wird vollgetankt!");
    System.out.println("Aktueller Tankinhalt " + tankAktuellFormatiert + ", max. Volumen " + tankMaxFormatiert);
    double differenz = tankMax - tankAktuell;
    tankAktuell = tankMax;
    System.out.println(differenz + " Liter getankt!");
}
    public void fahren(double strecke){
        System.out.println("\nEs sollen " + strecke + " km gefahren werden:");
        System.out.println("Aktueller km-Stand " + getKmStandFormatiert());
        System.out.println("Aktueller Tankinhalt " + getTankAktuellFormatiert());

        if (tankAktuell > 0) {

            if (tankAktuell < 5) {
                System.out.println("\nAchtung - Tank fast leer!\n");
            }
            double mengeNotwendig = strecke / 100 * verbrauch;
            System.out.println("Menge notwendig: " + mengeNotwendig);
            double streckeMoeglich;
            if (mengeNotwendig <= tankAktuell) {
                streckeMoeglich = mengeNotwendig / verbrauch * 100;
            } else {
                mengeNotwendig = tankAktuell;
                streckeMoeglich = mengeNotwendig / verbrauch * 100;
                System.out.println("\nDer Sprit reicht nicht!");
                System.out.println("Es werden nur " + streckeMoeglich + " km gefahren.");
                System.out.println("Die übrigen " + (strecke - streckeMoeglich) + " km musst Du laufen.\n");
            }

            this.kmStand += streckeMoeglich;

            System.out.println("Neuer km-Stand " + getKmStandFormatiert());
            System.out.println("Sprit verbraucht: " + mengeNotwendig + " Liter.");
            this.tankAktuell -= mengeNotwendig;
            System.out.println("Neuer Tankinhalt " + getTankAktuellFormatiert());
        } else {
            System.out.println("Der Tank ist leer, keine Fahrt möglich!");
        }
    }

    public double getVerbrauch() {
        return verbrauch;
    }

    public String getVerbrauchFormatiert() {
        return verbrauchFormatiert;
    }

    public double getTankAktuell(){
        return this.tankAktuell;
   }
    public String getTankAktuellFormatiert(){ //fragt aktuellen Wert ab und gibt ihn formatiert zurück
        return this.tankAktuell + " Liter";
    }

    public void setTankAktuell(double tankAktuell) {
        this.tankAktuell = tankAktuell;
        this.tankAktuellFormatiert = this.tankAktuell + " Liter";
    }

    public String getTankMaxFormatiert(){ //fragt aktuellen Wert ab und gibt ihn formatiert zurück
        return this.tankMax + " Liter";
    }
    public double getKmStand() {
        return kmStand;
    }
    public String getKmStandFormatiert() {
        return kmStand + " km";
    }
    public void setKmStand(double kmStand){
        //TODO Validierung: neue km > alte km? Sonst stimmt was nicht!
        this.kmStand = kmStand;
        this.kmStandFormatiert = NumberFormat.getInstance(Locale.GERMAN).format(kmStand) + " Liter";
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

    public double getTankMax() {
        return tankMax;
    }

    @Override
    public String toString() {
        if (marke == null || modell == null || baujahr < 0 || kmStand < 0 ){
            System.out.println("Achtung! Auto nicht vernünftig initialisiert - nicht genügend Daten vorhanden!");
        }
        return super.toString() + "\nMarke: " + marke + ", Modell: " + modell + "\nBaujahr: " + baujahr + ", km-Stand: " + kmStandFormatiert + "\nTankvolumen: " + tankMaxFormatiert + ", Verbrauch: " + verbrauchFormatiert;
        //super -> übergeordnete Klasse, hier Object (Auto extends Object)
        //Locale.GERMAN macht Trennpunkt zwischen den Tausendern
    }
}
