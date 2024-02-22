package MichaelReal.week19_Zoo_Multithreading;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Gehege {
    private String name;
    private HashMap<Tier, Integer> tierList;
    private ArrayList<String> pflegerGehegeList;
    private boolean wurdeBearbeitet;

    public Gehege(String name) {
        this.name = name;
        this.tierList = new HashMap<>();
        this.pflegerGehegeList = new ArrayList<>();
        this.wurdeBearbeitet = false;
    }

    public String getName() {
        return name;
    }

    public void addTier(Tier tier, int anzahl) {
        tierList.put(tier, anzahl);
    }

    public void addPfleger(String pfleger) {
        pflegerGehegeList.add(pfleger);
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

    public ArrayList<String> getPflegerGehegeList() {
        return pflegerGehegeList;
    }

    public void bearbeiteGehege(Pfleger pfleger) {

      // Kann verwendet werden, wenn ein Pfleger das ganze Gehege füttert. Für Methode "fuettereTiere()".
/*        System.out.println("Füttern der Tiere im Gehege " + name);
        fuettereTiere();
*/
        for (Tier tier : tierList.keySet()) {
            if (tier.getPflegerTierList().contains(pfleger.getName())) {
                // Füttere nur das Tier, wenn es dem Pfleger zugewiesen ist
                int anzahl = tierList.get(tier);
                System.out.println("Pfleger " + pfleger.getName() + " füttert " + anzahl + "x " + tier.getName());
            }
        }

        System.out.println("Pfleger " + pfleger.getName() + " beobachtet ein zufälliges Tier im Gehege " + name);
        beobachteZufaelligesTier(pfleger);

        wurdeBearbeitet = true;
    }

    private void fuettereTiere() {
        for (Tier tier : tierList.keySet()) {
            int anzahl = tierList.get(tier);
            System.out.println("Füttere " + anzahl + "x " + tier.getName());
            // Hier könnte ich zusätzliche Logik hinzufügen, z.B. Futterbedarf prüfen
        }
    }

    private void beobachteZufaelligesTier(Pfleger pfleger) {
        if (!tierList.isEmpty()) {
            Random random = new Random();
            Tier zufaelligesTier = (new ArrayList<>(tierList.keySet())).get(random.nextInt(tierList.size()));
            System.out.println("Pfleger " + pfleger.getName() + " beobachtet das Tier: " + zufaelligesTier.getName());
            // Hier könnte ich zusätzliche Logik für die Beobachtung hinzufügen
        } else {
            System.out.println("Pfleger " + pfleger.getName() + " findet keine Tiere im Gehege " + name);
        }
    }

    public boolean isWurdeBearbeitet() {
        return wurdeBearbeitet;
    }

    public void resetWurdeBearbeitet() {
        wurdeBearbeitet = false;
    }

    public void setWurdeBearbeitet(boolean wurdeBearbeitet) {
        this.wurdeBearbeitet = wurdeBearbeitet;
    }

    public void bearbeiteGehegeFuerSpezifischenPfleger(Pfleger pfleger) {
        for (Tier tier : tierList.keySet()) {
            if (tier.getPflegerTierList().contains(pfleger.getName())) {
                int anzahl = tierList.get(tier);
                System.out.println("Pfleger " + pfleger.getName() + " füttert " + anzahl + "x " + tier.getName() + " im Gehege " + this.name);
            }
        }
    }

    public void tiereBeissenLassen() {
        Random random = new Random();
        ArrayList<Tier> tiere = new ArrayList<>(tierList.keySet());

        for (Tier tier : tiere) {
            if (random.nextInt(100) < 40) { // 40 % Chance zu beissen
                tiere.stream()
                        .filter(anderesTier -> !anderesTier.equals(tier) && anderesTier.istLebendig())
                        .findAny()
                        .ifPresent(tier::beissen);
            }
        }

        entferneToteTiere();
    }

    //Die gleiche Methode ohne die Verwendung von einem Stream

/*  public void tiereBeissenLassen() {
    Random random = new Random();
    ArrayList<Tier> tiere = new ArrayList<>(tierList.keySet());

    for (Tier tier : tiere) {
        if (random.nextInt(100) < 40) { // 40 % Chance zu beissen
            // Liste für lebende Tiere, die nicht das aktuelle Tier sind
            ArrayList<Tier> moeglicheOpfer = new ArrayList<>();
            for (Tier anderesTier : tiere) {
                if (!anderesTier.equals(tier) && anderesTier.istLebendig()) {
                    moeglicheOpfer.add(anderesTier);
                }
            }

            if (!moeglicheOpfer.isEmpty()) {
                // Wähle ein zufälliges Tier aus der Liste der möglichen Opfer
                Tier zielTier = moeglicheOpfer.get(random.nextInt(moeglicheOpfer.size()));
                tier.beissen(zielTier);
            }
        }
    }

    entferneToteTiere();
*/


    private void entferneToteTiere() {
        tierList.keySet().removeIf(tier -> !tier.istLebendig());
    }


}


