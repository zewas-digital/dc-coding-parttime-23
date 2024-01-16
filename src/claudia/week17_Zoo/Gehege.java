package claudia.week17_Zoo;

import claudia.week17_Zoo.Tiere.Tiere;

import java.util.ArrayList;

public class Gehege {
    private int flaeche; //in qm
    private String name;
    private ArrayList<Tiere> ListeDerTiere = new ArrayList<>();

    public Gehege(int flaeche, String name, ArrayList<Gehege> ListeDerGehege) {
        this.flaeche = flaeche;
        this.name = name;
        ListeDerGehege.add(this);
    }

    public int anzahlDerTiere(){
        return this.ListeDerTiere.size();
    }
    public void tierHinzufuegen(Tiere tier) {
        this.ListeDerTiere.add(tier);
    }

    public void tierLoeschen(Tiere tier) {
        this.ListeDerTiere.remove(tier);
    }
    public String getName(){
        return this.name;
    }

    public String toString(){
        return "Das Gehege " + this.name + " hat eine Fläche von " + this.flaeche + " qm.";
    }

    public ArrayList<Tiere> getListeDerTiere() {
        return ListeDerTiere;
    }
}
