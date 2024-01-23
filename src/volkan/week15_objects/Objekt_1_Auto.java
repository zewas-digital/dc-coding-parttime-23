package volkan.week15_objects;

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
        Auto BMW = new Auto("BMW", "BMW.Modell", 2018, 80000);
        BMW.Marke = "BMW";
        BMW.Modell = "3.18d";
        BMW.baujahr = 2018;
        BMW.kmStand = 80000;

        System.out.println("Marke: " + BMW.Marke +
                "  Modell: " + BMW.Modell + "  Baujahr: " + BMW.baujahr + "  km-Stand: " + BMW.kmStand);
    }

}