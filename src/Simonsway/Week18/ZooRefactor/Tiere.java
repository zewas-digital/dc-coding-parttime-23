package Simonsway.Week18.ZooRefactor;

import java.util.ArrayList;

public class Tiere {

    private String name;
    private String gattung;
    private float tagesBedarf;


    // Konstruktor
    public Tiere(String name, String gattung, float tagesBedarf) {
        this.name = name;
        this.gattung = gattung;
        this.tagesBedarf = tagesBedarf;
    }

    // To String
    public String toString(){
        return this.name + ", " + this.gattung + ", " + this.tagesBedarf;
    }



    // Setter
    public void setName(String name) {
        this.name = name;
    }
    public void setGattung(String gattung) {
        this.gattung = gattung;
    }
    public void setTagesBedarf(float tagesBedarf) {
        this.tagesBedarf = tagesBedarf;
    }


    // Getter
    public String getName() {
        return this.name;
    }
    public String getGattung() {
        return this.gattung;
    }
    public float getTagesBedarf() {
        return this.tagesBedarf;
    }


    // Futter
    public ArrayList<Futter> futterArrayList = new ArrayList<>();

    public void addFutter (Futter futter){
        this.futterArrayList.add(futter);
    }

    public void removeFutter (Futter futter){
        this.futterArrayList.remove(futter);
    }

    public ArrayList <Futter> getFutterArrayList(){
        return this.futterArrayList;
    }

}
