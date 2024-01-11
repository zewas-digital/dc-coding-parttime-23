package eslem.week15_objects;

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
        Auto audi = new Auto();
        audi.marke = "audi";
        audi.modell = "rs7";
        audi.baujahr = 2013;
        audi.kmStand = 125000;
        audi.tankVolumen = 75;
        audi.tankInhalt = 50;

        System.out.println("Neus Objekt: " + audi + "\nDas Auto ist ein " + audi.marke + " " +  audi.modell + " baujahr " +  audi.baujahr + " km Stand " + audi.kmStand);

        Auto auto1 = new Auto("bmw", "e36", 1990, 111000, 70, 56);
        Auto auto2 = new Auto("mercedes", "cla", 2013, 222000, 50, 33);

        System.out.println(audi.toString());
        System.out.println(auto1.toString());
        System.out.println(auto2.toString());
    }
}














