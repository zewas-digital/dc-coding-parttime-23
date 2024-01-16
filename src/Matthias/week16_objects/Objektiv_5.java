package Matthias.week16_objects;

public class Objektiv_5 extends Object{
    public int brennweite;     // Angabe in mm bei Fotoobjektiven

    public Objektiv_5( int brennweite ) {this.brennweite = brennweite;}

    @Override
    public String toString() {
        return "Die Brennweite ist: "+brennweite;
    }
}
