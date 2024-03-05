package claudia.week21_Threads.Restaurant;

import java.util.Vector;

public class Restaurant {
    private final String name;

    private Vector<Raum> listeDerRaeume = new Vector<>();
    public boolean geoeffnet = false;
    public Restaurant(String name){
        this.name = name;
        }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return "Restaurant " + this.name;
    }
    public Vector<Raum> getListeDerRaeume(){
        return this.listeDerRaeume;
    }
    public void raumHinzufuegen(Raum r){
        this.listeDerRaeume.add(r);
    }

}
