package eslem.week21threads;

import oliver.week18_Zoo.Gehege;
import oliver.week18_Zoo.Objekt_9_Pfleger;
import oliver.week18_Zoo.Tiere;
import oliver.week18_Zoo.Zoo;

public class Objekt_13_ZooThread {
    public static void main(String[] args) throws InterruptedException {
        Zoo tierpark = Objekt_9_Pfleger.erzeugeZoo("Tierpark Dornbirn");
        // füge Tiere hinzu
        for (Gehege gehege : tierpark.gehege) {
            gehege.tierHinzufuegen("AlphaWolf", 70, 300, Tiere.WOELFE);
            gehege.tierHinzufuegen("CetaWolf", 50, 200, Tiere.WOELFE);
            gehege.tierHinzufuegen("Luchs", 40, 150, Tiere.LUCHSE);
            gehege.tierHinzufuegen("Panther", 90, 500, Tiere.PANTHER);
            gehege.tierHinzufuegen("Bär", 70, 900, Tiere.BAEREN);
        }

        ZooThreadSimulator simulator = new ZooThreadSimulator(tierpark);

        // simuliere x Tage:
        simulator.tagesSimulation(3);
    }
}
