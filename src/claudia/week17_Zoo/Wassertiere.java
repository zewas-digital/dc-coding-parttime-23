package claudia.week17_Zoo;

public class Wassertiere implements Tiere {
    private String art;
    private String name;
    private int volumenBenoetigt;
    private String futter;
    private double mengeInKilo;

    public Wassertiere(String art, String name, int volumenBenoetigt, String futter, double mengeInKilo){
        this.art = art;
        this.name = name;
        this.volumenBenoetigt = volumenBenoetigt;
        this.futter = futter;
        this.mengeInKilo = mengeInKilo;
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
