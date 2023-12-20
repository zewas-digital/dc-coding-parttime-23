package saifedine.week15_objects;

import java.text.NumberFormat;
import java.util.Locale;

public class Auto extends Object {

    /*
     * Marke
     * Modell
     * Baujahr
     * km-Stand
     */

    // Attribute
    public String marke;
    public String modell;
    public int baujahr;
    public int kmStand;


    public Auto(){
    }

    public Auto(String marke, String modell, int baujahr, int kmStand){
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.kmStand = kmStand;
    }

    @Override
    public String toString() {
        return "Auto { " + super.toString() +
                "\n Marke: " + marke +
                "\n Modell: " + modell +
                "\n Baujahr: " + baujahr +
                "\n Km-Stand: " + NumberFormat.getInstance(Locale.GERMAN).format(kmStand) + " km" +
                "\n}";
    }
}
