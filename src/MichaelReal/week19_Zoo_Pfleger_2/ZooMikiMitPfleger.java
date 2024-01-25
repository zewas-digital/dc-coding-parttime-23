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


        zooMiki.assignTierToGehege("Savanne", loewe,1);
        zooMiki.assignTierToGehege("Dschungel", elefant,1);
        zooMiki.assignTierToGehege("Fischtank", nemos, 20);

        // Hinzufügen von Futter
        Futter Lammkeule = new Futter("Lammkeule", "kg", 5.0);
        Futter Hasenkeule = new Futter("Hasenkeule", "kg", 3.5);
        Futter Heu = new Futter("Heu", "kg", 2.0);
        Futter Fischfutter = new Futter("Fischfutter", "Becher",2);

        loewe.addFutterBedarf(Lammkeule, 2);
        elefant.addFutterBedarf(Heu, 3);
        nemos.addFutterBedarf(Fischfutter,1);

        //Hinzufügen von Pflegern
        zooMiki.addPfleger("Otto");
        zooMiki.addPfleger("Carl");

        zooMiki.assignPflegerToGehege("Otto","Savanne");
        zooMiki.assignPflegerToGehege("Otto", "Dschungel");
        zooMiki.assignPflegerToGehege("Carl","Fischtank");

        loewe.addPfleger("Otto");
        elefant.addPfleger("Otto");
        nemos.addPfleger("Carl");


        zooMiki.printZooStructureWithTiere();

        zooMiki.calculateFutterBedarfUndKosten();

        // Ändern des Futters für ein Tier in einem Gehege
        zooMiki.changeTierFutter("Savanne", "🦁Alf", Hasenkeule, 8);
        zooMiki.removeTierFromGehege("Dschungel", elefant, 1);
        zooMiki.removeTierFromGehege("Fischtank", nemos, 5);


        zooMiki.printZooStructureWithTiere();

        zooMiki.calculateFutterBedarfUndKosten();
    }
}
