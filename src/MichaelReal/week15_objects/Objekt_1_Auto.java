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

public class Objekt_1_Auto {

    // Hauptmethode zum Erstellen und Testen der Auto-Instanz
    public static void main(String[] args) {
        // Erstellen einer Instanz von Auto
        Auto FiatPanda = new Auto("FIAT", "Panda", 2021, 25000,40.0, 0.06);

        // Rufe die toString() Methode der Auto-Instanz auf und gib das Auto aus
        System.out.println(FiatPanda);

        // Ausgabe der Eigenschaften des Objekts
       // System.out.println("Marke: " + FiatPanda.getMarke());
        //System.out.println("Modell: " + FiatPanda.getModell());
        //System.out.println("Baujahr: " + FiatPanda.getBaujahr());
        //System.out.println("Kilometerstand: " + String.format("%,.0f", FiatPanda.getKmStand()) + " km");
    }
}