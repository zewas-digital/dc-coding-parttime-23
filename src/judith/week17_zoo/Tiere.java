package judith.week17_zoo;

public class Tiere {

    private String tierNamen;
    private String tierArt;


    public  Tiere(String tierNamen, String tierArt) {
        this.tierNamen = tierNamen;
        this.tierArt = tierArt;

    }

    public String toString() {
        return this.tierNamen + ", " + this.tierArt;
    }
}
