package MichaelReal.week19_Zoo_Pfleger;


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
        Tier Loewe = new Tier("🦁Alf", "Löwe");
        Tier Elefant = new Tier("🐘Peter", "Elefant");
        Tier Nemos = new Tier("Nemos", "Fisch");


        zooMiki.assignTierToGehege("Savanne", Loewe,1);
        zooMiki.assignTierToGehege("Dschungel", Elefant,1);
        zooMiki.assignTierToGehege("Fischtank", Nemos, 20);

        // Hinzufügen von Futter
        Futter Lammkeule = new Futter("Lammkeule", "kg", 5.0);
        Futter Hasenkeule = new Futter("Hasenkeule", "kg", 3.5);
        Futter Heu = new Futter("Heu", "kg", 2.0);
        Futter Fischfutter = new Futter("Fischfutter", "Becher",2);

        Loewe.addFutterBedarf(Lammkeule, 2);
        Elefant.addFutterBedarf(Heu, 3);
        Nemos.addFutterBedarf(Fischfutter,1);

        zooMiki.printZooStructureWithTiere();

        zooMiki.calculateFutterBedarfUndKosten();

        // Ändern des Futters für ein Tier in einem Gehege
        zooMiki.changeTierFutter("Savanne", "🦁Alf", Hasenkeule, 8);
        zooMiki.removeTierFromGehege("Dschungel", Elefant, 1);
        zooMiki.removeTierFromGehege("Fischtank", Nemos, 5);


        zooMiki.printZooStructureWithTiere();

        zooMiki.calculateFutterBedarfUndKosten();
    }
}
