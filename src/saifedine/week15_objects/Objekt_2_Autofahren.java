package saifedine.week15_objects;

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

        Auto AudiA4 = new Auto("Audi", "A4", 2015, 143000,75,33);
        Auto HyundaiI20 = new Auto("Hyundai", "i20", 2016, 83622,35,23);

        System.out.println(AudiA4);
        System.out.println("KmStand vorher: " + AudiA4.kilometerstandFormatiert);
        System.out.println("Tankinhalt vorher: " + AudiA4.tankinhalt);

        AudiA4.fahren(17);
        System.out.println("gefahrene Km: " + AudiA4.gefahreneKm);                                                      // wird nicht ausgegeben, warum?
        System.out.println("Die gefahrene Km sind: " + AudiA4.getGefahreneKm());                                        // wird nicht ausgegeben, warum?
        System.out.println("KmStand nachher: " + AudiA4.getKilometerstand());
        System.out.println("KmStand nachher: " + AudiA4.kilometerstandFormatiert);

        AudiA4.vollTanken();
        System.out.println("Das Auto wurde mit " + AudiA4.getankteMenge);                                               // wird nicht ausgegeben, warum?
        System.out.println("Das Auto wurde mit " + AudiA4.getGetankteMenge() + " L getankt.");                          // wird nicht ausgegeben, warum?
        System.out.println("Tankinhalt nachher: " + AudiA4.getTankinhalt());

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println(HyundaiI20);
        System.out.println("KmStand vorher: " + HyundaiI20.kilometerstandFormatiert);
        System.out.println("Tankinhalt vorher: " + HyundaiI20.tankinhalt);

        HyundaiI20.fahren(78);
        System.out.println("KmStand nachher: " + HyundaiI20.getKilometerstand());
        System.out.println("KmStand nachher: " + HyundaiI20.kilometerstandFormatiert);

        HyundaiI20.vollTanken();
        System.out.println("Tankinhalt nachher: " + HyundaiI20.getTankinhalt());

    }
}
