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
    protected double tankinhalt; // Aktueller Tankinhalt in Litern
    protected double maximaleTankkapazitaet; // Maximale Tankkapazität in Litern
    protected Antriebsart antrieb;
    protected double gewicht;
    protected double verbrauch; // Kraftstoffverbrauch (Kilometer pro Liter)

    public Car(String hersteller, String modell, int kW, double tankinhalt, Antriebsart antrieb, double gewicht, double verbrauch, double maximaleTankkapazitaet) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.kW = kW;
        this.tankinhalt = tankinhalt;
        this.antrieb = antrieb;
        this.gewicht = gewicht;
        this.verbrauch = verbrauch;
        this.maximaleTankkapazitaet = maximaleTankkapazitaet;
    }

    public abstract void simulateDrive();

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

    public void refuel(double liter) {
        if (liter < 0) {
            System.out.println("Die Kraftstoffmenge kann nicht negativ sein.");
            return;
        }
        this.tankinhalt += liter;
        if (this.tankinhalt > this.maximaleTankkapazitaet) {
            this.tankinhalt = this.maximaleTankkapazitaet;
        }
        System.out.println("Das Auto wurde aufgetankt. Aktueller Tankinhalt: " + this.tankinhalt + " Liter");
    }
}
