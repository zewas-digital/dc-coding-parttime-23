package MichaelReal.week18_Zoo;


public class ZooMiki extends Zoo {

    public ZooMiki(String name, int gruendungsjahr) {
        super(name, gruendungsjahr);
    }

    @Override
    public void printAdditionalInfo() {
        // Überschreiben Sie diese Methode, um zusätzliche Informationen für ZooMiki auszugeben
        System.out.println("Zusätzliche Informationen für ZooMiki");
    }

    public static void main(String[] args) {
        ZooMiki zooMiki = new ZooMiki("ZooMiki", 2023);

        // Hinzufügen von Gehegen
        zooMiki.addGehege("Gehege1");
        zooMiki.addGehege("Gehege2");

        // Hinzufügen von Tieren
        Tier Loewe = new Tier("Alf", "Löwe");
        Tier Elefant = new Tier("Elefant", "Säugetier");

        zooMiki.assignTierToGehege("Gehege1", Loewe);
        zooMiki.assignTierToGehege("Gehege2", Elefant);

        // Hinzufügen von Futter
        Futter futter1 = new Futter("Fleisch", "kg", 5.0);
        Futter futter2 = new Futter("Heu", "kg", 2.0);

        Loewe.addFutterBedarf(futter1, 2);
        Elefant.addFutterBedarf(futter2, 3);

        // Ändern des Futters für ein Tier in einem Gehege
        zooMiki.changeTierFutter("Gehege1", "Löwe", futter1, 3);


        // Ausgabe der Zoo-Struktur
        zooMiki.printZooStructureWithTiere();

        // Berechnung des Gesamtfutterbedarfs und der Kosten
        zooMiki.calculateFutterBedarfUndKosten();
    }
}
