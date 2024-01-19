package claudia.week17_Zoo;

import claudia.week17_Zoo.Tiere.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Zoo {
    private final String name;
    private final int jahr;
    private ArrayList <Gehege> ListeDerGehege = new ArrayList <>();
    //private ArrayList <Tiere> ListeDerTiere = new ArrayList<>();

    private Futter futterGras;
    private Futter futterMaus;
    private Futter futterFrosch;
    private Futter futterKrill;


    public Zoo(String name, int jahr){
        this.name = name;
        this.jahr = jahr;
        this.futterGras = new Futter("Gras und Kräuter", "kg", Futter.STANDARD_PREIS_IN_EURO_PRO_KILO_GRAS);
        this.futterMaus = new Futter("Mäuse", "kg", Futter.STANDARD_PREIS_IN_EURO_PRO_KILO_MAEUSE);
        this.futterFrosch = new Futter("Frösche", "kg", Futter.STANDARD_PREIS_IN_EURO_PRO_KILO_FROESCHE);
        this.futterKrill = new Futter("Krill", "t", Futter.STANDARD_PREIS_IN_EURO_PRO_TONNE_KRILL);
    }
    public Zoo (String name, int jahr, double[] futterliste){
        this.name = name;
        this.jahr = jahr;
        this.futterGras = new Futter("Gras und Kräuter", "kg", futterliste[0]);
        this.futterMaus = new Futter("Mäuse", "kg", futterliste[1]);
        this.futterFrosch = new Futter("Frösche", "kg", futterliste[2]);
        this.futterKrill = new Futter("Krill", "t", futterliste[3]);
    }

    public HashMap<Futter, Double> erstelleFutterTabelle() {
        HashMap<Futter, Double> futterTabelle = new HashMap<>();

        for (Gehege g : getListeDerGehege()) {
            for (Tiere t : g.getListeDerTiere()) {
                //Falls aktuelles Futter noch nicht im Hashmap, hinzufügen mit Futtermenge des aktuellen Tiers t
                if (!futterTabelle.containsKey(t.getFutter()))
                    futterTabelle.put(t.getFutter(), t.getMengeInEinheit());
                    //Falls bereits enthalten, addiere Futtermenge des aktuellen Tiers dazu
                else futterTabelle.put(t.getFutter(), futterTabelle.get(t.getFutter()) + t.getMengeInEinheit());
            }
        }
        return futterTabelle;
    }
    public void erstelleFutterstatistik(HashMap<Futter, Double> futterStatistik) {
        double gesamt = 0;
        System.out.println("\n\n=========   Futterausgaben für den Zoo:   ========= ");
        System.out.println("====================================================");

        for (Futter key : futterStatistik.keySet()) {
            double menge = futterStatistik.get(key);
            double produkt = menge * key.getPreisProEinheit();
            gesamt += produkt;
            System.out.printf("%10f  %3s %-20s : %10.2f € \n", menge, key.getEinheit(), key.getName(), produkt);

        }
        System.out.printf("\n=> Kosten am Tag gesamt: %6.2f € \n", gesamt);
    }


    public ArrayList <String> listeAllerTiere(){
        ArrayList<String> liste = new ArrayList<>();
        for (Gehege g : ListeDerGehege) {
            for (Tiere t: g.getListeDerTiere()) {
                liste.add(t.getName());
            }
                    }
        return liste;
    }

    public void printStructure(ArrayList<Gehege> ListeDerGehege) {
        System.out.println("\n|-- Zoo: " + this.toString());
        for (Gehege g : ListeDerGehege) {
            System.out.println("|\t|-- Gehege: " + g.getName());
            if (g.getListeDerTiere().isEmpty()) System.out.println("|\t|--|-- (leer)");
            else {
                for (Tiere t : g.getListeDerTiere()) {
                    System.out.println("|\t|--|-- Tier: " + t.getName() + ", " + t.getArt());
                }
            }
        }
    }

     public void alleFuettern() {
         System.out.println("\nEs ist Fütterungszeit! ");
         for (Gehege g : this.ListeDerGehege) {
             System.out.println("\nIm Gehege " + g.getName() + " wird gefüttert: ");
             for (Tiere t : g.getListeDerTiere())  {
                 System.out.print("\t");
                 t.feed();
             }
         }
     }

    public void gehegeHinzufuegen(Gehege gehege, ArrayList<Gehege> ListeDerGehege){
        ListeDerGehege.add(gehege);
    }

    public void gehegeLoeschen(Gehege gehege, ArrayList<Gehege> ListeDerGehege){
        ListeDerGehege.remove(gehege);
    }
    @Override
    public String toString(){
        return this.name + ", gegründet " + this.jahr;
    }

    public ArrayList <Gehege> getListeDerGehege(){
        return this.ListeDerGehege;
    }

    public String getName() {
        return name;
    }
    public static void erstelleStandardZoo(Zoo meinZoo) {

        Gehege alpenwiese = new Gehege(10234, "Alpenwiese", meinZoo.getListeDerGehege());
        Gehege ried = new Gehege(373, "Ried", meinZoo.getListeDerGehege());
        Gehege terrariumWarm = new Gehege(80, "Terrarium (warm)", meinZoo.getListeDerGehege());

        Futter gras = new Futter("Gras und Kräuter", "kg", 0.2);
        Futter frosch = new Futter("Frösche", "kg", 1.7);
        Futter maus = new Futter("Mäuse", "kg", 12.6);
        Futter krill = new Futter("Krill", "t", 3.45);

        Landtiere storch1 = new Storch("Adebar1", frosch, 1, ried.getListeDerTiere());
        Landtiere storch2 = new Storch("Adebar2", frosch, 0.5, ried.getListeDerTiere());

        Landtiere murmel1 = new Murmeltier("Murmel1", gras, 0.78, alpenwiese.getListeDerTiere());

        Landtiere boa1 = new Schlange("Boa1", maus, 2.2, terrariumWarm.getListeDerTiere());
        Landtiere boa2 = new Schlange("Boa2", maus, 5.1, terrariumWarm.getListeDerTiere());
        Landtiere boa3 = new Schlange("Boa3", maus, 0.1, terrariumWarm.getListeDerTiere());

        Gehege aquarium = new Gehege(2000000, "Aquarium", meinZoo.getListeDerGehege());
        Wassertiere wal1 = new Wal("Wal1", krill, 23.5465, aquarium.getListeDerTiere());

    }

    public static void erstelleStandardZooMitPreisliste(Zoo meinZoo, double[] futterpreisliste) {

        Gehege alpenwiese = new Gehege(10234, "Alpenwiese", meinZoo.getListeDerGehege());
        Gehege ried = new Gehege(373, "Ried", meinZoo.getListeDerGehege());
        Gehege terrariumWarm = new Gehege(80, "Terrarium (warm)", meinZoo.getListeDerGehege());

        Futter gras = new Futter("Gras und Kräuter", "kg", futterpreisliste[0]);
        Futter frosch = new Futter("Frösche", "kg", futterpreisliste[1]);
        Futter maus = new Futter("Mäuse", "kg", futterpreisliste[2]);
        Futter krill = new Futter("Krill", "t", futterpreisliste[3]);

        Landtiere storch1 = new Storch("Adebar1", frosch, 1, ried.getListeDerTiere());
        Landtiere storch2 = new Storch("Adebar2", frosch, 0.5, ried.getListeDerTiere());

        Landtiere murmel1 = new Murmeltier("Murmel1", gras, 0.78, alpenwiese.getListeDerTiere());

        Landtiere boa1 = new Schlange("Boa1", maus, 2.2, terrariumWarm.getListeDerTiere());
        Landtiere boa2 = new Schlange("Boa2", maus, 5.1, terrariumWarm.getListeDerTiere());
        Landtiere boa3 = new Schlange("Boa3", maus, 0.1, terrariumWarm.getListeDerTiere());

        Gehege aquarium = new Gehege(2000000, "Aquarium", meinZoo.getListeDerGehege());
        Wassertiere wal1 = new Wal("Wal1", krill, 23.5465, aquarium.getListeDerTiere());

    }

}

