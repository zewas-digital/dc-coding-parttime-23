package Simonsway.Week18.ZooRefactor;

import java.util.ArrayList;

public class Gehege {

    private String name;

    // Konstruktor
    public Gehege (String name){
        this.name = name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
    // Getter
    public String getName() {
        return this.name;
    }

    public String toString(){
        return "Gehege: " + this.name;
    }


    // Tiere
    //////////////////////////////////////////////////////////////////////////////////////////////////
    public ArrayList<Tiere> tiereArrayList = new ArrayList<>();

    public void addTiere (Tiere tiere){
        this.tiereArrayList.add(tiere);
    }

    public void removeTiere (Tiere tiere){
        this.tiereArrayList.remove(tiere);
    }

    public ArrayList<Tiere> getTiereArrayList(){
        return this.tiereArrayList;
    }
}
