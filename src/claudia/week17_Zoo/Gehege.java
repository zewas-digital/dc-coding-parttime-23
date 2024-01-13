package claudia.week17_Zoo;

import java.util.ArrayList;

public class Gehege {
    private int flaeche; //in qm
    private String name;
    private ArrayList<Tier> ListeDerTiere = new ArrayList<>();

    public Gehege(int flaeche, String name) {
        this.flaeche = flaeche;
        this.name = name;
    }

    public void tierHinzufuegen(Tier tier) {
        this.ListeDerTiere.add(tier);
    }

    public void tierLoeschen(Tier tier) {
        this.ListeDerTiere.remove(tier);
    }
    public String getName(){
        return this.name;
    }

    public String toString(){
        return "Das Gehege " + this.name + " hat eine Fläche von " + this.flaeche + " qm.";
    }

    public ArrayList<Tier> getListeDerTiere() {
        return ListeDerTiere;
    }
}
