package examples.week19_Zoo;

/*
Bonusaufgabe: Simulation 0.2
Erweitere die Simulation

1/ Jedes Tier hat eine Gesundheit, ein MaxGesundheit und einen Biss.
2/ Jedes Tier versucht mit 40 % Wahrscheinlichkeit, ein Nachbar von ihm aus dem gleichen Gehege zu beißen.
3/ Falls ein Tier gebissen wird, wird seine Gesundheit mit dem Biss von Angreifer reduziert
3.1/ "toten Tiere" beißen nicht.
4/ Am Ende des Tages werden "toten Tiere" aus dem Gehege entfernt

Lass auf der Konsole ausdrucken, wer was macht.
 */

import examples.week18_Zoo.Objekt_9_Pfleger;
import examples.week18_Zoo.Zoo;

public class Objekt_11_ZooSimulationBonus1 {
    public static void main(String[] args) {
        Zoo tierpark = Objekt_9_Pfleger.erzeugeZoo("Tierpark Dornbirn");
        ZooSimulator1 simulation = new ZooSimulator1(tierpark);

        // simuliere x Tage:
        simulation.tagesSimulation(20);
    }
}
