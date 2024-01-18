package MichaelReal.week18_Zoo;


public class ZooMiki extends Zoo {

    public ZooMiki(String name, int gruendungsjahr) {
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
        ZooMiki zooMiki = new ZooMiki("ZooMiki", 2023);


        // Hinzufügen von Gehegen
        zooMiki.addGehege("Savanne");
        zooMiki.addGehege("Dschungel");

        // Hinzufügen von Tieren
        Tier Loewe = new Tier("🦁Alf", "Löwe");
        Tier Elefant = new Tier("🐘Peter", "Elefant");

        zooMiki.assignTierToGehege("Savanne", Loewe);
        zooMiki.assignTierToGehege("Dschungel", Elefant);

        // Hinzufügen von Futter
        Futter Lammkeule = new Futter("Lammkeule", "kg", 5.0);
        Futter Hasenkeule = new Futter("Hasenkeule", "kg", 3.5);
        Futter Heu = new Futter("Heu", "kg", 2.0);

        Loewe.addFutterBedarf(Lammkeule, 2);
        Elefant.addFutterBedarf(Heu, 3);

        zooMiki.printZooStructureWithTiere();

        zooMiki.calculateFutterBedarfUndKosten();

        // Ändern des Futters für ein Tier in einem Gehege
        zooMiki.changeTierFutter("Savanne", "🦁Alf", Hasenkeule, 8);
        zooMiki.removeTierFromGehege("Dschungel", Elefant);


        zooMiki.printZooStructureWithTiere();

        zooMiki.calculateFutterBedarfUndKosten();
    }
}
