package MichaelReal.week18_Zoo;


import java.util.ArrayList;

public class Gehege {
    private String name;
    private ArrayList<Tier> tierList;

    public Gehege(String name) {
        this.name = name;
        this.tierList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addTier(Tier tier) {
        tierList.add(tier);
    }

    public void removeTier(String tierName) {
        for (int i = 0; i < tierList.size(); i++) {
            if (tierList.get(i).getName().equals(tierName)) {
                tierList.remove(i);
                System.out.println("\nTier " + tierName + " wurde aus dem Gehege " + name + " entfernt.");
                return;
            }
        }
        System.out.println("Tier " + tierName + " wurde nicht gefunden.");
    }

    public void changeTierFutter(String tierName, Futter futter) {
        for (int i = 0; i < tierList.size(); i++) {
            if (tierList.get(i).getName().equals(tierName)) {
                tierList.get(i).setFutter(futter);
                System.out.println("\nDas Futter für Tier " + tierName + " wurde geändert zu: " + futter.getName());
                return;
            }
        }
        System.out.println("Tier " + tierName + " wurde nicht gefunden.");
    }

    public ArrayList<Tier> getTierList() {
        return tierList;
    }
}
