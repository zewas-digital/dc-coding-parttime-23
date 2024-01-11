package MichaelReal.week15_objects;

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
        // Erstellen einer Instanz von Auto
        Auto fiatPanda = new Auto("FIAT", "Panda", 2021, 25000,40.0, 0.06);

        fiatPanda.volltanken();

        fiatPanda.fahren(100);
        System.out.println(fiatPanda);
        fiatPanda.fahren(50);
        System.out.println(fiatPanda);
        fiatPanda.fahren(5);
        System.out.println(fiatPanda);
        fiatPanda.fahren(30);
        System.out.println(fiatPanda);
        fiatPanda.fahren(200);
        System.out.println(fiatPanda);
        fiatPanda.fahren(100);
        System.out.println(fiatPanda);
       // fiatPanda.fahren(100);        //aktivieren für 5km limit
        System.out.println(fiatPanda);
       // fiatPanda.fahren(200);       // aktivieren für leeren tank
        System.out.println(fiatPanda);
    }
}
