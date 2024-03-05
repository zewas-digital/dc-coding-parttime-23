package michael_k.week22;

import java.util.Random;

public class Engine {

    private int leistung;
    public final Antriebsart antriebsart;
    private double kilometer=0;
    private boolean defekt= false;
    public double verbrauchAuf100;
    private double engineFaktor;

    public Engine(Antriebsart antriebsart, int leistung, double engineFaktor){
        this.leistung = leistung;
        this.antriebsart = antriebsart;
        this.engineFaktor = engineFaktor;
    }
    public boolean kilometerZuruecklegen(double kilometer){

        Random random = new Random ();
        this.kilometer = this.kilometer + kilometer;
        if ((random.nextDouble (101)*engineFaktor)/100 < ((this.kilometer-2000)/100.0) ){this.defekt=true;}

        return this.defekt;
    }
    public void motorReparieren(){
        defekt = false;
        kilometer = 0;
    }
}
