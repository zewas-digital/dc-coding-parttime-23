package claudia.week22_Carsimulation;

import java.text.NumberFormat;
import java.util.Locale;

public class Auto {
    private String hersteller = null;
    private String modell = null;
    private double tankMax = 0;
    private double tankAktuell = 0;
    private double kmStand = -1;
    private double verbrauch = 0;
    private int gewicht = 0;

    /// formatierte double-Attribute:
    private String tankMaxFormatiert;
    private String tankAktuellFormatiert;
    private String kmStandFormatiert;
    private String verbrauchFormatiert;
    ///

    public Auto(String marke, String modell, double kmStand, double tankMax, double tankAktuell, double verbrauch) {
        //TODO Try-Catch!

        this.hersteller = marke;
        this.modell = modell;

        this.kmStand = kmStand;
        this.kmStandFormatiert = NumberFormat.getInstance(Locale.GERMAN).format(kmStand) + " km";
        this.tankMax = tankMax;
        this.tankMaxFormatiert = NumberFormat.getInstance(Locale.GERMANY).format(tankMax) + " Liter";
        this.tankAktuell = tankAktuell;
        this.tankAktuellFormatiert = NumberFormat.getInstance(Locale.GERMANY).format(tankAktuell) + " Liter";
        this.verbrauch = verbrauch;
        this.verbrauchFormatiert = NumberFormat.getInstance(Locale.GERMAN).format(verbrauch) + " l pro 100 km" ;
    }

    public Auto() {
        this.hersteller = "unbekannt";
        this.modell = "unbekannt";
    }

    public void volltanken() {
        System.out.println("\n" + "Das Auto " + this.hersteller + " " + this.modell + " wird vollgetankt!");
        //System.out.println("Aktueller Tankinhalt " + this.tankAktuellFormatiert + ", max. Volumen " + this.tankMaxFormatiert);
        double differenz = tankMax - tankAktuell;
        this.tankAktuell = this.tankMax;
        System.out.println(differenz + " Liter getankt!");
    }

    public double fahren(double strecke) {
        double restlicheStrecke = strecke;

        System.out.println("\nDas Auto " + this.hersteller + " " + this.modell + " muss " + strecke + " km fahren.");
        //System.out.println("Aktueller km-Stand " + this.getKmStandFormatiert());
        System.out.println("Aktueller Tankinhalt " + this.getTankAktuellFormatiert());

        if (this.tankAktuell > 0) {
            if (this.tankAktuell < 5) {
                System.out.println("\nAchtung - Tank fast leer!\n");
            }
            double mengeNotwendig = strecke / 100 * this.verbrauch;
            System.out.println("Menge notwendig: " + mengeNotwendig);
            double streckeMoeglich;
            if (mengeNotwendig <= this.tankAktuell) {
                streckeMoeglich = mengeNotwendig / this.verbrauch * 100;
                restlicheStrecke = 0;
            } else {
                mengeNotwendig = this.tankAktuell;
                streckeMoeglich = mengeNotwendig / this.verbrauch * 100;
                restlicheStrecke = strecke - streckeMoeglich;
                System.out.println("\nDer Sprit reicht nicht!");
                System.out.println("Es werden vorerst nur " + streckeMoeglich + " km gefahren.");
            }

            this.kmStand += streckeMoeglich;

            //System.out.println("Neuer km-Stand " + this.getKmStandFormatiert());
            System.out.println("Sprit verbraucht: " + mengeNotwendig + " Liter");
            this.tankAktuell -= mengeNotwendig;
            System.out.println("Neuer Tankinhalt " + this.getTankAktuellFormatiert());

        } else {
            System.out.println("Der Tank ist leer, keine Fahrt möglich!");
            restlicheStrecke = strecke;
        }
        return restlicheStrecke;
    }

    @Override
    public String toString() {
        if (this.hersteller == null || this.modell == null || this.kmStand < 0) {
            System.out.println("Achtung! Auto nicht vernünftig initialisiert - nicht genügend Daten vorhanden!");
        }
        return "\nMarke: " + hersteller + ", Modell: " + modell + ", km-Stand: " + kmStandFormatiert + "\nTankvolumen: " + tankMaxFormatiert + ", Verbrauch: " + verbrauchFormatiert;

    }



    /// Getter und Setter
    public String getHersteller() {
        return this.hersteller;
    }
    public String getModell() {
        return this.modell;
    }
    public double getTankMax() {
        return this.tankMax;
    }
    public String getTankMaxFormatiert() { //fragt aktuellen Wert ab und gibt ihn formatiert zurück
        return this.tankMax + " Liter";
    }
    public String getTankAktuellFormatiert() { //fragt aktuellen Wert ab und gibt ihn formatiert zurück
        return this.tankAktuell + " Liter";
    }
    public double getKmStand() {
        return this.kmStand;
    }
    public String getKmStandFormatiert() {
        return this.kmStand + " km";
    }
    public double getVerbrauch() {
        return verbrauch;
    }
    public String getVerbrauchFormatiert() {
        return verbrauchFormatiert;
    }

    /*public double getTankAktuell() {
        return this.tankAktuell;
    }*/
    public void setTankAktuell(double tankAktuell) {
        this.tankAktuell = tankAktuell;
        this.tankAktuellFormatiert = this.tankAktuell + " Liter";
    }
    public void setKmStand(double kmStand) {
        //TODO Validierung: neue km > alte km? Sonst stimmt was nicht!
        this.kmStand = kmStand;
        this.kmStandFormatiert = NumberFormat.getInstance(Locale.GERMAN).format(kmStand) + " Liter";
    }
}
