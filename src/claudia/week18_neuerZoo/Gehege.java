package claudia.week18_neuerZoo;

import java.util.ArrayList;

public class Gehege {
    private String name;
    private int flaeche;
    private ArrayList<Tier> ListeDerTiere = new ArrayList<>();

    public Gehege(String name, int flaeche) {
        this.name = name;
        this.flaeche = flaeche;
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
}
