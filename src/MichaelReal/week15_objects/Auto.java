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

    // Konstruktor
    public Auto(String marke, String modell, int baujahr, double kmStand) {
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.kmStand = kmStand;
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

    // toString() Methode
    @Override
    public String toString() {
        return "\nAuto { " +
                "Marke = " + marke  +
                ", Modell = " + modell  +
                ", Baujahr = " + baujahr +
                ", kmStand = " + String.format("%,.0f", kmStand) + " km }";
    }

}




