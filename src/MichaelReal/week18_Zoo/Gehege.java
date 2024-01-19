package MichaelReal.week18_Zoo;


import java.util.HashMap;

public class Gehege {
    private String name;
    private HashMap<Tier, Integer> tierList;
    private HashMap<Futter, Integer> futterBedarf;

    public Gehege(String name) {
        this.name = name;
        this.tierList = new HashMap<>();
        this.futterBedarf = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void addTier(Tier tier, int anzahl) {
        tierList.put(tier, anzahl);
    }

    public void removeTier(Tier tier) {
        tierList.remove(tier);
    }

    public void addFutterBedarf(Futter futter, int menge) {
        futterBedarf.put(futter, menge);
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

    public HashMap<Futter, Integer> getFutterBedarf() {
        return futterBedarf;
    }
}


