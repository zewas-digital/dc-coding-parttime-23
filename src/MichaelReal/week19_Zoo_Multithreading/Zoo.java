package MichaelReal.week19_Zoo_Multithreading;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Zoo {
    private final String name;
    private final int gruendungsjahr;
    private final ArrayList<Gehege> gehegeList;
    private final HashMap<Futter, Integer> gesamtFutterBedarf;
    private final ArrayList<Pfleger> pflegerList;
    private final ArrayList<TierArzt> tierarztList;


    public Zoo(String name, int gruendungsjahr) {
        this.name = name;
        this.gruendungsjahr = gruendungsjahr;
        this.gehegeList = new ArrayList<>();
        this.gesamtFutterBedarf = new HashMap<>();
        this.pflegerList = new ArrayList<>();
        this.tierarztList = new ArrayList<>();
    }


    public final void addGehege(String gehegeName) {
        gehegeList.add(new Gehege(gehegeName));
    }

    public final void addPfleger(String pflegerName, String lieblingsGattung) {
        pflegerList.add(new Pfleger(pflegerName, lieblingsGattung));
    }

    public void addTierarzt(String tierarztName) {
        this.tierarztList.add(new TierArzt(tierarztName));
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

    public void removePfleger(String pflegerName) {
        for (int i = 0; i < pflegerList.size(); i++) {
            if (pflegerList.get(i).getName().equals(pflegerName)) {
                pflegerList.remove(i);
                System.out.println("Pfleger " + pflegerName + " wurde entfernt.");
                return;
            }
        }
        System.out.println("Pfleger " + pflegerName + " wurde nicht gefunden.");
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

    public final void assignPflegerToGehege(String pflegerName, String gehegeName) {
        for (Gehege gehege : gehegeList) {
            if (gehege.getName().equals(gehegeName)) {
                gehege.addPfleger(pflegerName);
                System.out.println("\n Pfleger " + pflegerName + " wurde dem Gehege " + gehegeName + " hinzugefügt.");
                return;
            }
        }
        System.out.println("Pfleger " + pflegerName + " wurde nicht gefunden.");
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


    public abstract void printAdditionalInfo();

    // Methode zur Ausgabe der Zoo-Struktur mit Tieren und ihrem Futter
    public void printZooStructureWithTiere() {
        System.out.println("\n├── 🐯Zoo: " + name + ", gegründet " + gruendungsjahr);
        for (Gehege gehege : gehegeList) {
            System.out.println("│   ├── 🏁Gehege: " + gehege.getName());
            HashMap<Tier, Integer> tierList = gehege.getTierList();
            for (Tier tier : tierList.keySet()) {
                int anzahl = tierList.get(tier);
                System.out.println("│   │   ├── 🌿Tier: " + tier.getName() + " (Gattung: " + tier.getGattung() + ", Anzahl: " + anzahl + ")");
                System.out.println("│   │   │   ├── 🥗Futterbedarf:");
                HashMap<Futter, Integer> futterBedarf = tier.getFutterBedarf();
                for (Futter futter : futterBedarf.keySet()) {
                    int menge = futterBedarf.get(futter);
                    System.out.println("│   │   │   │   ├── " + futter.getName() + ": " + menge * anzahl + " " + futter.getEinheit());
                    ArrayList<String> pflegerTierList = tier.getPflegerTierList();
                    for (String pflegerName : pflegerTierList) {
                        System.out.println("│   │   │   │   │   ├── 👨‍⚕️Pfleger: " + pflegerName + " ist verantwortlich für " + tier.getName());
                    }
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

    public void simulateDay() {
        // Zurücksetzen der Bearbeitungszustände für alle Gehege
        for (Gehege gehege : gehegeList) {
            gehege.resetWurdeBearbeitet();
        }
        List<Thread> threads = new ArrayList<>();

        // Starten der Pfleger-Threads
        for (Pfleger pfleger : pflegerList) {
            Thread thread = new Thread(() -> simulateDayForPfleger(pfleger));
            threads.add(thread);
            thread.start();
        }

        // Starten der Tierarzt-Threads
        for (TierArzt tierarzt : tierarztList) {
            Thread thread = new Thread(() -> simulateDayForTierarzt(tierarzt));
            threads.add(thread);
            thread.start();
        }

        // Warten, dass alle Threads ihre Arbeit beenden
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Lassen Sie die Tiere sich am Ende des Tages gegenseitig beißen
        for (Gehege gehege : gehegeList) {
            gehege.tiereBeissenLassen();
        }

        // Eventuell weitere Aktionen, die am Ende des Tages stattfinden
        // z.B. das Zurücksetzen von Zuständen, die Berechnung von Statistiken etc.
        System.out.println("\nAlle Tagesaufgaben im Zoo sind abgeschlossen.");
    }


    public void beobachteLieblingstierInAnderemGehege(Pfleger pfleger) {
        for (Gehege gehege : gehegeList) {
            for (Tier tier : gehege.getTierList().keySet()) {
                if (tier.getGattung().equals(pfleger.getLieblingsGattung())) {
                    System.out.println("Pfleger " + pfleger.getName() + " besucht sein Lieblingstier " + tier.getName() + " im Gehege " + gehege.getName());
                    return; // Pfleger hat sein Lieblingstier gefunden und beobachtet
                }
            }
        }
        System.out.println("Pfleger " + pfleger.getName() + " konnte sein Lieblingstier nicht finden.");
    }

    public void simulateDayForPfleger(Pfleger pfleger) {
        // Simulation für jeden Pfleger
            System.out.println("\nPfleger " + pfleger.getName() + " beginnt seinen Tag.");
            // Pfleger bearbeitet zuerst die ihm zugewiesenen Gehege
            for (Gehege gehege : gehegeList) {
                if (gehege.getPflegerGehegeList().contains(pfleger.getName()) && !gehege.isWurdeBearbeitet()) {
                    System.out.println("Pfleger " + pfleger.getName() + " bearbeitet Gehege " + gehege.getName());
                    gehege.bearbeiteGehege(pfleger);
                    gehege.setWurdeBearbeitet(true);
                }
            }

            // Pfleger füttert Tiere, die ihm zugewiesen sind, aber sich in anderen Gehegen befinden
            for (Gehege gehege : gehegeList) {
                if (!gehege.getPflegerGehegeList().contains(pfleger.getName())) {
                    gehege.bearbeiteGehegeFuerSpezifischenPfleger(pfleger);
                }
            }
            // Pfleger besucht sein Lieblingstier in anderen Gehegen
            beobachteLieblingstierInAnderemGehege(pfleger);

        System.out.println("Pfleger " + pfleger.getName() + " hat seinen Tag beendet.");
    }

    public void simulateDayForTierarzt(TierArzt tierarzt) {
        System.out.println("Tierarzt " + tierarzt.getName() + " beginnt seinen Rundgang.");

        // Tierärzte behandeln die Tiere
        tierarzt.behandleTier(gehegeList);


        System.out.println("Tierarzt " + tierarzt.getName() + " hat seinen Rundgang beendet.");
    }


}