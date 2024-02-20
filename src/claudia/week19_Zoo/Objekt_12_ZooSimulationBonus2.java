package claudia.week19_Zoo;

/*
Bonusaufgabe: Simulation 0.3
Erweitere den Zoo mit Tierärzten, welche die verletzten Tiere behandeln und heilen.
Erstelle eine Klasse TierArzt mit einem Namen.

Erweitere die Simulation
Jeder Tierarzt wird an jedem Tag - genau 1 Tier behandeln
Der Tierarzt wählt das Tier mit der geringsten relativen Gesundheit
Zum Beispiel: 10 Gesundheit mit 100 Maximum ist 10% und so dringender als 1 Gesundheit aus 2 ergo 50%.

Der Tierarzt wird zufällig zwischen 30 und 100% der Gesundheit wiederherstellen
Kein Tier kann über die maximale Gesundheit geboostet werden.

Lass auf der Konsole ausdrucken, wer was macht.
 */


import claudia.week18_neuerZoo.Tier;
import claudia.week18_neuerZoo.Tierarzt;
import claudia.week18_neuerZoo.Zoo;
import claudia.week18_neuerZoo.Zoohilfe;

import java.util.ArrayList;

public class Objekt_12_ZooSimulationBonus2 {
    public static void main(String[] args) {
        //Zoo mit Tierarzt erstellen
        Zoo zoo = Zoohilfe.erstelleStandardZooMitPflegern();
        //ArrayList<Tier> listeAllerTiereImZoo = zoo.getListeDerTiere();
        Tierarzt tierarzt1 = new Tierarzt("Dr. Müller");
        zoo.setTierarzt(tierarzt1);


        Objekt_11_ZooSimulationBonus1.printTierTabelle(zoo);
        dailyScheduleWithDoctor(zoo, 100);

    }
    public static void dailyScheduleWithDoctor(Zoo zoo, int numberOfDays){
        //zweiter und dritter Tierarzt
        Tierarzt tierarzt2 = new Tierarzt ("Dr. Meyer");
        Tierarzt tierarzt3 = new Tierarzt ("Dr. Schultze");

        for (int day = 1; day <= numberOfDays; day++) {
            //Zu Beginn alle Tiere auf "ungefüttert" setzen
            System.out.println("\n*** TAG " + day + " ***");

            Zoohilfe.setAllAnimalsToHasntBitten(zoo.getListeDerTiere());
            //alle Tiere bekommen die Chance zu beißen:
            Objekt_11_ZooSimulationBonus1.letAllAnimalsBite(zoo.getListeDerGehege());
            //Entferne tote Tiere:
            zoo.removeAllDeadAnimals();
            //Füttere alle:
            zoo.feedAll();
            //neue Übersicht:
            Objekt_11_ZooSimulationBonus1.printTierTabelle(zoo);
            //Tierarzt heilt das schwächste Tier:
            zoo.getTierarzt().heal(findSickest(zoo));
            tierarzt2.heal(findSickest(zoo));
            tierarzt3.heal(findSickest(zoo));
        }

    }
    public static Tier findSickest(Zoo zoo){
        ArrayList<Tier> listeDerTiere = zoo.getListeDerTiere();
        Tier sickest = listeDerTiere.get(0);
        double ratio = (double) sickest.getHealthActual() /(double) sickest.getHealthMax();

        for (Tier tier : listeDerTiere){
            double ratioActual = (double) tier.getHealthActual() /(double) tier.getHealthMax();
            if (ratioActual < ratio){
                ratio = ratioActual;
                sickest = tier;
            }
            //System.out.println("Sickest : " + sickest.getName());
        }
        return sickest;
    }
}
