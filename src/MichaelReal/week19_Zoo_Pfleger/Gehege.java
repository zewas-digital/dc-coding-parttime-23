package MichaelReal.week19_Zoo_Pfleger;


import java.util.HashMap;

public class Gehege {
    private String name;
    private HashMap<Tier, Integer> tierList;
    private final HashMap<Pfleger, Integer> zustaendigePfleger;

    public Gehege(String name) {
        this.name = name;
        this.tierList = new HashMap<>();
        this.zustaendigePfleger = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void addTier(Tier tier, int anzahl) {
        tierList.put(tier, anzahl);
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

    public void addZustaendigerPfleger(Pfleger pfleger, int anzahl) {
        zustaendigePfleger.put(pfleger, anzahl);
    }

    public void removeZustandigerPfleger(Pfleger pfleger) {
        zustaendigePfleger.remove(pfleger);
    }

    public HashMap<Pfleger, Integer> getZustaendigePfleger() {
        return zustaendigePfleger;
    }

}


