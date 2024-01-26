package claudia.week18_neuerZoo;

import java.util.ArrayList;

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
        //System.out.println("In diesem Gehege wird folgendes Futter benötigt: ");
        for (Tier tier : this.getListeDerTiere()) {
            //System.out.println(tier.getFutterBedarfInEinheit() + " " + lagerhaus.getFutterliste().get(tier.getFutterart()).getEinheit() + " " + tier.getFutter());
            tier.feed();
        }
    }
}
