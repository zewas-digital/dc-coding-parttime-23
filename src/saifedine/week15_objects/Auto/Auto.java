package saifedine.week15_objects.Auto;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * Aufgabe 1/ Erstelle eine Klasse welche die typischen Werte eines Autos speichern kann.
 *
 * Marke
 * Modell
 * Baujahr
 * km-Stand
 *
 * -->  package saifedine.week15_objects; Objekt_1_Auto
 */

public class Auto extends Object {

    // Attribute - Objekt_1_Auto
    public String marke = "Marke -> unbekannt";
    public String modell = "Model -> unbekannt";;
    public int baujahr;
    private int kmStand;
    String kilometerstandFormatiert;
    private int tankvolumen = 80;
    public double tankinhalt;
    public double verbrauch;

    // Attribute - Objekt_2_Autofahren
    public int gefahreneKm;
    public double tankinhaltverbrauch;

    public double getankteMenge;

    public double reichweite;



//        Double[] fahrOutput = {(double) this.gefahreneKm, this.tankinhaltverbrauch};
//        return fahrOutput;


    // Methode zur Erstellung einer Instanz Auto ohne Konstruktoren
    public Auto() {
    }


    // Methode zur Erstellung einer Instanz Auto mit Konstruktoren & Überprüfung der Konstruktoren baujahr & tankvolumen
    /**
     * Konstruktor
     *
     * Der Konstruktor der Klasse Auto nimmt folgende Parameter entgegen:
     *
     * @param marke
     * @param modell
     * @param baujahr
     * @param kmStand
     * @param tankvolumen
     * @param tankinhalt
     * @param verbrauch
     */
    public Auto(String marke, String modell, int baujahr, int kmStand, int tankvolumen, int tankinhalt, double verbrauch) {

        // beim Anlegen eines neuen Objekts Auto werden diverse Konstruktoren vorab geprüft, dazu zählen:
        // Baujahr darf nicht kleiner 1885 sein, weil dann das 1. Auto erfunden wurde.
        if (baujahr < 1885) {
            throw new IllegalArgumentException("Das Baujahr ist ungültig, bitte geben Sie es mit vier Ziffern ein");
        }

        // wenn ein neues Objekt Auto erstellt wird! Für alle Autos wurde ein max. Tankvolumen von 80 definiert.
        // Ausdruck/Ausgabe einer Fehlermeldung, wenn beim Erstellen eines Autos ein größeres Tankvolumen als 80 l eingegeben wird!
        if (tankvolumen > this.tankvolumen) {
            throw new IllegalArgumentException("Ein größeres Tankvolumen als " + this.tankvolumen + " ist nicht möglich.");
        }

        // Objekt_1_Auto
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.kmStand = kmStand;
        this.kilometerstandFormatiert = NumberFormat.getInstance(Locale.GERMAN).format(kmStand) + " km";

        // Objekt_2_Autofahren
        this.tankvolumen = tankvolumen;
        this.tankinhalt = tankinhalt;
        this.verbrauch = verbrauch;
    }

    /**
     *
     * Aufgabe 3/ Erstelle weiters eine toString() Methode und erstelle einen schönen String mit den gegebenen Werten das Auto.
     *
     * @return: String
     *
     * -->  package saifedine.week15_objects; Objekt_1_Auto
     */

    // Methode mit der Befugnisse zum Überschreiben (@Override), hier wird die Standard-Methode der Objekt Klasse (extended Object - on the Top) überschrieben und gibt eine individuelle Darstellung / Version
    // erzeugt leserliche Darstellung des Objekts Auto für Ausdruck/Ausgabe und übergibt einen String
    @Override
    public String toString() {
        // Objekt_1_Auto
        return "Auto { " + super.toString() +
                "\n Marke: " + marke +
                "\n Modell: " + modell +
                "\n Baujahr: " + baujahr +
                "\n Km-Stand: " + NumberFormat.getInstance(Locale.GERMAN).format(kmStand) + " km" +

                // Objekt_2_Autofahren
                "\n Tankvolumen: " + tankvolumen +
                "\n Tankinhalt: " + tankinhalt +
                "\n}";
    }

    // Objekt_2_Autofahren
    // getKilometerstand(): Gibt den Kilometerstand des Autos zurück (Eigenschaft: private int kmStand)
    public int getKilometerstand() {
        return this.kmStand;
    }

    // Errechnet Verbrauch pro Km und übergibt diesen als double zurück
    public double getVerbrauchProKm(){
        return verbrauch / 100;
    }


    /**
     *
     * Aufgabe 1/ Ergänze bei deiner Klasse Auto eine Methode fahren(...) der ein Parameter
     * mit den zu fahrenden Kilometern übergeben werden kann. Erhöhe den Kilometerstand.
     *
     * @param gefahreneKm
     * @return
     *
     * -->  package saifedine.week15_objects; Objekt_2_Autofahren
     */

    // Objekt_2_Autofahren
    // fahren(): Setzt den neuen Kilometerstand des Autos (Eigenschaft: private int kmStand; & String kilometerstandFormatiert;)
    public Double[] fahren(int gefahreneKm) {

        // Übergibt den Konstruktor der Methode an die Klassen-Variable gefahrene Km - Zuordnung
        this.gefahreneKm = gefahreneKm;

        // Km Stand erhöht - Kalkulation
        this.kmStand = kmStand + gefahreneKm;

        // Km Stand Formatierung - Formatierung
        this.kilometerstandFormatiert = NumberFormat.getInstance(Locale.GERMAN).format(kmStand) + " km";

        // Ausdruck/Ausgabe
        System.out.println("Das Auto ist " + gefahreneKm + " km gefahren.");

        // Verbrauch der gefahrenen Km - Kalkulation
        this.tankinhaltverbrauch = this.gefahreneKm * this.getVerbrauchProKm();

        // Minderung des Tankinhalts um den Verbrauch (darüber) - Kalkulation
        // this.tankinhalt = tankinhalt - this.tankinhaltverbrauch;

        // Speicherung der gefahrenen Km & Verbrauch der gefahrenen Km in ein Double Array inkl. parsen zu double
        // in unserem Fall, wird in der fahrOutput in Objekt_2_Autofahren verwendet und ausgedruckt, leider bezieht sich das nur auf den AudiA4, somit unbrauchbar.
        // lt. Oliver kann es Fälle geben, wo das nützlich bzw. erforderlich sein kann!
        Double[] fahrOutput = {(double) this.gefahreneKm, this.tankinhaltverbrauch};

        return fahrOutput;
    }


    public Double[] fahren(int zuFahrendeKm, int gefahreneKm){

        System.out.println("ich möchte "+ zuFahrendeKm +" km fahren.");

        // Berechnung der Reichweiter in km mit dem aktuellen Tankinhalt
        this.reichweite =  this.tankinhalt / this.getVerbrauchProKm();

        //System.out.println("Audi: " + this.reichweite);

        if (this.reichweite > zuFahrendeKm){

            gefahreneKm = zuFahrendeKm;
            fahren(gefahreneKm);
            this.tankinhalt = tankinhalt - this.tankinhaltverbrauch;
        }

        else {

            int counterGefKm = 0;
            boolean warned = false;

            while (counterGefKm != zuFahrendeKm){

                this.tankinhalt -= this.getVerbrauchProKm();

                if (this.tankinhalt <= 5 && warned == false){                                                           // Kurzform !warned von Oliver
                    System.out.println("Sie haben nur mehr 5 Liter im Tank");
                    warned = true;
                }
                if (this.tankinhalt <= 0 && counterGefKm <= zuFahrendeKm){

                    int rest = zuFahrendeKm - counterGefKm;

                    System.out.println("Bis zum Ziel sind es noch " + rest);

                    gefahreneKm = counterGefKm;
                    fahren(gefahreneKm);
                    break;
                }
                counterGefKm++;
            }
        }
        Double[] fahrOutput1 = {(double) this.gefahreneKm, this.tankinhaltverbrauch};
        return fahrOutput1;
    }


    /**
     *
     * Aufgabe 2/ Ergänze ein Tankvolumen und den Tankinhalt für deine Auto-Klasse
     * und eine Methode volltanken() die das Tankvolumen auffüllt.
     * Gib aus, wie viele Liter getankt wurden.
     *
     * @return getankteMenge
     *
     * -->  package saifedine.week15_objects; Objekt_2_Autofahren
     */

    // Objekt_2_Autofahren
    // vollTanke(): Füllt den Tankinhalt bis Tankvolumen auf (Eingenschaft: private int tankvolumen = 80; & public int tankinhalt; & public int getankteMenge;)
    public double vollTanken() {

        // Ermittlung der erforderlichen Füllmenge (getankte Menge) - Kalkulation
        getankteMenge = this.tankvolumen - this.tankinhalt;

        // weist den Tankvolumen dem Tankinhalt zu - Tankinhalt entspricht Tankvolumen - Zuordnung
        this.tankinhalt = this.tankvolumen;

        // Ausdruck/Ausgabe
        System.out.println("Es sind " + getankteMenge + " l getankt worden" );

        return this.getankteMenge;
    }

    // Objekt_2_Autofahren
    // getTankinhalt(): Gibt den Tankinhalt des Autos zurück (Eigenschaft: public int tankinhalt; & public int getankteMenge;
    public double getTankinhalt(){
        return this.tankinhalt;
    }
}


