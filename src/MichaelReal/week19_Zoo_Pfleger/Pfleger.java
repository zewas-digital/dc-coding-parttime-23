package MichaelReal.week19_Zoo_Pfleger;

import java.util.ArrayList;
import java.util.HashMap;

public class Pfleger {
    private String name;
    private ArrayList<Gehege> zustandigeGehege; // Gehege, für die der Pfleger zuständig ist
    private ArrayList<Tier> zustandigeTiere; // Tiere, für die der Pfleger zuständig ist
    private HashMap<Gehege, Integer> gehegeTierAnzahl; // Anzahl der Tiere pro Gehege

    public Pfleger(String name) {
        this.name = name;
        this.zustandigeGehege = new ArrayList<>();
        this.zustandigeTiere = new ArrayList<>();
        this.gehegeTierAnzahl = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Gehege> getZustandigeGehege() {
        return zustandigeGehege;
    }

    public void addZustandigesGehege(Gehege gehege) {
        zustandigeGehege.add(gehege);
    }

    public void removeZustandigesGehege(Gehege gehege) {
        zustandigeGehege.remove(gehege);
    }

    public ArrayList<Tier> getZustandigeTiere() {
        return zustandigeTiere;
    }

    public void addZustandigesTier(String tierName) {
        Tier tier = getTierByName(tierName);
        if (tier != null) {
            zustandigeTiere.add(tier);
        } else {
            System.out.println("Tier mit dem Namen " + tierName + " wurde nicht gefunden.");
        }
    }


    public void removeZustandigesTier(Tier tier) {
        zustandigeTiere.remove(tier);
    }

    public Tier getTierByName(String tierName) {
        for (Tier tier : zustandigeTiere) {
            if (tier.getName().equals(tierName)) {
                return tier;
            }
        }
        return null;
    }

    public HashMap<Gehege, Integer> getGehegeTierAnzahl() {
        return gehegeTierAnzahl;
    }

    public void assignTierToGehege(Gehege gehege, int anzahl) {
        int currentAnzahl = gehegeTierAnzahl.getOrDefault(gehege, 0);
        gehegeTierAnzahl.put(gehege, currentAnzahl + anzahl);
    }

    public void removeTierFromGehege(Gehege gehege, int anzahl) {
        int currentAnzahl = gehegeTierAnzahl.getOrDefault(gehege, 0);
        if (currentAnzahl >= anzahl) {
            gehegeTierAnzahl.put(gehege, currentAnzahl - anzahl);
        }
    }
}
