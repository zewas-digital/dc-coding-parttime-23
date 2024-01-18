package Simonsway.Week18;

import java.util.ArrayList;

public class Tiere {

    private String name;
    private String gattung;
    private ArrayList<Futter> futterArrayList = new ArrayList<>();


    public Tiere(String name, String gattung){
        this.name = name;
        this.gattung = gattung;
    }
    public String toString(){
        return this.name + ", " + this.gattung;
    }


    public void addFutter (Futter futter){
        this.futterArrayList.add(futter);
    }
    public void removeFutter (Futter futter){
        this.futterArrayList.remove(futter);
    }



}
