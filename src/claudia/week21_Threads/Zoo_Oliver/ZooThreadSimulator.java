package claudia.week21_Threads.Zoo_Oliver;

import oliver.week18_Zoo.Gehege;
import oliver.week18_Zoo.Pfleger;
import oliver.week18_Zoo.Tier;
import oliver.week18_Zoo.Zoo;

import java.util.HashMap;

public class ZooThreadSimulator {
    Zoo zoo;

    public ZooThreadSimulator(Zoo zoo) {
        this.zoo = zoo;
    }

    protected void tagesSimulation(int anzahlTage) throws InterruptedException {
        // simuliere Anzahl Tage
        for (int i = 1; i <= anzahlTage; i++) {
            System.out.println("+– | Tag "+ i + " "+ "–".repeat(52) +"+");

            HashMap<Pfleger, ThreadPfleger> pflegerThreads = new HashMap<>();
            HashMap<Tier, ThreadTier> tierThreads = new HashMap<>();

            // erzeuge und starte Threads
            for (Pfleger pfleger : this.zoo.pfleger) {
                ThreadPfleger tmpPflegerThread = new ThreadPfleger(pfleger);
                pflegerThreads.put(pfleger, tmpPflegerThread);
                tmpPflegerThread.start();
            }
            for (Gehege gehege : this.zoo.gehege) {
                for (Tier tier : gehege.getTiere()) {
                    ThreadTier tmpTierThread = new ThreadTier(tier, gehege);
                    tierThreads.put(tier, tmpTierThread);
                    tmpTierThread.start();
                }
            }

            // warte bis Threads beendet sind
            for (ThreadPfleger tp : pflegerThreads.values()) {
                tp.join();
            }
            for (ThreadTier tt : tierThreads.values()) {
                tt.join();
            }

            System.out.println("\nTag beendet ---------");
        }
    }
}