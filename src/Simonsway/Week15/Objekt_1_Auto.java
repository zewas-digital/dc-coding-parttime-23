package Simonsway.Week15;

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

        Auto Audi = new Auto("Audi","A3",2003, 200000, 50, 30, 0.06, 450);
        System.out.println(Audi.toString());

        Auto Ford = new Auto("Ford","Mustang",1998, 130000, 70, 45, 0.04, 10);
        System.out.println(Ford.toString());

    }

}
