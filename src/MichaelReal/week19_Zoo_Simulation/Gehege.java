package MichaelReal.week19_Zoo_Simulation;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Gehege {
    private String name;
    private HashMap<Tier, Integer> tierList;
    private ArrayList<String> pflegerGehegeList;
    private boolean wurdeBearbeitet;

    public Gehege(String name) {
        this.name = name;
        this.tierList = new HashMap<>();
        this.pflegerGehegeList = new ArrayList<>();
        this.wurdeBearbeitet = false;
    }

    public String getName() {
        return name;
    }

    public void addTier(Tier tier, int anzahl) {
        tierList.put(tier, anzahl);
    }

    public void addPfleger(String pfleger) {
        pflegerGehegeList.add(pfleger);
    }

    // Methode zum Ändern des Futters für ein Tier in diesem Gehege
    public void changeTierFutter(String tierName, Futter neuesFutter, int neueMenge) {
        for (Tier tier : tierList.keySet()) {
            if (tier.getName().equals(tierName)) {
                HashMap<Futter, Integer> futterBedarf = tier.getFutterBedarf();
                futterBedarf.clear();
                futterBedarf.put(neuesFutter, neueMenge);
                System.out.println("\nFutter für Tier " + tierName + " in Gehege " + name + " geändert zu " + neuesFutter.getName() + " (Menge: " + neueMenge + ")");
                return;
            }
        }
        System.out.println("Tier " + tierName + " wurde nicht im Gehege " + name + " gefunden.");
    }

    public HashMap<Tier, Integer> getTierList() {
        return tierList;
    }

    public ArrayList<String> getPflegerGehegeList() {
        return pflegerGehegeList;
    }

    public void bearbeiteGehege() {
        System.out.println("Füttern der Tiere im Gehege " + name);
        fuettereTiere();

        System.out.println("Beobachtung eines zufälligen Tiers im Gehege " + name);
        beobachteZufaelligesTier();

        wurdeBearbeitet = true;
    }

    private void fuettereTiere() {
        for (Tier tier : tierList.keySet()) {
            int anzahl = tierList.get(tier);
            System.out.println("Füttere " + anzahl + "x " + tier.getName());
            // Hier könnte ich zusätzliche Logik hinzufügen, z.B. Futterbedarf prüfen
        }
    }

    private void beobachteZufaelligesTier() {
        if (!tierList.isEmpty()) {
            Random random = new Random();
            Tier zufaelligesTier = (new ArrayList<>(tierList.keySet())).get(random.nextInt(tierList.size()));
            System.out.println("Beobachtung des Tiers: " + zufaelligesTier.getName());
            // Hier könnte ich zusätzliche Logik für die Beobachtung hinzufügen
        } else {
            System.out.println("Keine Tiere im Gehege " + name + " zu beobachten.");
        }
    }

    public boolean isWurdeBearbeitet() {
        return wurdeBearbeitet;
    }

    public void resetWurdeBearbeitet() {
        wurdeBearbeitet = false;
    }


}


