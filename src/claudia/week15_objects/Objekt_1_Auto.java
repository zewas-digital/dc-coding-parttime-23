package claudia.week15_objects;

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

        Auto auto1 = new Auto();
        Auto auto2 = new Auto("Fiat", "Punto", 1980, 15000000, 35);
        Auto auto3 = new Auto("Skoda", "Octavia", 2000, 1450, 60 );
        //Auto auto4 = new Auto("erstesAuto", "ersteMarke", 1850, 23454);

        auto2.setKmStand(auto2.getKmStand() + 10);

        System.out.println("\nDrei neue Autos erzeugt: ");
        System.out.println(auto1.toString() + "\n");
        System.out.println(auto2.toString() + "\n");
        System.out.println(auto3.toString() + "\n");

        auto2.tankinhalt = 20; //Variable ist public! Direkter Zugriff möglich
        System.out.println("Tankinhalt " + auto2.tankinhalt);
        auto2.tankinhalt++;
        System.out.println("Tankinhalt " + auto2.getFormatierterTankinhalt());

    }

}
