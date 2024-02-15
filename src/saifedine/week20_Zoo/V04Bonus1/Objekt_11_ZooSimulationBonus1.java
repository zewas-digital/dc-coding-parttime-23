package saifedine.week20_Zoo.V04Bonus1;

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

public class Objekt_11_ZooSimulationBonus1 {

}
