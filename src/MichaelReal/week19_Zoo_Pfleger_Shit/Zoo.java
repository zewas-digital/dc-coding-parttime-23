package MichaelReal.week19_Zoo_Pfleger_Shit;



import java.util.ArrayList;
import java.util.HashMap;

public abstract class Zoo {
    private final String name;
    private final int gruendungsjahr;
    private final ArrayList<Gehege> gehegeList;
    private final HashMap<Futter, Integer> gesamtFutterBedarf;
    private final ArrayList<Pfleger> pflegerList;


    public Zoo(String name, int gruendungsjahr) {
        this.name = name;
        this.gruendungsjahr = gruendungsjahr;
        this.gehegeList = new ArrayList<>();
        this.gesamtFutterBedarf = new HashMap<>();
        this.pflegerList = new ArrayList<>();
    }

    public void addPfleger(Pfleger pfleger) {
        pflegerList.add(pfleger);
    }

    public void removePfleger(Pfleger pfleger) {
        pflegerList.remove(pfleger);
    }


    public final void addGehege(String gehegeName) {
        gehegeList.add(new Gehege(gehegeName));
    }

    public void removeGehege(String gehegeName) {
        // Durchlaufe die Liste der Gehege
        for (int i = 0; i < gehegeList.size(); i++) {
            if (gehegeList.get(i).getName().equals(gehegeName)) {
                // Durchlaufe die Liste der Pfleger
                for (Pfleger pfleger : pflegerList) {
                    // Entferne das zu entfernende Gehege aus der Liste der vom Pfleger betreuten Gehege
                    pfleger.removeZustandigesGehege(gehegeList.get(i));
                    // Durchlaufe die Liste der Tiere im zu entfernenden Gehege
                    HashMap<Tier, Integer> tierList = gehegeList.get(i).getTierList();
                    for (Tier tier : tierList.keySet()) {
                        // Entferne die Zuordnung des Pflegers zum Tier (falls vorhanden)
                        pfleger.removeZustandigesTier(tier);
                    }
                }

                gehegeList.remove(i);
                System.out.println("Gehege " + gehegeName + " wurde entfernt.");
                return;
            }
        }
        System.out.println("Gehege " + gehegeName + " wurde nicht gefunden.");
    }

    public Gehege getGehegeByName(String gehegeName) {
        for (Gehege gehege : gehegeList) {
            if (gehege.getName().equals(gehegeName)) {
                return gehege;
            }
        }
        return null; // Gehege mit dem angegebenen Namen wurde nicht gefunden
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

    public void removeTierFromGehege(String gehegeName, String tierName, int anzahl) {
        for (Gehege gehege : gehegeList) {
            if (gehege.getName().equals(gehegeName)) {
                HashMap<Tier, Integer> tierList = gehege.getTierList();
                for (Tier tier : tierList.keySet()) {
                    if (tier.getName().equals(tierName)) {
                        int aktuelleAnzahl = tierList.get(tier);
                        if (anzahl <= aktuelleAnzahl) {
                            if (aktuelleAnzahl - anzahl == 0) {
                                tierList.remove(tier); // Das Tier vollständig entfernen, wenn die Anzahl 0 ist
                            } else {
                                tierList.put(tier, aktuelleAnzahl - anzahl); // Anzahl aktualisieren
                            }
                            System.out.println("\n🌿Tier🌿 " + tierName + " wurde aus dem Gehege " + gehegeName + " entfernt (Anzahl: " + anzahl + ").");
                            return;
                        } else {
                            System.out.println("Nicht genügend " + tierName + " im Gehege " + gehegeName + ".");
                            return;
                        }
                    }
                }
                System.out.println("Tier " + tierName + " wurde nicht im Gehege " + gehegeName + " gefunden.");
                return;
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
                    System.out.println("│   │   │   │   ├── " + futter.getName() + ": " + menge * tierList.get(tier) + " " + futter.getEinheit());
                }
            }
        }

        // Schleife über Pfleger und ihre Zuordnungen zu Tieren und Gehegen
        for (Pfleger pfleger : pflegerList) {
            System.out.println("│   │   ├── 🧑‍⚕️Pfleger🧑‍⚕️: " + pfleger.getName());
            System.out.println("│   │   │   ├── 🏠Zuständige Gehege🏠:");
            for (Gehege gehege : pfleger.getZustandigeGehege()) {
                System.out.println("│   │   │   │   ├── " + gehege.getName());
            }
            System.out.println("│   │   │   ├── 🦁Zuständige Tiere🦁:");
            for (Tier tier : pfleger.getZustandigeTiere()) {
                System.out.println("│   │   │   │   ├── " + tier.getName());
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