package MichaelReal.week18_Zoo;



import java.util.ArrayList;
import java.util.HashMap;

public abstract class Zoo {
    private final String name;
    private final int gruendungsjahr;
    private ArrayList<Gehege> gehegeList;
    private HashMap<Futter, Integer> gesamtFutterBedarf;

    public Zoo(String name, int gruendungsjahr) {
        this.name = name;
        this.gruendungsjahr = gruendungsjahr;
        this.gehegeList = new ArrayList<>();
        this.gesamtFutterBedarf = new HashMap<Futter, Integer>();
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
                gehege.addTier(tier, 1); // Hier wird die Anzahl immer als 1 festgelegt
                System.out.println("Tier " + tier.getName() + " wurde dem Gehege " + gehegeName + " hinzugefügt.");
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

    public void changeTierFutter(String gehegeName, String tierName, Futter neuesFutter, int neueMenge) {
        for (Gehege gehege : gehegeList) {
            if (gehege.getName().equals(gehegeName)) {
                gehege.changeTierFutter(tierName, neuesFutter, neueMenge);
                return;
            }
        }
        System.out.println("Gehege " + gehegeName + " wurde nicht gefunden.");
    }

    // Abstrakte Methode zur Ausgabe zusätzlicher Informationen über den Zoo
    public abstract void printAdditionalInfo();

    // Methode zur Ausgabe der Zoo-Struktur mit Tieren und ihrem Futter
    public void printZooStructureWithTiere() {
        System.out.println("├── Zoo: " + name + ", gegründet " + gruendungsjahr);
        for (Gehege gehege : gehegeList) {
            System.out.println("│   ├── Gehege: " + gehege.getName());
            HashMap<Tier, Integer> tierList = gehege.getTierList();
            for (Tier tier : tierList.keySet()) {
                int anzahl = tierList.get(tier);
                System.out.println("│   │   ├── Tier: " + tier.getName() + " (Gattung: " + tier.getGattung() + ", Anzahl: " + anzahl + ")");
                System.out.println("│   │   │   ├── Futterbedarf:");
                HashMap<Futter, Integer> futterBedarf = tier.getFutterBedarf();
                for (Futter futter : futterBedarf.keySet()) {
                    int menge = futterBedarf.get(futter);
                    System.out.println("│   │   │   │   ├── " + futter.getName() + ": " + menge + " " + futter.getEinheit());
                }
            }
        }

        // Hier rufen wir printAdditionalInfo() auf, um zusätzliche Informationen auszugeben
        printAdditionalInfo();
    }

    // Methode zur Berechnung des Gesamtfutterbedarfs und der Kosten
    public void calculateFutterBedarfUndKosten() {
        gesamtFutterBedarf.clear();

        System.out.println("Gesamter Futterbedarf des Zoos:");
        for (Gehege gehege : gehegeList) {
            HashMap<Tier, Integer> tierList = gehege.getTierList();
            for (Tier tier : tierList.keySet()) {
                int anzahl = tierList.get(tier);
                HashMap<Futter, Integer> futterBedarf = tier.getFutterBedarf();
                for (Futter futter : futterBedarf.keySet()) {
                    int menge = futterBedarf.get(futter) * anzahl;
                    double einheitspreis = futter.getEinheitspreis();

                    // Futterbedarf des Tiers zum Gesamtfutterbedarf hinzufügen
                    gesamtFutterBedarf.put(futter, gesamtFutterBedarf.getOrDefault(futter, 0) + menge);

                    // Ausgabe des Futterbedarfs für jedes Futter
                    System.out.println(futter.getName() + ": " + menge + " " + futter.getEinheit() + " (Preis pro Kilo: " + einheitspreis + " Euro)");
                }
            }
        }

        // Berechnung der Gesamtkosten für die Tagesversorgung
        double gesamtKosten = 0.0;
        for (Futter futter : gesamtFutterBedarf.keySet()) {
            int menge = gesamtFutterBedarf.get(futter);
            double einheitspreis = futter.getEinheitspreis();
            gesamtKosten += (menge * einheitspreis);
        }

        System.out.println("Gesamtkosten für die Tagesversorgung: " + gesamtKosten + " Euro");
    }
}