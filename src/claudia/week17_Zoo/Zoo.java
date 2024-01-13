package claudia.week17_Zoo;

import java.util.ArrayList;

public class Zoo {
    private final String name;
    private final int jahr;
    private ArrayList <Gehege> ListeDerGehege = new ArrayList <> ();

    public Zoo(String name, int jahr){
        this.name = name;
        this.jahr = jahr;
    }

     public void printStructure() {
         System.out.println("\n|-- Zoo: " + this.toString());
         for (Gehege g : this.ListeDerGehege) {
             System.out.println("|\t|-- Gehege: " + g.getName());
             for (Tier t : g.getListeDerTiere()) {
                 System.out.println("|\t|--|-- Tier: " + t.getName());
             }
         }
     }

     public void alleFuettern() {
         System.out.println("\nEs ist Fütterungszeit! ");
         for (Gehege g : this.ListeDerGehege) {
             System.out.println("\nIm Gehege " + g.getName() + " wird gefüttert: ");
             for (Tier t : g.getListeDerTiere())  {
                 System.out.print("\t");
                 t.feed();
             }
         }
     }

    public void gehegeHinzufuegen(Gehege gehege){
        this.ListeDerGehege.add(gehege);
    }

    public void gehegeLoeschen(Gehege gehege){
        this.ListeDerGehege.remove(gehege);
    }
    @Override
    public String toString(){
        return this.name + ", gegründet " + this.jahr;
    }

    public ArrayList <Gehege> getListeDerGehege(){
        return this.ListeDerGehege;
    }
}

