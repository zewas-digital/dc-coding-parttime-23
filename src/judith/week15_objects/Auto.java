package judith.week15_objects;

import java.text.NumberFormat;
import java.util.Locale;

public class Auto extends Object{
    public String marke = "unbekannt";
    public String modell = "unbekannt";
    public int baujahr;

    public int kiloMeter;
    public int tankVolumen;
    public int tankInhalt;
    

    public Auto() {

        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.kiloMeter = kiloMeter;
        this.tankVolumen = tankVolumen;
        this.tankInhalt = tankInhalt;

    }
    @Override
    public String toString() {
        return "Auto { " + super.toString() + // super entspricht der erweiterten Object-Klasse
                "\n Marke: = " + marke +
                "\n Modell: = " + modell +
                "\n Baujahr: = " + baujahr +
                "\n Tankvolumen: = " + tankVolumen +
                "\n Tankinhalt: = " + tankInhalt +
                "\n Kilometerstand: = " + NumberFormat.getInstance(Locale.GERMAN).format(kiloMeter) +" km"
                + "\n}";
    }



    
}
