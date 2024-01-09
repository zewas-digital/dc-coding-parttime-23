package florian.week_15_objects;

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
        Auto Porsche = new Auto("Porsche", "Cayenne", 2018, 20000,80,0,0.5);

        System.out.println(Porsche + "\n");

        Porsche.fahren(60);
        Porsche.fahren(70);

        System.out.println("Neuer Kilometerstand: " + Porsche.kmStand);


        System.out.println("Aktuelles Tankvolumen: " + Porsche.tankvolumen + ", Getankte Menge: " + Porsche.volltanken() + " Liter");

        System.out.println(Porsche);

        Porsche.fahren(50);

        System.out.println(Porsche.verbrauchproKm());

    }
}