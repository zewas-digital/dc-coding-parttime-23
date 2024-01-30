package claudia.week18_neuerZoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Zoo {
    private final String name ;
    private final int jahr;
    private Direktor direktor;
    private Lagerhaus lagerhaus;


   // private HashMap<Pfleger, Gehege> zustaendig;
    private ArrayList<Gehege> ListeDerGehege = new ArrayList <>();
    private ArrayList<Pfleger> ListeDerPfleger = new ArrayList<>();
    private ArrayList<Tier> ListeDerTiere = new ArrayList<>();

    private ArrayList<Object[]> PflegerUndGehegeListe = new ArrayList<>();

    public Zoo(String name, int jahr) {
        this.name = name;
        this.jahr = jahr;
        this.direktor = new Direktor("Ariane", this.ListeDerPfleger, this.ListeDerGehege, false);
        this.lagerhaus = new Lagerhaus();
        //this.zustaendig = new HashMap<>();
    }

    public Zoo(String name, int jahr, Lagerhaus lagerhaus) {
        this.name = name;
        this.jahr = jahr;
        this.direktor = new Direktor("Ariane", this.ListeDerPfleger, this.ListeDerGehege, false);
        this.lagerhaus = lagerhaus;
        //this.zustaendig = new HashMap<>();
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

    public Tier findArt(String art) {
        ArrayList<Tier> liste = this.getListeDerTiere();
        Random random = new Random();
        int anzahl = liste.size();

        int temp = random.nextInt(anzahl);
        Tier t = liste.get(temp);
       // System.out.println("Erstes ausgesucht: " + t.getArt());

        int counter = 0;

        while (!t.getArt().equals(art) && counter < anzahl) {
            t = liste.get((temp + counter) % anzahl);
            //System.out.println("In der Schleife: " + t.getArt());
            counter++;
        }
        if (counter == anzahl) {
            System.out.println("Die Art " + art + " ist im Zoo leider nicht vorhanden!");
            return null;
        } else return t;
    }

    public ArrayList<Tier> getListeDerTiere() {
        ArrayList<Tier> liste = new ArrayList<>();
        for (Gehege gehege : this.getListeDerGehege()) {
            for (Tier tier : gehege.getListeDerTiere()) {
                liste.add(tier);
            }
        }
        return liste;
    }

    public ArrayList<Object[]> getPflegerUndGehegeListe() {

        this.PflegerUndGehegeListe.clear();
        for (Pfleger p : this.getListeDerPfleger()) {
            for (Gehege g : p.getListeDerBetreutenGehege()) {

                Object[] temp = new Object[2];
                temp[0] = p;
                temp[1] = g;
                this.PflegerUndGehegeListe.add(temp);
            }
        }
        return this.PflegerUndGehegeListe;
    }

    /*
    //Umständliche Variante von Abfrage der Zuständigkeit!
    public boolean pflegerZustaendigFuerGehege(Pfleger pfleger, Gehege gehege) {
        ArrayList<Object[]> liste = this.getPflegerUndGehegeListe();
        for (int i = 0; i < liste.size(); i++) {
            Object[] temp = liste.get(i);
            if (temp[0].equals(pfleger) && temp[1].equals(gehege)) {
                System.out.println("Pfleger: " + pfleger.getName() + ", Gehege: " + gehege.getName());
                return true;
            }
        }
        System.out.println("Pfleger: " + pfleger.getName() + ", Gehege: " + gehege.getName());

        return false;
    }
*/
    //Bessere Variante von Abfrage der Zuständigkeit
    public boolean pflegerZustaendigFuerGehege2(Pfleger pfleger, Gehege gehege) {
       for (Gehege g : pfleger.getListeDerBetreutenGehege()){
           if (g.equals(gehege)) {
               System.out.println("Pfleger " + pfleger.getName() + " zuständig für Gehege: " + gehege.getName());
               return true;
           }
       }
        System.out.println("Pfleger " + pfleger.getName() + " nicht zuständig für Gehege: " + gehege.getName());
        return false;
    }


    public void printPflegerUndGehegeListe() {
        System.out.println("\n\nListe der betreuten Gehege: ");
        ArrayList<Object[]> PflegerUndGehegeListe = this.getPflegerUndGehegeListe();
        for (int i = 0; i < PflegerUndGehegeListe.size(); i++) {
            Object[] temp = PflegerUndGehegeListe.get(i);
            System.out.printf("%-25s :  %-25s \n", (Pfleger) temp[0], (Gehege) temp[1]);
        }
    }


    public void printFeedList() {
        //Hashmap speichert Futterart mit benötigter Gesamtmenge:
        HashMap<Lagerhaus.Futterarten, Double> futterTabelle = new HashMap<>();

        for (Gehege g : getListeDerGehege()) {
            g.feedListEnclosure(futterTabelle)  ;
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
            ArrayList<Pfleger> zustaendigePfleger = g.getListeDerZustaendigenPfleger(this.getListeDerPfleger());
            System.out.print("|\t|-- Gehege: " + g.getName() + ", betreut von ");
            Zoohilfe.printArrayListPfleger(zustaendigePfleger);
            System.out.println();
            if (g.getListeDerTiere().isEmpty()) System.out.println("|\t|--|-- (leer)");
            else {
                for (Tier t : g.getListeDerTiere()) {
                    System.out.println("|\t|--|-- Tier: " + t.getName() + ", " + t.getArt());
                }
            }
        }
    }


    public void feedAll() {
        System.out.println("\nEs ist Fütterungszeit! ");
        for (Gehege g : this.ListeDerGehege) {
            if (!g.getListeDerTiere().isEmpty()) {
                System.out.println("\nIm Gehege " + g.getName() + " wird gefüttert: ");
                for (Tier t : g.getListeDerTiere()) {
                    System.out.print("\t");
                    t.feed(this.getLagerhaus());
                }
            }
        }
    }

    public void removeAllDeadAnimals(){
        for (Gehege gehege : this.ListeDerGehege){
            gehege.removeDeadAnimals();
        }
    }

    public Direktor getDirektor() {
        return direktor;
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

    public void pflegerHinzufuegen(Pfleger pfleger, ArrayList<Pfleger> ListeDerPfleger){
        ListeDerPfleger.add(pfleger);
    }

    public void pflegerLoeschen(Pfleger pfleger, ArrayList<Pfleger> ListeDerPfleger){
        ListeDerPfleger.remove(pfleger);
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


    public ArrayList<Pfleger> getListeDerPfleger() {
        return ListeDerPfleger;
    }

}
