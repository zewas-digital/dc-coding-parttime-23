package MichaelReal.week19_Zoo_KampfSimulation;


public class ZooMikiKampfSimulation extends Zoo {

    public ZooMikiKampfSimulation(String name, int gruendungsjahr) {
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
        ZooMikiKampfSimulation zooMiki = new ZooMikiKampfSimulation("ZooMiki", 2023);


        // Hinzufügen von Gehegen
        zooMiki.addGehege("Savanne");
        zooMiki.addGehege("Dschungel");
        zooMiki.addGehege("Fischtank");
        zooMiki.addGehege("Krokodilbecken");


        // Hinzufügen von Tieren
        Tier loewe = new Tier("🦁Alf", "Löwe",100,60);
        Tier loewe2 = new Tier("🦁Sonja", "Löwe",100,60);
        Tier elefant = new Tier("🐘Peter", "Elefant",100,30);
        Tier elefant2 = new Tier("🐘Carla", "Elefant",100,30);
        Tier nemos = new Tier("🐟Nemos", "Fisch",100,15);
        Tier seestern = new Tier("⭐Seestern", "Seestern",100,5);
        Tier krokodil1 = new Tier("🐊Fido", "Krokodil",100,80);
        Tier krokodil2 = new Tier("🐊Leila", "Krokodil",100,80);



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

        // Ändern des Futters für ein Tier in einem Gehege
        zooMiki.changeTierFutter("Savanne", "🦁Alf", Hasenkeule, 8);
        zooMiki.removeTierFromGehege("Fischtank", nemos, 5);


        zooMiki.printZooStructureWithTiere();

        zooMiki.calculateFutterBedarfUndKosten();

        // Starten der Tagessimulation
        zooMiki.simulateDay();

        zooMiki.printZooStructureWithTiere();

        zooMiki.calculateFutterBedarfUndKosten();

        zooMiki.simulateDay();

        zooMiki.printZooStructureWithTiere();

        zooMiki.calculateFutterBedarfUndKosten();

        zooMiki.simulateDay();

        zooMiki.printZooStructureWithTiere();

        zooMiki.calculateFutterBedarfUndKosten();

        zooMiki.simulateDay();

        zooMiki.printZooStructureWithTiere();

        zooMiki.calculateFutterBedarfUndKosten();

        zooMiki.simulateDay();
    }
}
