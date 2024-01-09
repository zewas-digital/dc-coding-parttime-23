package saifedine.week15_objects.oliver_V01;

/*
Aufgabe: Auto fahren

1/ Ergänze bei deiner Klasse Auto eine Methode fahren(...) der ein Parameter
mit den zu fahrenden Kilometern übergeben werden kann. Erhöhe den Kilometerstand.

2/ Ergänze ein Tankvolumen und den Tankinhalt für deine Auto-Klasse
und eine Methode volltanken() die das Tankvolumen auffüllt.
Gib aus, wie viele Liter getankt wurden.

3/ Bonus: Definiere einen Verbrauch pro Liter und reduziere beim fahren(...) den Tankinhalt.
Gib eine Warnmeldung aus, wenn nur mehr 5 Liter im Tank sind.
Gib aus, wenn der Tank leer ist und wie viele Kilometer bis zum Ziel noch nicht gefahren sind.
 */

import oliver.week15_objects.Auto;

public class Objekt_2_Autofahren {
    public static void main(String[] args) {
        oliver.week15_objects.Auto FordBronco = new Auto("Ford", "Bronco", 2023, 10000, 70);
        FordBronco.tankinhalt = 70; // vollgetankt
        //FordBronco.fahreBerechnet(650);

        FordBronco.fahren(1000);
        //FordBronco.fahren(400);
        //FordBronco.fahren(400);
        //System.out.println("Neuer Kilometerstand: "+ FordBronco.getKilometerstandFormatiert());
    }
}













