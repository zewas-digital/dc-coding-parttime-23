package Simonsway.Week18;

import java.util.ArrayList;

public class Gehege {

    private String gehegeName;

    public ArrayList<Tiere> tiereArrayList;


    // Konstruktor
    public Gehege (String gehegeName){
        this.gehegeName = gehegeName;
        this.tiereArrayList = new ArrayList<>();
    }


    // To String
    public String toString(){
        return "Gehege: " + this.gehegeName;
    }


    // Getter
    public String getGehegeName() {
        return gehegeName;
    }


    // Setter
    public void setGehegeName(String gehegeName) {
        this.gehegeName = gehegeName;
    }


    // Add & Remove
    public void addTiere (Tiere tiere){
        tiereArrayList.add(tiere);
    }
    public void removeTiere (Tiere tiere){
        tiereArrayList.remove(tiere);
    }


    // Array List Tiere
    public ArrayList<Tiere> getTiereArrayList(){
        return this.tiereArrayList;
    }



}
