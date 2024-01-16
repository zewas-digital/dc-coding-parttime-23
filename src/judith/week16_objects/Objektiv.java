package judith.week16_objects;

public class Objektiv {
    public double objektiv;

    public Objektiv(double brennweite) {
        this.objektiv = brennweite;
    }


    public String toString(){
        return "Objektiv " + objektiv + " mm";
    }
}

