package judith.week15_objects;

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



// Meine Notizen zur Aufgaben Erklärung / Ergänzung
// es sollen z.b. 100 km gefahren werden.
//die Methode soll prüfen wieviel KM gefahren wurden und wieviel km noch gefahren werden sollten (noch offen)
//und eine Warnung ausgeben, wenn der Tank leer ist


public class Objekt_2_Autofahren {
    public static void main(String[] args) {
        Auto VWGolf = new Auto();
        VWGolf.marke = "VW";
        VWGolf.modell = "Golf";
        VWGolf.baujahr = 2022;
        VWGolf.kiloMeter = 80680;
        VWGolf.tankVolumen = 50;
        VWGolf.tankInhalt = 20;
        VWGolf.verbrauchPKm = 1.0;


        System.out.println(VWGolf.toString());

        VWGolf.fahren(100); //Objektname "VWGolf" Classe Objekt_1_Auto. "Methodenname"

        VWGolf.volltanken();

        VWGolf.tankInhalt(100);



    }

}

