package MichaelReal.week19_Zoo_Multithreading;

import java.util.ArrayList;
import java.util.Random;

public class TierArzt implements Runnable {
    private String name;
    private Zoo zoo;

    public TierArzt(String name) {
        this.name = name;
        this.zoo = zoo;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        zoo.simulateDayForTierarzt(this);
    }

    // Methode, um das Tier mit der niedrigsten relativen Gesundheit zu behandeln
    public void behandleTier(ArrayList<Gehege> gehegeList) {
        Tier zielTier = null;
        Gehege zielGehege = null;
        double niedrigsteRelativeGesundheit = Double.MAX_VALUE;

        // Suche nach dem Tier mit der niedrigsten relativen Gesundheit
        for (Gehege gehege : gehegeList) {
            for (Tier tier : gehege.getTierList().keySet()) {
                double relativeGesundheit = (double) tier.getGesundheit() / tier.getMaxGesundheit();
                if (relativeGesundheit < niedrigsteRelativeGesundheit && tier.getGesundheit() < tier.getMaxGesundheit()) {
                    niedrigsteRelativeGesundheit = relativeGesundheit;
                    zielTier = tier;
                    zielGehege = gehege;
                }
            }
        }

        // Behandle das ausgewählte Tier
        if (zielTier != null) {
            Random random = new Random();
            int wiederherstellungsProzentsatz = 30 + random.nextInt(71); // Zufälliger Wert zwischen 30 und 100
            int vorherigeGesundheit = zielTier.getGesundheit(); // Gesundheit vor der Behandlung speichern
            int wiederhergestellteGesundheit = (int) (zielTier.getMaxGesundheit() * wiederherstellungsProzentsatz / 100.0);
            int neueGesundheit = Math.min(vorherigeGesundheit + wiederhergestellteGesundheit, zielTier.getMaxGesundheit());
            zielTier.setGesundheit(neueGesundheit);
            int geheiltePunkte = neueGesundheit - vorherigeGesundheit; // Berechne die geheilten Gesundheitspunkte

            System.out.println("\n" + this.name + " hat " + zielTier.getName() + " im Gehege " + zielGehege.getName() + " behandelt. Geheilte Gesundheitspunkte: " + geheiltePunkte + ". Neue Gesundheit: " + neueGesundheit);
        }
    }
}
