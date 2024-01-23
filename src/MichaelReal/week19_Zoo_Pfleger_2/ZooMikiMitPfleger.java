package MichaelReal.week19_Zoo_Pfleger_2;


public class ZooMikiMitPfleger extends Zoo {

    public ZooMikiMitPfleger(String name, int gruendungsjahr) {
        super(name, gruendungsjahr);
    }

    @Override
    public void printAdditionalInfo() {
        System.out.println("""
                               
                Zusätzliche Informationen für ZooMiki
                🐵🦊🐺🫏🫎🐴🐆🐮🐂🐃🐄🐷🐖🐗
                        
                """);
    }

    public static void main(String[] args) {
        ZooMikiMitPfleger zooMiki = new ZooMikiMitPfleger("ZooMiki", 2023);

        // Hinzufügen von Gehegen
        zooMiki.addGehege("Savanne");
        zooMiki.addGehege("Dschungel");
        zooMiki.addGehege("Fischtank");

        // Hinzufügen von Tieren
        Tier loewe = new Tier("🦁Alf", "Löwe");
        Tier elefant = new Tier("🐘Peter", "Elefant");
        Tier nemos = new Tier("Nemos", "Fisch");

        zooMiki.assignTierToGehege("Savanne", loewe, 1);
        zooMiki.assignTierToGehege("Dschungel", elefant, 1);
        zooMiki.assignTierToGehege("Fischtank", nemos, 20);

        // Hinzufügen von Futter
        Futter lammkeule = new Futter("Lammkeule", "kg", 5.0);
        Futter hasenkeule = new Futter("Hasenkeule", "kg", 3.5);
        Futter heu = new Futter("Heu", "kg", 2.0);
        Futter fischfutter = new Futter("Fischfutter", "Becher", 2);

        loewe.addFutterBedarf(lammkeule, 2);
        elefant.addFutterBedarf(heu, 3);
        nemos.addFutterBedarf(fischfutter, 1);

        // Hinzufügen von Pflegern
        Pfleger otto = new Pfleger("Otto");
        Pfleger adam = new Pfleger("Adam");

        zooMiki.addPfleger(otto);
        zooMiki.addPfleger(adam);

        // Zuweisen von Pflegern zu Gehegen
        otto.addZustaendigesGehege(zooMiki.getGehegeByName("Savanne"));
        otto.addZustaendigesGehege(zooMiki.getGehegeByName("Dschungel"));
        adam.addZustaendigesGehege(zooMiki.getGehegeByName("Fischtank"));

        // Zuweisen von Tieren zu Pflegern
        otto.addZustaendigesTier(loewe);
        otto.addZustaendigesTier(elefant);
        adam.addZustaendigesTier(nemos);

        // Ausgabe der Zoo-Struktur
        zooMiki.printZooStructureWithTiere();

        // Berechnen des Futterbedarfs und der Kosten
        zooMiki.calculateFutterBedarfUndKosten();

        // Ändern des Futters für ein Tier in einem Gehege
        zooMiki.changeTierFutter("Savanne", "🦁Alf", hasenkeule, 8);
        zooMiki.removeTierFromGehege("Dschungel", elefant, 1);
        zooMiki.removeTierFromGehege("Fischtank", nemos, 5);

        // Erneute Ausgabe der Zoo-Struktur
        zooMiki.printZooStructureWithTiere();
        zooMiki.calculateFutterBedarfUndKosten();
    }
}
