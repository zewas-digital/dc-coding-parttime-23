package michael_k.week15;

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

        Auto auto1 = new Auto ( "Audi", "A5", 2011, 200000 );
        Auto auto2 = new Auto ( "BMW", "5", 2013, 100000 );

        System.out.println ( auto1.toSrting ());

        System.out.println ( auto2.toSrting ());
    }

}
