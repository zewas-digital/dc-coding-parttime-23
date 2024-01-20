package claudia.week18_neuerZoo;

import java.util.ArrayList;
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

    }

    public HashMap<Futterarten, Futter> getFutterliste() {
        return futterliste;
    }
    // neue Hashmap
        // key enum
        // value Objekt mit allen Futterdaten ("Heu", "kg", 12)
    }

