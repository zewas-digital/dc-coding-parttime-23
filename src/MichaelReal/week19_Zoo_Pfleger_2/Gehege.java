package MichaelReal.week19_Zoo_Pfleger_2;


import java.util.HashMap;

public class Gehege {
    private String name;
    private HashMap<Tier, Integer> tierList;
    private HashMap<Pfleger, Integer> zustaendigePfleger; // Zuordnung von Pflegern zu diesem Gehege

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

    // Methode zum Zuordnen eines Pflegers zum Gehege
    public void assignPfleger(Pfleger pfleger) {
        zustaendigePfleger.put(pfleger, zustaendigePfleger.getOrDefault(pfleger, 0) + 1);
        pfleger.addZustaendigesGehege(this); // Pfleger auch informieren
    }

    // Methode zum Entfernen eines Pflegers aus dem Gehege
    public void removePfleger(Pfleger pfleger) {
        if (zustaendigePfleger.containsKey(pfleger)) {
            int count = zustaendigePfleger.get(pfleger);
            if (count > 1) {
                zustaendigePfleger.put(pfleger, count - 1);
            } else {
                zustaendigePfleger.remove(pfleger);
            }
            pfleger.removeZustaendigesGehege(this); // Pfleger auch informieren
        }

}


