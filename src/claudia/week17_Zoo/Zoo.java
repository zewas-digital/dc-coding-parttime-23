package claudia.week17_Zoo;

import java.util.ArrayList;

public class Zoo {
    private final String name;
    private final int jahr;
    private ArrayList <Gehege> GehegeListe = new ArrayList <> ();

    public Zoo(String name, int jahr){
        this.name = name;
        this.jahr = jahr;
    }

     public void printStructure() {
         System.out.println("\n|-- Zoo: " + this.toString());
         for (Gehege g : this.GehegeListe) {
             System.out.println("|\t|-- Gehege: " + g.getName());
         }
     }

    public void gehegeHinzufuegen(Gehege gehege){
        this.GehegeListe.add(gehege);
    }

    public void gehegeLoeschen(Gehege gehege){
        this.GehegeListe.remove(gehege);
    }
    @Override
    public String toString(){
        return this.name + ", gegründet " + this.jahr;
    }

    /*public ArrayList <Gehege> getGehegeListe(){
        return GehegeListe;
    }*/
}

