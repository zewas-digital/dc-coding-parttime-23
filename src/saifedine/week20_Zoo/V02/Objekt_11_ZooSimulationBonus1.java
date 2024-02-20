package saifedine.week20_Zoo.V02;

/*
Bonusaufgabe: Simulation 0.2
Erweitere die Simulation

ToDo:
 Simulation mit Simulationstage als Übergabeparameter erweitern

 Konsturktor Simulationsklasse

1/ Jedes Tier hat eine Gesundheit, ein MaxGesundheit und einen Biss.
ToDo:
 int MaxGesundheit pro Tier (individuell - siehe nächste Aufgabe "ZooSimulationBonus2)
 int Biss pro Tier (individuell - Punkteabzug bei Biss)
 Konsturktor von Tiere um 2 Übergabeparameter erweitern!! --> Klasse Tiere

2/ Jedes Tier versucht mit 40 % Wahrscheinlichkeit, ein Nachbar von ihm aus dem gleichen Gehege zu beißen.
ToDo:
 pro Tier Bisswahrscheinlichkeit von 0,4
 Random von 0 - 1 wird eine Bisswahrscheinlichkeit einem Tier zugeordnet, d.h. wenn random von 0 - 0,4 --> BISS - von 0,4 - 1 --> KEIN BISS
 Random wird für jedes Tier berechnet und ausgeführt
 Random TierAuswahl, darf nicht sich selbst beißen und keine toten Tiere beissen

3/ Falls ein Tier gebissen wird, wird seine Gesundheit mit dem Biss von Angreifer reduziert
ToDo:
 Definition der Bissverletztung bzw. Bissauswirkung ist immer Punkteabzug vom MaxGesundheit.
3.1/ "toten Tiere" beißen nicht.
ToDo:
 tote Tiere aus der Liste der Tiere entfernen nach jeder Sim.

4/ Am Ende des Tages werden "toten Tiere" aus dem Gehege entfernt
ToDo:
 tote Tiere aus der Liste der Tiere entfernen nach jeder Sim.

Lass auf der Konsole ausdrucken, wer was macht.++
 */

import saifedine.week20_Zoo.V03Bonus.Gehege;
import saifedine.week20_Zoo.V03Bonus.Tiere;
import saifedine.week20_Zoo.V03Bonus.Zoo;

public class Objekt_11_ZooSimulationBonus1 {

    public static void main(String[] args) {

        // Anlage Instanz Zoo
        Zoo tiergartenDornbirn = new Zoo("Tiergarten Dornbirn",2022);

        // Anlage Instanzen Gehege
        Gehege ried = new Gehege("Ried");
        Gehege terrarium = new Gehege("Terrarium (warm)");
        Gehege alpenwiese = new Gehege("Alpenwiese");

        // Gehegezuordnung zum Zoo
        tiergartenDornbirn.addGehege(ried);
        tiergartenDornbirn.addGehege(terrarium);
        tiergartenDornbirn.addGehege(alpenwiese);

        System.out.println("\ngetgehegeArrayList(): " + tiergartenDornbirn.getgehegeArrayList());

        tiergartenDornbirn.zooStrukturGehege();

        // Anlage Instanzen Tiere mit alten Konstruktor
        Tiere schlange1reptil = new Tiere("Schlange1","Reptil");
        Tiere schlange2reptil = new Tiere("Schlange2","Reptil");
        Tiere schlange3reptil = new Tiere("Schlange3","Reptil");
        Tiere schlange4reptil = new Tiere("Schlange4","Reptil");
        Tiere schlange5reptil = new Tiere("Schlange5","Reptil");

        Tiere hirsch1wild = new Tiere("Hirsch1","Wild");
        Tiere hirsch2wild = new Tiere("Hirsch2","Wild");
        Tiere hirsch3wild = new Tiere("Hirsch3","Wild");
        Tiere hirsch4wild = new Tiere("Hirsch4","Wild");
        Tiere hirsch5wild = new Tiere("Hirsch5","Wild");

        Tiere reh1wild = new Tiere("Reh", "Wild");
        Tiere schlidkroete1reptil = new Tiere("Schildkröte","Reptil");

    }

}
