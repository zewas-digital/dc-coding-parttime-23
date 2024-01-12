package saifedine.week15_objects;

/*
Aufgabe: Auto

1/ Erstelle eine Klasse welche die typischen Werte eines Autos speichern kann. --> public class Auto extends Object

Marke
Modell
Baujahr
km-Stand

2/ Erstelle eine Instanz dieser Klasse (Objekt) in dieser Klasse Objekt_1_Auto --> Objekt_1_Auto (unten)

3/ Erstelle weiters eine toString() Methode und erstelle einen schönen String mit den gegebenen Werten das Auto. --> public class Auto extends Object

4/ Gib das Auto in Objekt_1_Auto über die toString() Methode aus. --> Objekt_1_Auto (unten)
 */


public class Objekt_1_Auto {

    public static void main(String[] args) {

        /**
         *
         * Aufgabe 2/ Erstelle eine Instanz dieser Klasse (Objekt) in dieser Klasse Objekt_1_Auto (oben)
         *
         */

        Auto Auto1 = new Auto();
        Auto Auto2 = new Auto("Audi", "A4", 2015, 143000,75,33,7.5);
        Auto Auto3 = new Auto("Hyundai", "i20", 2016, 83622,35,23,4.8);

        /**
         *
         * Aufgabe 4/ Gib das Auto in Objekt_1_Auto über die toString() Methode aus (oben)
         */

//Ausgabe durch Auto1, wird die Methode toString in Auto.java aufgerufen und angezeigt
        System.out.println(Auto1 + "Die Auto-Daten sind: " + "\n");

//Ausgabe nicht durch Auto2.toString(), da diese Methode nicht verwendet wird (ausgegraut), somit wird die Methode toString in Auto.java aufgerufen und angezeigt
        System.out.println("Die Auto-Daten sind: " + Auto2.toString() + "\n");

//Ausgabe zweimal durch Auto3, da zweimal die Methode toString in Auto.java aufgerufen und angezeigt wird
        System.out.println(Auto3  + "\n" +  "Die Auto-Daten sind: " + Auto3.toString() + "\n");

    }
}
