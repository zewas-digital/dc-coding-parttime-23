package claudia.week18_neuerZoo;

import java.util.ArrayList;
import java.util.HashMap;

public class Gehege {
    private String name;
    private int flaeche;
    private ArrayList<Tier> ListeDerTiere = new ArrayList<>();
    private boolean alreadyFed = false;



    public Gehege(String name, int flaeche, ArrayList<Gehege> ListeDerGehege) {
        this.flaeche = flaeche;
        this.name = name;
        ListeDerGehege.add(this);
    }

   public void tierHinzufuegen(Tier tier){
        this.ListeDerTiere.add(tier);
   }

   public void tierLoeschen(Tier tier){
        this.ListeDerTiere.remove(tier);
   }

    public String getName() {
        return this.name;
    }

    public int getFlaeche() {
        return this.flaeche;
    }

    public ArrayList<Tier> getListeDerTiere() {
        return this.ListeDerTiere;
    }

    public ArrayList<Pfleger> getListeDerZustaendigenPfleger(ArrayList<Pfleger> ListeAllerPfleger){
        ArrayList<Pfleger> liste = new ArrayList<>();
        for (Pfleger p : ListeAllerPfleger){
            for (Gehege g : p.getListeDerBetreutenGehege()){
                if (this.equals(g)) liste.add(p);
            }
        }
        return liste;
    };
    @Override
    public String toString(){
        return ("Gehege " + this.name);
    }

    public boolean isAlreadyFed() {
        return alreadyFed;
    }
    public void changeFeedStatus(){
        if (this.alreadyFed) this.alreadyFed = false;
        else this.alreadyFed = true;
    }

    public void feedAllAnimalsInEnclosure(Lagerhaus lagerhaus){
        //
        for (Tier tier : this.getListeDerTiere()) {
            //System.out.println(tier.getFutterBedarfInEinheit() + " " + lagerhaus.getFutterliste().get(tier.getFutterart()).getEinheit() + " " + tier.getFutter());
            tier.feed();
        }
        System.out.print("\nIn diesem Gehege wurde folgendes Futter benötigt: ");
        printFeedListEnclosure(lagerhaus);

    }

    public void printFeedListEnclosure(Lagerhaus lagerhaus){
        //Hashmap speichert Futterart mit benötigter Gesamtmenge:
        HashMap<Lagerhaus.Futterarten, Double> futterTabelle = new HashMap<>();
        feedListEnclosure(futterTabelle);
        double gesamt = 0;
            System.out.println("\n\n=========   Futterausgaben für das Gehege:   ========== ");
            System.out.println("========================================================");

            for (Lagerhaus.Futterarten key : futterTabelle.keySet()) {
                Futter f = lagerhaus.getFutterliste().get(key);
                double menge = futterTabelle.get(key);
                double produkt = menge * f.getPreisProEinheit();
                gesamt += produkt;
                System.out.printf("%10f %6s %-20s  :  %10.2f € \n", menge, f.getEinheit(), f.getName(), produkt);

            }
            System.out.printf("\n=> Kosten am Tag gesamt: %6.2f € \n", gesamt);

    }

    public void feedListEnclosure(HashMap<Lagerhaus.Futterarten, Double> futterTabelle) {
        for (Tier t : this.getListeDerTiere()) {
            //Falls aktuelles Futter noch nicht im Hashmap, hinzufügen mit Futtermenge des aktuellen Tiers t
            if (!futterTabelle.containsKey(t.getFutterart()))
                futterTabelle.put(t.getFutterart(), t.getFutterBedarfInEinheit());
                //Falls bereits enthalten, addiere Futtermenge des aktuellen Tiers dazu
            else
                futterTabelle.put(t.getFutterart(), futterTabelle.get(t.getFutterart()) + t.getFutterBedarfInEinheit());
        }
    }


}
