package florian.week_15_objects;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Auto extends Object {

    public String marke;
    public String modell;
    public int baujahr;
    public int kmStand;
    public int tankvolumen = 80;
    public int literproKm;
    public int tankinhalt;

    public Auto(String Marke,String Modell,int Baujahr,int kmStand,int tankvolumen){
        this.marke = Marke;
        this.modell = Modell;
        this.baujahr = Baujahr;
        this.kmStand = kmStand;
        this.tankvolumen = tankvolumen;
    }

   public int fahren (int zufahrendeStrecke){
        this.kmStand +=  zufahrendeStrecke;

        return this.kmStand;
   }

   public int volltanken ( int tankinhalt){

        if (tankinhalt >= tankvolumen){
           tankinhalt++;
        }
       tankinhalt = tankvolumen - tankinhalt;

       return tankinhalt;
   }

  /* public int verbrauchproKm(int literproKm){

        kmStand = literproKm;

        if (literproKm - tankvolumen == 5 ){
            System.out.println("Es sind nur noch 5 Liter im Tank");
        }
   }*/



    public String toString() {

        return "Marke: " + marke +
                ", Modell: " + modell +
                ", Baujahr: " + baujahr +
                ", Km-Stand: " + NumberFormat.getInstance(Locale.GERMAN).format(kmStand) +
                ", Tankvolumen: " + tankvolumen ;
    }



}
