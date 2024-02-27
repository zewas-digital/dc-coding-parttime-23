package oliver.week19_Zoo;

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


import oliver.week18_Zoo.Gehege;
import oliver.week18_Zoo.Objekt_9_Pfleger;
import oliver.week18_Zoo.Tiere;
import oliver.week18_Zoo.Zoo;

public class Objekt_12_ZooSimulationBonus2 {
    public static void main(String[] args) {

        Zoo tierpark = Objekt_9_Pfleger.erzeugeZoo("Tierpark Dornbirn");
        // füge Tiere hinzu
        for (Gehege gehege : tierpark.gehege) {
            gehege.tierHinzufuegen("AlphaWolf", 70, 300, Tiere.WOELFE);
            gehege.tierHinzufuegen("BetaWolf", 50, 200, Tiere.WOELFE);
            gehege.tierHinzufuegen("Luchs", 40, 150, Tiere.LUCHSE);
            gehege.tierHinzufuegen("Panther", 90, 500, Tiere.PANTHER);
            gehege.tierHinzufuegen("Bär", 70, 900, Tiere.BAEREN);
        }

        ZooSimulator3 simulation = new ZooSimulator3(tierpark);

        // simuliere x Tage:
        simulation.tagesSimulation(14);
    }
}
