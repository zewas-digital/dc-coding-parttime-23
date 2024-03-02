package claudia.week22_Carsimulation;

import java.text.NumberFormat;
import java.util.Locale;

public class Motor {
    private double verbrauch;
    public Antriebsarten antriebart;
    private String motorName;
    private boolean an = false;
    private boolean kaputt = false;
    public Motor (double verbrauch, Antriebsarten antriebsart, String motorName){
        this.verbrauch = verbrauch;
        this.antriebart = antriebsart;
        this.motorName = motorName;
    }

    public void anschalten(){
        this.an = true;
        System.out.println("Motor läuft.");
    }
    public void ausschalten(){
        this.an = false;
        System.out.println("Motor abgeschaltet");
    }
    public double getVerbrauch() {
        return verbrauch;
    }

    public String getVerbrauchFormatiert(){
        return NumberFormat.getInstance(Locale.GERMAN).format(this.verbrauch) + " l pro 100 km" ;

    }

@Override
    public String toString(){
        return "Motor: " + this.motorName;
}
public boolean istAn(){
        return an;
}
public boolean istKaputt(){
        return kaputt;
}
public void reparieren(){
        this.kaputt = false;
}

}