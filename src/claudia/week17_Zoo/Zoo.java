package claudia.week17_Zoo;

import claudia.week17_Zoo.Tiere.Tiere;

import java.util.ArrayList;

public class Zoo {
    private final String name;
    private final int jahr;
    private ArrayList <Gehege> ListeDerGehege = new ArrayList <>();
    //private ArrayList <Tiere> ListeDerTiere = new ArrayList<>();

    public Zoo(String name, int jahr){
        this.name = name;
        this.jahr = jahr;
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
}

