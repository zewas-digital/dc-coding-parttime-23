package judith.week15_objects;

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

import judith.week14_objects.Person;



public class Objekt_1_Auto {

    public static void main(String[] args) {

        Auto VWGolf = new Auto();
        VWGolf.marke = "VW";
        VWGolf.modell = "Golf";
        VWGolf.baujahr = 2022;
        VWGolf.kiloMeter = 80680;
        VWGolf.tankVolumen = 50;
        VWGolf.tankInhalt = 10;


        System.out.println(VWGolf.toString());







    }



}
