package MichaelReal.week19_Zoo_Simulation;


public class ZooMikiSimulation extends Zoo {

    public ZooMikiSimulation(String name, int gruendungsjahr) {
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
        ZooMikiSimulation zooMiki = new ZooMikiSimulation("ZooMiki", 2023);


        // Hinzufügen von Gehegen
        zooMiki.addGehege("Savanne");
        zooMiki.addGehege("Dschungel");
        zooMiki.addGehege("Fischtank");
        zooMiki.addGehege("Krokodilbecken");


        // Hinzufügen von Tieren
        Tier loewe = new Tier("🦁Alf", "Löwe");
        Tier loewe2 = new Tier("🦁Udo", "Löwe");
        Tier elefant = new Tier("🐘Peter", "Elefant");
        Tier nemos = new Tier("🐟Nemos", "Fisch");
        Tier Krokodil1 = new Tier("🐊Fido", "Krokodil");
        Tier Krokodil2 = new Tier("🐊Manni", "Krokodil");



        zooMiki.assignTierToGehege("Savanne", loewe,1);
        zooMiki.assignTierToGehege("Savanne", loewe2,1);
        zooMiki.assignTierToGehege("Dschungel", elefant,1);
        zooMiki.assignTierToGehege("Fischtank", nemos, 20);
        zooMiki.assignTierToGehege("Krokodilbecken", Krokodil1, 1);
        zooMiki.assignTierToGehege("Krokodilbecken", Krokodil2, 1);


        // Hinzufügen von Futter
        Futter Lammkeule = new Futter("Lammkeule", "kg", 5.0);
        Futter Hasenkeule = new Futter("Hasenkeule", "kg", 3.5);
        Futter Heu = new Futter("Heu", "kg", 2.0);
        Futter Fischfutter = new Futter("Fischfutter", "Becher",2);
        Futter Krokodilfutter = new Futter("Ziegen", "Stk",20);


        loewe.addFutterBedarf(Lammkeule, 2);
        loewe2.addFutterBedarf(Lammkeule, 2);
        elefant.addFutterBedarf(Heu, 3);
        nemos.addFutterBedarf(Fischfutter,1);
        Krokodil1.addFutterBedarf(Krokodilfutter,1);
        Krokodil2.addFutterBedarf(Krokodilfutter,1);


        //Hinzufügen von Pflegern
        zooMiki.addPfleger("Otto","Krokodil");
        zooMiki.addPfleger("Carl","Löwe");
        zooMiki.addPfleger("Anna","Elefant");


        zooMiki.assignPflegerToGehege("Otto","Savanne");
        zooMiki.assignPflegerToGehege("Otto", "Dschungel");
        zooMiki.assignPflegerToGehege("Carl","Fischtank");
        zooMiki.assignPflegerToGehege("Anna","Krokodilbecken");


        loewe.addPfleger("Otto");
        elefant.addPfleger("Otto");
        nemos.addPfleger("Carl");
        loewe2.addPfleger("Carl");
        Krokodil1.addPfleger("Anna");
        Krokodil2.addPfleger("Anna");




        zooMiki.printZooStructureWithTiere();

        zooMiki.calculateFutterBedarfUndKosten();

        // Ändern des Futters für ein Tier in einem Gehege
        zooMiki.changeTierFutter("Savanne", "🦁Alf", Hasenkeule, 8);
        zooMiki.removeTierFromGehege("Fischtank", nemos, 5);


        zooMiki.printZooStructureWithTiere();

        zooMiki.calculateFutterBedarfUndKosten();

        // Starten der Tagessimulation
        zooMiki.simulateDay();
    }
}
