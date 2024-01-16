package MichaelReal.week18_Zoo;



import java.util.ArrayList;

public abstract class Zoo {
    private final String name;
    private final int gruendungsjahr;
    private ArrayList<Gehege> gehegeList;

    public Zoo(String name, int gruendungsjahr) {
        this.name = name;
        this.gruendungsjahr = gruendungsjahr;
        this.gehegeList = new ArrayList<>();
    }

    public void addGehege(String gehegeName) {
        gehegeList.add(new Gehege(gehegeName));
    }

    public void removeGehege(String gehegeName) {
        for (int i = 0; i < gehegeList.size(); i++) {
            if (gehegeList.get(i).getName().equals(gehegeName)) {
                gehegeList.remove(i);
                System.out.println("Gehege " + gehegeName + " wurde entfernt.");
                return;
            }
        }
        System.out.println("Gehege " + gehegeName + " wurde nicht gefunden.");
    }

    public void assignTierToGehege(String gehegeName, Tier tier) {
        for (Gehege gehege : gehegeList) {
            if (gehege.getName().equals(gehegeName)) {
                gehege.addTier(tier);
                System.out.println("\nTier " + tier.getName() + " wurde dem Gehege " + gehegeName + " hinzugefügt.");
                return;
            }
        }
        System.out.println("Gehege " + gehegeName + " wurde nicht gefunden.");
    }

    public void removeTierFromGehege(String gehegeName, String tierName) {
        for (Gehege gehege : gehegeList) {
            if (gehege.getName().equals(gehegeName)) {
                gehege.removeTier(tierName);
                return;
            }
        }
        System.out.println("Gehege " + gehegeName + " wurde nicht gefunden.");
    }

    public void changeTierFutter(String gehegeName, String tierName, Futter futter) {
        for (Gehege gehege : gehegeList) {
            if (gehege.getName().equals(gehegeName)) {
                gehege.changeTierFutter(tierName, futter);
                return;
            }
        }
        System.out.println("Gehege " + gehegeName + " wurde nicht gefunden.");
    }

    public void printZooStructureWithTiere() {
        System.out.println("\n├── Zoo: " + name + ", gegründet " + gruendungsjahr);
        for (Gehege gehege : gehegeList) {
            System.out.println("│   ├── Gehege: " + gehege.getName());
            ArrayList<Tier> tierList = gehege.getTierList();
            for (Tier tier : tierList) {
                System.out.println("│   │   ├── Tier: " + tier.getName());
                System.out.println("│   │   │   ├── Futter: " + tier.getFutter().getName());
            }
        }

        printAdditionalInfo();
    }

    public abstract void printAdditionalInfo();
}
