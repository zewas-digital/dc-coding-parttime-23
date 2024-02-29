package MichaelReal.week22_Carsimulation;

public abstract class Car {

    // Enumeration für die Antriebsarten
    public enum Antriebsart {
        BENZIN, DIESEL, GAS, STROM
    }

    // Attribute der Car Klasse
    protected String hersteller;

    protected String modell;
    protected int kW; // Leistung

    protected double tankinhalt; // Angenommen in Litern
    protected Antriebsart antrieb;
    protected double gewicht;

    protected double verbrauch; // Kraftstoffverbrauch (Kilometer pro Liter)

    // Konstruktor
    public Car(String hersteller, String modell, int kW, double tankinhalt, Antriebsart antrieb, double gewicht, double verbrauch) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.kW = kW;
        this.tankinhalt = tankinhalt;
        this.antrieb = antrieb;
        this.gewicht = gewicht;
        this.verbrauch = verbrauch;
    }

    // Eine abstrakte Methode für die Fahrsimulation
    public abstract void simulateDrive();

    // Die neue drive Methode
    public int drive(int kilometer) {
        int maxDistanz = (int) (tankinhalt * verbrauch);
        if (kilometer <= maxDistanz) {
            tankinhalt -= kilometer / verbrauch;
            return kilometer;
        } else {
            tankinhalt = 0; // Tank ist leer
            return maxDistanz;
        }
    }
}
