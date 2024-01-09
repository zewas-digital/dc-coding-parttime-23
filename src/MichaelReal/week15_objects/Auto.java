package MichaelReal.week15_objects;

/*
Aufgabe: Auto

1/ Erstelle eine Klasse welche die typischen Werte eines Autos speichern kann.

Marke
Modell
Baujahr
km-Stand

2/ Erstelle eine Instanz dieser Klasse (Objekt) in dieser Klasse Objekt_1_Auto

3/ Erstelle weiters eine toString() Methode und erstelle einen schönen String mit den gegebenen Werten das Auto.

4/ Gib das Auto in Objekt_1_Auto über die toString() Methode aus.
 */

public class Auto  extends Object {

    // Eigenschaften und Attribute
    private String marke;
    private String modell;
    private int baujahr;
    private double kmStand;
    private double tankvolumen;
    private double tankinhalt;
    private double verbrauchProKilometer;


    // Konstruktor
    public Auto(String marke, String modell, int baujahr, double kmStand, double tankvolumen, double verbrauchProKilometer) {
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.kmStand = kmStand;
        this.tankvolumen = tankvolumen;
        this.tankinhalt = 0.0; // Der Tank ist zu Beginn leer
        this.verbrauchProKilometer = verbrauchProKilometer;

    }

    // Getter- und Setter-Methoden
    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public double getKmStand() {
        return kmStand;
    }

    public void setKmStand(double kmStand) {
        this.kmStand = kmStand;
    }

    public double getTankvolumen() {
        return tankvolumen;
    }

    public double getTankinhalt() {
        return tankinhalt;
    }

    // toString() Methode
    @Override
    public String toString() {
        return "\n 🚗 { " +
                "Marke = " + marke  +
                ", Modell = " + modell  +
                ", Baujahr = " + baujahr +
                ", kmStand = " + String.format("%,.0f", kmStand) + " km" +
                ",  ⛽ = " + String.format("%,.2f", tankinhalt) + " Liter }";
    }

    // Methode zum Fahren
    public void fahren(double kilometer) {
        if (kilometer >= 0) {
            double verbrauch = kilometer * verbrauchProKilometer;
            if (verbrauch <= tankinhalt) {
                this.kmStand += kilometer;
                tankinhalt -= verbrauch;
                System.out.println("\nDas Auto wurde um " + kilometer + " Kilometer bewegt.");
                if (tankinhalt <= 5.0) {
                    System.out.println("Warnung: Nur noch " + tankinhalt + " Liter Treibstoff im Tank.");
                }
            } else {
                System.out.println("Nicht genug Treibstoff im Tank. Kacke!! 😭");
            }
        } else {
            System.out.println("Ungültige Eingabe: Negative Kilometeranzahl.");
        }
    }

    // Methode zum Volltanken
    public void volltanken() {
        tankinhalt = tankvolumen;
        System.out.println("Der Tank wurde voll aufgefüllt. Juhuuu!! ⛽🤓");
    }

}