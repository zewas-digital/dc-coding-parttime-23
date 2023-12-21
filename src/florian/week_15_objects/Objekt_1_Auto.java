package florian.week_15_objects;

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
        Auto Porsche = new Auto("Porsche", "Cayenne", 2018, 20000,70);
        Auto Volkswagen = new Auto("VW","Golf 7", 2015,12560,50);

        System.out.println(Porsche + "\n");

        System.out.println(Volkswagen.toString());
    }
}
