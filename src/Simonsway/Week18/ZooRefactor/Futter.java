package Simonsway.Week18.ZooRefactor;

import java.util.ArrayList;

public class Futter {

    private final Futter.einheit einheit;
    private String name;
    private float preis;

    public enum einheit {
        KG,
        STK;
    }

    public Futter (String name, float preis, einheit einheit){
        this.name = name;
        this.preis = preis;
        this.einheit = einheit;
    }

    public String toString(){
        return "Futter: " + this.name + "Preis" + this.preis;
    }


    //Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setPreis(float preis) {
        this.preis = preis;
    }

    //Getter
    public String getName() {
        return this.name;
    }

    public float getPreis() {
        return this.preis;
    }


    // Futter Art
    public ArrayList <FutterArt> futterArtArrayList = new ArrayList<>();

    public void addFutterArt (FutterArt futterArt){
        this.futterArtArrayList.add(futterArt);
    }
    public void removeFutter (FutterArt futterArt){
        this.futterArtArrayList.remove(futterArt);
    }




}
