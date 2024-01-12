package claudia.week17_Zoo;

public class Gehege {
    private int flaeche; //in qm
    private String name;

    public Gehege(int flaeche, String name){
        this.flaeche = flaeche;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return "Das Gehege " + this.name + " hat eine Fläche von " + this.flaeche + " qm.";
    }
}
