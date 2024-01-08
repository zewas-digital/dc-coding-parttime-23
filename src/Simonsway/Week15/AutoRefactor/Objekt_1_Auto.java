package Simonsway.Week15.AutoRefactor;

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

    public static void main(String[] args) {

        Auto Audi = new Auto("Audi", "A3", 2001, 5000, 70, 0.06);
        Audi.tankFuelstand = 25;
        Audi.fahzeugDetails();
        Audi.volltanken();
        Audi.fahren(7000);
        System.out.println("Neuer Kilomter Stand " + Audi.kmStand);
    }
}
