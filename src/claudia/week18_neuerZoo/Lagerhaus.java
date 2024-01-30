package claudia.week18_neuerZoo;

import java.util.HashMap;
import java.util.Scanner;

public class Lagerhaus {
    //definiere Futterarten - nur diese sind möglich
    public static enum Futterarten {
        GRAS,
        FISCH,
        SCHOKOLADE
    }
    //implementiere alle Futter, private => kein Zugriff von außen möglich!
    private Futter gras;
    private Futter fisch;
    private Futter schokolade;
    private HashMap<Futterarten, Futter> futterliste = new HashMap<>();
    //Lagerbestandsliste:
    private HashMap<Futterarten, Double> stocklist = new HashMap<>();


    public Lagerhaus() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nIhr neuer Zoo benötigt Futter. Welche Preise haben Sie ausgehandelt? ");
        System.out.println("\nBitte geben Sie die Futterpreise ein!: ");
        System.out.print("Gras pro Tonne: ");
        double preisGras = sc.nextDouble();
        System.out.print("Fisch pro Stück: ");
        double preisFisch = sc.nextDouble();
        System.out.print("Schokolade pro Kilo: ");
        double preisSchokolade = sc.nextDouble();
        Futter gras = new Futter("Gras", "Tonnen", preisGras);
        Futter fisch = new Futter("Fisch", "Stück", preisFisch);
        Futter schokolade = new Futter("Schokolade", "kg", preisSchokolade);
        futterliste.put(Futterarten.GRAS, gras);
        futterliste.put(Futterarten.FISCH, fisch);
        futterliste.put(Futterarten.SCHOKOLADE, schokolade);
        //Zu Beginn Lager füllen:
        stockWareHouse(1000.0, 1000.0, 1000.0);


    }

    public Lagerhaus(double[] preislisteGrasFischSchokolade) {
        Futter gras = new Futter("Gras", "Tonnen", preislisteGrasFischSchokolade[0]);
        Futter fisch = new Futter("Fisch", "Stück", preislisteGrasFischSchokolade[1]);
        Futter schokolade = new Futter("Schokolade", "kg", preislisteGrasFischSchokolade[2]);
        futterliste.put(Futterarten.GRAS, gras);
        futterliste.put(Futterarten.FISCH, fisch);
        futterliste.put(Futterarten.SCHOKOLADE, schokolade);
        stockWareHouse(1000.0, 1000.0, 1000.0);
    }

    private void stockWareHouse(double lagerbestandGras, double lagerbestandFisch, double lagerbestandSchokolade) {
        // Lager füllen:
        //System.out.println("\nLager aufgefüllt!");
        //System.out.println("Lagerbestand " + Futterarten.GRAS + " = " + lagerbestandGras);
        //System.out.println("Lagerbestand " + Futterarten.FISCH + " = " + lagerbestandFisch);
        //System.out.println("Lagerbestand " + Futterarten.SCHOKOLADE + " = " + lagerbestandSchokolade);
        stocklist.put(Futterarten.GRAS, lagerbestandGras);
        stocklist.put(Futterarten.FISCH, lagerbestandFisch);
        stocklist.put(Futterarten.SCHOKOLADE, lagerbestandSchokolade);
    }

    public void printStocklist(){
        //Hashmap speichert Futterart mit benötigter Gesamtmenge:
        HashMap<Futterarten, Double> stocklist = this.getStockListAllFeeds();
        
        System.out.println("\n\n==========   Lagerbestand Futter:   =========== ");
        System.out.println("===============================================");

        for (Futterarten key : stocklist.keySet()) {
            String einheit = this.getFutterliste().get(key).getEinheit();
            System.out.printf("%-20s    :    %10.3f %-10s\n", key, stocklist.get(key), einheit);
            //System.out.println("Futterart: " + key + ", Menge: " + stocklist.get(key));
        }
        System.out.println();

        }



    public HashMap<Futterarten, Futter> getFutterliste() {
        return futterliste;
    }
    // neue Hashmap
        // key enum
        // value Objekt mit allen Futterdaten ("Heu", "kg", 12)

    public HashMap<Futterarten, Double> getStockListAllFeeds() {
        return stocklist;
    }

    public void setStockListSingleFeed(Futterarten futterart, double newStock) {
        if (newStock <= 0) {
            System.out.println("Achtung! Lagerbestand von " + futterart + " geht zur Neige -");
            Scanner sc = new Scanner(System.in);
            System.out.println("Sie müssen etwas tun! Bestätigen Sie mit ENTER!");
            sc.nextLine();
        }

        this.stocklist.put(futterart, newStock);
    }
}

