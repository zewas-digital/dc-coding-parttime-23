package claudia.week15_objects;

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

public class Objekt_2_Autofahren {
    public static void main(String[] args) {

        Auto auto = new Auto("VW", "Golf", 1990, 15000, 60, 30, 7.3);

        System.out.println("\nNeues Auto erzeugt: " + auto.toString());
        System.out.println("Aktueller Tankinhalt: " + auto.getTankAktuellFormatiert());
        System.out.println("Aktueller Kilometerstand = " + auto.getKmStandFormatiert());

        auto.fahren(700);

        auto.fahren(1000);

        auto.volltanken();

    }
}
