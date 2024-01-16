package florian.week_15_objects;

public class Objektiv {

    private int brennweite;

    public Objektiv (int brennweite){
        this.brennweite = brennweite;
    }

    public String toString (){
        return "" + brennweite;
    }

    public int getBrennweite() {
        return brennweite;
    }
    public int setBrennweite(int brennweite) {
        return this.brennweite = brennweite;
    }
}