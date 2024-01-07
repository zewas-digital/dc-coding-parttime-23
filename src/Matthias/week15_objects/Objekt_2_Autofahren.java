package Matthias.week15_objects;

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
    public static void main( String[] args ) {
        Auto Auto1= new Auto( "Audi","A5",2007,6000,50,6 );
        System.out.println(Auto1);
        Auto1.fahren( 100 );// nicht
        System.out.println( Auto1 );
        System.out.println( "Get:"+Auto1.getKillometerstand());
        Auto1.volltanken();
        System.out.println( Auto1 );
        Auto1.fahren( 100 );
        System.out.println( Auto1 );
    }
}
