package MichaelReal.week19_Zoo_Pfleger_2;



import java.util.ArrayList;
import java.util.HashMap;

public abstract class Zoo {
    private final String name;
    private final int gruendungsjahr;
    private final ArrayList<Gehege> gehegeList;
    private final HashMap<Futter, Integer> gesamtFutterBedarf;
    private ArrayList<Pfleger> pflegerListe; // Liste der Pfleger im Zoo
    private HashMap<String, Gehege> gehegeListe; // HashMap zur Speicherung der Gehege

    public Zoo(String name, int gruendungsjahr) {
        this.name = name;
        this.gruendungsjahr = gruendungsjahr;
        this.gehegeList = new ArrayList<>();
        this.gesamtFutterBedarf = new HashMap<>();
        this.pflegerListe = new ArrayList<>();
        this.gehegeListe = new HashMap<>();
    }

    // Methode zum Abrufen eines Geheges anhand seines Namens
    public Gehege getGehegeByName(String name) {
        return this.gehegeListe.get(name);
    }

    public final void addGehege(String gehegeName) {
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

    public final void assignTierToGehege(String gehegeName, Tier tier, int anzahl) {
        for (Gehege gehege : gehegeList) {
            if (gehege.getName().equals(gehegeName)) {
                gehege.addTier(tier, anzahl);
                System.out.println("\n🌿Tier🌿 " + tier.getName() + " wurde dem Gehege " + gehegeName + " hinzugefügt.");
                return;
            }
        }
        System.out.println("Gehege " + gehegeName + " wurde nicht gefunden.");
    }

    public void removeTierFromGehege(String gehegeName, Tier tier, int anzahl) {
        for (Gehege gehege : gehegeList) {
            if (gehege.getName().equals(gehegeName)) {
                HashMap<Tier, Integer> tierList = gehege.getTierList();
                if (tierList.containsKey(tier)) {
                    int aktuelleAnzahl = tierList.get(tier);
                    if (anzahl <= aktuelleAnzahl) {
                        if (aktuelleAnzahl - anzahl == 0) {
                            tierList.remove(tier); // Das Tier vollständig entfernen, wenn die Anzahl 0 ist
                        } else {
                            tierList.put(tier, aktuelleAnzahl - anzahl); // Anzahl aktualisieren
                        }
                        System.out.println("\n🌿Tier🌿 " + tier.getName() + " wurde aus dem Gehege " + gehegeName + " entfernt (Anzahl: " + anzahl + ").");
                        return;
                    } else {
                        System.out.println("Nicht genügend " + tier.getName() + " im Gehege " + gehegeName + ".");
                    }
                } else {
                    System.out.println("Tier " + tier.getName() + " wurde nicht im Gehege " + gehegeName + " gefunden.");
                }
            }
        }
        System.out.println("Gehege " + gehegeName + " wurde nicht gefunden.");
    }



    public void changeTierFutter(String gehegeName, String tierName, Futter Futter, int neueMenge) {
        for (Gehege gehege : gehegeList) {
            if (gehege.getName().equals(gehegeName)) {
                gehege.changeTierFutter(tierName, Futter, neueMenge);
                return;
            }
        }
        System.out.println("Gehege " + gehegeName + " wurde nicht gefunden.");
    }

    // Methode zum Hinzufügen eines Pflegers
    public void addPfleger(Pfleger pfleger) {
        if (!pflegerListe.contains(pfleger)) {
            pflegerListe.add(pfleger);
        }
    }

    // Methode zum Entfernen eines Pflegers
    public void removePfleger(Pfleger pfleger) {
        pflegerListe.remove(pfleger);
    }

    public abstract void printAdditionalInfo();

    // Methode zur Ausgabe der Zoo-Struktur mit Tieren und ihrem Futter
    public void printZooStructureWithTiere() {
        System.out.println("\n├── 🐯Zoo🐯: " + name + ", gegründet " + gruendungsjahr);
        for (Gehege gehege : gehegeList) {
            System.out.println("│   ├── 🏁Gehege: " + gehege.getName());
            HashMap<Tier, Integer> tierList = gehege.getTierList();
            for (Tier tier : tierList.keySet()) {
                int anzahl = tierList.get(tier);
                System.out.println("│   │   ├── 🌿Tier🌿: " + tier.getName() + " (Gattung: " + tier.getGattung() + ", Anzahl: " + anzahl + ")");
                System.out.println("│   │   │   ├── 🥗Futterbedarf🥗:");
                HashMap<Futter, Integer> futterBedarf = tier.getFutterBedarf();
                for (Futter futter : futterBedarf.keySet()) {
                    int menge = futterBedarf.get(futter);
                    System.out.println("│   │   │   │   ├── " + futter.getName() + ": " + menge * anzahl + " " + futter.getEinheit());
                }
            }


            // Ausgabe der Pfleger und ihrer zugeordneten Tiere für jedes Gehege
            System.out.println("│   │   ├── 🧑‍⚕️Pfleger🧑‍⚕️:");
            for (Pfleger pfleger : gehege.getZustaendigePfleger().keySet()) {
                System.out.println("│   │   │   ├── " + pfleger.getName());
                System.out.println("│   │   │   │   ├── 🦁Zuständige Tiere🦁:");
                for (Tier zustandigesTier : pfleger.getZustaendigeTiere()) {
                    System.out.println("│   │   │   │   │   ├── " + zustandigesTier.getName());
                }
            }
        }

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