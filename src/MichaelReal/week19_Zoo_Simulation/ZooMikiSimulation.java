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
        Tier loewe2 = new Tier("🦁Sonja", "Löwe");
        Tier elefant = new Tier("🐘Peter", "Elefant");
        Tier elefant2 = new Tier("🐘Carla", "Elefant");
        Tier nemos = new Tier("🐟Nemos", "Fisch");
        Tier seestern = new Tier("⭐Seestern", "Seestern");
        Tier krokodil1 = new Tier("🐊Fido", "Krokodil");
        Tier krokodil2 = new Tier("🐊Leila", "Krokodil");



        zooMiki.assignTierToGehege("Savanne", loewe,1);
        zooMiki.assignTierToGehege("Savanne", loewe2,1);
        zooMiki.assignTierToGehege("Dschungel", elefant,1);
        zooMiki.assignTierToGehege("Dschungel", elefant2,1);
        zooMiki.assignTierToGehege("Fischtank", nemos, 20);
        zooMiki.assignTierToGehege("Fischtank", seestern, 5);
        zooMiki.assignTierToGehege("Krokodilbecken", krokodil1, 1);
        zooMiki.assignTierToGehege("Krokodilbecken", krokodil2, 1);


        // Hinzufügen von Futter
        Futter Lammkeule = new Futter("Lammkeule", "kg", 5.0);
        Futter Hasenkeule = new Futter("Hasenkeule", "kg", 3.5);
        Futter Heu = new Futter("Heu", "kg", 2.0);
        Futter Fischfutter = new Futter("Fischfutter", "Becher",2);
        Futter Plankton = new Futter("Plankton", "Becher",2);
        Futter Krokodilfutter = new Futter("Ziegen", "Stk",20);


        loewe.addFutterBedarf(Lammkeule, 2);
        loewe2.addFutterBedarf(Lammkeule, 2);
        elefant.addFutterBedarf(Heu, 3);
        elefant2.addFutterBedarf(Heu, 3);
        nemos.addFutterBedarf(Fischfutter,1);
        seestern.addFutterBedarf(Plankton,1);
        krokodil1.addFutterBedarf(Krokodilfutter,1);
        krokodil2.addFutterBedarf(Krokodilfutter,1);


        //Hinzufügen von Pflegern
        zooMiki.addPfleger("Otto","Krokodil");
        zooMiki.addPfleger("Carl","Löwe");
        zooMiki.addPfleger("Anna","Elefant");


        zooMiki.assignPflegerToGehege("Otto","Savanne");
        zooMiki.assignPflegerToGehege("Otto", "Dschungel");
        zooMiki.assignPflegerToGehege("Carl","Fischtank");
        zooMiki.assignPflegerToGehege("Anna","Krokodilbecken");


        loewe.addPfleger("Otto");
        loewe2.addPfleger("Carl");
        elefant.addPfleger("Otto");
        elefant2.addPfleger("Otto");
        nemos.addPfleger("Carl");
        seestern.addPfleger("Carl");
        krokodil1.addPfleger("Anna");
        krokodil2.addPfleger("Anna");




        zooMiki.printZooStructureWithTiere();

        zooMiki.calculateFutterBedarfUndKosten();

        // Starten der Tagessimulation
        zooMiki.simulateDay();
    }
}
