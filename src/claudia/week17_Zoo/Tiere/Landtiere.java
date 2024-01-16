package claudia.week17_Zoo.Tiere;

import java.util.ArrayList;

public abstract class Landtiere implements Tiere {
    private String art;
    private String name;
    private int flaecheBenoetigt;
    private String futter;
    private double mengeInKilo;

    public Landtiere(String art, String name, int flaecheBenoetigt, String futter, double mengeInKilo, ArrayList<Tiere> ListeDerTiereImGehege){
        this.art = art;
        this.name = name;
        this.flaecheBenoetigt = flaecheBenoetigt;
        this.futter = futter;
        this.mengeInKilo = mengeInKilo;
        ListeDerTiereImGehege.add(this);

    }

    public void feed (){
        System.out.println("\tIch fresse " + this.mengeInKilo + " kg " + this.futter + ".");
    };
    public String toString(){
        return "Ich bin ein " + art + " und heiße " + name + ".";
    }
    public double getMengeInKilo(){
        return this.mengeInKilo;
    }

    public String getName() {
        return name;
    }

    public String getFutter() {
        return this.futter;
    }

    public String getArt() {
        return art;
    }
}
