package Simonsway.Week17;

public class Tiere {
    private String name;
    private String art;


    public Tiere(String name, String art) {
        this.name = name;
        this.art = art;
    }
    public String getName() {
        return "|--Tier: " + this.name;
    }
    public String getArt() {
        return this.art;
    }

}
