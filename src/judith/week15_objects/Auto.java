package judith.week15_objects;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Locale;

public class Auto extends Object{
    public String marke = "unbekannt";
    public String modell = "unbekannt";
    public int baujahr;

    public int kiloMeter;
    public int tankVolumen;
    public int tankInhalt;

    public double verbrauchPKm;
    

    public Auto() {

        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.kiloMeter = kiloMeter;
        this.tankVolumen = tankVolumen;
        this.tankInhalt = tankInhalt;
        this.verbrauchPKm = verbrauchPKm;

    }
    @Override
    public String toString() {
        return "Auto { " + super.toString() + // super. entspricht der erweiterten Object-Klasse
                "\n Marke: = " + marke +
                "\n Modell: = " + modell +
                "\n Baujahr: = " + baujahr +
                "\n Tankvolumen: = " + tankVolumen +
                "\n Tankinhalt: = " + tankInhalt +
                "\n Kilometerstand: = " + NumberFormat.getInstance(Locale.GERMAN).format(kiloMeter) +" km"
                // in .format() wird die gewünschte Variable mit gegeben, hier z.b. kiloMeter
                + "\n}";

    }

    public int fahren (int zuFahrendeKilometer){
        int neuerKilometerStand = this.kiloMeter + zuFahrendeKilometer;
        System.out.println("Neuer Kilometerstand " + NumberFormat.getInstance(Locale.GERMAN).format(neuerKilometerStand) +" km");
        return neuerKilometerStand;
    }


    public int volltanken(){
        int getankteLiter = this.tankVolumen - this.tankInhalt;
        System.out.println("Es wurden " + getankteLiter + " Liter getankt ");
        this.tankInhalt = this.tankVolumen;
        return getankteLiter;
    }


    public int tankInhalt(int gefahreneKilometer){
        double verbrauchteLiter =  (gefahreneKilometer / 100) * verbrauchPKm;
        double aktuellerTankinhalt = this.tankInhalt - verbrauchteLiter;
        if(aktuellerTankinhalt <= 0 ){
            System.out.println("Der Tank ist leer und es sind noch " + "blbla KM zu fahren");
        } else if (aktuellerTankinhalt <= 5) {
            System.out.println("Es sind nur noch 5 Liter im Tank ");
        }
        else {
            System.out.println("Aktueller Tankinhalt  nach "+ gefahreneKilometer +" gefahrenen Kilometern beträgt " + aktuellerTankinhalt + " Liter");
        }


        return gefahreneKilometer;
    }




    
}

// inkl. der Prüfung wieviel KM der gewünschten Strecke noch nicht gefahren wurden (Wenn Tank leer).
