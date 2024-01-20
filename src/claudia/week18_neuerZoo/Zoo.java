package claudia.week18_neuerZoo;


import claudia.week18_neuerZoo.Gehege;

import java.util.ArrayList;
import java.util.HashMap;

public class Zoo {
    private final String name ;
    private final int jahr;
    private Lagerhaus lagerhaus;
    private ArrayList<Gehege> ListeDerGehege = new ArrayList <>();
    //private HashMap<Lagerhaus.Futterarten, Futter> futterliste;

    public Zoo(String name, int jahr) {
        this.name = name;
        this.jahr = jahr;
        this.lagerhaus = new Lagerhaus();
    }

    public ArrayList <String> listeAllerTiere(){
        ArrayList<String> liste = new ArrayList<>();
        for (Gehege g : ListeDerGehege) {
            for (Tier t: g.getListeDerTiere()) {
                liste.add(t.getName());
            }
        }
        return liste;
    }
    public void erstelleFutterstatistik() {
        //Hashmap speichert Futterart mit benötigter Gesamtmenge:
        HashMap<Lagerhaus.Futterarten, Double> futterTabelle = new HashMap<>();

        for (Gehege g : getListeDerGehege()) {
            for (Tier t : g.getListeDerTiere()) {
                //Falls aktuelles Futter noch nicht im Hashmap, hinzufügen mit Futtermenge des aktuellen Tiers t
                if (!futterTabelle.containsKey(t.getFutterart()))
                    futterTabelle.put(t.getFutterart(), t.getFutterBedarfInEinheit());
                    //Falls bereits enthalten, addiere Futtermenge des aktuellen Tiers dazu
                else futterTabelle.put(t.getFutterart(), futterTabelle.get(t.getFutterart()) + t.getFutterBedarfInEinheit());
            }
        }

        double gesamt = 0;
        System.out.println("\n\n===========   Futterausgaben für den Zoo:   =========== ");
        System.out.println("========================================================");

        for (Lagerhaus.Futterarten key : futterTabelle.keySet()) {
            Futter f = this.lagerhaus.getFutterliste().get(key);
            double menge = futterTabelle.get(key);
            double produkt = menge * f.getPreisProEinheit();
            gesamt += produkt;
            System.out.printf("%10f %6s %-20s  :  %10.2f € \n", menge, f.getEinheit(), f.getName(), produkt);

        }
        System.out.printf("\n=> Kosten am Tag gesamt: %6.2f € \n", gesamt);
    }


    public void printStructure() {
        ArrayList<Gehege> ListeDerGehege = this.getListeDerGehege();
        System.out.println("\n|-- Zoo: " + this.toString());
        for (Gehege g : ListeDerGehege) {
            System.out.println("|\t|-- Gehege: " + g.getName());
            if (g.getListeDerTiere().isEmpty()) System.out.println("|\t|--|-- (leer)");
            else {
                for (Tier t : g.getListeDerTiere()) {
                    System.out.println("|\t|--|-- Tier: " + t.getName() + ", " + t.getArt());
                }
            }
        }
    }

    //public HashMap<Lagerhaus.Futterarten, Futter> getFutterliste() {
    //    return this.lagerhaus.getFutterliste();
    //}

    public void feedAll() {
        System.out.println("\nEs ist Fütterungszeit! ");
        for (Gehege g : this.ListeDerGehege) {
            System.out.println("\nIm Gehege " + g.getName() + " wird gefüttert: ");
            for (Tier t : g.getListeDerTiere())  {
                System.out.print("\t");
                t.feed();
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getJahr() {
        return jahr;
    }

    public Lagerhaus getLagerhaus() {
        return lagerhaus;
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
}
