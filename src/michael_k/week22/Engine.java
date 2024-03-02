package michael_k.week22;

import java.util.Random;

public class Engine {

    private int leistung;
    public final Antriebsart antriebsart;
    private double kilometer=0;
    private boolean defekt= false;
    public double verbrauchAuf100;

    public Engine(Antriebsart antriebsart, int leistung){
        this.leistung = leistung;
        this.antriebsart = antriebsart;
    }
    public boolean kilometerZuruecklegen(double kilometer, double faktor){

        Random random = new Random ();
        this.kilometer = this.kilometer + kilometer;
        if ((random.nextDouble (101)*faktor)/100 < ((this.kilometer-2000)/100.0) ){this.defekt=true;}

        return this.defekt;
    }
    public void motorReparieren(){
        defekt = false;
        kilometer = 0;
    }
}
