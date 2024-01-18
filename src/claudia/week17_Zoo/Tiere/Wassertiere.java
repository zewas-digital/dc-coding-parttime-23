package claudia.week17_Zoo.Tiere;

import claudia.week17_Zoo.Futter;

import java.util.ArrayList;

public class Wassertiere implements Tiere {
    private String art;
    private String name;
    private int volumenBenoetigt;
    private Futter futter;
    private double mengeInEinheit;
    public double preisProEinheit;

    public Wassertiere(String art, String name, int volumenBenoetigt, Futter futter, double mengeInKilo, ArrayList<Tiere> ListeDerTiereImGehege){
        this.art = art;
        this.name = name;
        this.volumenBenoetigt = volumenBenoetigt;
        this.futter = futter;
        this.mengeInEinheit = mengeInKilo;
        ListeDerTiereImGehege.add(this);
    }

    public void feed (){
        System.out.println("\tIch fresse " + this.mengeInEinheit + this.futter.getEinheit() + " " + this.futter.getName() + ".");
    };
    public String toString(){
        return "Ich bin ein " + art + " und heiße " + name + ".";
    }
    public double getMengeInEinheit(){
        return this.mengeInEinheit;
    }

    public String getName() {
        return name;
    }

    public Futter getFutter() {
        return this.futter;
    }

    public String getArt() {
        return art;
    }
}
